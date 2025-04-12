package primeros_ejercicios;

import java.util.Scanner;

/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio24 {
    public static void main(String[] args){
        
        /* 24. Escriba un programa que lea los coeficientes a, b, y c de una 
        ecuación de segundo grado, y estudie si tiene o no solución. En caso 
        positivo, las soluciones se calcularán e imprimirán en pantalla.*/
        
        System.out.println("Ecuacion de segundo grado");
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el primer coeficiente: ");
        double a = lector.nextInt();
        System.out.println("Ingrese el segundo coeficiente: ");
        double b = lector.nextInt();
        System.out.println("Ingrese el tercer coeficiente: ");
        double c = lector.nextInt();
        
        if (a == 0) {
            System.out.println("No es una ecuacion de segundo grado");  
        } else {
            double discriminante = b * b - 4 * a * c;
            
            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante))/(2*a);
                double x2 = (-b + Math.sqrt(discriminante))/(2*a);
                System.out.println("La ecuacion tiene dos soluciones reales");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
                
            }else if (discriminante == 0){
                double x = -b / (2 * a);
                System.out.println("La ecuacion tiene una solucion real: ");
                System.out.println("X = " + x);
                
            }else {
                System.out.println("La ecuacion no tiene soluciones reales.");
            }
        
        
        } 
        
        
        
    }
}
