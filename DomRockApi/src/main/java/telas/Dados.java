package telas;

import java.util.ArrayList;

import DAO.DaoTipo_Dados; 
public class Dados {
	//Atributo
	private String vTipo;
	private int vQuantidade;
	private String vTempo;
	private String vEnvio;
	
	/*public Dados(String vTipo) {
		this.vTipo = vTipo;

	}

	public Dados(int vQuantidade) {
		this.vQuantidade = vQuantidade;
	}
	
	public Dados(String vTempo, String vEnvio) {
		this.vTempo = vTempo;
		this.vEnvio = vEnvio;
	}*/
	
	
	
	
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

	public void setvTipo(String dados) {
		this.vTipo = dados;
	}
	public String getvTipo() {
		return vTipo;
	}
}
