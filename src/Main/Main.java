/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

/**
 *
 * @author edder
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona objPersona;
        objPersona = new Persona();
        
        objPersona.nombre = "Edder Sánchez";
        objPersona.añoNacimiento = 1992;
        
        System.out.println("Nombre de la persona: " + objPersona.nombre);
        System.out.println("Año de Nacimiento: " + objPersona.añoNacimiento);
    }
    
}
