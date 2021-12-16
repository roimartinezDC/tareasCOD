package mastermind;

import java.util.Scanner;

public class Funcionamiento {

    public static boolean generarAleatorio(Tablero auxTablero) {
        auxTablero.setCifraAleatoria("54321");
        return true;
    }

    public static void pedirSecuencia(Tablero tablero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cifra Secuencia:");
        tablero.setCifraSecuencia(sc.next());
    }

    public static boolean comprobarSecuencia(String aleatoria, String secuencia) {
        boolean resultado = false;
        Tablero tab = Tablero.getInstance();
        String cadena = "";

        if (aleatoria.equals(secuencia)) {
            resultado = true;
        } else {
            for (int i = 0; i < aleatoria.length(); i++) {
                if (aleatoria.charAt(i)==secuencia.charAt(i)) {
                    cadena = cadena+"o";
                } else if (aleatoria.contains(String.valueOf(secuencia.charAt(i)))) {
                    cadena = cadena+"-";
                } else {
                    cadena = cadena+"x";
                }
            }

            tab.setCifraPista(cadena);
        }
        return resultado;
    }

    public static void mostrar(String entrada) {
        System.out.println(entrada);
    }

    public static void mostrarPista(String cifraPista) {
        System.out.println(cifraPista);
    }

}
