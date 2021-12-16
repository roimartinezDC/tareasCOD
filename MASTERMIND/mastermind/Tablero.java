package mastermind;

public class Tablero {
    private String cifraAleatorio;
    private String cifraSecuencia;
    private String cifraPista;
    private static Tablero instancia = null;

    private Tablero() {
    }

    public static Tablero getInstance() {
        if (instancia == null) {
            instancia = new Tablero();
        }
        return instancia;
    }


    public void setCifraAleatoria(String aleatorio) {
        cifraAleatorio = aleatorio;
    }
    public String getCifraAleatoria() {
        return cifraAleatorio;
    }

    public String getCifraSecuencia() {
        return cifraSecuencia;
    }
    public void setCifraSecuencia(String sec) {
        cifraSecuencia = sec;
    }

    public String getCifraPista() {
        return cifraPista;
    }
    public void setCifraPista(String list) {
        cifraPista = list;
    }

}
