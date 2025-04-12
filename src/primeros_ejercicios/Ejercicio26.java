package primeros_ejercicios;

import java.util.Scanner;

/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio26 {
    public static void main(String[] args){
        
        /* 26. Escriba un programa que lea tres numeros enteros positivos, y 
        que calcule e  imprima en pantalla el menor y el mayor de todos ellos. */
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Digite el primer numero entero: ");
        int numero1 = lector.nextInt();
        System.out.println("Digite el segundo numero entero: ");
        int numero2 = lector.nextInt();
        System.out.println("Digite el tercer numero entero: ");
        int numero3 = lector.nextInt();
        
        if (numero1 <= 0 || numero2 <= 0 || numero3 <= 0) {
            System.out.println("Todos los numeros deben ser enteros positivos");
        }
        
        // Calcular el mayor o menor de ellos.
        int mayor = numero1;
        int menor = numero1;
        
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        
        if (numero2 < menor) {
            menor = numero2;                   
        }
        if (numero3 < menor) {
            menor = numero3;                   
        }
        
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        
    }
}
