package classroom;

public class Persona {

    /*final static*/ long cedula = 3;
    String nombre;
    static int totalPersonas = 0;
    
   /* static{
        totalPersonas = 0;
        cedula = 3;
    }*/
    
    public Persona() {
    	this.nombre = "";
    	this. cedula = 3;
    	totalPersonas++;	
    }
    
    public Persona(long cedula, String nombre) { //Estudiantes1 envia long- String
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) { //Estudiantes1 envia entero
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = "";
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
