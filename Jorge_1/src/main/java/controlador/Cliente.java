// Pacote
package controlador;

// Imports
import java.util.ArrayList;

//Classe
public class Cliente {

    //Atributos
    private String vNome_Cliente;
    private String vCNPJ_Cliente;
    private String vNome_Cliente2;
    private String vCNPJ_Cliente2;
    private String vSocial_Cliente;
    private String vSetor_Cliente;
    private String vSolucao_Cliente;
    private String vObjetivo_Cliente;
    private String vEntregaM_Cliente;
    private String vEntregaP_Cliente;
    private int vId;

    // Construtor
    public Cliente(String vNome_Cliente, String vCNPJ_Cliente, String vSocial_Cliente, String vSetor_Cliente,
            String vSolucao_Cliente, String vObjetivo_Cliente, String vEntregaM_Cliente, String vEntregaP_Cliente) {
        this.vNome_Cliente = vNome_Cliente;
        this.vCNPJ_Cliente = vCNPJ_Cliente;
        this.vSocial_Cliente = vSocial_Cliente;
        this.vSetor_Cliente = vSetor_Cliente;
        this.vSolucao_Cliente = vSolucao_Cliente;
        this.vObjetivo_Cliente = vObjetivo_Cliente;
        this.vEntregaM_Cliente = vEntregaM_Cliente;
        this.vEntregaP_Cliente = vEntregaP_Cliente;
    }
    public Cliente(String vNome_Cliente, String vCNPJ_Cliente, String vSocial_Cliente, String vSetor_Cliente,
            String vSolucao_Cliente, String vObjetivo_Cliente, String vEntregaM_Cliente, String vEntregaP_Cliente
            , String vCNPJ_Cliente2, String vNome_Cliente2) {
        this.vNome_Cliente = vNome_Cliente;
        this.vCNPJ_Cliente = vCNPJ_Cliente;
        this.vSocial_Cliente = vSocial_Cliente;
        this.vSetor_Cliente = vSetor_Cliente;
        this.vSolucao_Cliente = vSolucao_Cliente;
        this.vObjetivo_Cliente = vObjetivo_Cliente;
        this.vEntregaM_Cliente = vEntregaM_Cliente;
        this.vEntregaP_Cliente = vEntregaP_Cliente;
        this.vCNPJ_Cliente2 = vCNPJ_Cliente2;
        this.vNome_Cliente2 = vNome_Cliente2;
    }
// Getters and Setters
    public String getvNome_Cliente() {
        return vNome_Cliente;
    }
    public void setvNome_Cliente(String vNome_Cliente) {
        this.vNome_Cliente = vNome_Cliente;
    }

    public String getvCNPJ_Cliente() {
        return vCNPJ_Cliente;
    }
    public void setvCNPJ_Cliente(String vCNPJ_Cliente) {
        this.vCNPJ_Cliente = vCNPJ_Cliente;
    }

    public String getvSocial_Cliente() {
        return vSocial_Cliente;
    }
    public void setvSocial_Cliente(String vSocial_Cliente) {
        this.vSocial_Cliente = vSocial_Cliente;
    }

    public String getvSetor_Cliente() {
        return vSetor_Cliente;
    }
    public void setvSetor_Cliente(String vSetor_Cliente) {
        this.vSetor_Cliente = vSetor_Cliente;
    }

    public String getvSolucao_Cliente() {
        return vSolucao_Cliente;
    }
    public void setvSolucao_Cliente(String vSolucao_Cliente) {
        this.vSolucao_Cliente = vSolucao_Cliente;
    }

    public String getvObjetivo_Cliente() {
        return vObjetivo_Cliente;
    }
    public void setvObjetivo_Cliente(String vObjetivo_Cliente) {
        this.vObjetivo_Cliente = vObjetivo_Cliente;
    }

    public String getvEntregaM_Cliente() {
        return vEntregaM_Cliente;
    }
    public void setvEntregaM_Cliente(String vEntregaM_Cliente) {
        this.vEntregaM_Cliente = vEntregaM_Cliente;
    }

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
		this.vObjetivo_Cliente = vOjetivo_Cliente;
		this.vEntregaP_Cliente = vEntregaP_Cliente;
		this.vEntregaM_Cliente = vEntregaM_Cliente;
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public String getvNome_Cliente2() {
		return vNome_Cliente2;
	}
	public void setvNome_Cliente2(String vNome_Cliente2) {
		this.vNome_Cliente2 = vNome_Cliente2;
	}
	public String getvCNPJ_Cliente2() {
		return vCNPJ_Cliente2;
	}
	public void setvCNPJ_Cliente2(String vCNPJ_Cliente2) {
		this.vCNPJ_Cliente2 = vCNPJ_Cliente2;
	}
	
}
