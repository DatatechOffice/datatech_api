package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import telas.Cliente;


public class DaoCliente {
    
    private Cliente c1;
    String sql;
    

	public void criarCl(Cliente c1) {
    	this.c1=c1;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into cliente (nome_cliente, objetivo, entrega_minimas, entregas_possiveis) values (?, ?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, c1.getvCliente());
            pst.setObject(2, c1.getvObjetivo());
            pst.setObject(3, c1.getvEntregaM());
            pst.setObject(4, c1.getvEntregaP());
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
	
	
	public void deletarCl(Cliente c1) {
    	this.c1=c1;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "DELETE FROM cliente WHERE nome_cliente =? and objetivo=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, c1.getvCliente());
            pst.setString(2, c1.getvObjetivo());
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
    
	
	public void atualizarCl(Cliente c1) {
		this.c1=c1;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "update cliente set nome_cliente=?, objetivo=?, entrega_minimas=?, entregas_possiveis=? where nome_cliente = 'B' ";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, c1.getvCliente());
            pst.setObject(2, c1.getvObjetivo());
            pst.setObject(3, c1.getvEntregaM());
            pst.setObject(4, c1.getvEntregaP());           
            int rowsUpdated = pst.executeUpdate();
            if(rowsUpdated > 0) {
            	System.out.println("Atualizou passou");
            }
            
            
        } catch (SQLException e) {
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
	
	/*
	 * public void exibirCl(Cliente c1) { this.c1=c1; Connection con = null; try {
	 * con = ConnectionManager.getConnection(); sql =
	 * "select nome_cliente from cliente "; //String exSql = new sql.get("nome");
	 * PreparedStatement pst; pst = con.prepareStatement(sql);
	 * 
	 * pst.executeQuery(); System.out.println(sql);
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); throw new
	 * RuntimeException("Erro ao inserir os dados!", e); } finally { try { if (con
	 * != null) con.close(); } catch (SQLException e) { e.printStackTrace(); throw
	 * new RuntimeException("Erro ao fechar conexão", e); } } }
	 */
    public List<Cliente> buscarClientes(Cliente c1) {
    	this.c1=c1;
        List<Cliente> clientes = new ArrayList<Cliente>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from cliente where nome_cliente = ?";
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setString(1, c1.getvCliente());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	Cliente c2 = new Cliente();
            	c2.setvCliente(rs.getString("nome_cliente"));
            	c2.setvObjetivo(rs.getString("objetivo"));
            	c2.setvEntregaM(rs.getString("entrega_minimas"));
            	c2.setvEntregaP(rs.getString("entregas_possiveis"));
            	c2.setvId(rs.getInt("id_cliente"));
            	clientes.add(c2);
            	
            	System.out.print(c2.getvId() + c2.getvCliente() + c2.getvObjetivo() + c2.getvEntregaM() + c2.getvEntregaP());
            	 
          	
            	
            	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão", e);
            }
        }        
        return clientes;
    }

}
