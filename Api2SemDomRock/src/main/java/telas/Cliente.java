package telas;

public class Cliente {
	//Atributo
	private String vCliente_Nome;
	private String vSolucao;
	private String vObjetivo;
	private String vEntregaM;
	private String vEntregaP;
	private String vEnvio;
	private Object vPrazo;
	
	//Atributo Produto
	
	//Constructor
	
	
	public Cliente(String vCliente) {
		this.vCliente_Nome = vCliente;

	}
	
	public Cliente(String vCliente,
					String vSolucao,
					String vObjetivo,
					String vEntregaM,
					String vEntregaP,
					String vEnvio,
					Object vPrazo) {
		
			this.vCliente_Nome = vCliente;
			this.vSolucao = vSolucao;
			this.vObjetivo = vObjetivo;
			this.vEntregaM = vEntregaM;
			this.vEntregaP = vEntregaP;
			this.vEnvio = vEnvio;
			this.vPrazo = vPrazo;

	}
	 //métodos de acesso do tipo getters e setters

	public Object getvPrazo() {
		return vPrazo;
	}

	public void setvPrazo(Object vPrazo) {
		this.vPrazo = vPrazo;
	}

	public String getvCliente() {
		return vCliente_Nome;
	}

	public void setvCliente(String vCliente) {
		this.vCliente_Nome = vCliente;
	}

	public String getvSolucao() {
		return vSolucao;
	}

	public void setvSolucao(String vSolucao) {
		this.vSolucao = vSolucao;
	}

	public String getvObjetivo() {
		return vObjetivo;
	}

	public void setvObjetivo(String vObjetivo) {
		this.vObjetivo = vObjetivo;
	}

	public String getvEntregaM() {
		return vEntregaM;
	}

	public void setvEntregaM(String vEntregaM) {
		this.vEntregaM = vEntregaM;
	}

	public String getvEntregaP() {
		return vEntregaP;
	}

	public void setvEntregaP(String vEntregaP) {
		this.vEntregaP = vEntregaP;
	}
	
	public String getvEnvio() {
		return vEnvio;
	}
	
	public void setvEnvio(String vEnvio) {
		this.vEnvio= vEnvio;
	}
	
	//métodos da classe

}