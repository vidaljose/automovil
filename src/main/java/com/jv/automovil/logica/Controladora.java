package com.jv.automovil.logica;

import com.jv.automovil.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAuto(String modelo, String marca, String motor, String color, String patente, int cantidadPuertas){
        Automovil auto = new Automovil( modelo,  marca,  motor,  color,  patente,  cantidadPuertas);
        controlPersis.crearAuto(auto);
    }
    
    public void eliminarAuto(int id){
        controlPersis.eliminarAuto(id);
    }
    
    public void editarAuto(Automovil auto,String modelo, String marca, String motor, String color, String patente, int cantidadPuertas){
        // Se modifica auto
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantidadPuertas);
        
        controlPersis.editarAuto(auto);
    }
    
    public Automovil traerAuto(int id){
        return controlPersis.traerAuto(id);
    }
    
    public List<Automovil> traerListaAutos(){
        return controlPersis.traerListaAutos();
    }
    
}
