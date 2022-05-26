package controlador;

public class Usuario {
	String vNome_Usuario;
	String vSenha_Usuario;
	String vReSenha_Usuario;
	String vEmail_Usuario;
	
	//get e set do nome do suario
	public String getvNome_Usuario() {
		return vNome_Usuario;
	}
	public void setvNome_Usuario(String vNome_Usuario) {
		this.vNome_Usuario = vNome_Usuario;
	}
	
	//get e set da senha do usuario
	public String getvSenha_Usuario() {
		return vSenha_Usuario;
	}
	public void setvSenha_Usuario(String vSenha_Usuario) {
		this.vSenha_Usuario = vSenha_Usuario;
	}
	
	//get e set da resenha do usuario
	public String getvReSenha_Usuario() {
		return vReSenha_Usuario;
	}
	public void setvReSenha_Usuario(String vReSenha_Usuario) {
		this.vReSenha_Usuario = vReSenha_Usuario;
	}
	
	//get e set do email do usuario
	public String getvEmail_Usuario() {
		return vEmail_Usuario;
	}
	public void setvEmail_Usuario(String vEmail_Usuario) {
		this.vEmail_Usuario = vEmail_Usuario;
	}

	//construtor da classe usuario
	public Usuario(String vNome_Usuario, String vSenha_Usuario, String vResenha_Usuario, String vEmail_Usuario) {
		// TODO Auto-generated constructor stub
		this.vNome_Usuario = vNome_Usuario;
		this.vSenha_Usuario = vSenha_Usuario;
		this.vReSenha_Usuario = vResenha_Usuario;
		this.vEmail_Usuario = vEmail_Usuario;
	}

}
