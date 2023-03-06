package classroom;

public class Persona {

    /*final*/ long cedula = 1; //= 3 // Variable inmutable
    String nombre;
    static int totalPersonas; // = 0
    
  /*static{ //Variable global
        totalPersonas = 0;
        //cedula = 3;
    }*/
    
    public Persona() {
    	this.nombre = "";
    	cedula = 0;
    	totalPersonas++;
   
    	//System.out.println(nombre+" con cc0 ="+cedula);
    }
    
    public Persona(long cedula, String nombre) { //Estudiantes1  long - String
        this.cedula = cedula;
        this.nombre = nombre;
       // System.out.println(nombre+" con cc1 ="+cedula);
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) { //Estudiantes1  String - long
        this.cedula = cedula;
        this.nombre = nombre;
        //System.out.println(nombre+" con cc2 ="+cedula);
        totalPersonas++;
    }

    public Persona(long cedula) { //Estudiantes1  long
        this.cedula = cedula;
        this.nombre = "";
        //System.out.println(nombre+" con cc3 ="+cedula);
        totalPersonas++;
    }
   

    public Persona(String nombre) {
        this.nombre = nombre;
        //System.out.println(nombre+" con cc4 ="+cedula);
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
