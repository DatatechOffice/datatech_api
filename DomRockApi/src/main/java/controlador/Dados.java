package controlador;

import java.util.ArrayList;

public class Dados {
	//Atributo
	private String vTipo;
	private int vQuantidade;
	private String vTempo;
	private String vEnvio;
	
	//<------------------------------GETTERS E SETTERS DA QUANTIDADE DE DADOS RECEBEIDOS------------------------------>
	public int getvQuantidade() {
		return vQuantidade;
	}
	public void setvQuantidade(int vQuantidade) {
		this.vQuantidade = vQuantidade;
	}
	
	//<------------------------------GETTERS E SETTERS DE EM QUANTO TEMPO OS DADOS SERÃO ENVIADOS------------------------------>
	public String getvTempo() {
		return vTempo;
	}
	public void setvTempo(String vTempo) {
		this.vTempo = vTempo;
	}
	//<------------------------------GETTERS E SETTERS DA FORMA DE ENVIO------------------------------>
	public String getvEnvio() {
		return vEnvio;
	}
	public void setvEnvio(String vEnvio) {
		this.vEnvio = vEnvio;
	}

	//<------------------------------GETTERS E SETTERS DO TIPO DE DADOS ENVIADOS------------------------------>
	public void setvTipo(String dados) {
		this.vTipo = dados;
	}
	public String getvTipo() {
		return vTipo;
	}
}