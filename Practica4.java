
package practica4;

import java.util.Scanner;


public class Practica4 {

    public static void main(String[] args) {
        Scanner cambio = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad que desea convertir");
        double cantidad = cambio.nextDouble();
        
        cambio.nextLine();
        
        cambio.close();
        
        double dolares = (cantidad / 17.16);
        
        double euros = (cantidad / 18.26);
        
        cambio.close();
        
       System.out.println("Su monto en dolares es de: " + dolares + " Y tambien es equivalente a: " + euros + " euros");
       
    }
    
}
