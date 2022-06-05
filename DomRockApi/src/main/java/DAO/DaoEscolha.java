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

public class DaoEscolha {

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

	public DaoEscolha(Cliente p1, Cliente p2, Cliente p3, Cliente p4, Cliente p5, Cliente p6) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
	}

	public DaoEscolha(Dados d1) {
		this.d1 = d1;
	}

	public DaoEscolha(Dados e1, Dados e2, Dados e3, Dados d1) {
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
		this.d1 = d1;
	}

	public DaoEscolha(Dados t1, Dados t2, Dados t3, Dados t4, Dados t5, Dados t6, Dados t7) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
		this.t5 = t5;
		this.t6 = t6;
		this.t7 = t7;
	}

	public DaoEscolha() {
	}

	public void criarEscolhaProduto(Cliente c1) {
		this.c1 = c1;
		Connection con = null;
		try {

			if (p1.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (id_produto, cnpj, id_cliente) values (?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, p1.getvId_Produto());
				pst.setObject(2, c1.getvCNPJ_Cliente());
				pst.setObject(3, c1.getvId_Cliente());
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

	public void criarEscolhaEnvio(Cliente c1) {
		this.c1 = c1;
		Connection con = null;
		try {

			if (e1.getvEnvio() != d1.getvEnvio()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "update escolha set forma_envio = ? where cnpj = ? and id_cliente = ?";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, e1.getvEnvio());
				pst.setObject(2, c1.getvCNPJ_Cliente());
				pst.setObject(3, c1.getvId_Cliente());
				int rowsUpdated = pst.executeUpdate();
				if (rowsUpdated > 0) {
					System.out.println("Atualizou passou");
				}
			}
			if (e2.getvEnvio() != d1.getvEnvio()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "update escolha set forma_envio = ? where cnpj = ? and id_cliente = ?";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, e2.getvEnvio());
				pst.setObject(2, c1.getvCNPJ_Cliente());
				pst.setObject(3, c1.getvId_Cliente());
				int rowsUpdated = pst.executeUpdate();
				if (rowsUpdated > 0) {
					System.out.println("Atualizou passou");
				}
			}
			if (e3.getvEnvio() != d1.getvEnvio()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "update escolha set forma_envio = ? where cnpj = ? and id_cliente = ?";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, e3.getvEnvio());
				pst.setObject(2, c1.getvCNPJ_Cliente());
				pst.setObject(3, c1.getvId_Cliente());
				int rowsUpdated = pst.executeUpdate();
				if (rowsUpdated > 0) {
					System.out.println("Atualizou passou");
				}
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
		this.c1 = c1;
		Connection con = null;
		try {
			con = ConnectionManager.getConnection();
			// cnpj, entrega_minimas, entregas_possiveis, nome_cliente, objetivo, setor,
			// razao_social
			String insert_sql = "update escolha set quantidade = ?, prazo = ? where cnpj = ? and id_cliente = ?";
			PreparedStatement pst;
			pst = con.prepareStatement(insert_sql);
			pst.setObject(1, d1.getvQuantidade());
			pst.setObject(2, d1.getvPrazo());
			pst.setObject(3, c1.getvCNPJ_Cliente());
			pst.setObject(4, c1.getvId_Cliente());
			int rowsUpdated = pst.executeUpdate();
			if (rowsUpdated > 0) {
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
		this.c1 = c1;
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
			while (rs.next()) {

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

	public void deletarEscolha(Cliente c1) {
		this.c1 = c1;
		Connection con = null;
		try {
			con = ConnectionManager.getConnection();
			String insert_sql = "DELETE FROM escolha WHERE cnpj =? and id_cliente=?";
			PreparedStatement pst;
			pst = con.prepareStatement(insert_sql);
			pst.setString(1, c1.getvCNPJ_Cliente());
			pst.setInt(2, c1.getvId_Cliente());
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