package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
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
		btn_Alterar.setBounds(10, 450, 150, 30);
		frmConsulta.getContentPane().add(btn_Alterar);
		
		JButton btn_Deletar = new JButton("Deletar");
		btn_Deletar.setFont(new Font("Arial", Font.BOLD, 15));
		btn_Deletar.setBounds(491, 30, 150, 30);
		frmConsulta.getContentPane().add(btn_Deletar);
		frmConsulta.setTitle("Consulta");
		frmConsulta.setBounds(100, 100, 800, 600);
		frmConsulta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//<------------------------------BOTÃO PARA CONSULTAR CLIENTE NO BANCO------------------------------>
		btn_Consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//cria o select com o c1 para armazenar os dados
				textField_CNPJ.setText("select do CNPJ");
				textField_Nome_Cliente.setText("Select do Nome do Cliente");
				textField_Razao_Social.setText("Select Razao Social");
				textField_Setor.setText("Select do Setor");
				textField_Solucao.setText("Select da Solucao");
				textArea_P.setText("Select da Entrega Possivel");
				textArea_M.setText("Select da entrega minima");
				

			}
		});
		//<------------------------------FINAL DO BOTÃO PARA CONSULTAR CLIENTE NO BANCO------------------------------>
		
		//<------------------------------BOTÃO PARA ALTERAR OS CAMPOS DE CONSULTA------------------------------>
		btn_Alterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CRIAR OS GET PARA MANDAR PRO BANCO OS CAMPOS
				textField_CNPJ.getText();
				textField_Nome_Cliente.getText();
				textField_Razao_Social.getText();
				textField_Setor.getText();
				textField_Solucao.getText();
				textArea_P.getText();
				textArea_M.getText();
				
			}
		});
		//<------------------------------FINAL BOTÃO PARA ALTERAR OS CAMPOS DE CONSULTA------------------------------>

		//<------------------------------BOTÃO PARA DELETAR UM CLIENTE------------------------------>
		btn_Deletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DELETE ENTIDADE ONDE O CNPJ É IGUAL
			}
		});
		//<------------------------------FINAL BOTÃO PARA DELETAR O CLIENTE------------------------------>

	}

}
