
package ejercicio1extraguia7;

import Entidades.Cancion;
import java.util.Scanner;


public class Ejercicio1ExtraGuia7 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion cancion1 = new Cancion(); 
     
        System.out.println("El título de la canción es: ");
        cancion1.setTitulo(leer.next());
        System.out.println("El autor de la canción es: ");
        cancion1.setAutor(leer.next());
        System.out.println(cancion1.toString()); 
        
        Cancion cancion2 = new Cancion("Mi bebito fiu fiu", "LBC");
        System.out.println(cancion2.toString());
        
        
    }
    
}
