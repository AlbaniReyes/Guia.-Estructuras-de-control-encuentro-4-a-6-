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
public class Ejer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al 
        // usuario hasta que la suma de los números introducidos supere el límite inicial.|
        
        Scanner leer = new Scanner (System.in);
        int num;
        int suma = 0; 
        int limite = 20 ;
        
        while (suma<=limite) {
            System.out.println("*INGRESA NUMEROS ENTEROS AL AZAR*");
            num = leer.nextInt();
            suma = suma + num ;
        }
        
        System.out.println("La suma de los numeros ingresados es igual a " + suma);
    }
    
}
