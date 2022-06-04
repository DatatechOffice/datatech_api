package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import DAO.DaoCliente;
import DAO.DaoUsuario;
import controlador.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro {

	JFrame frmCadastro;
	private JTextField textField_Usuario;
	private JTextField textField_Senha1;
	private JTextField textField_Senha2;
	private JTextField textField_Email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frmCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastro = new JFrame();
		frmCadastro.setTitle("Cadastro");
		frmCadastro.getContentPane().setBackground(SystemColor.windowBorder);
		frmCadastro.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite um Nome de Usuario");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(235, 80, 310, 29);
		frmCadastro.getContentPane().add(lblNewLabel);
		
		textField_Usuario = new JTextField();
		textField_Usuario.setFont(new Font("Arial", Font.BOLD, 15));
		textField_Usuario.setBounds(245, 119, 300, 29);
		frmCadastro.getContentPane().add(textField_Usuario);
		textField_Usuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Digite uma Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Arial", Font.BOLD, 20));
		lblSenha.setBounds(235, 158, 197, 29);
		frmCadastro.getContentPane().add(lblSenha);
		
		textField_Senha1 = new JTextField();
		textField_Senha1.setFont(new Font("Arial", Font.BOLD, 15));
		textField_Senha1.setColumns(10);
		textField_Senha1.setBounds(245, 197, 300, 29);
		frmCadastro.getContentPane().add(textField_Senha1);
		
		JLabel lblDigiteASenha = new JLabel("Digite a senha novamente");
		lblDigiteASenha.setForeground(Color.WHITE);
		lblDigiteASenha.setFont(new Font("Arial", Font.BOLD, 20));
		lblDigiteASenha.setBounds(235, 236, 310, 29);
		frmCadastro.getContentPane().add(lblDigiteASenha);
		
		textField_Senha2 = new JTextField();
		textField_Senha2.setFont(new Font("Arial", Font.BOLD, 15));
		textField_Senha2.setColumns(10);
		textField_Senha2.setBounds(245, 275, 300, 29);
		frmCadastro.getContentPane().add(textField_Senha2);
		
		JLabel lblEmail = new JLabel("Digite um E-Mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Arial", Font.BOLD, 20));
		lblEmail.setBounds(235, 314, 197, 29);
		frmCadastro.getContentPane().add(lblEmail);
		
		textField_Email = new JTextField();
		textField_Email.setFont(new Font("Arial", Font.BOLD, 15));
		textField_Email.setColumns(10);
		textField_Email.setBounds(245, 353, 300, 29);
		frmCadastro.getContentPane().add(textField_Email);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!textField_Usuario.getText().equals("") &&
						!textField_Senha1.getText().equals("") &&
						!textField_Senha2.getText().equals("") &&
						!textField_Email.getText().equals("")) {
					
					//chamando a classe usuario atraves de um objeto
					Usuario usuario = new Usuario(textField_Usuario.getText(), textField_Senha1.getText(), textField_Senha2.getText(), textField_Email.getText());
					
					//utilizando um if para comparar se a senha e a re-senha são equivalantes
					if(usuario.getvSenha_Usuario().equals(usuario.getvReSenha_Usuario())) {
						
						 DaoUsuario daoCriarUsuario = new DaoUsuario(); 
						 daoCriarUsuario.criarUS(usuario);
						
						//Metodo para retorna para a tela de login após o caastro ser confirmado
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Login window = new Login();
									window.frmLogin.setVisible(true);
									frmCadastro.setVisible(false);
									
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
						//fim do metodo de retorno para o login
						
					}else {
						JOptionPane.showMessageDialog(null, "As senhas não são equivalentes");
						System.out.println();
						textField_Senha1.setText("");
						textField_Senha2.setText("");
					}
					//fim do if e else de comparação de senha e re-senha

					
				}else {
					JOptionPane.showInternalMessageDialog(null, "Por favor preencha todos os dados");
				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(304, 413, 150, 29);
		frmCadastro.getContentPane().add(btnNewButton);
		
		JButton btnRetornarCadastro = new JButton("Retornar");
		btnRetornarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu window = new Menu();
				window.frmMenu.setVisible(true);
				frmCadastro.setVisible(false);
			}
		});
		btnRetornarCadastro.setFont(new Font("Arial", Font.BOLD, 20));
		btnRetornarCadastro.setBounds(31, 413, 150, 29);
		frmCadastro.getContentPane().add(btnRetornarCadastro);
		frmCadastro.setBounds(100, 100, 800, 600);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	
	
	
	

}
