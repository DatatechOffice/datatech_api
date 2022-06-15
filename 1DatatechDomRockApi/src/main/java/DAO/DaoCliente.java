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
    private String select_sql;
    private PreparedStatement pst;
    
	public void criarCl(Cliente c1) {
    	this.c1=c1;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into cliente (cnpj, entrega_minimas, entregas_possiveis, nome_cliente, objetivo, setor, razao_social, id_solucao) values (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvEntregaM_Cliente());
            pst.setObject(3, c1.getvEntregaP_Cliente());
            pst.setObject(4, c1.getvNome_Cliente());
            pst.setObject(5, c1.getvObjetivo_Cliente());
            pst.setObject(6, c1.getvSetor_Cliente());
            pst.setObject(7, c1.getvSocial_Cliente());
            pst.setObject(8, c1.getvId_Solucao());
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
            
            String insert_sql = "DELETE FROM cliente WHERE cnpj =? and id_cliente=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, c1.getvCNPJ_Cliente());
            pst.setInt (2, c1.getvId_Cliente());
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
            String insert_sql = "update cliente set cnpj=?, entrega_minimas=?, entregas_possiveis=?, nome_cliente=?, objetivo=?, setor=?, razao_social=? , id_solucao=? where cnpj =? and id_cliente =?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvEntregaM_Cliente());
            pst.setObject(3, c1.getvEntregaP_Cliente());
            pst.setObject(4, c1.getvNome_Cliente());
            pst.setObject(5, c1.getvObjetivo_Cliente());
            pst.setObject(6, c1.getvSetor_Cliente());
            pst.setObject(7, c1.getvSocial_Cliente());
            pst.setObject(8, c1.getvId_Solucao());
            pst.setObject(9, c1.getvCNPJ_Cliente());
            pst.setObject(10, c1.getvId_Cliente());
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
        	select_sql = "select * from cliente where cnpj = ? and id_solucao=?";// where cnpj = ?
            pst = con.prepareStatement(select_sql);
            pst.setString(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Solucao());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	
            	c1.setvId_Cliente(rs.getInt("id_cliente"));
            	c1.setvId_Solucao(rs.getInt("id_solucao"));
            	c1.setvCNPJ_Cliente(rs.getString("cnpj"));
            	c1.setvEntregaM_Cliente(rs.getString("entrega_minimas"));
            	c1.setvEntregaP_Cliente(rs.getString("entregas_possiveis"));
            	c1.setvNome_Cliente(rs.getString("nome_cliente"));
            	c1.setvObjetivo_Cliente(rs.getString("objetivo"));
            	c1.setvSetor_Cliente(rs.getString("setor"));
            	c1.setvSocial_Cliente(rs.getString("razao_social"));
            	clientes.add(c1);
            	
				
				  System.out.print("Id_Cliente= " + c1.getvId_Cliente() +" Id_Solucao= "+c1.getvId_Solucao()+" CNPJ= " + c1.getvCNPJ_Cliente() +
				  " Entrega_minima= " + c1.getvEntregaM_Cliente() +" Entrega_possivel= " +
				  c1.getvEntregaP_Cliente() + " Nome= " + c1.getvNome_Cliente() + " Objetivo= "
				  + c1.getvObjetivo_Cliente() + " Setor= " + c1.getvSetor_Cliente() +
				  " Razao_Social= " + c1.getvSocial_Cliente());
            
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

