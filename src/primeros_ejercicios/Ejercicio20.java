package primeros_ejercicios;

import java.util.Scanner;

/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio20 {
    public static void main(String[] args){
        
        /* 20. Escribir un programa en Java que calcule el área de un rectángulo
        del cúal se le proporcionará por el teclado su altura y anchura. */
        
        System.out.println("Área de un rectángulo");
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectangulo: ");
        double altura = lector.nextDouble();
        System.out.println("Ingrese el ancho del rectangulo: ");
        double anchura = lector.nextDouble();
        
        double area = altura * anchura;
        System.out.printf("El area del rectangulo es %.2f.\n", area);
        
        
    }
}
