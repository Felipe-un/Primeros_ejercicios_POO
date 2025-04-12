package primeros_ejercicios;

import java.util.Scanner;

/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio22 {
    public static void main(String[]args){
        
        /* 22. Escribir un programa en Java que lea un número entero por el 
        teclado e imprima todos los números impares menores que él. */
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero ENTERO: ");
        int entero = lector.nextInt();
        
        System.out.println("Los numeros impares menores que " + entero + " son: ");
        
        for (int i = 1; i < entero; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
            
        }
        
    }
}
