/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_9;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Ejer_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
        // El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
        // Nota: recordar el uso de la sentencia break.
        
        Scanner leer = new Scanner (System.in);
        int num;
        int suma = 0; 
        int cont = 0 ;
        
        do {
            System.out.println("*INGRESA NUMEROS ENTEROS AL AZAR*");
            num = leer.nextInt();
            if (num>0) {
                cont=cont+1;
                suma = suma + num;
            } else if (num<0) {
                cont= cont+1;
                suma = suma + 0;
            }
            
            if (num==0){
                System.out.println("Se capturo el numero cero");
                System.out.println("Cantidad de números leídos: " + cont);
                System.out.println("La suma de los numeros ingresados es igual a " + suma);
            }    
            
            if (cont>=20){
                System.out.println("Se supero el numero de numeros permitidos");
                System.out.println("Cantidad de números leídos: " + cont);
                System.out.println("La suma de los numeros ingresados es igual a " + suma);
            } 
            
        } while (cont<20) ;
    }
}  