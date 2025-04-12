package primeros_ejercicios;

import java.util.Scanner;

/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio23 {
    public static void main(String[] args){
        
        /* 23. Implemente el algoritmo de Euclides para encontrar el gcd de dos 
        números leidos desde el teclado (Maximo común divisor). */
        
        System.out.println("MAXIMO COMUN DIVISOR");
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero1 = lector.nextInt();
        System.out.println("Ingrese otro numero: ");
        int numero2 = lector.nextInt();
        
        int mcd = calcularMCD(numero1, numero2);
        
        System.out.println("El MAXIMO COMUN DIVISOR de " + numero1 + " y " + numero2 + " es: " + mcd);
        
    }
    
        public static int calcularMCD(int a, int b) {
            while(b != 0){
                int temp = b;
                b = a % b;
                a = temp;
            }
            return Math.abs(a);
        }

}
