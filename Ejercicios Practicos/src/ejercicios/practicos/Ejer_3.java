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
public class Ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
        // Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
        // en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("INGRESE UNA FRASE");
        String frase = leer.nextLine();
        frase=frase.toUpperCase();
        
        int largo = frase.length() ;
        
        if (largo==8) {
            System.out.println("CORRECTO");
        } else
            System.out.println("INCORRECTO");
    }
    
}
