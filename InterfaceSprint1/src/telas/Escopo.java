package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;

public class Escopo {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Prosseguir");
		btnNewButton.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(10, 27, 151, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cliente");
		lblNewLabel.setBounds(10, 13, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Solu\u00E7\u00E3o:");
		lblNewLabel_1.setBounds(10, 58, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nxt.Demand");
		rdbtnNewRadioButton.setBounds(6, 79, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("NxT.Operations");
		rdbtnNewRadioButton_1.setBounds(6, 105, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Objetivo");
		lblNewLabel_2.setBounds(10, 139, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 156, 151, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Entregas Minimas");
		lblNewLabel_3.setBounds(10, 183, 92, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(105, 180, 56, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_4 = new JLabel("Entregas Poss\u00EDveis");
		lblNewLabel_4.setBounds(10, 208, 92, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(105, 205, 56, 20);
		frame.getContentPane().add(spinner_1);
	}
}
