package primeros_ejercicios;
/*
 * @author Felipe Béltran, primeros 30 ejercicios.
 */
public class Ejercicio17 {
    public static void main(String[] args){
        
        /* 17. Escribir un programa en Java que sume los cuadrados de los cien 
        primeros números naturales, mostrando el resultado en pantalla. */
        
        System.out.println("17. Suma de los cuadrados de los cien primeros");
        System.out.println("numeros naturales");
        
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i*i;     
        }
        
        System.out.println("    La suma de los cuadrados es: = " + suma);
    }
    
}
