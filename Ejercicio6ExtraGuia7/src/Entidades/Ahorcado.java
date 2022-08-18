
package Entidades;

import java.util.Scanner;
import java.util.Arrays;

public class Ahorcado {
    //Atributos
    private String [] palabra ;
    private int jugadasMaximas;
    private int encontradas;
   //genero un atributo mas, que va a ser un vector que se completará con las
    //letras encontradas
    private String [] vector;
    
    
    //constructores

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int jugadasMaximas, int encontradas) {
        this.palabra = palabra;
        this.jugadasMaximas = jugadasMaximas;
        this.encontradas = encontradas;
    }
   
    
    //toString

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", jugadasMaximas=" + jugadasMaximas + ", encontradas=" + encontradas + '}';
    }

     Scanner leer = new Scanner(System.in);

    public void imprimirVector(){
        
         for (int i=0;i<palabra.length;i++)
       {
            System.out.print(palabra[i]);
       }
         System.out.println(" ");
       for (int i=0;i<palabra.length;i++)
       {
            System.out.print(vector[i]);
       }
        System.out.println(" ");
       
   }
 
    

    public void crearJuego() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la palabra a buscar");
        //genero la variable palab para poder asignar valor en los atributos
        String palab = leer.next().toLowerCase();
        
        
        //asigno el tamaño a los vectores con la longitud de la palabra
        palabra = new String [palab.length()];
        vector = new String [palab.length()];
        
        //ingreso la palabra en el vector
        for (int i = 0; i < palab.length(); i++) {
            palabra [i] = palab.substring(i, i+1);
        }
        // inicializo vector con - e imprimo
        Arrays.fill(vector, "- ");
        
        //guardo en jugadasMaximas los ingresados por el usuario
        System.out.println("Ingrese la cantidad de jugadas máximas");
        jugadasMaximas = leer.nextInt();
        
        //inicio encontradas en 0
        encontradas = 0;
    }
    
    public void longitud(){
        System.out.println("La longitud de la palabra es " + palabra.length);
        imprimirVector();
        
    }
   
    public void buscar(String letra){
        //inicializo un vector igual a "palabra" para ordenarlo y poder usar 
        //binarySearch
        String ordenado [] = Arrays.copyOf(palabra, palabra.length);
        Arrays.sort(ordenado);
        int posicion = Arrays.binarySearch(ordenado, letra);
        if (posicion >= 0){
             System.out.println("Mensaje: la letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: la letra no pertenece a la palabra");
            jugadasMaximas--;
        }
        
    }

    public void encontradas(String letra){
        boolean estaLetra = true;
        
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equalsIgnoreCase(letra)){
                vector [i] = palabra[i];  
                encontradas++;
                estaLetra = true;
            }
        }
        if (estaLetra == false){
            jugadasMaximas--;
        }
        System.out.println("Número de letras (encontradas, faltantes): ("+encontradas+" , "+(palabra.length - encontradas)+")");
        
        //imprimo el vector con las letras encontradas
        String aux = "";
        for (String elemento:vector){
          aux = aux + " "+ elemento;  
        }
        System.out.println(aux);
    }
    
    public void intentos(){
        System.out.println("Número de oportunidades restantes: "+jugadasMaximas);
    }
    
    public void juego(){
        crearJuego();
        longitud();
        System.out.println("//////////////////\n\n");
        do {
         System.out.println("Ingrese la letra a buscar");
        String letra1 = leer.next();
          System.out.println("//////////////////\n\n");
        buscar(letra1);
        encontradas(letra1);
        intentos();
          System.out.println("//////////////////\n\n");
        }while (jugadasMaximas > 0 && encontradas < palabra.length);
    }
    
}



