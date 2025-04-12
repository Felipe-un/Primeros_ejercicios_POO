package primeros_ejercicios;
/*
 * @author Felipe Béltran, Primeros 30 ejercicios.
 */
public class Ejercicio28 {
    public static void main(String[] args){
        
        /* 28. Implemente una sentencia switch que escriba un mensaje en cada 
        caso. Inclúyala en bucle de prueba for. Utilice también un break tras 
        cada caso y pruébelo. Elimine el break y vea que ocurre.*/
        
        //Si quitamos el break los casos se muestran hasta encontrar uno
        //o terminar la iteración.
        
        System.out.println("Probando la sentencia switch.");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i + ": ");
            
            switch (i) {
                case 1:
                    System.out.println("Hola, buenos días.");
                    break;
                case 2:
                    System.out.println("Hola, buenas tardes.");
                    break;
                case 3:
                    System.out.println("Hola, buenas noches.");
                    break;  
                default:
                    System.out.println("La opcion no es correcta.");;
            }  
        }   
    }
}
