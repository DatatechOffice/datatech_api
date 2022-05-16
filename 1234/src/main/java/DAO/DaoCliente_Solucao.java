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

public class DaoCliente_Solucao {
    
    private Cliente c1;
    
	public void novaCS(Cliente c1) {
		this.c1=c1;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into cliente_solucao (id_cliente, id_solucao) values (?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, 2);
            pst.setObject(2, 22);        
            
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