package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaBronze extends JFrame {

	private JPanel contentPane;
	private JLabel Title_FormaEnvio;
	private JLabel Title_PrazoDadosRecebidos;
	private JTextField Txt_TipoDeDados;
	private JTextField Txt_FormasDeEnvio;
	private JTextField Txt_PrazoDeDadosRecebidos;
	private JTextField Txt_QuantidadeRecebida;
	private JLabel Title_QuantidadeRecebida;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ConsultaBronze consultaBronze = new ConsultaBronze();
					consultaBronze.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultaBronze() {
		setTitle("Consulta_Bronze");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Title_TipoDeDados = new JLabel("Tipo de Dados:");
		Title_TipoDeDados.setFont(new Font("Tahoma", Font.BOLD, 16));
		Title_TipoDeDados.setHorizontalAlignment(SwingConstants.CENTER);
		Title_TipoDeDados.setForeground(Color.WHITE);
		Title_TipoDeDados.setBounds(44, 170, 190, 19);
		contentPane.add(Title_TipoDeDados);
		
		Title_FormaEnvio = new JLabel("Formas de Envio:");
		Title_FormaEnvio.setFont(new Font("Tahoma", Font.BOLD, 16));
		Title_FormaEnvio.setHorizontalAlignment(SwingConstants.CENTER);
		Title_FormaEnvio.setForeground(Color.WHITE);
		Title_FormaEnvio.setBounds(416, 172, 190, 14);
		contentPane.add(Title_FormaEnvio);
		
		Title_PrazoDadosRecebidos = new JLabel("Prazo de Dados Recebidos");
		Title_PrazoDadosRecebidos.setFont(new Font("Tahoma", Font.BOLD, 16));
		Title_PrazoDadosRecebidos.setHorizontalAlignment(SwingConstants.CENTER);
		Title_PrazoDadosRecebidos.setForeground(Color.WHITE);
		Title_PrazoDadosRecebidos.setBounds(44, 297, 235, 14);
		contentPane.add(Title_PrazoDadosRecebidos);
		
		Txt_TipoDeDados = new JTextField();
		Txt_TipoDeDados.setBounds(70, 189, 190, 60);
		contentPane.add(Txt_TipoDeDados);
		Txt_TipoDeDados.setColumns(10);
		
		Txt_FormasDeEnvio = new JTextField();
		Txt_FormasDeEnvio.setBounds(429, 189, 190, 60);
		contentPane.add(Txt_FormasDeEnvio);
		Txt_FormasDeEnvio.setColumns(10);
		
		Txt_PrazoDeDadosRecebidos = new JTextField();
		Txt_PrazoDeDadosRecebidos.setBounds(70, 322, 190, 39);
		contentPane.add(Txt_PrazoDeDadosRecebidos);
		Txt_PrazoDeDadosRecebidos.setColumns(10);
		
		Txt_QuantidadeRecebida = new JTextField();
		Txt_QuantidadeRecebida.setBounds(429, 322, 190, 39);
		contentPane.add(Txt_QuantidadeRecebida);
		Txt_QuantidadeRecebida.setColumns(10);
		
		Title_QuantidadeRecebida = new JLabel("Quantidade Recebida");
		Title_QuantidadeRecebida.setFont(new Font("Tahoma", Font.BOLD, 16));
		Title_QuantidadeRecebida.setHorizontalAlignment(SwingConstants.CENTER);
		Title_QuantidadeRecebida.setForeground(Color.WHITE);
		Title_QuantidadeRecebida.setBounds(416, 297, 190, 14);
		contentPane.add(Title_QuantidadeRecebida);
		
		JButton Botao_Retornar = new JButton("Retornar");
		Botao_Retornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConsultaBronze consultaBronze = new ConsultaBronze();
				consultaBronze.setVisible(false);
				Menu menu = new Menu();
				menu.frmMenu.setVisible(true);
				
			}
		});
		Botao_Retornar.setFont(new Font("Arial", Font.BOLD, 16));
		Botao_Retornar.setBounds(70, 391, 130, 31);
		contentPane.add(Botao_Retornar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(70, 66, 190, 31);
		contentPane.add(textField);
		
		JButton Botao_Retornar_1 = new JButton("Consultar");
		Botao_Retornar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao_Retornar_1.setFont(new Font("Arial", Font.BOLD, 16));
		Botao_Retornar_1.setBounds(270, 66, 130, 31);
		contentPane.add(Botao_Retornar_1);
		
		JButton Botao_Retornar_2 = new JButton("Deletar");
		Botao_Retornar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao_Retornar_2.setFont(new Font("Arial", Font.BOLD, 16));
		Botao_Retornar_2.setBounds(489, 66, 130, 31);
		contentPane.add(Botao_Retornar_2);
		
		JButton Botao_Retornar_3 = new JButton("Atualizar");
		Botao_Retornar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao_Retornar_3.setFont(new Font("Arial", Font.BOLD, 16));
		Botao_Retornar_3.setBounds(489, 391, 130, 31);
		contentPane.add(Botao_Retornar_3);
		
		JLabel Title_TipoDeDados_1 = new JLabel("CNPJ:");
		Title_TipoDeDados_1.setHorizontalAlignment(SwingConstants.CENTER);
		Title_TipoDeDados_1.setForeground(Color.WHITE);
		Title_TipoDeDados_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		Title_TipoDeDados_1.setBounds(44, 42, 190, 19);
		contentPane.add(Title_TipoDeDados_1);
	}
}
