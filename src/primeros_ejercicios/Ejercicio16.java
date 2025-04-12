package primeros_ejercicios;
/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio16 {
    
    public static void main(String[] args){
        
        /* 16. Escribir un programa en Java que multiplique los 20 primeros 
        números naturales */
        
        long multi = 1;
        System.out.println("16. Multiplicación de los 20 primeros números naturales");
        for (int i = 1; i <= 20; i++) {
            multi *= i;
            }
        
        System.out.println("La multiplicacion de los primeros 20 numeros naturales es: " + multi);
    }
    
}
