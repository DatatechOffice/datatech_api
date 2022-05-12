package testeCRUD;



import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;


public class CRUD {
	
	

		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
			
			System.out.println("Conexao com o Banco esta ativa");
			int id;
		    String ab;
		    
			ConectaBanco ob1=new ConectaBanco();
			String q=new String();
			//ob1.abrirConexao();
			
			
		    
		    /*ab = JOptionPane.showInputDialog("Digite o nome");
	        q="SELECT * from cliente where nome_cliente='"+ ab+"'";
	        System.out.println(q);
	        ob1.read(q);*/
	        
	        ab = JOptionPane.showInputDialog("Digite o nome");
	        q="DELETE FROM cliente WHERE nome_cliente='" + ab + "'";
	        ob1.delete(q);
	        
	        
	        
	       /* id = Integer.parseInt(JOptionPane.showInputDialog("Digite RA"));*/
		   /* ab = JOptionPane.showInputDialog("Digite o nome do cliente");
	        q= "UPDATE cliente SET nome_cliente='Marchado', objetivo='Machado', entrega_minima='Machado', entrega_possiveis='Machado' WHERE nome_cliente='" + ab + "'";
	        ob1.update(q);*/
	       
			/* ab = JOptionPane.showInputDialog("Digite o nome da Tabela");
	        q="INSERT INTO cliente (nome_cliente,objetivo,entrega_minima,entrega_possiveis) VALUES ('Eduardo','Renata','Monica','Leonardo')";
	        ob1.createRegistro(q);*/
	        	        
	        
		}
}
