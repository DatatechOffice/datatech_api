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

	public DaoEscolha(Cliente p1, Cliente p2, Cliente p3, Cliente p4, Cliente p5, Cliente p6) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
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