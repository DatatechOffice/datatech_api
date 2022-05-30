package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;

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
		frmBronze.setTitle("Bronze");
		frmBronze.setBounds(100, 100, 800, 600);
		frmBronze.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
