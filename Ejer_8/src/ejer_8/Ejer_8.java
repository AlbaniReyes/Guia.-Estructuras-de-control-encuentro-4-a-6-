/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_8;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Ejer_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
        Scanner leer = new Scanner (System.in);
        int nota ;
        System.out.println("Ingresa una nota");
        nota = leer.nextInt();
        if (nota<=10) { 
            System.out.println("NOTA CORRECTA");
            } else if (nota>10) {
                while (nota>10) {
                System.out.println("INGRESE OTRA NOTA");
                nota = leer.nextInt();
                if (nota<=10) { 
                System.out.println("NOTA CORRECTA");
                }
                }
            }
    }
}

