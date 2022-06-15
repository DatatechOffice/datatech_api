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
import controlador.GoldCon;

public class DaoSilver_Gold {

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
	private GoldCon g1;
	

	
	public DaoSilver_Gold(Cliente c1, Cliente p1, Cliente p2, Cliente p3, Cliente p4, Cliente p5, Cliente p6, Dados e1,
			Dados e2, Dados e3, Dados d1, Dados t1, Dados t2, Dados t3, Dados t4, Dados t5, Dados t6, Dados t7,
			int contador, GoldCon g1) {
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
		this.g1 = g1;
	}
	
	public void criarSilverGold() {
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into silver_gold (cnpj, id_cliente, id_gold) values (?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, g1.getvId_Gold());
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
	
	public void deletarEsSG() {
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "DELETE FROM silver_gold WHERE id_cliente = ? and cnpj=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setInt(1, c1.getvId_Cliente());
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