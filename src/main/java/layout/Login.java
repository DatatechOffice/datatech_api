package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	JFrame frmLogin;
	private JTextField textField_Usuario;
	private JTextField textField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(SystemColor.windowBorder);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 800, 600);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Arial", Font.BOLD, 20));
		lblUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblUsuario.setBounds(350, 183, 100, 30);
		frmLogin.getContentPane().add(lblUsuario);
		
		textField_Usuario = new JTextField();
		textField_Usuario.setBackground(SystemColor.menu);
		textField_Usuario.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Usuario.setFont(new Font("Arial", Font.BOLD, 15));
		textField_Usuario.setBounds(250, 223, 300, 30);
		frmLogin.getContentPane().add(textField_Usuario);
		textField_Usuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Arial", Font.BOLD, 20));
		lblSenha.setAlignmentX(0.5f);
		lblSenha.setBounds(350, 265, 100, 30);
		frmLogin.getContentPane().add(lblSenha);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.menu);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Arial", Font.BOLD, 14));
		textField.setColumns(10);
		textField.setBounds(250, 305, 300, 30);
		frmLogin.getContentPane().add(textField);
		
		btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			//a��o do bot�o entrar onde vamos verificar no banco o login e senha e passar para tela menu
			public void actionPerformed(ActionEvent e) {
				
				//<------------------------------a��o responsavel pelo transa��o de tela de login para menu------------------------------>
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							//aqui setamos qual dela vai ser aberta
							Menu window = new Menu();
							//aqui setamos a nova tela como visivel
							window.frmMenu.setVisible(true);
							//e para n�o ficar com duas telas abertas, ordenamos a atual a ficar invisivel
							frmLogin.setVisible(false);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				//<------------------------------fim da a��o de transa��o------------------------------>
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(325, 369, 169, 21);
		frmLogin.getContentPane().add(btnNewButton);
	}
}
