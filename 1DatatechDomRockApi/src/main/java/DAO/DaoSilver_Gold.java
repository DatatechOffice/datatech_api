package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controlador.Cliente;
import controlador.Dados;

public class DaoSilver_Gold {

	private Cliente c1;
	private Dados d1;
	private Dados t1;
	private Dados t2;
	private Dados t3;
	private Dados t4;
	private Dados t5;
	private Dados t6;
	private Dados t7;

	
	public DaoSilver_Gold(Cliente c1, Dados d1, Dados t1, Dados t2, Dados t3, Dados t4, Dados t5, Dados t6, Dados t7) {
		this.c1=c1;	
		this.d1=d1;
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
		this.t4=t4;
		this.t5=t5;
		this.t6=t6;
		this.t7=t7;
	}
	
	public void criarEscolhaDados() {
		Connection con = null;
		try {
			con = ConnectionManager.getConnection();
            if(t1.getvId_Dados()!=d1.getvId_Dados()) {
			String insert_sql = "insert into escolha_dados (id_dados, id_escolha) values (?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, t1.getvId_Dados());
            pst.setObject(2, c1.getvId_Escolha());
            pst.executeUpdate();
            }
            if(t2.getvId_Dados()!=d1.getvId_Dados()) {
    			String insert_sql = "insert into escolha_dados (id_dados, id_escolha) values (?, ?)";
                PreparedStatement pst;
                pst = con.prepareStatement(insert_sql);
                pst.setObject(1, t2.getvId_Dados());
                pst.setObject(2, c1.getvId_Escolha());
                pst.executeUpdate();
                }
            if(t3.getvId_Dados()!=d1.getvId_Dados()) {
    			String insert_sql = "insert into escolha_dados (id_dados, id_escolha) values (?, ?)";
                PreparedStatement pst;
                pst = con.prepareStatement(insert_sql);
                pst.setObject(1, t3.getvId_Dados());
                pst.setObject(2, c1.getvId_Escolha());
                pst.executeUpdate();
                }
            if(t4.getvId_Dados()!=d1.getvId_Dados()) {
    			String insert_sql = "insert into escolha_dados (id_dados, id_escolha) values (?, ?)";
                PreparedStatement pst;
                pst = con.prepareStatement(insert_sql);
                pst.setObject(1, t4.getvId_Dados());
                pst.setObject(2, c1.getvId_Escolha());
                pst.executeUpdate();
                }
            if(t5.getvId_Dados()!=d1.getvId_Dados()) {
    			String insert_sql = "insert into escolha_dados (id_dados, id_escolha) values (?, ?)";
                PreparedStatement pst;
                pst = con.prepareStatement(insert_sql);
                pst.setObject(1, t5.getvId_Dados());
                pst.setObject(2, c1.getvId_Escolha());
                pst.executeUpdate();
                }
            if(t6.getvId_Dados()!=d1.getvId_Dados()) {
        			String insert_sql = "insert into escolha_dados (id_dados, id_escolha) values (?, ?)";
                    PreparedStatement pst;
                    pst = con.prepareStatement(insert_sql);
                    pst.setObject(1, t6.getvId_Dados());
                    pst.setObject(2, c1.getvId_Escolha());
                    pst.executeUpdate();
                    }
            if(t7.getvId_Dados()!=d1.getvId_Dados()) {
        			String insert_sql = "insert into escolha_dados (id_dados, id_escolha) values (?, ?)";
                    PreparedStatement pst;
                    pst = con.prepareStatement(insert_sql);
                    pst.setObject(1, t7.getvId_Dados());
                    pst.setObject(2, c1.getvId_Escolha());
                    pst.executeUpdate();
                    }
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
	
	
	
	public List<Cliente> buscarEscolhaProduto(Cliente c1) {
    	this.c1=c1;
        List<Cliente> clientes = new ArrayList<Cliente>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setString(1, c1.getvCNPJ_Cliente());
            pst.setInt(2, c1.getvId_Cliente());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	
            	
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	c1.setvId_Produto(rs.getInt("id_produto"));
            	clientes.add(c1);	
            }
            System.out.print("Id_Escolha= " + c1.getvId_Escolha() + "Id_Produto= " + c1.getvId_Produto());
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
	
	public void deletarEsD() {
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "DELETE FROM escolha_dados WHERE id_escolha = ?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setInt(1, c1.getvId_Escolha());
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

	/*
	 * public void criarEscolhaCliente(Cliente c1) { Connection con = null; try {
	 * con = ConnectionManager.getConnection(); String insert_sql =
	 * "insert into escolha (cnpj,id_cliente) values (?,?)"; PreparedStatement pst;
	 * 
	 * pst = con.prepareStatement(insert_sql); pst.setObject(1,
	 * c1.getvCNPJ_Cliente()); pst.setObject(2, c1.getvId_Cliente());
	 * pst.executeUpdate(); } catch (SQLException e) { e.printStackTrace(); throw
	 * new RuntimeException("Erro ao inserir os dados!", e); } finally { try { if
	 * (con != null) con.close(); } catch (SQLException e) { e.printStackTrace();
	 * throw new RuntimeException("Erro ao fechar conexão", e); } } }
	 */
}