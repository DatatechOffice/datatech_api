package telas;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Bronze {

	JFrame frmBronze;
	Cliente c1;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bronze window = new Bronze(c1);
					window.frmBronze.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Bronze(Cliente c1) {
		this.c1=c1;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBronze = new JFrame();
		frmBronze.setTitle("Bronze");
		frmBronze.setBounds(100, 100, 631, 331);
		frmBronze.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBronze.getContentPane().setLayout(null);
		frmBronze.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de Dado");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 141, 14);
		frmBronze.getContentPane().add(lblNewLabel);
		
		JLabel lblFormaDeEnvio = new JLabel("Forma de Envio");
		lblFormaDeEnvio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFormaDeEnvio.setBounds(10, 96, 141, 14);
		frmBronze.getContentPane().add(lblFormaDeEnvio);
		
		JLabel lblQuantidadeRecebida = new JLabel("Quantidade Recebida");
		lblQuantidadeRecebida.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantidadeRecebida.setBounds(10, 155, 174, 14);
		frmBronze.getContentPane().add(lblQuantidadeRecebida);
		
		JButton btnNewButton = new JButton("Prosseguir");

		btnNewButton.setBounds(10, 258, 141, 23);
		frmBronze.getContentPane().add(btnNewButton);
		
		JCheckBox vDados_PDF = new JCheckBox("PDF");
		vDados_PDF.setBounds(14, 32, 97, 23);
		frmBronze.getContentPane().add(vDados_PDF);
		
		JCheckBox vDados_JSON = new JCheckBox("JSON");
		vDados_JSON.setBounds(113, 32, 97, 23);
		frmBronze.getContentPane().add(vDados_JSON);
		
		JCheckBox vDados_CSV = new JCheckBox("CSV");
		vDados_CSV.setBounds(212, 32, 97, 23);
		frmBronze.getContentPane().add(vDados_CSV);
		
		JCheckBox vDados_Planilhas = new JCheckBox("Planilhas");
		vDados_Planilhas.setBounds(311, 32, 97, 23);
		frmBronze.getContentPane().add(vDados_Planilhas);
		
		JCheckBox vDados_Tabelas = new JCheckBox("Tabelas");
		vDados_Tabelas.setBounds(14, 58, 97, 23);
		frmBronze.getContentPane().add(vDados_Tabelas);
		
		JCheckBox vDados_Audio = new JCheckBox("Audio");
		vDados_Audio.setBounds(113, 58, 97, 23);
		frmBronze.getContentPane().add(vDados_Audio);
		
		JCheckBox vDados_Texto = new JCheckBox("vDados_Texto");
		vDados_Texto.setBounds(212, 58, 97, 23);
		frmBronze.getContentPane().add(vDados_Texto);
		
		JCheckBox vOrigem_API = new JCheckBox("API");
		vOrigem_API.setBounds(6, 117, 97, 23);
		frmBronze.getContentPane().add(vOrigem_API);
		
		JCheckBox vOrigem_SFTP = new JCheckBox("SFTP");
		vOrigem_SFTP.setBounds(105, 117, 97, 23);
		frmBronze.getContentPane().add(vOrigem_SFTP);
		
		JCheckBox vOrigem_Upload = new JCheckBox("Upload");
		vOrigem_Upload.setBounds(204, 117, 97, 23);
		frmBronze.getContentPane().add(vOrigem_Upload);
		
		JButton btnRetorna = new JButton("Retorna");
		btnRetorna.setBounds(160, 258, 141, 23);
		frmBronze.getContentPane().add(btnRetorna);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//armezando tipos de dados
				ArrayList<String> vDadosList = new ArrayList<String>();
				
				if(vDados_JSON.isSelected()) {
					vDadosList.add("JSON");
					
				}
				if(vDados_CSV.isSelected()) {
					vDadosList.add("CSV");
					
				}
				if(vDados_Planilhas.isSelected()) {
					vDadosList.add("Planilhas");
					
				}
				if(vDados_Tabelas.isSelected()) {
					vDadosList.add("Tabelas");
					
				}
				if(vDados_PDF.isSelected()) {
					vDadosList.add("PDF");
					
				}
				if(vDados_Audio.isSelected()) {
					vDadosList.add("Audio");
					
				}
				if(vDados_Texto.isSelected()) {
					vDadosList.add("Texto");
					
				}
				//fim do armazenamento de tipos de dados
				
			}
		});
		
		btnRetorna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Criando as opções do alerta
				Object[] options = { "Confirmar", "Cancelar" };
				int retorno=JOptionPane.showOptionDialog(null,"Você deseja continuar: ", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				
				//Definindo as ações do alerta
				
				//Se o usúario confirma segue para a proxima etap
				if(retorno == 0){					
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Escopo window2 = new Escopo();
								window2.frmEscopo.setVisible(true);
								frmBronze.setVisible(false);
								
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
				}
			}
		});
	}
}