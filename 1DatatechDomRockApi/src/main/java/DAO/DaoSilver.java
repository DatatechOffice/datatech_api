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

public class DaoSilver {

	private Cliente c1;
	private Cliente p1;
	private Cliente p2;
	private Cliente p3;
	private Cliente p4;
	private Cliente p5;
	private Cliente p6;
	private Dados d1;
	private Dados e1;
	private Dados e2;
	private Dados e3;
	private Dados t1;
	private Dados t2;
	private Dados t3;
	private Dados t4;
	private Dados t5;
	private Dados t6;
	private Dados t7;
	private int contador;

	public DaoSilver(Cliente c1, Cliente p1, Cliente p2, Cliente p3, Cliente p4, Cliente p5, Cliente p6, Dados e1,
			Dados e2, Dados e3, Dados d1, Dados t1, Dados t2, Dados t3, Dados t4, Dados t5, Dados t6, Dados t7,
			int contador) {
		this.c1 = c1;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
		this.d1 = d1;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
		this.t5 = t5;
		this.t6 = t6;
		this.t7 = t7;
		this.contador = contador;
	}

	public DaoSilver() {
	}

	public void criarSilverProduto() {
		Connection con = null;
		try {
			if (e1.getvEnvio() != d1.getvEnvio()) {
				if (p1.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p2.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p3.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p4.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p5.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p6.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e1.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
			}
			if (e2.getvEnvio() != d1.getvEnvio()) {
				if (p1.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p2.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p3.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p4.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p5.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p6.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e2.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
			}
			if (e3.getvEnvio() != d1.getvEnvio()) {
				if (p1.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p1.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p2.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p2.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p3.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p3.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p4.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p4.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p5.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p5.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
				}
				if (p6.getvId_Produto() != c1.getvId_Produto()) {
					if (t1.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t1.getvId_Dados());
						pst.executeUpdate();
					}
					if (t2.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t2.getvId_Dados());
						pst.executeUpdate();
					}
					if (t3.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t3.getvId_Dados());
						pst.executeUpdate();
					}
					if (t4.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t4.getvId_Dados());
						pst.executeUpdate();
					}
					if (t5.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t5.getvId_Dados());
						pst.executeUpdate();
					}
					if (t6.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t6.getvId_Dados());
						pst.executeUpdate();
					}
					if (t7.getvId_Dados() != d1.getvId_Dados()) {
						con = ConnectionManager.getConnection();
						String insert_sql = "insert into silver (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente, sok_snok, id_dados) values (?,?,?,?,?,?,?,?)";
						PreparedStatement pst;
						pst = con.prepareStatement(insert_sql);
						pst.setObject(1, d1.getvPrazo());
						pst.setObject(2, d1.getvQuantidade());
						pst.setObject(3, e3.getvEnvio());
						pst.setObject(4, p6.getvId_Produto());
						pst.setObject(5, c1.getvCNPJ_Cliente());
						pst.setObject(6, c1.getvId_Cliente());
						pst.setObject(7, "snok");
						pst.setObject(8, t7.getvId_Dados());
						pst.executeUpdate();
					}
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
				throw new RuntimeException("Erro ao fechar conexÃ£o", e);
			}
		}
	}

	public List<Cliente> buscarSilverProduto() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		Connection con = null;
		try {

			con = ConnectionManager.getConnection();
			String select_sql = "select * from silver where cnpj=? and id_cliente=?";// where cnpj = ?
			PreparedStatement pst;
			pst = con.prepareStatement(select_sql);
			pst.setObject(1, c1.getvCNPJ_Cliente());
			pst.setObject(2, c1.getvId_Cliente());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				p1.setvId_Produto(rs.getInt("id_produto"));
				e1.setvEnvio(rs.getString("forma_envio"));
				clientes.add(c1);

				System.out.println(p1.getvId_Produto() + " " + e1.getvEnvio());
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
				throw new RuntimeException("Erro ao fechar conexÃ£o", e);
			}
		}
		return clientes;
	}

	public List<Cliente> buscarSilverDados1() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        Connection con = null;
        try {
        	if(p1.getvId_Produto() != c1.getvId_Produto()) {
        		if(e1.getvEnvio() != d1.getvEnvio()) {
        				
        	con = ConnectionManager.getConnection();
            String select_sql = "select * from silver where cnpj=? and id_cliente=? and id_produto=? and forma_envio=? and id_dados=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p1.getvId_Produto());
            pst.setObject(4, e1.getvEnvio());
            pst.setObject(5, contador);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	d1.setvId_Dados(rs.getInt("id_dados"));
            	/*if(d1.getvId_Dados() == 1) {
            		t1.setvId_Dados(1);
            	}
            	if(d1.getvId_Dados() == 2) {
            		t2.setvId_Dados(2);
            	}
            		if(d1.getvId_Dados() == 3) {
                		t3.setvId_Dados(3);
                	}
            		
            		if(d1.getvId_Dados() == 4) {
                		t4.setvId_Dados(4);
                	}
            		
            		if(d1.getvId_Dados() == 5) {
                		t5.setvId_Dados(5);
                	}
            		
            		if(d1.getvId_Dados() == 6) {
                		t6.setvId_Dados(6);
                	}
            		
            		if(d1.getvId_Dados() == 7) {
                		t7.setvId_Dados(7);
                	}
            	}*/
     
        	clientes.add(c1);	
            }
        		}
        			}
        	}catch(

	SQLException e)
	{
		e.printStackTrace();
		throw new RuntimeException("Erro ao buscar tarefas!", e);
	}finally
	{
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao fechar conexÃ£o", e);
		}
	}return clientes;
	}

	public void atualizarSOk() {
        Connection con = null;
        try {
        	if((d1.getvId_Dados() == 1) || (d1.getvId_Dados() == 2) || (d1.getvId_Dados() == 3) || (d1.getvId_Dados() == 4)
            		|| (d1.getvId_Dados() == 5) || (d1.getvId_Dados() == 6) || (d1.getvId_Dados() == 7)) {
            con = ConnectionManager.getConnection();
            //cnpj, entrega_minimas, entregas_possiveis, nome_cliente, objetivo, setor, razao_social
            String insert_sql = "update silver set sok_snok='sok' where cnpj =? and id_cliente =? and id_dados=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, (d1.getvId_Dados() == 1) || (d1.getvId_Dados() == 2) || (d1.getvId_Dados() == 3) || (d1.getvId_Dados() == 4)
            		|| (d1.getvId_Dados() == 5) || (d1.getvId_Dados() == 6) == (d1.getvId_Dados() == 7));
            int rowsUpdated = pst.executeUpdate();
            if(rowsUpdated > 0) {
            	System.out.println("Atualizou passou");
            	}
            }else {
            	DaoSilver buscarSilverProduto = new DaoSilver(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1, t1, t2,
						t3, t4, t5, t6, t7, contador);
				buscarSilverProduto.buscarSilverProduto();
            	System.out.println("IdDados: "+d1.getvId_Dados());
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

	public void deletarEscolha(Cliente c1) {
		this.c1 = c1;
		Connection con = null;
		try {
			con = ConnectionManager.getConnection();
			String insert_sql = "DELETE FROM escolha WHERE id_cliente=? and cnpj=?";
			PreparedStatement pst;
			pst = con.prepareStatement(insert_sql);
			pst.setObject(1, c1.getvId_Cliente());
			pst.setObject(2, c1.getvCNPJ_Cliente());
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
				throw new RuntimeException("Erro ao fechar conexÃ£o", e);
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
	 * throw new RuntimeException("Erro ao fechar conexÃ£o", e); } } }
	 */
}
