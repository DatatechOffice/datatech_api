// pacote
package controlador;

// Classe
public class Usuario {
    //Atributos
    private String vNome_Usuario;
    private String vSenha_Usuario;
    private String vReSenha_Usuario;
    private String vEmail_Usuario;

    // Construtor
    public Usuario(String vNome_Usuario, String vSenha_Usuario, String vReSenha_Usuario, String vEmail_Usuario) {
        this.vNome_Usuario = vNome_Usuario;
        this.vSenha_Usuario = vSenha_Usuario;
        this.vReSenha_Usuario = vReSenha_Usuario;
        this.vEmail_Usuario = vEmail_Usuario;
    }

    public Usuario(String vNome_Usuario, String vSenha_Usuario, String vEmail_Usuario) {
        this.vNome_Usuario = vNome_Usuario;
        this.vSenha_Usuario = vSenha_Usuario;
        this.vEmail_Usuario = vEmail_Usuario;
    }
    
    public Usuario() {
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters
    public String getvNome_Usuario() {
        return vNome_Usuario;
    }
    public void setvNome_Usuario(String vNome_Usuario) {
        this.vNome_Usuario = vNome_Usuario;
    }

    public String getvSenha_Usuario() {
        return vSenha_Usuario;
    }
    public void setvSenha_Usuario(String vSenha_Usuario) {
        this.vSenha_Usuario = vSenha_Usuario;
    }

    public String getvReSenha_Usuario() {
        return vReSenha_Usuario;
    }
    public void setvReSenha_Usuario(String vReSenha_Usuario) {
        this.vReSenha_Usuario = vReSenha_Usuario;
    }

    public String getvEmail_Usuario() {
        return vEmail_Usuario;
    }
    public void setvEmail_Usuario(String vEmail_Usuario) {
        this.vEmail_Usuario = vEmail_Usuario;
    }
}
