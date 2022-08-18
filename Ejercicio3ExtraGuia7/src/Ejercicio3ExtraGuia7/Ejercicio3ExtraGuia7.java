
package Ejercicio3ExtraGuia7;

import Entidades.Raices;
import java.util.Scanner;


public class Ejercicio3ExtraGuia7 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Raices cuadratica = new Raices();
        
        System.out.println("Ingrese el valor de a: ");
        cuadratica.setA(leer.nextFloat());
        System.out.println("Ingrese el valor de b: ");
        cuadratica.setB(leer.nextFloat());
        System.out.println("Ingrese el valor de c: ");
        cuadratica.setC(leer.nextFloat());
        System.out.println("*************");
        cuadratica.getDiscriminante();
        System.out.println("--------------");
        cuadratica.calcular();
        System.out.println("--------------");
                
    }
    
}
