package DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoBanco {
	
	/* Atributos da classe*/
	
	 Connection con;
	 Statement stmt;
	 ResultSet rs;
	 PreparedStatement ps;
	

	String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Teste;user=Api;password=12345;encrypt=true;trustServerCertificate=true";

	// ****************************************************************************************/

	public void abrirConexao() {

		try {
			System.out.print("Connecting to SQL Server ... ");
			try (Connection connection = DriverManager.getConnection(connectionUrl)) {
				System.out.println("Done.");
			}

		} catch (Exception e)

		{

			JOptionPane.showMessageDialog(null, "Erro na conex�o com o BD ", "ERRO", JOptionPane.ERROR_MESSAGE, null);

		}

	}

	// ******************************************************************/
	/*public void createRegistro(String q) throws SQLException {

		try {

			abrirConexao();

			// Executa a query de inserte
			stmt.executeUpdate(q);
			JOptionPane.showMessageDialog(null, "registro inserido");
		} finally {
			con.close();
		}

	}

	// **************************************************************/
	
	/* * public void read(String query) throws SQLException { try {
	 * 
	 * abrirConexao();
	 * 
	 * rs = stmt.executeQuery(query);
	 * 
	 * if (rs.next()) {
	 * 
	 * System.out.println(rs.getString("RA") + rs.getString("Nome"));
	 * 
	 * JOptionPane.showMessageDialog(null, rs.getString("RA") +
	 * rs.getString("Nome"));
	 * 
	 * } else {
	 * 
	 * JOptionPane.showMessageDialog(null, "N�o existe registro com este C�digo !");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * catch (Exception ex) {
	 * 
	 * JOptionPane.showMessageDialog(null, "erro aqui");
	 * 
	 * } finally { con.close(); }
	 * 
	 * }
	 */

	// ***********************************************************************************/
	/*
	 * public void update(String query) throws SQLException { try {
	 * 
	 * abrirConexao();
	 * 
	 * stmt.executeUpdate(query);
	 * 
	 * JOptionPane.showMessageDialog(null, " Dados atualizados");
	 * 
	 * } catch (Exception ex) {
	 * 
	 * JOptionPane.showMessageDialog(null, ex);
	 * 
	 * } finally { con.close(); }
	 * 
	 * }
	 */

	// *************************************************************************/
	/*
	 * public void delete(String query) throws SQLException { try {
	 * 
	 * abrirConexao();
	 * 
	 * stmt.executeUpdate(query);
	 * 
	 * JOptionPane.showMessageDialog(null, "item exclu�do");
	 * 
	 * } catch (Exception ex) {
	 * 
	 * JOptionPane.showMessageDialog(null, "erro ao exlcuir");
	 * 
	 * } finally { con.close(); }
	 * 
	 * }
	 */

}
