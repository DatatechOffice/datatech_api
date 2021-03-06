package layout;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DaoCliente;
import DAO.DaoSilver;
import controlador.Cliente;
import controlador.Dados;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import java.awt.Color;
import javax.swing.JTextField;

public class Silver extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame silver;
	private JComboBox comboBoxSolucaoSilver;
	private JComboBox comboBoxTipoArquivoSilver;
	private JCheckBox chckbxExtensaoPdfSilver;
	private JCheckBox chckbxTamanhoPdfSilver;
	private JCheckBox chckbxNomePdfSilver;
	private JCheckBox chckbxExtensaoJsonSilver;
	private JCheckBox chckbxTamanhoJsonSilver;
	private JCheckBox chckbxNomeJsonSilver;
	private JCheckBox chckbxExtensaoCsvSilver;
	private JCheckBox chckbxTamanhoCsvSilver;
	private JCheckBox chckbxLimiteLinhasCsvSilver;
	private JCheckBox chckbxNomeCsvSilver;
	private JCheckBox chckbxNomePlanilhasSilver;
	private JCheckBox chckbxTamanhoPlanilhasSilver;
	private JCheckBox chckbxTamanhoTabelasSilver;
	private JCheckBox chckbxNomeTabelasSilver;
	private JCheckBox chckbxTamanhoAudioSilver;
	private JCheckBox chckbxNomeAudioSilver;
	private JCheckBox chckbxTamanhoTextoSilver;
	private JCheckBox chckbxNomeTextoSilver;
	private JButton btnAvacarSilver;
	private JButton btnVoltarMenuSilver;
	private JLabel lbPdfSilver;
	private JLabel lbJsonSilver;
	private JLabel lbCsvSilver;
	private JLabel lbPlanilhasSilver;
	private JLabel lbTabelasSilver;
	private JLabel lbAudioSilver;
	private JLabel lbTextoSilver;
	private JLabel lbCnpjSilver;
	private JLabel lbSoluoSilver;
	private JTextField textFieldCnpjSilver;
	private int contador;
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

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Silver silver = new Silver();
					silver.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Silver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		chckbxExtensaoPdfSilver = new JCheckBox(".pdf");
		chckbxExtensaoPdfSilver.setForeground(Color.WHITE);
		chckbxExtensaoPdfSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxExtensaoPdfSilver.setBackground(Color.GRAY);
		chckbxExtensaoPdfSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExtensaoPdfSilver.setBounds(10, 115, 150, 23);
		contentPane.add(chckbxExtensaoPdfSilver);

		chckbxTamanhoPdfSilver = new JCheckBox("at?? 10 mb");
		chckbxTamanhoPdfSilver.setForeground(Color.WHITE);
		chckbxTamanhoPdfSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxTamanhoPdfSilver.setBackground(Color.GRAY);
		chckbxTamanhoPdfSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoPdfSilver.setBounds(10, 141, 150, 23);
		contentPane.add(chckbxTamanhoPdfSilver);

		chckbxNomePdfSilver = new JCheckBox("nome padronizado");
		chckbxNomePdfSilver.setForeground(Color.WHITE);
		chckbxNomePdfSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxNomePdfSilver.setBackground(Color.GRAY);
		chckbxNomePdfSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomePdfSilver.setBounds(10, 167, 150, 23);
		contentPane.add(chckbxNomePdfSilver);

		chckbxExtensaoJsonSilver = new JCheckBox(".yaml ou .yml");
		chckbxExtensaoJsonSilver.setForeground(Color.WHITE);
		chckbxExtensaoJsonSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxExtensaoJsonSilver.setBackground(Color.GRAY);
		chckbxExtensaoJsonSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExtensaoJsonSilver.setBounds(195, 115, 150, 23);
		contentPane.add(chckbxExtensaoJsonSilver);

		chckbxTamanhoJsonSilver = new JCheckBox("at?? 20 mb");
		chckbxTamanhoJsonSilver.setForeground(Color.WHITE);
		chckbxTamanhoJsonSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxTamanhoJsonSilver.setBackground(Color.GRAY);
		chckbxTamanhoJsonSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoJsonSilver.setBounds(195, 141, 150, 23);
		contentPane.add(chckbxTamanhoJsonSilver);

		chckbxNomeJsonSilver = new JCheckBox("nome padronizado");
		chckbxNomeJsonSilver.setForeground(Color.WHITE);
		chckbxNomeJsonSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxNomeJsonSilver.setBackground(Color.GRAY);
		chckbxNomeJsonSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomeJsonSilver.setBounds(195, 167, 150, 23);
		contentPane.add(chckbxNomeJsonSilver);

		chckbxExtensaoCsvSilver = new JCheckBox(".csv");
		chckbxExtensaoCsvSilver.setForeground(Color.WHITE);
		chckbxExtensaoCsvSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxExtensaoCsvSilver.setBackground(Color.GRAY);
		chckbxExtensaoCsvSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExtensaoCsvSilver.setBounds(415, 115, 150, 23);
		contentPane.add(chckbxExtensaoCsvSilver);

		chckbxTamanhoCsvSilver = new JCheckBox("at?? 1 mb");
		chckbxTamanhoCsvSilver.setForeground(Color.WHITE);
		chckbxTamanhoCsvSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxTamanhoCsvSilver.setBackground(Color.GRAY);
		chckbxTamanhoCsvSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoCsvSilver.setBounds(415, 141, 150, 23);
		contentPane.add(chckbxTamanhoCsvSilver);

		chckbxLimiteLinhasCsvSilver = new JCheckBox("at?? 1000 linhas");
		chckbxLimiteLinhasCsvSilver.setForeground(Color.WHITE);
		chckbxLimiteLinhasCsvSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxLimiteLinhasCsvSilver.setBackground(Color.GRAY);
		chckbxLimiteLinhasCsvSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxLimiteLinhasCsvSilver.setBounds(415, 167, 150, 23);
		contentPane.add(chckbxLimiteLinhasCsvSilver);

		chckbxNomeCsvSilver = new JCheckBox("nome padronizado");
		chckbxNomeCsvSilver.setForeground(Color.WHITE);
		chckbxNomeCsvSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxNomeCsvSilver.setBackground(Color.GRAY);
		chckbxNomeCsvSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomeCsvSilver.setBounds(415, 193, 150, 23);
		contentPane.add(chckbxNomeCsvSilver);

		chckbxNomePlanilhasSilver = new JCheckBox("nome padronizado");
		chckbxNomePlanilhasSilver.setForeground(Color.WHITE);
		chckbxNomePlanilhasSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxNomePlanilhasSilver.setBackground(Color.GRAY);
		chckbxNomePlanilhasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomePlanilhasSilver.setBounds(624, 141, 150, 23);
		contentPane.add(chckbxNomePlanilhasSilver);

		chckbxTamanhoPlanilhasSilver = new JCheckBox("at?? 10 mb");
		chckbxTamanhoPlanilhasSilver.setForeground(Color.WHITE);
		chckbxTamanhoPlanilhasSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxTamanhoPlanilhasSilver.setBackground(Color.GRAY);
		chckbxTamanhoPlanilhasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoPlanilhasSilver.setBounds(624, 115, 150, 23);
		contentPane.add(chckbxTamanhoPlanilhasSilver);

		chckbxTamanhoTabelasSilver = new JCheckBox("at??? 10 mb");
		chckbxTamanhoTabelasSilver.setForeground(Color.WHITE);
		chckbxTamanhoTabelasSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxTamanhoTabelasSilver.setBackground(Color.GRAY);
		chckbxTamanhoTabelasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoTabelasSilver.setBounds(10, 268, 150, 23);
		contentPane.add(chckbxTamanhoTabelasSilver);

		chckbxNomeTabelasSilver = new JCheckBox("nome padronizado");
		chckbxNomeTabelasSilver.setForeground(Color.WHITE);
		chckbxNomeTabelasSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxNomeTabelasSilver.setBackground(Color.GRAY);
		chckbxNomeTabelasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomeTabelasSilver.setBounds(10, 294, 150, 23);
		contentPane.add(chckbxNomeTabelasSilver);

		chckbxTamanhoAudioSilver = new JCheckBox("at?? 10 mb");
		chckbxTamanhoAudioSilver.setForeground(Color.WHITE);
		chckbxTamanhoAudioSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxTamanhoAudioSilver.setBackground(Color.GRAY);
		chckbxTamanhoAudioSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoAudioSilver.setBounds(195, 268, 150, 23);
		contentPane.add(chckbxTamanhoAudioSilver);

		chckbxNomeAudioSilver = new JCheckBox("nome padronizado");
		chckbxNomeAudioSilver.setForeground(Color.WHITE);
		chckbxNomeAudioSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxNomeAudioSilver.setBackground(Color.GRAY);
		chckbxNomeAudioSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomeAudioSilver.setBounds(195, 294, 150, 23);
		contentPane.add(chckbxNomeAudioSilver);

		chckbxTamanhoTextoSilver = new JCheckBox("at?? 10 mb");
		chckbxTamanhoTextoSilver.setForeground(Color.WHITE);
		chckbxTamanhoTextoSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxTamanhoTextoSilver.setBackground(Color.GRAY);
		chckbxTamanhoTextoSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTamanhoTextoSilver.setBounds(415, 268, 150, 23);
		contentPane.add(chckbxTamanhoTextoSilver);

		chckbxNomeTextoSilver = new JCheckBox("nome padronizado");
		chckbxNomeTextoSilver.setForeground(Color.WHITE);
		chckbxNomeTextoSilver.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxNomeTextoSilver.setBackground(Color.GRAY);
		chckbxNomeTextoSilver.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNomeTextoSilver.setBounds(415, 294, 150, 23);
		contentPane.add(chckbxNomeTextoSilver);

		String[] Solucoes = { "Nxt.Demand", "Nxt.Operations" };
		contentPane.setLayout(null);

		comboBoxSolucaoSilver = new JComboBox(Solucoes);
		comboBoxSolucaoSilver.setFont(new Font("Arial", Font.BOLD, 20));
		comboBoxSolucaoSilver.setBounds(453, 14, 159, 28);
		contentPane.add(comboBoxSolucaoSilver);

		String[] tiposArquivo = { "Selecione uma Op????o", "PDF", "JSON", "CSV", "Planilhas", "Tabelas", "Audio",
				"Texto" };
		contentPane.setLayout(null);

		comboBoxTipoArquivoSilver = new JComboBox(tiposArquivo);
		comboBoxTipoArquivoSilver.setFont(new Font("Arial", Font.BOLD, 11));
		comboBoxTipoArquivoSilver.setBounds(10, 51, 764, 20);
		comboBoxTipoArquivoSilver.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (comboBoxTipoArquivoSilver.getSelectedItem() == "Selecione uma Op????o") {
					hideAll();
				}
				if (comboBoxTipoArquivoSilver.getSelectedItem() == "PDF") {
					aparecerPdf();
				}
				if (comboBoxTipoArquivoSilver.getSelectedItem() == "JSON") {
					aparecerJson();
				}
				if (comboBoxTipoArquivoSilver.getSelectedItem() == "CSV") {
					aparecerCsv();
				}
				if (comboBoxTipoArquivoSilver.getSelectedItem() == "Planilhas") {
					aparecerPlanilhas();
				}
				if (comboBoxTipoArquivoSilver.getSelectedItem() == "Tabelas") {
					aparecerTabelas();
				}
				if (comboBoxTipoArquivoSilver.getSelectedItem() == "Audio") {
					aparecerAudio();
				}
				if (comboBoxTipoArquivoSilver.getSelectedItem() == "Texto") {
					aparecerTexto();
				}
			}
		});
		contentPane.add(comboBoxTipoArquivoSilver);

		btnAvacarSilver = new JButton("Avan??ar");
		btnAvacarSilver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					//

					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Gold gold = new Gold();
								gold.setVisible(true);
								silver.setVisible(false);

							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
			}
		});

		btnAvacarSilver.setFont(new Font("Arial", Font.BOLD, 15));
		btnAvacarSilver.setBounds(624, 520, 150, 30);
		contentPane.add(btnAvacarSilver);

		btnVoltarMenuSilver = new JButton("Voltar ao Menu");
		btnVoltarMenuSilver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Menu window = new Menu();
							window.frmMenu.setVisible(true);
							silver.setVisible(false);

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});

		btnVoltarMenuSilver.setFont(new Font("Arial", Font.BOLD, 15));
		btnVoltarMenuSilver.setBounds(10, 520, 150, 30);
		contentPane.add(btnVoltarMenuSilver);

		lbPdfSilver = new JLabel("PDF");
		lbPdfSilver.setForeground(Color.WHITE);
		lbPdfSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbPdfSilver.setFont(new Font("Arial", Font.BOLD, 25));
		lbPdfSilver.setBounds(10, 78, 150, 30);
		contentPane.add(lbPdfSilver);

		lbJsonSilver = new JLabel("JSON");
		lbJsonSilver.setForeground(Color.WHITE);
		lbJsonSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbJsonSilver.setFont(new Font("Arial", Font.BOLD, 25));
		lbJsonSilver.setBounds(195, 78, 150, 30);
		contentPane.add(lbJsonSilver);

		lbCsvSilver = new JLabel("CSV");
		lbCsvSilver.setForeground(Color.WHITE);
		lbCsvSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbCsvSilver.setFont(new Font("Arial", Font.BOLD, 25));
		lbCsvSilver.setBounds(415, 78, 150, 30);
		contentPane.add(lbCsvSilver);

		lbPlanilhasSilver = new JLabel("Planilhas");
		lbPlanilhasSilver.setForeground(Color.WHITE);
		lbPlanilhasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbPlanilhasSilver.setFont(new Font("Arial", Font.BOLD, 25));
		lbPlanilhasSilver.setBounds(624, 78, 150, 30);
		contentPane.add(lbPlanilhasSilver);

		lbTabelasSilver = new JLabel("Tabelas\r\n");
		lbTabelasSilver.setForeground(Color.WHITE);
		lbTabelasSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbTabelasSilver.setFont(new Font("Arial", Font.BOLD, 25));
		lbTabelasSilver.setBounds(10, 231, 150, 30);
		contentPane.add(lbTabelasSilver);

		lbAudioSilver = new JLabel("Audio");
		lbAudioSilver.setForeground(Color.WHITE);
		lbAudioSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbAudioSilver.setFont(new Font("Arial", Font.BOLD, 25));
		lbAudioSilver.setBounds(195, 231, 150, 30);
		contentPane.add(lbAudioSilver);

		lbTextoSilver = new JLabel("Texto");
		lbTextoSilver.setForeground(Color.WHITE);
		lbTextoSilver.setHorizontalAlignment(SwingConstants.CENTER);
		lbTextoSilver.setFont(new Font("Arial", Font.BOLD, 25));
		lbTextoSilver.setBounds(415, 231, 150, 30);
		contentPane.add(lbTextoSilver);

		textFieldCnpjSilver = new JTextField();
		textFieldCnpjSilver.setFont(new Font("Arial", Font.BOLD, 25));
		textFieldCnpjSilver.setBounds(94, 14, 225, 26);
		contentPane.add(textFieldCnpjSilver);
		textFieldCnpjSilver.setColumns(10);

		lbCnpjSilver = new JLabel("CNPJ:");
		lbCnpjSilver.setForeground(Color.WHITE);
		lbCnpjSilver.setFont(new Font("Arial", Font.BOLD, 25));
		lbCnpjSilver.setBounds(10, 14, 74, 26);
		contentPane.add(lbCnpjSilver);

		lbSoluoSilver = new JLabel("Solu????o:");
		lbSoluoSilver.setForeground(Color.WHITE);
		lbSoluoSilver.setFont(new Font("Arial", Font.BOLD, 25));
		lbSoluoSilver.setBounds(339, 14, 104, 26);
		contentPane.add(lbSoluoSilver);
		
		

		JButton btnSelecionarCliente = new JButton("Selecionar Cliente");
		btnSelecionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				c1.setvCNPJ_Cliente(textFieldCnpjSilver.getText());

				if (comboBoxSolucaoSilver.getSelectedItem() == "Nxt.Demand") {
					c1.setvId_Solucao(1);
					c1.setvSolucao_Cliente("Nxt.Demand");

					DaoCliente daoExibirCliente = new DaoCliente();
					daoExibirCliente.buscarClientes(c1);
					if(c1.getvId_Solucao() == 1) {		

					DaoSilver buscarSilverProduto = new DaoSilver(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
							t3, t4, t5, t6, t7, contador);
					buscarSilverProduto.buscarSilverProduto();

					JOptionPane.showMessageDialog(null,
							"Cliente Selecionado: " + c1.getvCNPJ_Cliente() + " " + c1.getvSolucao_Cliente());
					System.out.println("Rolou");
					}else {
						if((c1.getvId_Solucao() != 1) || (c1.getvId_Solucao() != 2)) {
							JOptionPane.showMessageDialog(null, "Cliente n??o possui essa Solu????o!");
						}
					}
				} else {
					c1.setvId_Solucao(2);
					c1.setvSolucao_Cliente("Nxt.Operations");

					DaoCliente daoExibirCliente = new DaoCliente();
					daoExibirCliente.buscarClientes(c1);
					if(c1.getvId_Solucao() == 2) {		

						DaoSilver buscarSilverProduto = new DaoSilver(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
								t3, t4, t5, t6, t7, contador);
						buscarSilverProduto.buscarSilverProduto();

						JOptionPane.showMessageDialog(null,
								"Cliente Selecionado: " + c1.getvCNPJ_Cliente() + " " + c1.getvSolucao_Cliente());
						System.out.println("Rolou");
						}else {
							if((c1.getvId_Solucao() != 1) || (c1.getvId_Solucao() != 2)) {
								JOptionPane.showMessageDialog(null, "Cliente n??o possui essa Solu????o!");
							}
						}
				}
			}
		});
		btnSelecionarCliente.setFont(new Font("Arial", Font.BOLD, 13));
		btnSelecionarCliente.setBounds(624, 14, 150, 30);
		contentPane.add(btnSelecionarCliente);

		JButton btnAvacarSilver_1 = new JButton("Tornar SilverOk");
		btnAvacarSilver_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (c1.getvId_Solucao() == 1) {
					for (int contador = 0; contador < 8; contador++) {
						DaoSilver buscarSilverDados = new DaoSilver(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
								t3, t4, t5, t6, t7, contador);
						buscarSilverDados.buscarSilverDados1();

						DaoSilver atualizarSOk = new DaoSilver(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
								t3, t4, t5, t6, t7, contador);
						atualizarSOk.atualizarSOk();}
				}
				if (c1.getvId_Solucao() == 2) {

					for (int contador = 0; contador < 8; contador++) {
						DaoSilver buscarSilverDados = new DaoSilver(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
								t3, t4, t5, t6, t7, contador);
						buscarSilverDados.buscarSilverDados1();

						DaoSilver atualizarSOk = new DaoSilver(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
								t3, t4, t5, t6, t7, contador);
						atualizarSOk.atualizarSOk();}
				}
				JOptionPane.showMessageDialog(null, "Silvers atualizados para SOK!");
				}
		});
		btnAvacarSilver_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnAvacarSilver_1.setBounds(624, 414, 150, 30);
		contentPane.add(btnAvacarSilver_1);

		hideAll();
	}

	public void hideAll() {
		chckbxExtensaoPdfSilver.setVisible(false);
		chckbxTamanhoPdfSilver.setVisible(false);
		chckbxNomePdfSilver.setVisible(false);
		chckbxExtensaoJsonSilver.setVisible(false);
		chckbxTamanhoJsonSilver.setVisible(false);
		chckbxNomeJsonSilver.setVisible(false);
		chckbxExtensaoCsvSilver.setVisible(false);
		chckbxTamanhoCsvSilver.setVisible(false);
		chckbxLimiteLinhasCsvSilver.setVisible(false);
		chckbxNomeCsvSilver.setVisible(false);
		chckbxNomePlanilhasSilver.setVisible(false);
		chckbxTamanhoPlanilhasSilver.setVisible(false);
		chckbxTamanhoTabelasSilver.setVisible(false);
		chckbxNomeTabelasSilver.setVisible(false);
		chckbxTamanhoAudioSilver.setVisible(false);
		chckbxNomeAudioSilver.setVisible(false);
		chckbxTamanhoTextoSilver.setVisible(false);
		chckbxNomeTextoSilver.setVisible(false);
		lbPdfSilver.setVisible(false);
		lbJsonSilver.setVisible(false);
		lbCsvSilver.setVisible(false);
		lbPlanilhasSilver.setVisible(false);
		lbTabelasSilver.setVisible(false);
		lbAudioSilver.setVisible(false);
		lbTextoSilver.setVisible(false);
	}

	public void aparecerPdf() {
		hideAll();
		lbPdfSilver.setVisible(true);
		chckbxExtensaoPdfSilver.setVisible(true);
		chckbxTamanhoPdfSilver.setVisible(true);
		chckbxNomePdfSilver.setVisible(true);
	}

	public void aparecerJson() {
		hideAll();
		lbJsonSilver.setVisible(true);
		chckbxExtensaoJsonSilver.setVisible(true);
		chckbxTamanhoJsonSilver.setVisible(true);
		chckbxNomeJsonSilver.setVisible(true);
	}

	public void aparecerCsv() {
		hideAll();
		lbCsvSilver.setVisible(true);
		chckbxExtensaoCsvSilver.setVisible(true);
		chckbxTamanhoCsvSilver.setVisible(true);
		chckbxLimiteLinhasCsvSilver.setVisible(true);
		chckbxNomeCsvSilver.setVisible(true);
	}

	public void aparecerPlanilhas() {
		hideAll();
		lbPlanilhasSilver.setVisible(true);
		chckbxNomePlanilhasSilver.setVisible(true);
		chckbxTamanhoPlanilhasSilver.setVisible(true);
	}

	public void aparecerTabelas() {
		hideAll();
		lbTabelasSilver.setVisible(true);
		chckbxTamanhoTabelasSilver.setVisible(true);
		chckbxNomeTabelasSilver.setVisible(true);
	}

	public void aparecerAudio() {
		hideAll();
		lbAudioSilver.setVisible(true);
		chckbxTamanhoAudioSilver.setVisible(true);
		chckbxNomeAudioSilver.setVisible(true);
	}

	public void aparecerTexto() {
		hideAll();
		lbTextoSilver.setVisible(true);
		chckbxTamanhoTextoSilver.setVisible(true);
		chckbxNomeTextoSilver.setVisible(true);
	}

	public JFrame getSilver() {
		return silver;
	}
}