package primeros_ejercicios;
/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio15 {
    public static void main(String[] args){
        
        /* 15. Escribir un programa en Jasva que imprima por pantalla los
        cuadrados de los 30 primeros números naturales. */
        
        System.out.println("15. Cuadrados de los primeros 30 numeros naturales.");
        
        for (int i = 1; i <= 30; i++) {
            
            int cuadrado= i*i;
            System.out.println("    El cuadrado de " + i + " es " + cuadrado);
            
        }        
    } 
}
