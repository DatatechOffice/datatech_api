package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JTextField;

import DAO.DaoCliente;
import DAO.DaoEscolha;
import controlador.Cliente;
import controlador.Dados;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consulta {

	JFrame frmConsulta;
	private JTextField textField_CNPJ;
	private JTextField textField_Nome_Cliente;
	private JTextField textField_Razao_Social;
	private JTextField textField_Setor;
	private JTextField textField_Solucao;
	private JTextField textFieldProdutos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta window = new Consulta();
					window.frmConsulta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Consulta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConsulta = new JFrame();
		frmConsulta.getContentPane().setBackground(SystemColor.windowBorder);
		frmConsulta.getContentPane().setLayout(null);

		textField_CNPJ = new JTextField();
		textField_CNPJ.setFont(new Font("Arial", Font.BOLD, 15));
		textField_CNPJ.setColumns(10);
		textField_CNPJ.setBounds(10, 30, 300, 30);
		frmConsulta.getContentPane().add(textField_CNPJ);

		JLabel lblCpfcnpj = new JLabel("CNPJ:");
		lblCpfcnpj.setForeground(Color.WHITE);
		lblCpfcnpj.setFont(new Font("Arial", Font.BOLD, 20));
		lblCpfcnpj.setBounds(10, 10, 200, 20);
		frmConsulta.getContentPane().add(lblCpfcnpj);

		JButton btn_Consultar = new JButton("Consultar");
		btn_Consultar.setFont(new Font("Arial", Font.BOLD, 15));
		btn_Consultar.setBounds(331, 30, 150, 30);
		frmConsulta.getContentPane().add(btn_Consultar);

		JLabel lblNomeDoCliente = new JLabel("Nome do Cliente:");
		lblNomeDoCliente.setForeground(Color.WHITE);
		lblNomeDoCliente.setFont(new Font("Arial", Font.BOLD, 20));
		lblNomeDoCliente.setBounds(10, 70, 200, 20);
		frmConsulta.getContentPane().add(lblNomeDoCliente);

		textField_Nome_Cliente = new JTextField();
		textField_Nome_Cliente.setFont(new Font("Arial", Font.BOLD, 15));
		textField_Nome_Cliente.setColumns(10);
		textField_Nome_Cliente.setBounds(10, 90, 300, 30);
		frmConsulta.getContentPane().add(textField_Nome_Cliente);

		JLabel lblCpfcnpj_1_1 = new JLabel("Raz\u00E3o Social:");
		lblCpfcnpj_1_1.setForeground(Color.WHITE);
		lblCpfcnpj_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblCpfcnpj_1_1.setBounds(10, 130, 200, 20);
		frmConsulta.getContentPane().add(lblCpfcnpj_1_1);

		textField_Razao_Social = new JTextField();
		textField_Razao_Social.setFont(new Font("Arial", Font.BOLD, 15));
		textField_Razao_Social.setColumns(10);
		textField_Razao_Social.setBounds(10, 150, 300, 30);
		frmConsulta.getContentPane().add(textField_Razao_Social);

		JLabel lblCpfcnpj_1_2 = new JLabel("Setor:");
		lblCpfcnpj_1_2.setForeground(Color.WHITE);
		lblCpfcnpj_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblCpfcnpj_1_2.setBounds(10, 190, 200, 20);
		frmConsulta.getContentPane().add(lblCpfcnpj_1_2);

		textField_Setor = new JTextField();
		textField_Setor.setFont(new Font("Arial", Font.BOLD, 15));
		textField_Setor.setColumns(10);
		textField_Setor.setBounds(10, 210, 300, 30);
		frmConsulta.getContentPane().add(textField_Setor);

		JLabel lblCpfcnpj_1_3 = new JLabel("Solu\u00E7\u00E3o:");
		lblCpfcnpj_1_3.setForeground(Color.WHITE);
		lblCpfcnpj_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblCpfcnpj_1_3.setBounds(10, 250, 200, 20);
		frmConsulta.getContentPane().add(lblCpfcnpj_1_3);

		textField_Solucao = new JTextField();
		textField_Solucao.setFont(new Font("Arial", Font.BOLD, 15));
		textField_Solucao.setColumns(10);
		textField_Solucao.setBounds(10, 270, 300, 30);
		frmConsulta.getContentPane().add(textField_Solucao);

		JLabel lblCpfcnpj_1_3_1 = new JLabel("Entregas Possiveis:");
		lblCpfcnpj_1_3_1.setForeground(Color.WHITE);
		lblCpfcnpj_1_3_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblCpfcnpj_1_3_1.setBounds(10, 310, 200, 20);
		frmConsulta.getContentPane().add(lblCpfcnpj_1_3_1);

		JLabel lblCpfcnpj_1_3_2 = new JLabel("Entregas Minimas");
		lblCpfcnpj_1_3_2.setForeground(Color.WHITE);
		lblCpfcnpj_1_3_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblCpfcnpj_1_3_2.setBounds(331, 310, 200, 20);
		frmConsulta.getContentPane().add(lblCpfcnpj_1_3_2);

		JTextArea textArea_P = new JTextArea();
		textArea_P.setFont(new Font("Arial", Font.BOLD, 15));
		textArea_P.setBounds(10, 340, 200, 100);
		frmConsulta.getContentPane().add(textArea_P);

		JTextArea textArea_M = new JTextArea();
		textArea_M.setFont(new Font("Arial", Font.BOLD, 15));
		textArea_M.setBounds(331, 340, 200, 100);
		frmConsulta.getContentPane().add(textArea_M);

		JButton btn_Alterar = new JButton("Alterar");
		btn_Alterar.setFont(new Font("Arial", Font.BOLD, 15));
		btn_Alterar.setBounds(491, 451, 150, 30);
		frmConsulta.getContentPane().add(btn_Alterar);

		JButton btn_Deletar = new JButton("Deletar");
		btn_Deletar.setFont(new Font("Arial", Font.BOLD, 15));
		btn_Deletar.setBounds(491, 30, 150, 30);
		frmConsulta.getContentPane().add(btn_Deletar);

		textFieldProdutos = new JTextField();
		textFieldProdutos.setFont(new Font("Arial", Font.BOLD, 15));
		textFieldProdutos.setColumns(10);
		textFieldProdutos.setBounds(357, 210, 300, 30);
		frmConsulta.getContentPane().add(textFieldProdutos);

		JLabel lblCpfcnpj_1_3_3 = new JLabel("Produto(s):");
		lblCpfcnpj_1_3_3.setForeground(Color.WHITE);
		lblCpfcnpj_1_3_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblCpfcnpj_1_3_3.setBounds(357, 190, 200, 20);
		frmConsulta.getContentPane().add(lblCpfcnpj_1_3_3);

		JButton btn_Retornar = new JButton("Retornar");
		btn_Retornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// aqui setamos qual dela vai ser aberta
				Menu window = new Menu();
				// aqui setamos a nova tela como visivel
				window.frmMenu.setVisible(true);
				// e para nﾃｧﾂｸﾅ� ficar com duas telas abertas, ordenamos a atual a ficar
				// invisivel
				frmConsulta.setVisible(false);
			}
		});
		btn_Retornar.setFont(new Font("Arial", Font.BOLD, 15));
		btn_Retornar.setBounds(10, 451, 150, 30);
		frmConsulta.getContentPane().add(btn_Retornar);
		frmConsulta.setTitle("Consulta");
		frmConsulta.setBounds(100, 100, 800, 600);
		frmConsulta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// <------------------------------BOTﾃO PARA CONSULTAR CLIENTE NO
		// BANCO------------------------------>
		btn_Consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente c1 = new Cliente();
				Cliente p1 = new Cliente();
				Cliente p2 = new Cliente();
				Cliente p3 = new Cliente();
				Cliente p4 = new Cliente();
				Cliente p5 = new Cliente();
				Cliente p6 = new Cliente();
				Dados d1 = new Dados();
				Dados e1 = new Dados();
				Dados e2 = new Dados();
				Dados e3 = new Dados();
				

				c1.setvCNPJ_Cliente(textField_CNPJ.getText());

				DaoCliente daoExibirCliente = new DaoCliente();
				daoExibirCliente.buscarClientes(c1);

				// cria o select com o c1 para armazenar os dados
				textField_CNPJ.setText(c1.getvCNPJ_Cliente());
				textField_Nome_Cliente.setText(c1.getvNome_Cliente());
				textField_Razao_Social.setText(c1.getvSocial_Cliente());
				textField_Setor.setText(c1.getvSetor_Cliente());

				if (c1.getvId_Solucao() == 1) {
					textField_Solucao.setText("NxtDemand");
				}
				if (c1.getvId_Solucao() == 2) {
					textField_Solucao.setText("NxtOperations");
				}
				textArea_P.setText(c1.getvEntregaP_Cliente());
				textArea_M.setText(c1.getvEntregaM_Cliente());

				DaoEscolha daobuscarproduto = new DaoEscolha(p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
				daobuscarproduto.buscarEscolhaProduto(c1);

				textFieldProdutos.setText(Integer.toString(c1.getvId_Produto()));
			}
		});
		// <------------------------------FINAL DO BOTﾃO PARA CONSULTAR CLIENTE NO
		// BANCO------------------------------>

		// <------------------------------BOTﾃO PARA ALTERAR OS CAMPOS DE
		// CONSULTA------------------------------>
		btn_Alterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Cliente c1 = new Cliente();

				c1.setvCNPJ_Cliente(textField_CNPJ.getText());
				DaoCliente daoExibirCliente = new DaoCliente();
				daoExibirCliente.buscarClientes(c1);

				// CRIAR OS GET PARA MANDAR PRO BANCO OS CAMPOS

				c1.setvCNPJ_Cliente(textField_CNPJ.getText());
				c1.setvNome_Cliente(textField_Nome_Cliente.getText());
				c1.setvSocial_Cliente(textField_Razao_Social.getText());
				c1.setvSetor_Cliente(textField_Setor.getText());
				c1.setvSolucao_Cliente(textField_Solucao.getText());
				c1.setvEntregaP_Cliente(textArea_P.getText());
				c1.setvEntregaM_Cliente(textArea_M.getText());

				if (textField_Solucao.getText().equals("NxtDemand")) {
					
					c1.setvId_Solucao(1);
					DaoCliente daoAlteraCliente = new DaoCliente();
					daoAlteraCliente.atualizarCl(c1);

					// Trazer Tela limpa após deletar a tabela

					textField_Nome_Cliente.setText("");
					textField_Razao_Social.setText("");
					textField_Setor.setText("");
					textFieldProdutos.setText("");
					textField_Solucao.setText("");
					textArea_P.setText("");
					textArea_M.setText("");
					JOptionPane.showMessageDialog(null, "Alterado com Sucesso");

				} else {
					if (textField_Solucao.getText() .equals( "NxtOperations")) {
						c1.setvId_Solucao(2);
						DaoCliente daoAlteraCliente = new DaoCliente();
						daoAlteraCliente.atualizarCl(c1);

						// Trazer Tela limpa após deletar a tabela

						textField_Nome_Cliente.setText("");
						textField_Razao_Social.setText("");
						textField_Setor.setText("");
						textFieldProdutos.setText("");
						textField_Solucao.setText("");
						textArea_P.setText("");
						textArea_M.setText("");
						JOptionPane.showMessageDialog(null, "Alterado com Sucesso");

					} else {
						textField_Solucao.setText("NxtDemand ou NxtOperations");
						JOptionPane.showMessageDialog(null, "Digite novamente");

					}

				}

			}
		});
		// <------------------------------FINAL BOTﾃO PARA ALTERAR OS CAMPOS DE
		// CONSULTA------------------------------>

		// <------------------------------BOTﾃO PARA DELETAR UM
		// CLIENTE------------------------------>
		btn_Deletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Cliente c1 = new Cliente();

				c1.setvCNPJ_Cliente(textField_CNPJ.getText());
				DaoCliente daoExibirCliente = new DaoCliente();
				daoExibirCliente.buscarClientes(c1);

				DaoEscolha daoDeleteEscolha = new DaoEscolha();
				daoDeleteEscolha.deletarEscolha(c1);
				;

				DaoCliente daoDeleteCliente = new DaoCliente();
				daoDeleteCliente.deletarCl(c1);

				// Trazer Tela limpa após deletar a tabela
				textField_CNPJ.setText("");
				textField_Nome_Cliente.setText("");
				textField_Razao_Social.setText("");
				textField_Setor.setText("");
				textFieldProdutos.setText("");
				textField_Solucao.setText("");
				textArea_P.setText("");
				textArea_M.setText("");

				JOptionPane.showMessageDialog(null, "Deletado com Sucesso");

			}
		});
		// <------------------------------FINAL BOTﾃO PARA DELETAR O
		// CLIENTE------------------------------>

	}
}
