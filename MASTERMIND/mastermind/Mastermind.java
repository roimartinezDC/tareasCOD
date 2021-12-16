package mastermind;

import javax.swing.*;

public class Mastermind {
    private static int intentos;

    public static void main(String[] args) {

        Tablero tab = Tablero.getInstance();

        Funcionamiento.generarAleatorio(tab);

        for(intentos = 0; intentos < 10; intentos++) {
            Funcionamiento.pedirSecuencia(tab);
            if (Funcionamiento.comprobarSecuencia(tab.getCifraAleatoria(), tab.getCifraSecuencia())) {
                Funcionamiento.mostrar("GANASTE");
                break;
            } else {
                Funcionamiento.mostrarPista(tab.getCifraPista());
            }
        }
        Funcionamiento.mostrar("FIN");
    }

    public void verCifra() {
        Tablero tab = Tablero.getInstance();
        System.out.println(tab.getCifraAleatoria());
    }
}
