/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Ejer_6 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        //Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
        Scanner leer = new Scanner (System.in);
        int num1;
        int num2;
        int num = 25;
        System.out.println("Ingresa 2 numeros enteros. El programa devolvera si son mayores a 25");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        if (num1>num) { 
        System.out.println(num1 + " es mayor a " + num);
        }        
        if (num2>num) {
        System.out.println(num2 + " es mayor a " + num);
        } 
        
        if (num1>=num & num2>=num) {
        System.out.println(num1 + " y " + num2 + " son mayores a " + num);
        } else if (num1<num & num2<num) {
        System.out.println(num1 + " y " + num2 + " son menores a " + num);
        }  
        
    }
    
}
