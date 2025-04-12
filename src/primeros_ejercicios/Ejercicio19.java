package primeros_ejercicios;

import java.util.Scanner;

/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio19 {
    
    public static void main(String[] args){
        
        /* 19. Escribir un programa en Java que convierta de euros a dólares.
        Recibirá un número decimal correspondiente a la cantidad en euros y 
        contestará con la cantidad correspondiente en dólares. */
        
        Scanner lector = new Scanner(System.in);
        
        double tasadeconversion = 1.14;
        System.out.println("Ingrese la cantidad de euros: ");
        
        double euros = lector.nextDouble();
        
        double dolares = euros * tasadeconversion;
        
        System.out.printf("%.2f euros equivalen a %.2f dolares\n", euros, dolares);
        
    }
}
