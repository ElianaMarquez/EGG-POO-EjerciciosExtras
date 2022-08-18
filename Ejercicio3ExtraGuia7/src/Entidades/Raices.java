
package Entidades;


public class Raices {
    //atributos
    private float a;
    private float b;
    private float c;
    private double discriminante;

    //constructores

    public Raices() {
    }

    public Raices(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //getter y setter

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    //toString

    @Override
    public String toString() {
        return "Raices{" + "a = " + a + ", b = " + b + ", c = " + c + '}';
    }
    
    
  public void getDiscriminante(){
     discriminante = Math.pow(b, 2) - 4 * a * c; 
      System.out.println("El discriminante es: "+ discriminante);
  }
  public boolean tieneRaices(){
     return discriminante > 0;
}  
  public boolean tieneRaiz (){
      return discriminante == 0;
      
  }
  public void obtenerRaices(){
      
      if(tieneRaices()){
          System.out.println("Raiz 1: "+( -b + ((Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a))));
          System.out.println("Raiz 2: "+( -b - ((Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a))));
      }
  }
  
  public void obtenerRaiz(){
      
      if(tieneRaiz()){
          System.out.println("Raiz 1: "+( -b + ((Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a))));
      }
  }
  
  public void calcular(){
      if (tieneRaiz()){
          obtenerRaiz();
      }else  if (tieneRaices()){
              obtenerRaices();
          }else{
          System.out.println("No existen soluciones");
      }
      }
      
  }

