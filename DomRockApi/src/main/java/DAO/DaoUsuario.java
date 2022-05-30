package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controlador.Cliente;
import controlador.Usuario;


public class DaoUsuario {
    
    private Usuario usuario;
    String sql;
    

	public void criarUS(Usuario usuario) {
    	this.usuario = usuario;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into usuario (nome_usuario, senha, email) values (?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, usuario.getvNome_Usuario());
            pst.setObject(2, usuario.getvSenha_Usuario());
            pst.setObject(3, usuario.getvEmail_Usuario());
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
	
	
	public void deletarUS(Usuario usuario) {
    	this.usuario = usuario;
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
    
	
	public void atualizarUS(Usuario usuario) {
		this.usuario = usuario;
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
    public List<Usuario> buscarUsuarios(Usuario usuario) {
    	this.usuario = usuario;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from usuario where nome_usuario = ?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setString(1, usuario.getvNome_Usuario());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	Usuario u1 = new Usuario();
            	u1.setvNome_Usuario(rs.getString("nome_usuario"));
            	u1.setvSenha_Usuario(rs.getString("senha"));
            	u1.setvEmail_Usuario(rs.getString("email"));
            	usuarios.add(u1);
            	
            	System.out.print("Nome= " + u1.getvNome_Usuario());
            	 
          	
            	
            	
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
        return usuarios;
    }

}
