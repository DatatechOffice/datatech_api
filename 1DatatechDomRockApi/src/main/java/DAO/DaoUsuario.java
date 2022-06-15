package DAO;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import controlador.Cliente;
import controlador.Usuario;
import layout.Login;
import layout.Menu;


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
            String insert_sql = "DELETE FROM usuario WHERE nome_usuario = ? and senha = ?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, usuario.getvNome_Usuario());
            pst.setString(2, usuario.getvSenha_Usuario());
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
            String insert_sql = "update usuario set nome_usuario = ?, senha = ?, email = ? where nome_usuario = ? and email = ?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, usuario.getvNome_Usuario());
            pst.setObject(2, usuario.getvSenha_Usuario());
            pst.setObject(3, usuario.getvEmail_Usuario());
            pst.setObject(4, usuario.getvNome_Usuario());
            pst.setObject(5, usuario.getvEmail_Usuario());
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
            String select_sql = "select * from usuario where nome_usuario = ? and senha=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setString(1, usuario.getvNome_Usuario());
            pst.setString(2, usuario.getvSenha_Usuario());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	Usuario u1 = new Usuario();
            	u1.setvNome_Usuario(rs.getString("nome_usuario"));
            	u1.setvSenha_Usuario(rs.getString("senha"));
            	u1.setvEmail_Usuario(rs.getString("email"));
            	usuarios.add(u1);
            	

            	if(usuario.getvNome_Usuario().equals(u1.getvNome_Usuario()) )
				{
                	System.out.print("Nome= " + u1.getvNome_Usuario());	
                	
                	EventQueue.invokeLater(new Runnable() {
    					public void run() {
    						try {
    							Login window = new Login();
    							// aqui setamos qual dela vai ser aberta
    							Menu window1 = new Menu();
    							// aqui setamos a nova tela como visivel
    							window1.getFrmMenu().setVisible(true);
    							// e para n�o ficar com duas telas abertas, ordenamos a atual a ficar invisivel
    							window.getFrmLogin().setVisible(false);

    						} catch (Exception e) {
    							e.printStackTrace();
    						}
    					}
    				});
				}
            	else {
            		JOptionPane.showMessageDialog(null,
							"Senha ou nome de usuario incorretos!");
            		System.out.print("Senha ou nome de usuario incorretos!");
            	}
            	
            	//System.out.print("Nome= " + usuario.getvNome_Usuario());	
			
            	 
          	
            	
            	
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
