package primeros_ejercicios;
/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicios1_9 {
    
    public static void main(String[] args) {
        
        //1.1 IMPRIMIR EN PANTALLA
        System.out.println("IMPRIMIR EN PANTALLA");
        
        /* 1. Escribir un programa en Java que imprima por pantalla la frase "Hola,
        ya se imprimir frases. */
        System.out.println("1. Hola, ya sé imprimir frases.");
               
        /* 2. Escribir un programa en Java que imprima por pantalla un número 
        entero, por ejemplo el 273, o el 597.*/
        int entero = 273;
        System.out.println("2. El número entero es: " + entero);
        
        
        /* 3. Escribir un programa en Java  que imprima por pantalla un número
        decimal, por ejemplo el 5,3 o el 7,5. */
        
        // Al usar float es necesario usar una f al final o cambiar el tipo de 
        // dato por un double
        float decimal = 7.5f;
        System.out.println("3. El número decimal es: " + decimal);
        
        // OPERACIONES BÁSICAS Y BUCLES
        System.out.println("");
        System.out.println("OPERACIONES BÁSICAS Y BUCLES");
        
        // Números:
        int numero1 = 1234;
        int numero2 = 532;
        
        /* 4. Escribir un programa en Java que imprima por pantalla la suma de
        1234 y 532. */

        int suma = numero1 + numero2;
        System.out.println("4. La suma de 1234 y 532 es: " + suma);
        
        /* 5. Escribir un programa en Java que imprima por pantalla la resta de 
        1234 y 532. */
        int resta = numero1 - numero2;
        System.out.println("5. La resta de 1234 y 532 es: " + resta);
        
        /* 6. Escribir un programa en Java que imprima por pantalla la 
        multiplicación de 1234 y 532. */
        int multi = numero1 * numero2;
        System.out.println("6. La multiplicación de 1234 y 532 es: " + multi);
        
        /* 7. Escribir un programa en Java que imprima por pantalla la 
        divisón de 1234 y 532. */
        float division = (float)numero1 / numero2;
        System.out.println("7. La división de 1234 y 532 es: " + division);
        
        /* 8. Escribir un programa en Java que imprima por pantalla los números
        del 1 al 3. */
        System.out.println("8. Numeros del 1 al 3");
        for (int i = 1; i < 4; i++) {
            System.out.println("    Numero: " + i);
        }
        
        /* 9. Escribir un programa en Java que imprima por pantalla los números
        del 1 al 9*/
        System.out.println("9. Numeros del 1 al 9");
        for (int i = 1; i < 10; i++) {
            System.out.println("    Numero: " + i);
        }
        
    }
    
}
