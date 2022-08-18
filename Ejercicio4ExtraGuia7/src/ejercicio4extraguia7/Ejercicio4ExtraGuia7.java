
package ejercicio4extraguia7;

import Entidades.NIF;
import Servicios.NIFServicio;


public class Ejercicio4ExtraGuia7 {

    
    public static void main(String[] args) {
        NIFServicio ns = new NIFServicio();
        NIF dnis = ns.crearNif();
        ns.mostrarVector(dnis);
    }
    
}
/*
package ej.extr.pkg4;

import NIF.NIF;


public class EjExtr4 {

  
    public static void main(String[] args) {
       NIF n= new NIF();
       n.crearNif();
        System.out.println(n);
    }
    
}

*/