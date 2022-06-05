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
import javax.swing.JButton;

public class ConsultaBronze extends JFrame {

	private JPanel contentPane;
	private JLabel Title_FormaEnvio;
	private JLabel Title_PrazoDadosRecebidos;
	private JTextField Txt_TipoDeDados;
	private JTextField Txt_FormasDeEnvio;
	private JTextField Txt_PrazoDeDadosRecebidos;
	private JTextField Txt_QuantidadeRecebida;
	private JLabel Title_QuantidadeRecebida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaBronze frame = new ConsultaBronze();
					frame.setVisible(true);
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
		setBounds(100, 100, 467, 412);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Title_TipoDeDados = new JLabel("Tipo de Dados:");
		Title_TipoDeDados.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Title_TipoDeDados.setHorizontalAlignment(SwingConstants.CENTER);
		Title_TipoDeDados.setForeground(Color.WHITE);
		Title_TipoDeDados.setBounds(10, 11, 190, 19);
		contentPane.add(Title_TipoDeDados);
		
		Title_FormaEnvio = new JLabel("Formas de Envio:");
		Title_FormaEnvio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Title_FormaEnvio.setHorizontalAlignment(SwingConstants.CENTER);
		Title_FormaEnvio.setForeground(Color.WHITE);
		Title_FormaEnvio.setBounds(234, 13, 190, 14);
		contentPane.add(Title_FormaEnvio);
		
		Title_PrazoDadosRecebidos = new JLabel("Prazo de Dados Recebidos");
		Title_PrazoDadosRecebidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Title_PrazoDadosRecebidos.setHorizontalAlignment(SwingConstants.CENTER);
		Title_PrazoDadosRecebidos.setForeground(Color.WHITE);
		Title_PrazoDadosRecebidos.setBounds(10, 182, 190, 14);
		contentPane.add(Title_PrazoDadosRecebidos);
		
		Txt_TipoDeDados = new JTextField();
		Txt_TipoDeDados.setBounds(10, 39, 190, 97);
		contentPane.add(Txt_TipoDeDados);
		Txt_TipoDeDados.setColumns(10);
		
		Txt_FormasDeEnvio = new JTextField();
		Txt_FormasDeEnvio.setBounds(234, 38, 190, 97);
		contentPane.add(Txt_FormasDeEnvio);
		Txt_FormasDeEnvio.setColumns(10);
		
		Txt_PrazoDeDadosRecebidos = new JTextField();
		Txt_PrazoDeDadosRecebidos.setBounds(10, 207, 190, 97);
		contentPane.add(Txt_PrazoDeDadosRecebidos);
		Txt_PrazoDeDadosRecebidos.setColumns(10);
		
		Txt_QuantidadeRecebida = new JTextField();
		Txt_QuantidadeRecebida.setBounds(234, 207, 190, 97);
		contentPane.add(Txt_QuantidadeRecebida);
		Txt_QuantidadeRecebida.setColumns(10);
		
		Title_QuantidadeRecebida = new JLabel("Quantidade Recebida");
		Title_QuantidadeRecebida.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Title_QuantidadeRecebida.setHorizontalAlignment(SwingConstants.CENTER);
		Title_QuantidadeRecebida.setForeground(Color.WHITE);
		Title_QuantidadeRecebida.setBounds(234, 182, 190, 14);
		contentPane.add(Title_QuantidadeRecebida);
		
		JButton Botao_Retornar = new JButton("Retornar");
		Botao_Retornar.setBounds(10, 338, 89, 23);
		contentPane.add(Botao_Retornar);
		
		JButton Botao_Avancar = new JButton("Avan\u00E7ar");
		Botao_Avancar.setBounds(334, 338, 89, 23);
		contentPane.add(Botao_Avancar);
	}
}
