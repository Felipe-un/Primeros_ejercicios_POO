package primeros_ejercicios;

import java.util.Scanner;

/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio21 {
    public static void main(String[] args){
        
        /* 21. Escribir un programa en Java que lea dos números del teclado
        y diga cual es el mayor y cual el menor*/
        
        System.out.println("Menor y mayor de dos numeros");
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        double numero1 = lector.nextDouble();
        
        System.out.println("Ingrese otro numero: ");
        double numero2 = lector.nextDouble();
        
        if (numero1 < numero2) {
            System.out.printf("El numero %.2f es mayor que el numero %.2f", numero2, numero1);
        } else {
            System.out.printf("El numero %.2f es mayor que el numero %.2f\n", numero1, numero2);            
        }
        
        
    }
}
