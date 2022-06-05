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

public class DaoEscolha_Dados {

	private Cliente c1;
	private Cliente p1;
	private Cliente p2;
	private Cliente p3;
	private Cliente p4;
	private Cliente p5;
	private Cliente p6;
	private Cliente p7;
	private Dados d1;
	private Dados t1;
	private Dados t2;
	private Dados t3;
	private Dados t4;
	private Dados t5;
	private Dados t6;
	private Dados t7;
	private Dados e1;
	private Dados e2;
	private Dados e3;
	
	public DaoEscolha_Dados(Cliente p1, Cliente p2, Cliente p3, Cliente p4, Cliente p5, Cliente p6) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
	}

	public DaoEscolha_Dados(Dados d1) {
		this.d1=d1;	
	}
	public DaoEscolha_Dados() {
	}
	
	public void criarEscolhaDados(Cliente c1) {
		this.c1 = c1;
		Connection con = null;
		try {
			
			if(t1.getvId_Dados() != d1.getvId_Dados()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_dados, id_escolha) values (?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, t1.getvId_Dados());
				pst.setObject(2, c1.getvId_Escolha());
				pst.executeUpdate();
			}
			if(t2.getvId_Dados() != d1.getvId_Dados()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_dados, id_escolha) values (?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, t2.getvId_Dados());
				pst.setObject(2, c1.getvId_Escolha());
				pst.executeUpdate();
			}
			if(t3.getvId_Dados() != d1.getvId_Dados()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_dados, id_escolha) values (?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, t3.getvId_Dados());
				pst.setObject(2, c1.getvId_Escolha());
				pst.executeUpdate();
			}
			if(t4.getvId_Dados() != d1.getvId_Dados()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_dados, id_escolha) values (?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, t4.getvId_Dados());
				pst.setObject(2, c1.getvId_Escolha());
				pst.executeUpdate();
			}
			if(t5.getvId_Dados() != d1.getvId_Dados()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_dados, id_escolha) values (?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, t5.getvId_Dados());
				pst.setObject(2, c1.getvId_Escolha());
				pst.executeUpdate();
			}
			if(t6.getvId_Dados() != d1.getvId_Dados()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_dados, id_escolha) values (?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, t6.getvId_Dados());
				pst.setObject(2, c1.getvId_Escolha());
				pst.executeUpdate();
			}
			if(t7.getvId_Dados() != d1.getvId_Dados()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_dados, id_escolha) values (?,?)";
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
	
	public void criarEscolhaEnvio(Cliente c1) {
		this.c1 = c1;
		Connection con = null;
		try {

			if (p1.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "update escolha set quantidade = ?, forma_envio = ?, prazo = ? where cnpj =? and id_cliente =?";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, c1.getvCNPJ_Cliente());
				pst.setObject(2, c1.getvCNPJ_Cliente());
				pst.setObject(3, c1.getvId_Cliente());
				pst.setObject(4, c1.getvId_Cliente());
				pst.setObject(5, c1.getvId_Cliente());
				pst.executeUpdate();
			}
			if (p2.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_produto, cnpj, id_cliente) values (?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, p2.getvId_Produto());
				pst.setObject(2, c1.getvCNPJ_Cliente());
				pst.setObject(3, c1.getvId_Cliente());
				pst.executeUpdate();
			}
			if (p3.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_produto, cnpj, id_cliente) values (?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, p3.getvId_Produto());
				pst.setObject(2, c1.getvCNPJ_Cliente());
				pst.setObject(3, c1.getvId_Cliente());
				pst.executeUpdate();
			}
			if (p4.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_produto, cnpj, id_cliente) values (?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, p4.getvId_Produto());
				pst.setObject(2, c1.getvCNPJ_Cliente());
				pst.setObject(3, c1.getvId_Cliente());
				pst.executeUpdate();
			}
			if (p5.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_produto, cnpj, id_cliente) values (?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, p5.getvId_Produto());
				pst.setObject(2, c1.getvCNPJ_Cliente());
				pst.setObject(3, c1.getvId_Cliente());
				pst.executeUpdate();
			}
			if (p6.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_produto, cnpj, id_cliente) values (?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, p6.getvId_Produto());
				pst.setObject(2, c1.getvCNPJ_Cliente());
				pst.setObject(3, c1.getvId_Cliente());
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
	public void criarEscolhaQuantidadePrazo(Cliente c1) {
		this.c1=c1;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            //cnpj, entrega_minimas, entregas_possiveis, nome_cliente, objetivo, setor, razao_social
            String insert_sql = "update escolha set quantidade = ?, prazo = ? where cnpj = ? and id_cliente = ?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, d1.getvQuantidade());
            pst.setObject(2, d1.getvPrazo());
            pst.setObject(3, c1.getvCNPJ_Cliente());
            pst.setObject(4, c1.getvId_Cliente());
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