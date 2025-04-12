package primeros_ejercicios;

import java.util.Scanner;

/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio27 {
    public static void main(String[] args){
        
        /* 27. Escriba un programa que lea temperaturas expresadas en grados 
        Fahrenheit y las convierta a grados celsius mostrándola. El programa 
        finalizará cuando lea un valor de temperatura igual a 999. La 
        conversión de grados Fahrenheit a Celsius está dad por C= 5/9(F-32). */
        
        Scanner lector = new Scanner(System.in);
        double fahrenheit;
        
        System.out.println("Ingrese la temperaturas en Fahrenheit (999 para salir):");
        
        while (true) {
            System.out.println("Temperatura (F): ");
            fahrenheit = lector.nextDouble();
            
            if (fahrenheit == 999){
                System.out.println("Fin.");
                break;
            }

            double celsius = (0.5/9)*(fahrenheit-32);
            System.out.printf("%.2f F = %.2f C\n", fahrenheit,celsius);
            
            
        }        
    }
}
