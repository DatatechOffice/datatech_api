package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	JFrame frmMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.getContentPane().setBackground(SystemColor.windowBorder);
		frmMenu.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EscopoSelect window = new EscopoSelect();
				//aqui setamos a nova tela como visivel
				window.getFrmEscopoSelect().setVisible(true);
				//e para não ficar com duas telas abertas, ordenamos a atual a ficar invisivel
				frmMenu.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(300, 200, 180, 30);
		frmMenu.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ativa\u00E7\u00E3o do Cliente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							//aqui setamos qual dela vai ser aberta
							EscopoInsert window = new EscopoInsert();
							//aqui setamos a nova tela como visivel
							window.getFrmEscopoInsert().setVisible(true);
							//e para não ficar com duas telas abertas, ordenamos a atual a ficar invisivel
							frmMenu.setVisible(false);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_1.setBounds(300, 160, 180, 30);
		frmMenu.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cadastrar Usuario");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//abaixo colocaremos o if responsavel por comparar o login e senha digitado com o banco
				//if(){}
				//ação responsavel pelo transação de telas entre menu e cadstro
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							//aqui setamos qual dela vai ser aberta
							Cadastro window = new Cadastro();
							//aqui setamos a nova tela como visivel
							window.frmCadastro.setVisible(true);
							//e para não ficar com duas telas abertas, ordenamos a atual a ficar invisivel
							frmMenu.setVisible(false);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				//fim da transação de tela
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_2.setBounds(596, 10, 180, 30);
		frmMenu.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Deletar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EscopoDelete window = new EscopoDelete();
				//aqui setamos a nova tela como visivel
				window.getFrmEscopoDelete().setVisible(true);
				//e para não ficar com duas telas abertas, ordenamos a atual a ficar invisivel
				frmMenu.setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_3.setBounds(300, 241, 180, 30);
		frmMenu.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Atualizar");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EscopoUpdate window = new EscopoUpdate();
				//aqui setamos a nova tela como visivel
				window.getFrmEscopoUpdate().setVisible(true);
				//e para não ficar com duas telas abertas, ordenamos a atual a ficar invisivel
				frmMenu.setVisible(false);
			}
		});
		btnNewButton_3_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_3_1.setBounds(300, 282, 180, 30);
		frmMenu.getContentPane().add(btnNewButton_3_1);
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 800, 600);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
