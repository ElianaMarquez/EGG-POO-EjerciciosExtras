
package ejercicio2extraguia7;

import Entidades.Puntos;
import Servicios.PuntoServicio;


public class Ejercicio2ExtraGuia7 {

    
    public static void main(String[] args) {
       PuntoServicio ps = new PuntoServicio();
       Puntos punto = ps.crearPunto();
       ps.distanciaPuntos(punto);
    }
    
}
