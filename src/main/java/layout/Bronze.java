package layout;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import DAO.DaoCliente;
import DAO.DaoCliente_Dados;
import DAO.DaoCliente_Produto;
import DAO.DaoTipo_Dados;
import controlador.Cliente;
import controlador.Dados;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;

public class Bronze {

	JFrame frmBronze;
	Cliente c1;
	EscopoInsert vProList;
	private JTextField textField_vEnvio;
	private String vTipo;
	private Dados dados;
	/**
	 * Launch the application.
	 */
	
	
	
	/**
	 * Create the application.
	 */
	
	public Bronze(Dados dados) {
		this.dados=dados;
	}
	public JFrame getFrmBronze() {
		return frmBronze;
	}
	public void setFrmBronze(JFrame frmBronze) {
		this.frmBronze = frmBronze;
	}
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
		
		JLabel lblQuantidadeRecebida = new JLabel("Prazo deDados Recebida");
		lblQuantidadeRecebida.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantidadeRecebida.setBounds(10, 155, 246, 14);
		frmBronze.getContentPane().add(lblQuantidadeRecebida);
		
		JButton btnNewButton = new JButton("Prosseguir");

		btnNewButton.setBounds(10, 258, 141, 23);
		frmBronze.getContentPane().add(btnNewButton);
		
		final JCheckBox vDados_PDF = new JCheckBox("PDF");
		vDados_PDF.setBounds(14, 32, 97, 23);
		frmBronze.getContentPane().add(vDados_PDF);
		
		final JCheckBox vDados_JSON = new JCheckBox("JSON");
		vDados_JSON.setBounds(113, 32, 97, 23);
		frmBronze.getContentPane().add(vDados_JSON);
		
		final JCheckBox vDados_CSV = new JCheckBox("CSV");
		vDados_CSV.setBounds(212, 32, 97, 23);
		frmBronze.getContentPane().add(vDados_CSV);
		
		final JCheckBox vDados_Planilhas = new JCheckBox("Planilhas");
		vDados_Planilhas.setBounds(311, 32, 97, 23);
		frmBronze.getContentPane().add(vDados_Planilhas);
		
		final JCheckBox vDados_Tabelas = new JCheckBox("Tabelas");
		vDados_Tabelas.setBounds(14, 58, 97, 23);
		frmBronze.getContentPane().add(vDados_Tabelas);
		
		final JCheckBox vDados_Audio = new JCheckBox("Audio");
		vDados_Audio.setBounds(113, 58, 97, 23);
		frmBronze.getContentPane().add(vDados_Audio);
		
		final JCheckBox vDados_Texto = new JCheckBox("vDados_Texto");
		vDados_Texto.setBounds(212, 58, 97, 23);
		frmBronze.getContentPane().add(vDados_Texto);
		
		final JCheckBox vOrigem_API = new JCheckBox("API");
		vOrigem_API.setBounds(6, 117, 97, 23);
		frmBronze.getContentPane().add(vOrigem_API);
		
		final JCheckBox vOrigem_SFTP = new JCheckBox("SFTP");
		vOrigem_SFTP.setBounds(105, 117, 97, 23);
		frmBronze.getContentPane().add(vOrigem_SFTP);
		
		final JCheckBox vOrigem_Upload = new JCheckBox("Upload");
		vOrigem_Upload.setBounds(204, 117, 97, 23);
		frmBronze.getContentPane().add(vOrigem_Upload);
		
		JButton btnRetorna = new JButton("Retorna");
		btnRetorna.setBounds(160, 258, 141, 23);
		frmBronze.getContentPane().add(btnRetorna);
		
		final JSpinner vContagem = new JSpinner();
		vContagem.setBounds(10, 175, 44, 20);
		frmBronze.getContentPane().add(vContagem);
		
		final JComboBox JComboBo_vData = new JComboBox();
		JComboBo_vData.setModel(new DefaultComboBoxModel(new String[] {"<Selecione uma das op\u00E7\u00F5es>", "Dias", "Semanas", "Meses"}));
		JComboBo_vData.setBounds(64, 174, 192, 22);
		frmBronze.getContentPane().add(JComboBo_vData);
		
		textField_vEnvio = new JTextField();
		textField_vEnvio.setBounds(10, 227, 246, 20);
		frmBronze.getContentPane().add(textField_vEnvio);
		textField_vEnvio.setColumns(10);
		
		JLabel lblQuantidadeRecebida_1 = new JLabel("Quantidade Recebida");
		lblQuantidadeRecebida_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantidadeRecebida_1.setBounds(10, 212, 174, 14);
		frmBronze.getContentPane().add(lblQuantidadeRecebida_1);
		
		
		//bot�o de prosseguir
		btnNewButton.addActionListener(new ActionListener() {
			private Dados dados;

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
				
				String vDadosListStr = "";
				for (String vDadosList1 : vDadosList) {
					vDadosListStr+= vDadosList1+",";
				}
				
				
				//fim do armazenamento de tipos de dados
				
				//armazena os tipos de envio
				ArrayList<String> vEnviarList = new ArrayList<String>();
				
				if(vOrigem_API.isSelected()) {
					vEnviarList.add("API");
					
				}
				if(vOrigem_SFTP.isSelected()) {
					vEnviarList.add("SFTP");
					
				}
				if(vOrigem_Upload.isSelected()) {
					vEnviarList.add("Upload");
					
				}

				//fim do armazenamento dos tipos de envio
				
				//Recebendo da quantidade  de dados
				
				dados.setvEnvio(textField_vEnvio.getText());
				dados.setvTempo(vContagem.getValue()+" "+JComboBo_vData.getSelectedItem());
				vTipo=vDadosListStr;
				
				//Armazenando o prazo de dados recebidos
				if(vDadosList.size() !=0 &&
						vEnviarList.size() !=0 &&
						!textField_vEnvio.getText().equals("") &&
						!JComboBo_vData.getSelectedItem().equals("<Selecione uma das op��es>")) {	
					
					/*DaoCliente_Dados daoCD=new DaoCliente_Dados(c1);
					daoCD.novaCD(dados);*/
					
					/*DaoCliente_Produto daoCP=new DaoCliente_Produto();
					daoCP.novaCP(c1);*/
					
				//Mostrando pro cliente os dados salvos ate agora
				JOptionPane.showMessageDialog(null, "Cliente: "+c1.getvNome_Cliente()+"\n"+
						"Solu��o: "+c1.getvSolucao_Cliente()+"\n"+
						"Objetivo: "+c1.getvObjetivo_Cliente()+"\n"+
						"Entregas Minimas: "+c1.getvEntregaM_Cliente()+"\n"+
						"Entregas Possiveis: "+c1.getvEntregaP_Cliente()+"\n"+
						"Produtos Selecionados:"+"\n"+
						"Tipo de Dados Selecionado:"+vDadosList+"\n"+
						"Forma de Envio Selecionado:"+vEnviarList+"\n"+
						"Programa��o de envio de dados:"+dados.getvTempo()+"\n"+
						"Quantidade de Dados Recebido: "+dados.getvEnvio());
				}else {
					JOptionPane.showMessageDialog(null,"Seleciona um  prazo valido ou Selecione todos os campos");
				}
			}
		});
		
		//Bot�o de retorna a pagina anteior
		btnRetorna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								EscopoInsert window2 = new EscopoInsert();
								window2.getFrmEscopoInsert().setVisible(true);
								frmBronze.setVisible(false);
								
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
				}
			
		});
	}
}