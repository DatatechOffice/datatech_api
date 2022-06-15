package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JMenu;

public class Menu {

	JFrame frmMenu;
	private final Action OpenEscopo = new SwingAction_4();
	private final Action OpenSilver = new SwingAction_6();
	private final Action OpenGold = new SwingAction_7();

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
				Consulta window = new Consulta();
				//aqui setamos a nova tela como visivel
				window.frmConsulta.setVisible(true);
				//e para não ficar com duas telas abertas, ordenamos a atual a ficar invisivel
				frmMenu.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(310, 273, 150, 30);
		frmMenu.getContentPane().add(btnNewButton);
		
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Ativa\u00E7\u00E3o do Cliente");
		menuBar.setBounds(310, 157, 150, 47);
		frmMenu.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ativa\u00E7\u00E3o do Cliente");
		mnNewMenu.setFont(new Font("Arial", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuEscopo = new JMenuItem("Escopo/Bronze");
		mntmNewMenuEscopo.setFont(new Font("Arial", Font.BOLD, 14));
		mntmNewMenuEscopo.setAction(OpenEscopo);
		mnNewMenu.add(mntmNewMenuEscopo);
		
		JMenuItem mntmNewMenuSilver = new JMenuItem("Silver");
		mntmNewMenuSilver.setFont(new Font("Arial", Font.BOLD, 14));
		mntmNewMenuSilver.setAction(OpenSilver);
		mnNewMenu.add(mntmNewMenuSilver);
		
		JMenuItem mntmNewMenuGold = new JMenuItem("Gold");
		mntmNewMenuGold.setFont(new Font("Arial", Font.BOLD, 14));
		mntmNewMenuGold.setAction(OpenGold);
		mnNewMenu.add(mntmNewMenuGold);
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 800, 600);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame getFrmMenu() {
		return frmMenu;
	}

	public void setFrmMenu(JFrame frmMenu) {
		this.frmMenu = frmMenu;
	}
	
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Escopo/Bronze");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			EscopoInsert window2 = new EscopoInsert();
			//aqui setamos a nova tela como visivel
			window2.getFrmEscopoInsert().setVisible(true);
			//e para não ficar com duas telas abertas, ordenamos a atual a ficar invisivel
			frmMenu.setVisible(false);
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "Silver");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Silver window = new Silver();
			//aqui setamos a nova tela como visivel
			window.setVisible(true);
			//e para não ficar com duas telas abertas, ordenamos a atual a ficar invisivel
			frmMenu.setVisible(false);
		}
	}
	private class SwingAction_7 extends AbstractAction {
		public SwingAction_7() {
			putValue(NAME, "Gold");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Gold window = new Gold();
			//aqui setamos a nova tela como visivel
			window.setVisible(true);
			//e para não ficar com duas telas abertas, ordenamos a atual a ficar invisivel
			frmMenu.setVisible(false);
		}
	}
}
