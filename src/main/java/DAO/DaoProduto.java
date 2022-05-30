package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import telas.Cliente;
import telas.Escopo;

public class DaoProduto {
    
    private Cliente c1;
    
   private Escopo escopo;
   
   public DaoProduto(Escopo escopo) {
	   this.escopo=escopo;
   }
    
    
    public void novaPR(Cliente c1) {
    	this.c1=c1;
    	
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into produto (nome_produto) values (?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, escopo.abc.get(0));
            
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