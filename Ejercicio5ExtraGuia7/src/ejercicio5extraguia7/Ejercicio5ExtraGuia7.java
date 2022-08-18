
package ejercicio5extraguia7;

import java.util.Scanner;


public class Ejercicio5ExtraGuia7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre", "octubre","noviembre","diciembre"};
        String mesSecreto =  mes [ (int)(Math.random()*12)] ;
        String opcion;
        
         System.out.println("Cuál es el mes secreto??");
        do {
        opcion = leer.next();
        if (opcion.equalsIgnoreCase(mesSecreto))
               System.out.println("¡¡Ha acertado!!");
        else 
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
        } while (!opcion.equalsIgnoreCase(mesSecreto));
     
        }
    
}
