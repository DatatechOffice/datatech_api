package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import telas.Cliente;
import telas.Dados;

public class DaoTipo_Dados {
    
    private Dados dados;
    
	public void novaTD(Dados dados) {
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into tipo_dados (tipo_dados) values (?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, "csvTeste");
            
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao inserir os dados!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão", e);
            }
        }

	}
}