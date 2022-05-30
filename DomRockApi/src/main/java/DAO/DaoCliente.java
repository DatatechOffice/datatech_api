package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controlador.Cliente;


public class DaoCliente {
    
    private Cliente c1;
    String sql;
    

	public void criarCl(Cliente c1) {
    	this.c1=c1;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into cliente (cnpj, entrega_minimas, entregas_possiveis, nome_cliente, objetivo, setor, razao_social) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvEntregaM_Cliente());
            pst.setObject(3, c1.getvEntregaP_Cliente());
            pst.setObject(4, c1.getvNome_Cliente());
            pst.setObject(5, c1.getvObjetivo_Cliente());
            pst.setObject(6, c1.getvSetor_Cliente());
            pst.setObject(7, c1.getvSocial_Cliente());
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
            String insert_sql = "DELETE FROM cliente WHERE cnpj =? and nome_cliente=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, c1.getvCNPJ_Cliente());
            pst.setString(2, c1.getvNome_Cliente());
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
            //cnpj, entrega_minimas, entregas_possiveis, nome_cliente, objetivo, setor, razao_social
            String insert_sql = "update cliente set cnpj=?, entrega_minimas=?, entregas_possiveis=?, nome_cliente=?, objetivo=?, setor=?, razao_social=?  where cnpj =? and nome_cliente =?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvEntregaM_Cliente());
            pst.setObject(3, c1.getvEntregaP_Cliente());
            pst.setObject(4, c1.getvNome_Cliente());
            pst.setObject(5, c1.getvObjetivo_Cliente());
            pst.setObject(6, c1.getvSetor_Cliente());
            pst.setObject(7, c1.getvSocial_Cliente());
            pst.setObject(8, c1.getvCNPJ_Cliente2());
            pst.setObject(9, c1.getvNome_Cliente2());
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
            String select_sql = "select * from cliente where cnpj = ?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setString(1, c1.getvCNPJ_Cliente());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	Cliente c2 = new Cliente();
            	c2.setvId(rs.getInt("id_cliente"));
            	c2.setvCNPJ_Cliente(rs.getString("cnpj"));
            	c2.setvEntregaM_Cliente(rs.getString("entrega_minimas"));
            	c2.setvEntregaP_Cliente(rs.getString("entregas_possiveis"));
            	c2.setvNome_Cliente(rs.getString("nome_cliente"));
            	c2.setvObjetivo_Cliente(rs.getString("objetivo"));
            	c2.setvSetor_Cliente(rs.getString("setor"));
            	c2.setvSocial_Cliente(rs.getString("razao_social"));
            	clientes.add(c2);
            	
            	System.out.print("Id= " + c2.getvId() +" CNPJ= " + c2.getvCNPJ_Cliente() + " Entrega_minima= " + c2.getvEntregaM_Cliente() +" Entrega_possivel= " +
            	c2.getvEntregaP_Cliente() + " Nome= " + c2.getvNome_Cliente() + " Objetivo= " + c2.getvObjetivo_Cliente() +
            	" Setor= " + c2.getvSetor_Cliente() + " Razao_Social= " + c2.getvSocial_Cliente());
            	 
          	
            	
            	
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
