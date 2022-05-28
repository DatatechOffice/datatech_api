package controlador;

import java.util.ArrayList;

public class Cliente {
	//ATRIBUTOS A SEREM USADOS NA TELA DO ESCOPO
	
	String vNome_Cliente;
	String vCNPJ_Cliente;
	String vSocial_Cliente;
	String vSetor_Cliente;
	String vSolucao_Cliente;
	String vOjetivo_Cliente;
	String vEntregaM_Cliente;
	String vEntregaP_Cliente;
	int vId;
	
	
	//FIM DOS ATRIBUTOS A SEREM USADO NA TELA DO ESCOPO
	
	//COMEÇO DOS GET E SETTERS DOS ATRIBUTOS
	
	//get e set do nome do cliente
	public String getvNome_Cliente() {
		return vNome_Cliente;
	}
	public void setvNome_Cliente(String vNome_Cliente) {
		this.vNome_Cliente = vNome_Cliente;
	}
	
	//GET E SET DO CNPJ DO CLIENTE
	public String getvCNPF_Cliente() {
		return vCNPJ_Cliente;
	}
	public void setvCNPF_Cliente(String vCNPF_Cliente) {
		this.vCNPJ_Cliente = vCNPF_Cliente;
	}
	
	//GET E SET DO NOME SOCIAL DA EMPRESA DO CLIENTE
	public String getvSocial_Cliente() {
		return vSocial_Cliente;
	}
	public void setvSocial_Cliente(String vSocial_Cliente) {
		this.vSocial_Cliente = vSocial_Cliente;
	}
	
	//GET E SET DO SETOR A QUAL A EMPRESA PERTENCE
	public String getvSetor_Cliente() {
		return vSetor_Cliente;
	}
	public void setvSetor_Cliente(String vSetor_Cliente) {
		this.vSetor_Cliente = vSetor_Cliente;
	}
	
	//GET E SET DA SOLUCAO QUE ESTARA ATIVANDO O CLIENTE
	public String getvSolucao_Cliente() {
		return vSolucao_Cliente;
	}
	public void setvSolucao_Cliente(String vSolucao_Cliente) {
		this.vSolucao_Cliente = vSolucao_Cliente;
	}
	
	//GET E SET DO OBJETIVO DO CLIENTE
	public String getvOjetivo_Cliente() {
		return vOjetivo_Cliente;
	}
	public void setvOjetivo_Cliente(String vOjetivo_Cliente) {
		this.vOjetivo_Cliente = vOjetivo_Cliente;
	}
	
	//GET E SET DA QUANTIDADE DE ENTREGAS MINIMAS
	public String getvEntregaM_Cliente() {
		return vEntregaM_Cliente;
	}
	public void setvEntregaM_Cliente(String vEntregaM_Cliente) {
		this.vEntregaM_Cliente = vEntregaM_Cliente;
	}
	
	//GET E SET DA QUANTIDADE POSSIVEL DE ENTREGA MINIMAS
	public String getvEntregaP_Cliente() {
		return vEntregaP_Cliente;
	}
	public void setvEntregaP_Cliente(String vEntregaP_Cliente) {
		this.vEntregaP_Cliente = vEntregaP_Cliente;
	}
	
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public Cliente(	String vNome_Cliente,
	String vCNPJ_Cliente,
	String vSocial_Cliente,
	String vSetor_Cliente,
	String vSolucao_Cliente,
	String vOjetivo_Cliente,
	String vEntregaM_Cliente,
	String vEntregaP_Cliente) {
		
		this.vNome_Cliente = vNome_Cliente;
		this.vCNPJ_Cliente = vCNPJ_Cliente;
		this.vSocial_Cliente = vSocial_Cliente;
		this.vSetor_Cliente = vSetor_Cliente;
		this.vSolucao_Cliente = vSolucao_Cliente;
		this.vOjetivo_Cliente = vOjetivo_Cliente;
		this.vEntregaP_Cliente = vEntregaP_Cliente;
		this.vEntregaM_Cliente = vEntregaM_Cliente;
		
	}

	public Cliente(int vId,
			String vNome_Cliente,
			String vCNPJ_Cliente,
			String vSocial_Cliente,
			String vSetor_Cliente,
			String vSolucao_Cliente,
			String vOjetivo_Cliente,
			String vEntregaM_Cliente,
			String vEntregaP_Cliente) {
		this.vId=vId;
		this.vNome_Cliente = vNome_Cliente;
		this.vCNPJ_Cliente = vCNPJ_Cliente;
		this.vSocial_Cliente = vSocial_Cliente;
		this.vSetor_Cliente = vSetor_Cliente;
		this.vSolucao_Cliente = vSolucao_Cliente;
		this.vOjetivo_Cliente = vOjetivo_Cliente;
		this.vEntregaP_Cliente = vEntregaP_Cliente;
		this.vEntregaM_Cliente = vEntregaM_Cliente;
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}	
}
