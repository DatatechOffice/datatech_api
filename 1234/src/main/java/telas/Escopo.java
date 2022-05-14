package telas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.text.JTextComponent;

import DAO.TarefaDao;

import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Escopo {

	JFrame frmEscopo;
	private JTextField textField_vCliente;
	private JTextField textField_vObjetivo;
	private JTextField textField_vEntregaM;
	private JTextField textField_vEntregaP;
	Cliente c1;
	TarefaDao insert_sql;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escopo window = new Escopo();
					window.frmEscopo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Escopo() {
		initialize();
	}
	public Escopo(TarefaDao insert_sql) {
		this.insert_sql = insert_sql; 
		
	}
	
	public Escopo(Cliente c1) {
		this.c1=c1;
		initialize();
		
		textField_vCliente.setText(this.c1.getvCliente());
		textField_vObjetivo.setText(this.c1.getvObjetivo());
		textField_vEntregaM.setText(this.c1.getvEntregaP());
		textField_vEntregaP.setText(this.c1.getvEntregaM());
		
		
		
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEscopo = new JFrame();
		frmEscopo.setTitle("Escopo\r\n");
		frmEscopo.setBounds(100, 100, 631, 331);
		frmEscopo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEscopo.setLocationRelativeTo(null);
		frmEscopo.getContentPane().setLayout(null);
		
		//Criando um grupo para selecionar apenas um radio
		ButtonGroup vRadioGroup = new ButtonGroup();
	
		
		textField_vCliente = new JTextField();
		textField_vCliente.setBounds(10, 30, 151, 20);
		frmEscopo.getContentPane().add(textField_vCliente);
		textField_vCliente.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome do Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 15, 151, 14);
		frmEscopo.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Solu\u00E7\u00E3o:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 55, 156, 14);
		frmEscopo.getContentPane().add(lblNewLabel_1);
		
		
		final JRadioButton vSolucao_NxtDemand = new JRadioButton("Nxt.Demand");

		vSolucao_NxtDemand.setSelected(true);
		vSolucao_NxtDemand.setBounds(6, 70, 175, 23);
		frmEscopo.getContentPane().add(vSolucao_NxtDemand);
		final JRadioButton vSolucao_NxtOperations = new JRadioButton("NxT.Operations");
		vSolucao_NxtOperations.setBounds(6, 90, 175, 23);
		frmEscopo.getContentPane().add(vSolucao_NxtOperations);
		
		//adicionando os radios no grupo vRadioGroup que foi criado
		vRadioGroup.add(vSolucao_NxtOperations);
		vRadioGroup.add(vSolucao_NxtDemand);
		
		JLabel lblNewLabel_2 = new JLabel("Objetivo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 120, 151, 14);
		frmEscopo.getContentPane().add(lblNewLabel_2);
		
		textField_vObjetivo = new JTextField();
		textField_vObjetivo.setBounds(10, 135, 175, 20);
		frmEscopo.getContentPane().add(textField_vObjetivo);
		textField_vObjetivo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Entregas Minimas");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 166, 171, 14);
		frmEscopo.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Entregas Poss\u00EDveis");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 214, 171, 14);
		frmEscopo.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Produto");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(205, 10, 100, 14);
		frmEscopo.getContentPane().add(lblNewLabel_5);
		
		final JCheckBox vProduto_Vox = new JCheckBox("Nxt.Demand Vox");
		vProduto_Vox.setBounds(205, 25, 261, 23);
		frmEscopo.getContentPane().add(vProduto_Vox);
		
		final JCheckBox vProduto_Marketing = new JCheckBox("Nxt.Demand Marketing & Planning");
		vProduto_Marketing.setBounds(205, 50, 261, 23);
		frmEscopo.getContentPane().add(vProduto_Marketing);
		
		final JCheckBox vProduto_Sales = new JCheckBox("Nxt.Demand Sales & Distribution");
		vProduto_Sales.setBounds(205, 75, 261, 23);
		frmEscopo.getContentPane().add(vProduto_Sales);
		
		final JCheckBox vProduto_Pricing = new JCheckBox("Nxt.Demand Pricing");
		vProduto_Pricing.setBounds(205, 100, 261, 23);
		frmEscopo.getContentPane().add(vProduto_Pricing);
		
		final JCheckBox vProduto_Optimization = new JCheckBox("Nxt.Operations Optimization");
		vProduto_Optimization.setBounds(205, 25, 204, 23);
		frmEscopo.getContentPane().add(vProduto_Optimization);
		vProduto_Optimization.setVisible(false);
		
		final JCheckBox vProduto_Matching = new JCheckBox("Nxt.Operations Matching & Risk");
		vProduto_Matching.setBounds(205, 50, 267, 23);
		frmEscopo.getContentPane().add(vProduto_Matching);
		vProduto_Matching.setVisible(false);
		
		textField_vEntregaM = new JTextField();
		textField_vEntregaM.setBounds(10, 183, 175, 20);
		frmEscopo.getContentPane().add(textField_vEntregaM);
		textField_vEntregaM.setColumns(10);
		
		textField_vEntregaP = new JTextField();
		textField_vEntregaP.setBounds(10, 230, 175, 20);
		frmEscopo.getContentPane().add(textField_vEntregaP);
		textField_vEntregaP.setColumns(10);
		
		
		JButton btnNewButton_Prosseguir = new JButton("Prosseguir");
		
		btnNewButton_Prosseguir.setBounds(20, 260, 151, 23);
		frmEscopo.getContentPane().add(btnNewButton_Prosseguir);
		
		vSolucao_NxtOperations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vSolucao_NxtOperations.isSelected()) {
					//os produtos do Nxt Operations Aparece
					vProduto_Optimization.setVisible(true);
					vProduto_Matching.setVisible(true);
					
					//os produtos do NxtDemand Desaparece 
					vProduto_Vox.setVisible(false);
					vProduto_Sales.setVisible(false);
					vProduto_Pricing.setVisible(false);
					vProduto_Marketing.setVisible(false);
					
					//Os produtos são desselecionados
					vProduto_Vox.setSelected(false);
					vProduto_Sales.setSelected(false);
					vProduto_Pricing.setSelected(false);
					vProduto_Marketing.setSelected(false);
				}
			}
				
		});
		
		vSolucao_NxtDemand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(vSolucao_NxtDemand.isSelected()) {
					//os produtos do Nxt Operations Aparece
					vProduto_Optimization.setVisible(false);
					vProduto_Matching.setVisible(false);
					
					//Os Produtos são desselecionados
					vProduto_Optimization.setSelected(false);
					vProduto_Matching.setSelected(false);
					
					//os produtos do NxtDemand Desaparece 
					vProduto_Vox.setVisible(true);
					vProduto_Sales.setVisible(true);
					vProduto_Pricing.setVisible(true);
					vProduto_Marketing.setVisible(true);
				}
			}
		});
		
		btnNewButton_Prosseguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> vProList = new ArrayList<String>();
				
				//Adicionando na array de produtos as opções de NxtDemand
				if(vProduto_Vox.isSelected()) {
					vProList.add("Nxt.Demand Vox");
				}
				if(vProduto_Sales.isSelected()) {
					vProList.add("Nxt.Demand Sales");
				}
				if(vProduto_Pricing.isSelected()) {
					vProList.add("Nxt.Demand Pricing");
				}
				if(vProduto_Marketing.isSelected()) {
					vProList.add("Nxt.Demand Marketing");
				}
				
				//Adicionando na array de produtos as opções de Operations
				if(vProduto_Matching.isSelected()) {
					vProList.add("Nxt.Operations Macthing");
				}
				if(vProduto_Optimization.isSelected()) {
					vProList.add("Nxt.Operations Optimization");
				}

				// Mostrar as informações da ativaçao na tela
				
				
				//lista para armazenar várias pessoas
				
				//se houver dados para prosseguir
				//armazenando a solução selecionado
				
				if(!textField_vCliente.getText().equals("") &&
						!textField_vObjetivo.getText().equals("") &&
						!textField_vEntregaM.getText().equals("")  &&
						!textField_vEntregaP.getText().equals("") &&
						vProList.size() != 0)
				{
					// um objeto pessoa é criado
					c1=new Cliente(textField_vCliente.getText());
					
					//salvando a solução selecionada no atributo do cliente
					if(vSolucao_NxtDemand.isSelected()) {
						c1.setvSolucao("NxtDemand");
					}
					else {
						c1.setvSolucao("NxtOperations");
					}
					
					c1.setvObjetivo(textField_vObjetivo.getText());
					c1.setvEntregaM(textField_vEntregaM.getText());
					c1.setvEntregaP(textField_vEntregaP.getText());
					
					
					//Criando as opções do alerta
					Object[] options = { "Confirmar", "Cancelar" };
					int retorno=JOptionPane.showOptionDialog(null, "Cliente: "+c1.getvCliente()+"\n"+
															"Solução: "+c1.getvSolucao()+"\n"+
															"Objetivo: "+c1.getvObjetivo()+"\n"+
															"Entregas Minimas: "+c1.getvEntregaM()+"\n"+
															"Entregas Possiveis: "+c1.getvEntregaP()+"\n"+
															"Produtos Selecionados:"+vProList+"\n"+
															"Você deseja continuar: ", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
					
					//Definindo as ações do alerta
					
					//Se o usúario confirma segue para a proxima etap
					if(retorno == 0){
						//JOptionPane.showMessageDialog(null, "Cliente: "+textField_vCliente.getText()+"\n"+"Cadastrado com sucesso");
						TarefaDao tarefaDao = new TarefaDao();
						tarefaDao.nova(c1);
						
						
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Bronze window1 = new Bronze(c1);
									window1.frmBronze.setVisible(true);
									frmEscopo.setVisible(false);
									
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
						
					}
					//Se cancelar ele altera os dados necessarios
					else {
						JOptionPane.showMessageDialog(null, "Altere os dados");

					}
				}
				//Se houver um campo vazio o programa não continua
				else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos");
				}
				
				
					System.out.println(c1.getvCliente()+"\n"+
										c1.getvSolucao()+"\n"+
										c1.getvObjetivo()+"\n"+
										c1.getvEntregaM()+"\n"+
										c1.getvEntregaP());
	
				System.out.println(vProList);
								
			}
		});
		
	}
}