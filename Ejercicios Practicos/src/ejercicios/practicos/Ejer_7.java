/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.practicos;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Ejer_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 
        
    Scanner leer = new Scanner(System.in);
        int correcto = 0 ;
        int incorrecto = 0 ;
        
        System.out.println("INGRESE UNA CADENA");
        String frase;
        do {
            
            frase = leer.nextLine();
            int largo = frase.length() ;
            String letra1= frase.substring(0,1);
            String letra2 = frase.substring((largo-1),largo);
           
            if (frase.equals("&&&&&")) {
                System.out.println("FIN DE ENVIOS");
                System.out.println("Se recibieron " + correcto + " cadenas correctas y " + incorrecto + " cadenas incorrectas");
                break;
            }
            if ( (largo==5) && ((letra1.equalsIgnoreCase("X")) && ((letra2.equalsIgnoreCase("O"))))) {
            System.out.println("CORRECTO - INGRESE UNA CADENA");
            correcto = correcto + 1 ; 
            } else {
            System.out.println("INCORRECTO - INGRESE UNA CADENA");
            incorrecto = incorrecto + 1 ;
             }   
        } while(!"&&&&&".equals(frase)) ;  
    }
}