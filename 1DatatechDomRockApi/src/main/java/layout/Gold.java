package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
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
		setBounds(100, 100, 536, 446);
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
		
		lbSolucao = new JLabel("Solução:");
		lbSolucao.setHorizontalAlignment(SwingConstants.CENTER);
		lbSolucao.setForeground(Color.WHITE);
		lbSolucao.setFont(new Font("Arial", Font.BOLD, 16));
		lbSolucao.setBounds(311, 15, 121, 14);
		contentPane.add(lbSolucao);
		
		String[] Solucoes = {"Nxt.Demand", "Nxt.Operations"};
		contentPane.setLayout(null);
		
		comboBoxSolucaoGold = new JComboBox(Solucoes);
		comboBoxSolucaoGold.setFont(new Font("Arial", Font.BOLD, 16));
		comboBoxSolucaoGold.setBounds(336, 34, 145, 22);
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
				if(comboBoxOperacaoDadosGold.getSelectedItem() == "Matching") {
					
				}
				if(comboBoxOperacaoDadosGold.getSelectedItem() == "Join") {
					
				}
				if(comboBoxOperacaoDadosGold.getSelectedItem() == "Agregação") {
					
				}
				if(comboBoxOperacaoDadosGold.getSelectedItem() == "Serie Temporal") {
					
				}
				
			}
		});
		btnConcluirGold.setFont(new Font("Arial", Font.BOLD, 16));
		btnConcluirGold.setBounds(325, 366, 156, 29);
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
		btnVoltarAoMenu.setBounds(10, 367, 190, 29);
		contentPane.add(btnVoltarAoMenu);
		
		String[] OperacaoDados = {"Matching", "Join", "Agregação", "Serie Temporal"};
		contentPane.setLayout(null);
		comboBoxOperacaoDadosGold = new JComboBox(OperacaoDados);
		comboBoxOperacaoDadosGold.setFont(new Font("Arial", Font.BOLD, 15));
		comboBoxOperacaoDadosGold.setBounds(20, 180, 447, 35);
		contentPane.add(comboBoxOperacaoDadosGold);
	}
	
	public JFrame getGold() {
		return gold;
	}
}