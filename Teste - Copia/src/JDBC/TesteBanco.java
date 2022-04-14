package JDBC;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;


public class TesteBanco {
	
	

		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
			
			System.out.println("*********************Conexão jdbc******************************");
			
			ConexaoBanco ob1=new ConexaoBanco();
			String q=new String();
		    int cod;
		    
			cod = Integer.parseInt(JOptionPane.showInputDialog("Digite RA"));
	        q="SELECT * from Aluno where RA='"+ cod+"'";
	        System.out.println(q);
	        ob1.read(q);
	        
	        /*q="DELETE FROM Aluno WHERE RA='" + cod + "'";
	        ob1.delete(q);
	        
	       cod = Long.parseLong(JOptionPane.showInputDialog("Digite RA"));
	        q= "UPDATE Aluno SET Nome='Marcia', Massa=60, Altura=1.73, Sexo='F' WHERE RA='" + cod + "'";
	        ob1.update(q);
	       
	        q="INSERT INTO Aluno (RA,Nome,Massa,Sexo,Altura) VALUES (146028,'Renata',46,'F',1.49)";
	        ob1.createRegistro(q);*/
		}
}
