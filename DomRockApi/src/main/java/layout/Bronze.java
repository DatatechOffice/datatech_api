package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frmBronze.getContentPane().setBackground(SystemColor.windowBorder);
		frmBronze.getContentPane().setLayout(null);
		
		JButton btnButtonRetornar = new JButton("Retornar");
		btnButtonRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EscopoInsert window = new EscopoInsert();
				//aqui setamos a nova tela como visivel
				window.getFrmEscopoInsert().setVisible(true);
				//e para não ficar com duas telas abertas, ordenamos a atual a ficar invisivel
				frmBronze.setVisible(false);
			}
		});
		btnButtonRetornar.setFont(new Font("Arial", Font.BOLD, 16));
		btnButtonRetornar.setBounds(10, 520, 132, 30);
		frmBronze.getContentPane().add(btnButtonRetornar);
		frmBronze.setTitle("Bronze");
		frmBronze.setBounds(100, 100, 800, 600);
		frmBronze.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
