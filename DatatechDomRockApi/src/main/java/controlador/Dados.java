// Pacote
package controlador;

//Classe
public class Dados {
    //Atributos
    private String vTipo;
    private String vQuantidade;
    private String vPrazo;
    private String vEnvio;
    private int vId_Dados;


    // Construtor
    public Dados(String vTipo, String vQuantidade, String vTempo, String vEnvio) {
        this.vTipo = vTipo;
        this.vQuantidade = vQuantidade;
        this.vPrazo = vTempo;
        this.vEnvio = vEnvio;
    }
    public Dados() {
    	
    }
	// Getters and Setters
    public String getvTipo() {
        return vTipo;
    }
    public void setvTipo(String vTipo) {
        this.vTipo = vTipo;
    }

    public String getvQuantidade() {
        return vQuantidade;
    }
    public void setvQuantidade(String vQuantidade) {
        this.vQuantidade = vQuantidade;
    }

    public String getvPrazo() {
        return vPrazo;
    }
    public void setvPrazo(String vPrazo) {
        this.vPrazo = vPrazo;
    }

    public String getvEnvio() {
        return vEnvio;
    }
    public void setvEnvio(String vEnvio) {
        this.vEnvio = vEnvio;
    }
	public int getvId_Dados() {
		return vId_Dados;
	}
	public void setvId_Dados(int vId_Dados) {
		this.vId_Dados = vId_Dados;
	}
}