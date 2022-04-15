package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author CAIO
 * 
 * Classe Responsavel por conectar ao banco de dados
 */
public class SqlServerConnection {
    
    //Metodo para obter conexão pelo driver do SqlServer
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        //Projeto > Propriedades > Bibliotecas > Adicionar JAR > sqljdbc42.jar     
        //Registra JDBC driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //Abrindo a conexão        
 //       Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=db_CrudJava;integratedSecurity=true;");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:3066;dataBaseName=XXXXXX;user=XXXXX;password=XXXXX;");
        return con;    
        }
    public static boolean testarConexao()
    {        
        try {
            SqlServerConnection SqlCon = new SqlServerConnection();
            Connection con = SqlCon.getConnection();
            if(con != null){
                System.out.println("Sucesso : Conectou no banco");
                return true;
            }else
                return false;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally            
        {
            System.out.println("Teste Finalizado");
        }
    }
}
