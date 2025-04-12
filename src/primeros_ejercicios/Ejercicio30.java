package primeros_ejercicios;
/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio30 {
    public static void main(String[] args){
        
        /* 30. Escriba un programa que use dos bucles for anidados y el 
        operador de módulo (%) para detectar e imprimir números primos. */
        
        int limite = 100;
        
        System.out.println("Numeros primos del 2 al " + limite + ":");
        
        for (int numero = 2; numero <= limite; numero++) {
            boolean esPrimo = true;
            
            for (int divisor = 2; divisor <= numero / 2; divisor++) {
                if (numero % divisor == 0){
                    esPrimo = false;
                    break;
                }    
            }
            
            if (esPrimo) {
                System.out.println(numero + " ");
            }
        }
        
        
        
    }
}
