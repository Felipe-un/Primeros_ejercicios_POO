package primeros_ejercicios;
/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio25 {
    public static void main(String[] args){
        
        /* 25. Pruebe la recursividad en Java. Escriba programas que calculen 
        recursivamente las funciones factorial (n) y Ackermann (x, y). */
        
        int n = 5;
        System.out.println("Factorial de " + n + " es: " + factorial(n));   
                
    }
    
    public static long factorial(int n){
        if (n <= 1){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
