package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DaoCliente;
import DAO.DaoSilver;
import DAO.DaoSilver_Gold;
import controlador.Cliente;
import controlador.Dados;
import controlador.GoldCon;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gold extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame gold;
	private JTextField textFieldCnpJGold;
	private JComboBox comboBoxSolucaoGold;
	private JComboBox comboBoxOperacaoDadosGold;
	private JLabel lbCnpjGold;
	private JLabel lbSolucao;
	private JLabel lbOperacaoDadosGold;
	private JButton btnConcluirGold;
	private JButton btnVoltarAoMenu;
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
	Dados t1 = new Dados();
	Dados t2 = new Dados();
	Dados t3 = new Dados();
	Dados t4 = new Dados();
	Dados t5 = new Dados();
	Dados t6 = new Dados();
	Dados t7 = new Dados();
	private int contador;
	GoldCon g1 = new GoldCon();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gold gold = new Gold();
					gold.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Gold() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbCnpjGold = new JLabel("CNPJ do Cliente:");
		lbCnpjGold.setHorizontalAlignment(SwingConstants.CENTER);
		lbCnpjGold.setForeground(Color.WHITE);
		lbCnpjGold.setFont(new Font("Arial", Font.BOLD, 16));
		lbCnpjGold.setBounds(-11, 11, 190, 22);
		contentPane.add(lbCnpjGold);

		textFieldCnpJGold = new JTextField();
		textFieldCnpJGold.setFont(new Font("Arial", Font.BOLD, 11));
		textFieldCnpJGold.setBounds(20, 37, 190, 22);
		contentPane.add(textFieldCnpJGold);
		textFieldCnpJGold.setColumns(10);

		lbSolucao = new JLabel("Solu\u00E7\u00E3o:");
		lbSolucao.setHorizontalAlignment(SwingConstants.CENTER);
		lbSolucao.setForeground(Color.WHITE);
		lbSolucao.setFont(new Font("Arial", Font.BOLD, 16));
		lbSolucao.setBounds(221, 15, 121, 14);
		contentPane.add(lbSolucao);

		String[] Solucoes = { "Nxt.Demand", "Nxt.Operations" };
		contentPane.setLayout(null);

		comboBoxSolucaoGold = new JComboBox(Solucoes);
		comboBoxSolucaoGold.setFont(new Font("Arial", Font.BOLD, 16));
		comboBoxSolucaoGold.setBounds(246, 34, 145, 22);
		contentPane.add(comboBoxSolucaoGold);

		lbOperacaoDadosGold = new JLabel("Opera\u00E7\u00E3o dos Dados:");
		lbOperacaoDadosGold.setHorizontalAlignment(SwingConstants.CENTER);
		lbOperacaoDadosGold.setForeground(Color.WHITE);
		lbOperacaoDadosGold.setFont(new Font("Arial", Font.BOLD, 16));
		lbOperacaoDadosGold.setBounds(10, 140, 190, 29);
		contentPane.add(lbOperacaoDadosGold);

		btnConcluirGold = new JButton("Concluir");
		btnConcluirGold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (c1.getvId_Solucao() == 1) {
					if (comboBoxOperacaoDadosGold.getSelectedItem() == "Matching") {
						g1.setvId_Gold(1);
							
						DaoSilver_Gold criarSilverGold = new DaoSilver_Gold(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
									t3, t4, t5, t6, t7, contador, g1);
							criarSilverGold.criarSilverGold();

					}
					if (comboBoxOperacaoDadosGold.getSelectedItem() == "Join") {
						g1.setvId_Gold(2);
						
							DaoSilver_Gold criarSilverGold = new DaoSilver_Gold(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
									t3, t4, t5, t6, t7, contador, g1);
							criarSilverGold.criarSilverGold();
							
							
					}
					if (comboBoxOperacaoDadosGold.getSelectedItem() == "Agregação") {
						g1.setvId_Gold(3);

							DaoSilver_Gold criarSilverGold = new DaoSilver_Gold(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
									t3, t4, t5, t6, t7, contador, g1);
							criarSilverGold.criarSilverGold();
							
					}
					if (comboBoxOperacaoDadosGold.getSelectedItem() == "Serie Temporal") {
						g1.setvId_Gold(4);

							DaoSilver_Gold criarSilverGold = new DaoSilver_Gold(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
									t3, t4, t5, t6, t7, contador, g1);
							criarSilverGold.criarSilverGold();
							
							
					}

				}
				if (c1.getvId_Solucao() == 2) {

					if (comboBoxOperacaoDadosGold.getSelectedItem() == "Matching") {
						g1.setvId_Gold(1);
							
							DaoSilver_Gold criarSilverGold = new DaoSilver_Gold(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
									t3, t4, t5, t6, t7, contador, g1);
							criarSilverGold.criarSilverGold();
							
							

					}
					if (comboBoxOperacaoDadosGold.getSelectedItem() == "Join") {
						g1.setvId_Gold(2);
							
							DaoSilver_Gold criarSilverGold = new DaoSilver_Gold(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
									t3, t4, t5, t6, t7, contador, g1);
							criarSilverGold.criarSilverGold();
							
					}
					if (comboBoxOperacaoDadosGold.getSelectedItem() == "Agregação") {
						g1.setvId_Gold(3);
							
							DaoSilver_Gold criarSilverGold = new DaoSilver_Gold(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
									t3, t4, t5, t6, t7, contador, g1);
							criarSilverGold.criarSilverGold();
					
					}
					if (comboBoxOperacaoDadosGold.getSelectedItem() == "Serie Temporal") {
						g1.setvId_Gold(4);
							
							DaoSilver_Gold criarSilverGold = new DaoSilver_Gold(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
									t3, t4, t5, t6, t7, contador, g1);
							criarSilverGold.criarSilverGold();
							
					}

				}
				JOptionPane.showMessageDialog(null, "Gold Atualizado com Sucesso!");
				/*
				 * else { JOptionPane.showMessageDialog(null,
				 * "Selecione um Cliente pelo CNPJ e pela Solução!"); }
				 */
			}

		});
		btnConcluirGold.setFont(new Font("Arial", Font.BOLD, 16));
		btnConcluirGold.setBounds(495, 426, 156, 29);
		contentPane.add(btnConcluirGold);

		btnVoltarAoMenu = new JButton("Voltar ao Menu");
		btnVoltarAoMenu.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {

						try {
							Menu window = new Menu();
							window.frmMenu.setVisible(true);
							gold.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnVoltarAoMenu.setFont(new Font("Arial", Font.BOLD, 15));
		btnVoltarAoMenu.setBounds(10, 427, 190, 29);
		contentPane.add(btnVoltarAoMenu);

		String[] OperacaoDados = { "Matching", "Join", "Agregação", "Serie Temporal" };
		contentPane.setLayout(null);
		comboBoxOperacaoDadosGold = new JComboBox(OperacaoDados);
		comboBoxOperacaoDadosGold.setFont(new Font("Arial", Font.BOLD, 15));
		comboBoxOperacaoDadosGold.setBounds(20, 180, 447, 35);
		contentPane.add(comboBoxOperacaoDadosGold);

		JButton btnSelecionarCliente = new JButton("Selecionar Cliente");
		btnSelecionarCliente.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				c1.setvCNPJ_Cliente(textFieldCnpJGold.getText());

				if (comboBoxSolucaoGold.getSelectedItem() == "Nxt.Demand") {
					c1.setvId_Solucao(1);
					c1.setvSolucao_Cliente("Nxt.Demand");

					DaoCliente daoExibirCliente = new DaoCliente();
					daoExibirCliente.buscarClientes(c1);

					DaoSilver buscarSilverProduto = new DaoSilver(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
							t3, t4, t5, t6, t7, contador);
					buscarSilverProduto.buscarSilverProduto();

					JOptionPane.showMessageDialog(null,
							"Cliente Selecionado: " + c1.getvCNPJ_Cliente() + " " + c1.getvSolucao_Cliente());
					System.out.println("Rolou");

				} else {
					c1.setvId_Solucao(2);
					c1.setvSolucao_Cliente("Nxt.Operations");

					DaoCliente daoExibirCliente = new DaoCliente();
					daoExibirCliente.buscarClientes(c1);

					DaoSilver buscarSilverProduto = new DaoSilver(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
							t3, t4, t5, t6, t7, contador);
					buscarSilverProduto.buscarSilverProduto();

					System.out.println("Rolou2");
					JOptionPane.showMessageDialog(null,
							"Cliente Selecionado: " + c1.getvCNPJ_Cliente() + " " + c1.getvSolucao_Cliente());
				}
			}

		});
		btnSelecionarCliente.setFont(new Font("Arial", Font.BOLD, 13));
		btnSelecionarCliente.setBounds(495, 31, 156, 29);
		contentPane.add(btnSelecionarCliente);
	}

	public JFrame getGold() {
		return gold;
	}
}