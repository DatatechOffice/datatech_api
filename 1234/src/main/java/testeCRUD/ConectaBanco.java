package testeCRUD;

/*Importando bibliotecas */

//import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectaBanco {

	/* Atributos da classe */

	Connection con;
	Statement stmt;
	ResultSet rs;
	PreparedStatement ps;

	/* Configuracao do BD */

	String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Teste;user=Teste;password=1234;encrypt=true;trustServerCertificate=true";

//****************************************************************************************/

	public void abrirConexao()

	{

		try {

			// Class.forName(driver).newInstance();
			con = DriverManager.getConnection(connectionUrl);
			stmt = con.createStatement();

		} catch (Exception e)

		{

			JOptionPane.showMessageDialog(null, "Erro na conexao com o Banco de Dados ", "ERRO",
					JOptionPane.ERROR_MESSAGE, null);

		}

	}

//******************************************************************/	
	public void createRegistro(String q) throws SQLException {

		try {

			abrirConexao();

			// Executa a query de insercao
			stmt.executeUpdate(q);
			JOptionPane.showMessageDialog(null, "registro inserido");
		} finally {
			con.close();
		}

	}

//**************************************************************/	
	public void read(String query) throws SQLException {
		try {

			abrirConexao();

			rs = stmt.executeQuery(query);

			if (rs.next()) {

				System.out.println(rs.getString("nome_cliente")+rs.getString("Objetivo")+rs.getString("entrega_minima")+rs.getString("entrega_possiveis"));

				JOptionPane.showMessageDialog(null, rs.getString("nome_cliente")+rs.getString("Objetivo")+rs.getString("entrega_minima")+rs.getString("entrega_possiveis") );

			} else {

				JOptionPane.showMessageDialog(null, "Nao existe registro com este Codigo !");

			}

		}

		catch (Exception ex) {

			JOptionPane.showMessageDialog(null, "erro aqui");

		} finally {
			con.close();
		}

	}

//***********************************************************************************/
	public void update(String query) throws SQLException {
		try {

			abrirConexao();

			stmt.executeUpdate(query);

			JOptionPane.showMessageDialog(null, " Dados atualizados");

		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, ex);

		} finally {
			con.close();
		}

	}

//*************************************************************************/	
	public void delete(String query) throws SQLException {
		try {

			abrirConexao();

			stmt.executeUpdate(query);

			JOptionPane.showMessageDialog(null, "item excluido");

		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, "erro ao exlcuir");

		} finally {
			con.close();
		}

	}

}
