// Pacote
package controlador;

//Classe
public class Dados {
    //Atributos
    private String vTipo;
    private int vQuantidade;
    private String vTempo;
    private String vEnvio;


    // Construtor
    public Dados(String vTipo, int vQuantidade, String vTempo, String vEnvio) {
        this.vTipo = vTipo;
        this.vQuantidade = vQuantidade;
        this.vTempo = vTempo;
        this.vEnvio = vEnvio;
    }

    // Getters and Setters
    public String getvTipo() {
        return vTipo;
    }
    public void setvTipo(String vTipo) {
        this.vTipo = vTipo;
    }

    public int getvQuantidade() {
        return vQuantidade;
    }
    public void setvQuantidade(int vQuantidade) {
        this.vQuantidade = vQuantidade;
    }

    public String getvTempo() {
        return vTempo;
    }
    public void setvTempo(String vTempo) {
        this.vTempo = vTempo;
    }

    public String getvEnvio() {
        return vEnvio;
    }
    public void setvEnvio(String vEnvio) {
        this.vEnvio = vEnvio;
    }
}