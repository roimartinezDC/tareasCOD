package Singleton;

/**
 * @author Roi Martínez
 */

public class Singleton {
    
    private String nombre;
    private int edad;
    private static Singleton instancia = null;
    
    private Singleton() {}
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
    
}
