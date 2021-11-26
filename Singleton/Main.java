package Singleton;

/**
 * @author Roi Martínez
 */

public class Main {
    public static void main(String[] args) {
        Singleton instancia = Singleton.getInstancia();
        
        instancia.setEdad(18);
        instancia.setNombre("Roi");
        
        Singleton instancia2 = Singleton.getInstancia();
        
        System.out.println(instancia2.getNombre());
    }
}
