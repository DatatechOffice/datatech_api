package telas;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class Bronze {

	JFrame frmBronze;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bronze window = new Bronze();
					window.frmBronze.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bronze() {
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 141, 22);
		frmBronze.getContentPane().add(comboBox);
		
		JLabel lblFormaDeEnvio = new JLabel("Forma de Envio");
		lblFormaDeEnvio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFormaDeEnvio.setBounds(10, 69, 141, 14);
		frmBronze.getContentPane().add(lblFormaDeEnvio);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 94, 141, 22);
		frmBronze.getContentPane().add(comboBox_1);
		
		JLabel lblQuantidadeRecebida = new JLabel("Quantidade Recebida");
		lblQuantidadeRecebida.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantidadeRecebida.setBounds(10, 138, 174, 14);
		frmBronze.getContentPane().add(lblQuantidadeRecebida);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(121, 163, 51, 20);
		frmBronze.getContentPane().add(spinner);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(10, 163, 101, 22);
		frmBronze.getContentPane().add(comboBox_1_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 213, 141, 23);
		frmBronze.getContentPane().add(btnNewButton);
	}
}
