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
public class Ejer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un programa que dado un número determine si es par o impar
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("INGRESE UN NUMERO");
        int num = leer.nextInt();
        
        if (num%2==0){
            System.out.println("ES UN NUMERO PAR");
        } else
            System.out.println("ES UN NUMERO IMPAR");
        
        
        
    }
    
}
