package primeros_ejercicios;

import java.util.Scanner;

/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio29 {
    public static void main(String[] args){
        
        /* 29. Cuando se lee una entrada estándar, por lo general se alcanza 
        el fin de archivo cuando el usuario teclea CTRL-D, CTRL-Z, o algún otro 
        carácter dependiente del sistema. Descubra cuál es el adecuado en su 
        sistema. Escriba un programa que lea datos controlando el fin de la 
        secuencia con la combinación adecuada. 
        */
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese numeros o Presione Ctrl Z para finalizar.");
        
        while (lector.hasNextInt()){
            int numero = lector.nextInt();
            System.out.println("Numero leído: " + numero);
        }
        
        System.out.println("Comando digitado");
        
        
    }
}
