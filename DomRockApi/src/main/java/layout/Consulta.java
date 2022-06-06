package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JTextField;

import DAO.DaoCliente;
import DAO.DaoEscolha;
import DAO.DaoEscolha_Dados;
import controlador.Cliente;
import controlador.Dados;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
		btn_Consultar.setBounds(197, 451, 150, 30);
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
		textField_Razao_Social.setBounds(10, 149, 300, 30);
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
		lblCpfcnpj_1_3_1.setBounds(110, 310, 200, 20);
		frmConsulta.getContentPane().add(lblCpfcnpj_1_3_1);

		JLabel lblCpfcnpj_1_3_2 = new JLabel("Entregas Minimas:");
		lblCpfcnpj_1_3_2.setForeground(Color.WHITE);
		lblCpfcnpj_1_3_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblCpfcnpj_1_3_2.setBounds(486, 310, 200, 20);
		frmConsulta.getContentPane().add(lblCpfcnpj_1_3_2);

		JTextArea textArea_P = new JTextArea();
		textArea_P.setFont(new Font("Arial", Font.BOLD, 15));
		textArea_P.setBounds(110, 340, 200, 100);
		frmConsulta.getContentPane().add(textArea_P);

		JTextArea textArea_M = new JTextArea();
		textArea_M.setFont(new Font("Arial", Font.BOLD, 15));
		textArea_M.setBounds(486, 340, 200, 100);
		frmConsulta.getContentPane().add(textArea_M);

		JButton btn_Alterar = new JButton("Alterar");
		btn_Alterar.setFont(new Font("Arial", Font.BOLD, 15));
		btn_Alterar.setBounds(446, 451, 150, 30);
		frmConsulta.getContentPane().add(btn_Alterar);

		JButton btn_Deletar = new JButton("Deletar");
		btn_Deletar.setFont(new Font("Arial", Font.BOLD, 15));
		btn_Deletar.setBounds(624, 451, 150, 30);
		frmConsulta.getContentPane().add(btn_Deletar);
		
		JCheckBox vEnvio_API = new JCheckBox("API");
		vEnvio_API.setForeground(Color.WHITE);
		vEnvio_API.setFont(new Font("Arial", Font.BOLD, 15));
		vEnvio_API.setBackground(SystemColor.windowBorder);
		vEnvio_API.setBounds(584, 113, 150, 31);
		frmConsulta.getContentPane().add(vEnvio_API);
		
		JCheckBox vEnvio_SFTP = new JCheckBox("SFTP");
		vEnvio_SFTP.setForeground(Color.WHITE);
		vEnvio_SFTP.setFont(new Font("Arial", Font.BOLD, 15));
		vEnvio_SFTP.setBackground(SystemColor.windowBorder);
		vEnvio_SFTP.setBounds(584, 90, 150, 31);
		frmConsulta.getContentPane().add(vEnvio_SFTP);
		
		JCheckBox vEnvio_Upload = new JCheckBox("Upload");
		vEnvio_Upload.setForeground(Color.WHITE);
		vEnvio_Upload.setFont(new Font("Arial", Font.BOLD, 15));
		vEnvio_Upload.setBackground(SystemColor.windowBorder);
		vEnvio_Upload.setBounds(584, 67, 150, 31);
		frmConsulta.getContentPane().add(vEnvio_Upload);
		
		JCheckBox vProduto_Vox = new JCheckBox("Nxt.Demand Vox");
		vProduto_Vox.setForeground(SystemColor.text);
		vProduto_Vox.setBackground(SystemColor.windowBorder);
		vProduto_Vox.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Vox.setBounds(329, 67, 175, 30);
		frmConsulta.getContentPane().add(vProduto_Vox);

		JCheckBox vProduto_Optimization = new JCheckBox("Nxt.Operations Optimization");
		vProduto_Optimization.setForeground(SystemColor.text);
		vProduto_Optimization.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Optimization.setBackground(SystemColor.windowBorder);
		vProduto_Optimization.setBounds(331, 190, 240, 30);
		frmConsulta.getContentPane().add(vProduto_Optimization);

		JCheckBox vProduto_Matching = new JCheckBox("Nxt.Operations Matching");
		vProduto_Matching.setForeground(Color.WHITE);
		vProduto_Matching.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Matching.setBackground(SystemColor.windowBorder);
		vProduto_Matching.setBounds(331, 224, 222, 30);
		frmConsulta.getContentPane().add(vProduto_Matching);

		JCheckBox vProduto_Sales = new JCheckBox("Nxt.Demand Sales");
		vProduto_Sales.setForeground(Color.WHITE);
		vProduto_Sales.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Sales.setBackground(SystemColor.windowBorder);
		vProduto_Sales.setBounds(329, 96, 175, 30);
		frmConsulta.getContentPane().add(vProduto_Sales);

		JCheckBox vProduto_Marketing = new JCheckBox("Nxt.Demand Marketing");
		vProduto_Marketing.setForeground(Color.WHITE);
		vProduto_Marketing.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Marketing.setBackground(SystemColor.windowBorder);
		vProduto_Marketing.setBounds(331, 161, 200, 30);
		frmConsulta.getContentPane().add(vProduto_Marketing);

		JCheckBox vProduto_Pricing = new JCheckBox("Nxt.Demand Pricing");
		vProduto_Pricing.setForeground(Color.WHITE);
		vProduto_Pricing.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Pricing.setBackground(SystemColor.windowBorder);
		vProduto_Pricing.setBounds(329, 127, 175, 30);
		frmConsulta.getContentPane().add(vProduto_Pricing);

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
		
		JLabel lblFormaenvio = new JLabel("Formas_Envio:");
		lblFormaenvio.setForeground(Color.WHITE);
		lblFormaenvio.setFont(new Font("Arial", Font.BOLD, 20));
		lblFormaenvio.setBounds(584, 33, 200, 27);
		frmConsulta.getContentPane().add(lblFormaenvio);
		
		JLabel lblProdutos = new JLabel("Produtos:");
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setFont(new Font("Arial", Font.BOLD, 20));
		lblProdutos.setBounds(331, 33, 200, 20);
		frmConsulta.getContentPane().add(lblProdutos);
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

				// cria o select com o c1 para armazenar os dados
				
				if (textField_Solucao.getText().equals("NxtDemand")) {
					c1.setvCNPJ_Cliente(textField_CNPJ.getText());
					c1.setvId_Solucao(1);
					
					DaoCliente daoExibirCliente = new DaoCliente();
					daoExibirCliente.buscarClientes(c1);
					
					DaoEscolha daobuscarproduto = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
					daobuscarproduto.buscarEscolhaProduto();

					
					// Trazer Tela limpa após deletar a tabela

					textField_CNPJ.setText(c1.getvCNPJ_Cliente());
					textField_Nome_Cliente.setText(c1.getvNome_Cliente());
					textField_Razao_Social.setText(c1.getvSocial_Cliente());
					textField_Setor.setText(c1.getvSetor_Cliente());
					textArea_P.setText(c1.getvEntregaP_Cliente());
					textArea_M.setText(c1.getvEntregaM_Cliente());
					textField_Solucao.setText("NxtDemand");
				} else {
					if (textField_Solucao.getText() .equals("NxtOperations")) {
						c1.setvCNPJ_Cliente(textField_CNPJ.getText());
						c1.setvId_Solucao(2);
						
						DaoCliente daoExibirCliente = new DaoCliente();
						daoExibirCliente.buscarClientes(c1);
						
						DaoEscolha daobuscarproduto = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						daobuscarproduto.buscarEscolhaProduto();

					

						// Trazer Tela limpa após deletar a tabela

						textField_CNPJ.setText(c1.getvCNPJ_Cliente());
						textField_Nome_Cliente.setText(c1.getvNome_Cliente());
						textField_Razao_Social.setText(c1.getvSocial_Cliente());
						textField_Setor.setText(c1.getvSetor_Cliente());
						textArea_P.setText(c1.getvEntregaP_Cliente());
						textArea_M.setText(c1.getvEntregaM_Cliente());
						textField_Solucao.setText("NxtOperations");
					} else {
						textField_Solucao.setText("NxtDemand ou NxtOperations");
						JOptionPane.showMessageDialog(null, "Digite: NxtDemand ou Operations");
					}			
			}
		}
		});
		// <------------------------------FINAL DO BOTﾃO PARA CONSULTAR CLIENTE NO
		// BANCO------------------------------>

		// <------------------------------BOTﾃO PARA ALTERAR OS CAMPOS DE
		// CONSULTA------------------------------>
		btn_Alterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Cliente c1 = new Cliente();

				

				// CRIAR OS GET PARA MANDAR PRO BANCO OS CAMPOS

				if (textField_Solucao.getText().equals("NxtDemand")) {
					
					c1.setvId_Solucao(1);
					c1.setvCNPJ_Cliente(textField_CNPJ.getText());
					
					DaoCliente daoExibirCliente = new DaoCliente();
					daoExibirCliente.buscarClientes(c1);
					
					c1.setvCNPJ_Cliente(textField_CNPJ.getText());
					c1.setvNome_Cliente(textField_Nome_Cliente.getText());
					c1.setvSocial_Cliente(textField_Razao_Social.getText());
					c1.setvSetor_Cliente(textField_Setor.getText());
					c1.setvEntregaP_Cliente(textArea_P.getText());
					c1.setvEntregaM_Cliente(textArea_M.getText());
					
					DaoCliente daoAlteraCliente = new DaoCliente();
					daoAlteraCliente.atualizarCl(c1);

					// Trazer Tela limpa após deletar a tabela

					textField_Nome_Cliente.setText("");
					textField_Razao_Social.setText("");
					textField_Setor.setText("");
				
					textArea_P.setText("");
					textArea_M.setText("");
					JOptionPane.showMessageDialog(null, "Alterado com Sucesso");

				} else {
					if (textField_Solucao.getText().equals("NxtOperations")) {
						
						c1.setvId_Solucao(2);
						c1.setvCNPJ_Cliente(textField_CNPJ.getText());
						
						DaoCliente daoExibirCliente = new DaoCliente();
						daoExibirCliente.buscarClientes(c1);
						
						c1.setvCNPJ_Cliente(textField_CNPJ.getText());
						c1.setvNome_Cliente(textField_Nome_Cliente.getText());
						c1.setvSocial_Cliente(textField_Razao_Social.getText());
						c1.setvSetor_Cliente(textField_Setor.getText());
						c1.setvEntregaP_Cliente(textArea_P.getText());
						c1.setvEntregaM_Cliente(textArea_M.getText());
						
						DaoCliente daoAlteraCliente = new DaoCliente();
						daoAlteraCliente.atualizarCl(c1);

						// Trazer Tela limpa após deletar a tabela

						textField_Nome_Cliente.setText("");
						textField_Razao_Social.setText("");
						textField_Setor.setText("");
					
						textArea_P.setText("");
						textArea_M.setText("");
						JOptionPane.showMessageDialog(null, "Alterado com Sucesso");

					} else {
						textField_Solucao.setText("NxtDemand ou NxtOperations");
						JOptionPane.showMessageDialog(null, "Digite: NxtDemand ou Operations");

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
				Cliente p1 = new Cliente();
				Cliente p2 = new Cliente();
				Cliente p3 = new Cliente();
				Cliente p4 = new Cliente();
				Cliente p5 = new Cliente();
				Cliente p6 = new Cliente();
				Dados t1 = new Dados();
				Dados t2= new Dados();
				Dados t3= new Dados();
				Dados t4= new Dados();
				Dados t5= new Dados();
				Dados t6= new Dados();
				Dados t7= new Dados();
				Dados d1 = new Dados();
				Dados e1 = new Dados();
				Dados e2 = new Dados();
				Dados e3 = new Dados();
				
				if(vEnvio_API.isSelected()) {
					e1.setvEnvio("API");
				}
				
				if(vEnvio_SFTP.isSelected()) {
					e2.setvEnvio("SFTP");
				}
				if(vEnvio_Upload.isSelected()) {
					e3.setvEnvio("Upload");
				}
				
				if (vProduto_Optimization.isSelected()) {
					p6.setvId_Produto(6);
				}

				if (vProduto_Matching.isSelected()) {
					p5.setvId_Produto(5);
				}

				if (vProduto_Vox.isSelected()) {
					p1.setvId_Produto(1);
				}
				if (vProduto_Sales.isSelected()) {
					p3.setvId_Produto(3);
				}
				if (vProduto_Pricing.isSelected()) {
					p4.setvId_Produto(4);
				}
				if (vProduto_Marketing.isSelected()) {
					p2.setvId_Produto(2);
				}
				
				if (textField_Solucao.getText().equals("NxtDemand")) {
					
					c1.setvId_Solucao(1);
					c1.setvCNPJ_Cliente(textField_CNPJ.getText());
						
					DaoCliente daoExibirCliente = new DaoCliente();
					daoExibirCliente.buscarClientes(c1);
					
					
					
					
					
					// Trazer Tela limpa após deletar a tabela
					if(e1.getvEnvio()!=d1.getvEnvio()) { 
						  if(p1.getvId_Produto()!=c1.getvId_Produto()) {
					
							  
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE1(); 
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD();
								
								
						  }
						  if(p2.getvId_Produto()!=c1.getvId_Produto()) {
							  
						
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE4(); 
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD();
							  }
						  if(p3.getvId_Produto()!=c1.getvId_Produto()) {
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE7(); 
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD();
							  }
						  if(p4.getvId_Produto()!=c1.getvId_Produto()) {
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE10(); 
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD(); 
							  }
					
					  }  
					  if(e2.getvEnvio()!=d1.getvEnvio()){
						  if(p1.getvId_Produto()!=c1.getvId_Produto()) {
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE2(); 
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD();
						  }
						  if(p2.getvId_Produto()!=c1.getvId_Produto()) {
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE5(); 
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD();
							  }
						  if(p3.getvId_Produto()!=c1.getvId_Produto()) {
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE8(); 
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD();
							  }
						  if(p4.getvId_Produto()!=c1.getvId_Produto()) {
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE11(); 
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD();
							  }

					  }
					  if(e3.getvEnvio()!=d1.getvEnvio()) { 
						  if(p1.getvId_Produto()!=c1.getvId_Produto()) {
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE3(); 
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD();
						  }
						  if(p2.getvId_Produto()!=c1.getvId_Produto()) {
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE6(); 
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD();
							  }
						  if(p3.getvId_Produto()!=c1.getvId_Produto()) {
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE9(); 
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD();
							  }
						  if(p4.getvId_Produto()!=c1.getvId_Produto()) {
							  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
							  daoExibirEscolha1.buscarEscolhaProdutoE12();
							  
							  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
								daoDeleteEscolhaDados.deletarEsD();
							  }

					  }
					  DaoEscolha daoDeleteEscolha = new DaoEscolha();
						daoDeleteEscolha.deletarEscolha(c1);
					  
					  DaoCliente daoDeleteCliente = new DaoCliente();
						daoDeleteCliente.deletarCl(c1);

					textField_CNPJ.setText("");
					textField_Nome_Cliente.setText("");
					textField_Razao_Social.setText("");
					textField_Setor.setText("");
				
					textField_Solucao.setText("");
					textArea_P.setText("");
					textArea_M.setText("");
					JOptionPane.showMessageDialog(null, "Deletado com Sucesso");

				} else {
					if (textField_Solucao.getText().equals("NxtOperations")) {
						
						c1.setvId_Solucao(2);
						c1.setvCNPJ_Cliente(textField_CNPJ.getText());
						
						DaoCliente daoExibirCliente = new DaoCliente();
						daoExibirCliente.buscarClientes(c1);
						
						DaoEscolha daoExbirEscolha = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						daoExbirEscolha.buscarEscolhaProduto();
						
						if(e1.getvEnvio()!=d1.getvEnvio()) { 
							  if(p5.getvId_Produto()!=c1.getvId_Produto()) {
								  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
								  daoExibirEscolha1.buscarEscolhaProdutoE13(); 
								  
								  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
									daoDeleteEscolhaDados.deletarEsD();
								  }
							  if(p6.getvId_Produto()!=c1.getvId_Produto()) {
								  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
								  daoExibirEscolha1.buscarEscolhaProdutoE16(); 
								  
								  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
									daoDeleteEscolhaDados.deletarEsD();
								  }
						  }  
						  if(e2.getvEnvio()!=d1.getvEnvio()){
							  if(p5.getvId_Produto()!=c1.getvId_Produto()) {
								  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
								  daoExibirEscolha1.buscarEscolhaProdutoE14(); 
								  
								  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
									daoDeleteEscolhaDados.deletarEsD();
								  }
							  if(p6.getvId_Produto()!=c1.getvId_Produto()) {
								  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
								  daoExibirEscolha1.buscarEscolhaProdutoE17(); 
								  
								  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
									daoDeleteEscolhaDados.deletarEsD();
								  }
						  }
						  if(e3.getvEnvio()!=d1.getvEnvio()) { 
							  if(p5.getvId_Produto()!=c1.getvId_Produto()) {
								  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
								  daoExibirEscolha1.buscarEscolhaProdutoE15(); 
								  
								  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
									daoDeleteEscolhaDados.deletarEsD(); 
								  }
							  if(p6.getvId_Produto()!=c1.getvId_Produto()) {
								  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
								  daoExibirEscolha1.buscarEscolhaProdutoE18(); 
								  
								  DaoEscolha_Dados daoDeleteEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
									daoDeleteEscolhaDados.deletarEsD(); 
								  }
						  }
						  
						  
						  DaoEscolha daoDeleteEscolha = new DaoEscolha();
							daoDeleteEscolha.deletarEscolha(c1);
						  
						  DaoCliente daoDeleteCliente = new DaoCliente();
							daoDeleteCliente.deletarCl(c1);
							
							
						// Trazer Tela limpa após deletar a tabela

						textField_CNPJ.setText("");
						textField_Nome_Cliente.setText("");
						textField_Razao_Social.setText("");
						textField_Setor.setText("");
				
						textField_Solucao.setText("");
						textArea_P.setText("");
						textArea_M.setText("");
						JOptionPane.showMessageDialog(null, "Deletado com Sucesso");

					} else {
						textField_Solucao.setText("NxtDemand ou NxtOperations");
						JOptionPane.showMessageDialog(null, "Digite: NxtDemand ou Operations");

					}
				// Trazer Tela limpa após deletar a tabela
			

			}}
		});
		// <------------------------------FINAL BOTﾃO PARA DELETAR O
		// CLIENTE------------------------------>

	}
}
