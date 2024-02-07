package com.jv.automovil.persistencia;

import com.jv.automovil.logica.Automovil;
import com.jv.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void crearAuto(Automovil auto){
        autoJpa.create(auto);
    }
    
    public void eliminarAuto(int id){
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarAuto(Automovil auto){
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Automovil traerAuto(int id){
         System.out.println("El id es: "+ id);
         Automovil auto = autoJpa.findAutomovil(id);
         System.out.println("La marca del auto es: "+ auto.getMarca());
        return auto;
    }
    
    public List<Automovil> traerListaAutos(){
        List<Automovil> autos = autoJpa.findAutomovilEntities();
        // ArrayList<Automovil> listaAutos = new ArrayList(autos);
        return autos;
    }
    
}
