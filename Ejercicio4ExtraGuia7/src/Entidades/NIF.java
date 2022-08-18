
package Entidades;




public class NIF {
    //atributos
    private long dni;
    private String letra;

    
    //constructores

    public NIF() {
    }

    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }
    //getter y setter

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

   
    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

   

    @Override
    public String toString() {
        return "NIF " +  dni +" - " + letra ;
    }
   
    
    
}
/*
@Override
    public String toString() {
        return "NIF " + dni + "- " + letra ;
    }
       
    public void crearNif(){
        System.out.println("Ingrese el DNI: ");
        dni=leer.nextLong();
        int x = (int)dni%23;
        System.out.println("x tiene: "+ x);
       letra=vector[x];           
        
        
    }
*/