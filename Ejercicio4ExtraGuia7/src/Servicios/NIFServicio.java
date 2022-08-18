
package Servicios;

import Entidades.NIF;
import java.util.Scanner;


public class NIFServicio {
     public NIF crearNif(){
        Scanner leer = new Scanner(System.in);
        NIF doc = new NIF();
        String longDni;
        String [] vector1 = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        do{
            System.out.println("Ingrese su Número de DNI, corrobore que sean 8 dígitos");
            doc.setDni(leer.nextLong());
           // longDni = doc.toString().length();
           longDni = Integer.toString((int)doc.getDni());
                
        }while (longDni.length() != 8);
        int calculoLetra = (int)doc.getDni() % 23;
       
        doc.setLetra(vector1[calculoLetra]); 
         
      return doc; 
     }    
     public void mostrarVector(NIF doc){
         System.out.println(doc.toString());
     }
    
}
