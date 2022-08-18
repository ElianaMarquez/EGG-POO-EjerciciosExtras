
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;


public class PuntoServicio {
    Scanner leer = new Scanner(System.in);
    public Puntos crearPunto(){
        Puntos punto = new Puntos();
        System.out.println("Ingrese el valor para la coordenada x1: ");
        punto.setX1(leer.nextFloat());
        System.out.println("Ingrese el valor para la coordenada y1: ");
        punto.setY1(leer.nextFloat());
         System.out.println("Ingrese el valor para la coordenada x2: ");
        punto.setX2(leer.nextFloat());
        System.out.println("Ingrese el valor para la coordenada y2: ");
        punto.setY2(leer.nextFloat());
        
        return punto;
    }
    public void distanciaPuntos(Puntos punto){
        double distancia; 
        distancia = Math.sqrt(Math.pow(punto.getX2()-punto.getX1(), 2) + Math.pow(punto.getY2()-punto.getY1(), 2));
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
    
}
