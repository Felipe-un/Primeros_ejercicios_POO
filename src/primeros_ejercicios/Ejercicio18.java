package primeros_ejercicios;

import java.util.Scanner;

/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio18 {
    public static void main(String[] args){
        
        /* 18. Escribir un programa en Java que lea un número entero desde
        el teclado y realice la suma de los 100 números siguientes, mostrando
        el resultado en pantalla. */
        
        System.out.println("18. Suma de los 100 numeros siguientes al numero digitado");
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = lector.nextInt();
        int suma = 0;
        
        for (int i = 0; i <= 100; i++) {
            suma += numero + i;
                       
        }
        
        System.out.println("La suma de los 100 numeros siguientes es: " + suma);
        
        
    }
    
}
