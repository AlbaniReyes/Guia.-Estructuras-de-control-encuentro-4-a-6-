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
public class Ejer_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("=======================================");
        //System.out.println("=================MENU==================");
        //System.out.println("1 - SUMAR");
        //System.out.println("2 - RESTAR");
       // System.out.println("3 - MULTIPLICAR");
       // System.out.println("4 - DIVIDIR");
       // System.out.println("5 - SALIR");
        //System.out.println("=======================================");
        //System.out.println("Elija una opcion:");
        //System.out.println("=======================================");
        //int option = leerNum.nextInt();
       // System.out.println("=======================================");
        
        Scanner leer = new Scanner (System.in);
        Scanner entrada = new Scanner (System.in);
        int num1;
        int num2;
        String respuesta = "N" ;
                        
        System.out.println("*INGRESA 2 NUMEROS ENTEROS AL AZAR*");  
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        do {
        System.out.println("=======================================");
        System.out.println("=================MENU==================");
        System.out.println("1 - SUMAR");
        System.out.println("2 - RESTAR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("5 - SALIR");
        System.out.println("=======================================");
        System.out.println("Elija una opcion:");
        System.out.println("=======================================");
        int option = leer.nextInt();
        System.out.println("=======================================");        
        
        
        switch (option) {
            case 1: 
                System.out.println("La suma de los numeros ingresados es igual a " + (num1 + num2) );
            break;
            
            case 2:
                System.out.println("La resta de los numeros ingresados es igual a " + (num1 - num2) );
            break;
            
            case 3:
                System.out.println("La multiplicacion de los numeros ingresados es igual a " + (num1 * num2) );
            break;
            
            case 4:
                System.out.println("La division de los numeros ingresados es igual a " + (num1 / num2) );
            break;
            
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                respuesta = entrada.next();
            }
        } while (respuesta.equalsIgnoreCase("N")) ;
    }
}
