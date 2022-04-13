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
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Escopo {

	private JFrame frame;
	private JTextField vCliente;
	private JTextField textField_vObjetivo;
	private JTextField textField_vEntregaM;
	private JTextField textField_vEntregaP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escopo window = new Escopo();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 867, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Criando um grupo para selecionar apenas um radio
		ButtonGroup vRadioGroup = new ButtonGroup();
	
		
		vCliente = new JTextField();
		vCliente.setBounds(10, 30, 151, 20);
		frame.getContentPane().add(vCliente);
		vCliente.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome do Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 15, 151, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Solu\u00E7\u00E3o:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 55, 156, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JRadioButton vSolucao_NxtDemand = new JRadioButton("Nxt.Demand");

		vSolucao_NxtDemand.setSelected(true);
		vSolucao_NxtDemand.setBounds(6, 70, 175, 23);
		frame.getContentPane().add(vSolucao_NxtDemand);
		JRadioButton vSolucao_NxtOperations = new JRadioButton("NxT.Operations");
		vSolucao_NxtOperations.setBounds(6, 90, 175, 23);
		frame.getContentPane().add(vSolucao_NxtOperations);
		
		//adicionando os radios no grupo vRadioGroup que foi criado
		vRadioGroup.add(vSolucao_NxtOperations);
		vRadioGroup.add(vSolucao_NxtDemand);
		
		JLabel lblNewLabel_2 = new JLabel("Objetivo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 120, 151, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_vObjetivo = new JTextField();
		textField_vObjetivo.setBounds(10, 135, 175, 20);
		frame.getContentPane().add(textField_vObjetivo);
		textField_vObjetivo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Entregas Minimas");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 166, 171, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Entregas Poss\u00EDveis");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 214, 171, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Produto");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(205, 10, 100, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox vProduto_Vox = new JCheckBox("Nxt.Demand Vox");
		vProduto_Vox.setBounds(205, 25, 261, 23);
		frame.getContentPane().add(vProduto_Vox);
		
		JCheckBox vProduto_Marketing = new JCheckBox("Nxt.Demand Marketing & Planning");
		vProduto_Marketing.setBounds(205, 50, 261, 23);
		frame.getContentPane().add(vProduto_Marketing);
		
		JCheckBox vProduto_Sales = new JCheckBox("Nxt.Demand Sales & Distribution");
		vProduto_Sales.setBounds(205, 75, 261, 23);
		frame.getContentPane().add(vProduto_Sales);
		
		JCheckBox vProduto_Pricing = new JCheckBox("Nxt.Demand Pricing");
		vProduto_Pricing.setBounds(205, 100, 261, 23);
		frame.getContentPane().add(vProduto_Pricing);
		
		JCheckBox vProduto_Optimization = new JCheckBox("Nxt.Operations Optimization");
		vProduto_Optimization.setBounds(465, 25, 204, 23);
		frame.getContentPane().add(vProduto_Optimization);
		vProduto_Optimization.setVisible(false);
		
		JCheckBox vProduto_Matching = new JCheckBox("Nxt.Operations Matching & Risk");
		vProduto_Matching.setBounds(465, 50, 267, 23);
		frame.getContentPane().add(vProduto_Matching);
		vProduto_Matching.setVisible(false);
		
		textField_vEntregaM = new JTextField();
		textField_vEntregaM.setBounds(10, 183, 175, 20);
		frame.getContentPane().add(textField_vEntregaM);
		textField_vEntregaM.setColumns(10);
		
		textField_vEntregaP = new JTextField();
		textField_vEntregaP.setBounds(10, 230, 175, 20);
		frame.getContentPane().add(textField_vEntregaP);
		textField_vEntregaP.setColumns(10);
		
		
		JButton btnNewButton_Prosseguir = new JButton("Prosseguir");
		
		btnNewButton_Prosseguir.setBounds(20, 260, 151, 23);
		frame.getContentPane().add(btnNewButton_Prosseguir);
		
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
				}
			}
				
		});
		
		vSolucao_NxtDemand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(vSolucao_NxtDemand.isSelected()) {
					//os produtos do Nxt Operations Aparece
					vProduto_Optimization.setVisible(false);
					vProduto_Matching.setVisible(false);
					
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
				
				
				// Mostrar as informações da ativaçao na tela
				JOptionPane.showMessageDialog(null, "Cliente: "+vCliente.getText()+"\n"+"Cadastrado com sucesso");
				
				
				//lista para armazenar várias pessoas
				ArrayList<Cliente> cli=new ArrayList<Cliente>();
				
				//se houver dados para prosseguir
				//armazenando a solução selecionado
				
				if(!vCliente.getText().equals(""))
				{
					// um objeto pessoa é criado
					Cliente c1=new Cliente(vCliente.getText());
					
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
					
					//e adcionado à lista
					cli.add(c1);

					//campos são limpos
					vCliente.setText("");
					textField_vObjetivo.setText("");
					
					
				}
				
				
					
				for (int i = 0; i < cli.size(); i ++) {
					Cliente cList = cli.get(i);
					System.out.println(cList.getvCliente()+"\n"+
										cList.getvSolucao()+"\n"+
										cList.getvObjetivo()+"\n"+
										cList.getvEntregaM()+"\n"+
										cList.getvEntregaP());
							
				}
				
				
		
				
			}
		});
		
	}
}
