package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import controlador.Cliente;

import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Escopo {

	private JFrame frmEscopo;
	private JTextField textField_vNomeCliente;
	private JLabel lblCpfcnpj;
	private JTextField textField_vCNPJ;
	private JLabel lblSetor;
	private JTextField textField_vObjetivo;
	private JTextField textField_vRazaoSocial;


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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEscopo = new JFrame();
		frmEscopo.setTitle("Escopo");
		frmEscopo.getContentPane().setBackground(SystemColor.windowBorder);
		frmEscopo.getContentPane().setLayout(null);
				
		JLabel lblNewLabel = new JLabel("Nome do Cliente:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 10, 200, 20);
		frmEscopo.getContentPane().add(lblNewLabel);
		
		textField_vNomeCliente = new JTextField();
		textField_vNomeCliente.setFont(new Font("Arial", Font.BOLD, 15));
		textField_vNomeCliente.setBounds(10, 30, 300, 30);
		frmEscopo.getContentPane().add(textField_vNomeCliente);
		textField_vNomeCliente.setColumns(10);
		
		lblCpfcnpj = new JLabel("CNPJ:");
		lblCpfcnpj.setForeground(Color.WHITE);
		lblCpfcnpj.setFont(new Font("Arial", Font.BOLD, 20));
		lblCpfcnpj.setBounds(10, 70, 200, 20);
		frmEscopo.getContentPane().add(lblCpfcnpj);
		
		textField_vCNPJ = new JTextField();
		textField_vCNPJ.setFont(new Font("Arial", Font.BOLD, 15));
		textField_vCNPJ.setColumns(10);
		textField_vCNPJ.setBounds(10, 90, 300, 30);
		frmEscopo.getContentPane().add(textField_vCNPJ);
		
		lblSetor = new JLabel("Setor");
		lblSetor.setForeground(SystemColor.text);
		lblSetor.setFont(new Font("Arial", Font.BOLD, 20));
		lblSetor.setBounds(14, 190, 300, 20);
		frmEscopo.getContentPane().add(lblSetor);
		
		JComboBox comboBox_vEstabalecimento = new JComboBox();
		comboBox_vEstabalecimento.setModel(new DefaultComboBoxModel(new String[] {"<Selecione uma op\u00E7ao>", "Varejo", "Atacado"}));
		comboBox_vEstabalecimento.setFont(new Font("Arial", Font.BOLD, 15));
		comboBox_vEstabalecimento.setBounds(14, 220, 300, 30);
		frmEscopo.getContentPane().add(comboBox_vEstabalecimento);
		
		JLabel lblSolucao = new JLabel("Solu\u00E7\u00E3o:");
		lblSolucao.setForeground(Color.WHITE);
		lblSolucao.setFont(new Font("Arial", Font.BOLD, 20));
		lblSolucao.setBounds(14, 260, 300, 20);
		frmEscopo.getContentPane().add(lblSolucao);
		
		JRadioButton vSolucao_NxtDemand = new JRadioButton("Nxt.Demand");
		vSolucao_NxtDemand.setSelected(true);
		vSolucao_NxtDemand.setForeground(SystemColor.text);
		vSolucao_NxtDemand.setFont(new Font("Arial", Font.BOLD, 15));
		vSolucao_NxtDemand.setBackground(SystemColor.windowBorder);
		vSolucao_NxtDemand.setBounds(10, 286, 200, 30);
		frmEscopo.getContentPane().add(vSolucao_NxtDemand);
		
		JRadioButton vSolucao_NxtOperations = new JRadioButton("Nxt.Operations");
		vSolucao_NxtOperations.setForeground(Color.WHITE);
		vSolucao_NxtOperations.setFont(new Font("Arial", Font.BOLD, 15));
		vSolucao_NxtOperations.setBackground(SystemColor.windowBorder);
		vSolucao_NxtOperations.setBounds(10, 318, 200, 30);
		frmEscopo.getContentPane().add(vSolucao_NxtOperations);
		frmEscopo.setBounds(100, 100, 800, 600);
		frmEscopo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//	//<------------------------------CRIANDO O GRUPO DE RADIOS------------------------------>
		ButtonGroup vRadioGroup = new ButtonGroup();
		
		//	//<------------------------------ADICIONADO AO GRUPO DE RADIOS AS OP��ES QUE N�O PODEM SE REPETIR------------------------------>
		vRadioGroup.add(vSolucao_NxtOperations);
		vRadioGroup.add(vSolucao_NxtDemand);
		
		JLabel lblObjetivo = new JLabel("Objetivo:");
		lblObjetivo.setForeground(Color.WHITE);
		lblObjetivo.setFont(new Font("Arial", Font.BOLD, 20));
		lblObjetivo.setBounds(10, 360, 200, 20);
		frmEscopo.getContentPane().add(lblObjetivo);
		
		textField_vObjetivo = new JTextField();
		textField_vObjetivo.setFont(new Font("Arial", Font.BOLD, 15));
		textField_vObjetivo.setColumns(10);
		textField_vObjetivo.setBounds(10, 389, 300, 30);
		frmEscopo.getContentPane().add(textField_vObjetivo);
		
		JLabel lblProdutos = new JLabel("Produtos:");
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setFont(new Font("Arial", Font.BOLD, 20));
		lblProdutos.setBounds(440, 10, 200, 20);
		frmEscopo.getContentPane().add(lblProdutos);
		
		JCheckBox vProduto_Vox = new JCheckBox("Nxt.Demand Vox");
		vProduto_Vox.setForeground(SystemColor.text);
		vProduto_Vox.setBackground(SystemColor.windowBorder);
		vProduto_Vox.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Vox.setBounds(339, 35, 175, 30);
		frmEscopo.getContentPane().add(vProduto_Vox);
		
		JCheckBox vProduto_Optimization = new JCheckBox("Nxt.Operations Optimization");
		vProduto_Optimization.setForeground(SystemColor.text);
		vProduto_Optimization.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Optimization.setBackground(SystemColor.windowBorder);
		vProduto_Optimization.setBounds(516, 36, 240, 30);
		frmEscopo.getContentPane().add(vProduto_Optimization);
		vProduto_Optimization.setVisible(false);
		
		JCheckBox vProduto_Matching = new JCheckBox("Nxt.Operations Matching");
		vProduto_Matching.setForeground(Color.WHITE);
		vProduto_Matching.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Matching.setBackground(SystemColor.windowBorder);
		vProduto_Matching.setBounds(516, 71, 240, 30);
		frmEscopo.getContentPane().add(vProduto_Matching);
		vProduto_Matching.setVisible(false);
		
		JCheckBox vProduto_Sales = new JCheckBox("Nxt.Demand Sales");
		vProduto_Sales.setForeground(Color.WHITE);
		vProduto_Sales.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Sales.setBackground(SystemColor.windowBorder);
		vProduto_Sales.setBounds(339, 70, 175, 30);
		frmEscopo.getContentPane().add(vProduto_Sales);
		
		JCheckBox vProduto_Marketing = new JCheckBox("Nxt.Demand Marketing");
		vProduto_Marketing.setForeground(Color.WHITE);
		vProduto_Marketing.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Marketing.setBackground(SystemColor.windowBorder);
		vProduto_Marketing.setBounds(339, 137, 200, 30);
		frmEscopo.getContentPane().add(vProduto_Marketing);
		
		JCheckBox vProduto_Pricing = new JCheckBox("Nxt.Demand Pricing");
		vProduto_Pricing.setForeground(Color.WHITE);
		vProduto_Pricing.setFont(new Font("Arial", Font.BOLD, 15));
		vProduto_Pricing.setBackground(SystemColor.windowBorder);
		vProduto_Pricing.setBounds(339, 102, 175, 30);
		frmEscopo.getContentPane().add(vProduto_Pricing);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social");
		lblRazoSocial.setForeground(Color.WHITE);
		lblRazoSocial.setFont(new Font("Arial", Font.BOLD, 20));
		lblRazoSocial.setBounds(10, 130, 200, 20);
		frmEscopo.getContentPane().add(lblRazoSocial);
		
		textField_vRazaoSocial = new JTextField();
		textField_vRazaoSocial.setFont(new Font("Arial", Font.BOLD, 15));
		textField_vRazaoSocial.setColumns(10);
		textField_vRazaoSocial.setBounds(10, 150, 300, 30);
		frmEscopo.getContentPane().add(textField_vRazaoSocial);
		
		JButton btnNewButton = new JButton("Avan\u00E7ar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(300, 500, 150, 30);
		frmEscopo.getContentPane().add(btnNewButton);
		
		JLabel lblEntragasPossiveis = new JLabel("Entragas Possiveis:");
		lblEntragasPossiveis.setForeground(Color.WHITE);
		lblEntragasPossiveis.setFont(new Font("Arial", Font.BOLD, 20));
		lblEntragasPossiveis.setBounds(340, 220, 200, 20);
		frmEscopo.getContentPane().add(lblEntragasPossiveis);
		
		JLabel lblEntregasMinimas = new JLabel("Entregas Minimas:");
		lblEntregasMinimas.setForeground(Color.WHITE);
		lblEntregasMinimas.setFont(new Font("Arial", Font.BOLD, 20));
		lblEntregasMinimas.setBounds(339, 329, 200, 20);
		frmEscopo.getContentPane().add(lblEntregasMinimas);
		
		JTextArea textArea_EntregaP = new JTextArea();
		textArea_EntregaP.setFont(new Font("Arial", Font.BOLD, 15));
		textArea_EntregaP.setBounds(339, 250, 301, 69);
		frmEscopo.getContentPane().add(textArea_EntregaP);
		
		JTextArea textArea_EntregaM = new JTextArea();
		textArea_EntregaM.setFont(new Font("Arial", Font.BOLD, 15));
		textArea_EntregaM.setBounds(339, 361, 301, 69);
		frmEscopo.getContentPane().add(textArea_EntregaM);

		vSolucao_NxtDemand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(vSolucao_NxtDemand.isSelected()) {
					//<------------------------------DECLARANDO QUE OS PRODUTOS DE NXTDEMAND DEVEM APARECER------------------------------>
					vProduto_Vox.setVisible(true);
					vProduto_Marketing.setVisible(true);
					vProduto_Sales.setVisible(true);
					vProduto_Pricing.setVisible(true);
					
					//<------------------------------DECLARANDO QUE AO APARECER OS PRODUTOS DE NXTDEMAND OS DE NXTOPERATIONS SOME------------------------------>
					vProduto_Optimization.setVisible(false);
					vProduto_Matching.setVisible(false);
					
					//<------------------------------ORDENANDO QUE AO SUMI OS PRODUTOS DO NXTOPERATIONS DEVEM SER DESELECIONADOS------------------------------>
					vProduto_Optimization.setSelected(false);
					vProduto_Matching.setSelected(false);
				}
			}
		});
		
		vSolucao_NxtOperations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(vSolucao_NxtOperations.isSelected()) {
					
					//<------------------------------OS PRODUTOS DE NXTOPERATIONS SE TORNAM VISIVEL------------------------------>
					vProduto_Optimization.setVisible(true);
					vProduto_Matching.setVisible(true);
					
					//<------------------------------OS PRODUTOS DE NXTDEMAND SOMEM DA TELA------------------------------>
					vProduto_Vox.setVisible(false);
					vProduto_Marketing.setVisible(false);
					vProduto_Sales.setVisible(false);
					vProduto_Pricing.setVisible(false);
					
					//<------------------------------SE ELES SOMEM DA TELA DEVEM SER DESELECIONADOS TAMBEM------------------------------>
					vProduto_Vox.setSelected(false);
					vProduto_Marketing.setSelected(false);
					vProduto_Sales.setSelected(false);
					vProduto_Pricing.setSelected(false);
				}
			}
		});
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> vProList = new ArrayList<String>();
				
				//<------------------------------ADICIONANDO OS PRODUTOS NUMA ARRAY------------------------------>
				if(vProduto_Optimization.isSelected()) {
					vProList.add("NxtOperations optimization");
				}
				
				if(vProduto_Matching.isSelected()) {
					vProList.add("NxtOperations Matching");
				}
				
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
				//<------------------------------FIM DO ADICIONAR PRODUTOS AS ARRAYS------------------------------>
				
				if(!textField_vNomeCliente.getText().equals("") &&
						!textField_vCNPJ.getText().equals("") &&
						!textField_vRazaoSocial.getText().equals("") &&
						!textField_vObjetivo.getText().equals("") &&
						vProList.size() != 0 &&
						!textArea_EntregaP.getText().equals("") &&
						!textArea_EntregaM.getText().equals("")) {
					
					//<------------------------------come�o dos set da tela escopo nos atributos------------------------------>
					//<------------------------------CRIANDO O OBJETO PARA SER AS INFORMA��ES DA TELA------------------------------>
					Cliente c1 = new Cliente(null, null, null, null, null, null, null, null);
					
					//<------------------------------SETTANDO O NOME DO CLIENTE------------------------------>
					c1.setvNome_Cliente(textField_vNomeCliente.getText());
					
					//<------------------------------SETTANDO O CNPJ DO CLIENTE------------------------------>
					c1.setvCNPF_Cliente(textField_vCNPJ.getText());
					
					//<------------------------------SETTANDO O NOME DE RAZ�O SOCIAL DA EMPRESA------------------------------>
					c1.setvSocial_Cliente(textField_vRazaoSocial.getText());
					
					//<------------------------------SETTANDO O SETOR DA EMPRESA DO NOSSO CLIENTE------------------------------>
					c1.setvSetor_Cliente(null);
					
					//<------------------------------UM IF PARA SELECIONAR QUAL SOLU��O ESTAMOS ATRIBUINDO O CLIENTE------------------------------>
					//<------------------------------SE NXTDEMAND EST� SELECIONADO ENT�O ATRIBUIMOS ELA A VARIAVEL------------------------------>
					if(vSolucao_NxtDemand.isSelected()) {
						c1.setvSolucao_Cliente("NxtDemand");
					}
					//<------------------------------DO CONTRARIO TEMOS APENAS UMA SEGUNDA OP��O ENT�O COM ELSE JA RESOLVEMOS------------------------------>
					else {
						c1.setvSolucao_Cliente("NxtOperations");
					}
					
					//<------------------------------SETTANDO O OBJETIVO DO NOSSO CLIENTE------------------------------>
					c1.setvOjetivo_Cliente(textField_vObjetivo.getText());
					
					
					//<------------------------------SETTANDO AS ENTREGAS POSSIVEIS------------------------------>
					c1.setvEntregaP_Cliente(textArea_EntregaP.getText());
					
					//<------------------------------SETTANDO AS ENTREGAS MINIMAS------------------------------>
					c1.setvEntregaM_Cliente(textArea_EntregaM.getText());
					//<------------------------------FIM DO SETT DE INFORMA��ES DA TELA ESCOPO------------------------------>
					
					//<------------------------------CRIANDO O CAMINHO DA TELA ESCOPO PARA A BRONZE------------------------------>
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								//<------------------------------AQUI CRIAMOS UM OBJETO DA NOVA TELA------------------------------>
								Bronze window = new Bronze();
								//<------------------------------FALAMOS QUAL TELA SE TORNA VISIVEL------------------------------>
								window.frmBronze.setVisible(true);
								//<------------------------------DECLARAMOS QUE A TELA ATUAL VAI SUMIR------------------------------>
								frmEscopo.setVisible(false);
								
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					//<------------------------------FIM DESSA TRANSA��O DE TELAS------------------------------>
					
				}else {
					//<------------------------------MENSAGEM DE ALERTA PARA NOTIFICAR O USUARIO QUE TEM CAMPOS VAZIOS------------------------------>
					JOptionPane.showMessageDialog(null, "Preencha todos os campos");
				}
				
			}
		});
	}
}