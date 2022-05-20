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

public class DaoCliente_Dados {
    
    private Dados dados;
    private Cliente c1;

	public DaoCliente_Dados(Cliente c1) {
		this.c1=c1;
    }
    

	public void novaCD(Dados dados) {
		this.dados=dados;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into cliente_dados (id_cliente, id_dados, prazo, forma_envio, quantidade) values (?, ?, ?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, 1);
            pst.setObject(2, 1);
            pst.setObject(3, c1.getvPrazo());
            pst.setObject(4, "STFPTeste");
            pst.setObject(5, 42);
            
            
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