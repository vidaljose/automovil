package com.jv.automovil;

import com.jv.automovil.igu.Principal;

public class Automovil {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Llamamos y hacemos visible a la igu
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }
}
