/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_10;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Ejer_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        // 5 *****
        // 3 ***
        // 11 ***********
        // 2 **
        
        Scanner leer = new Scanner (System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        
        System.out.println("*INGRESA 4 NUMEROS (ENTRE EL 1 Y EL 20)*");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        
        if (num1<=20) {
         System.out.print(num1);
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
                }else {
        System.out.print("El numero ingresado en invalido");  
           }
        
        System.out.println() ; 
        
        if (num2<=20) {
         System.out.print(num2);
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
                }else {
        System.out.print("El numero ingresado en invalido");  
           }
        
        System.out.println() ;
        
        if (num3<=20) {
         System.out.print(num3);
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
                }else {
        System.out.print("El numero ingresado en invalido");  
           }
        
        System.out.println() ;
        
        if (num4<=20) {
         System.out.print(num4);
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
                }else {
        System.out.print("El numero ingresado en invalido");  
           }    
        
        System.out.println() ;
    }
}
