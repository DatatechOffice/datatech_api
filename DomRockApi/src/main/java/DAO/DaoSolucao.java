package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import telas.Cliente;

public class DaoSolucao {
    
    private Cliente c1;
    
    

	public void novaSol(Cliente c1) {
    	this.c1=c1;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into solucao (nome_solucao) values (?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, c1.getvSolucao());
            
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
        
     
    /*public List<Tarefa> buscarTarefas() {
        List<Tarefa> tarefas = new ArrayList<Tarefa>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select tar_id, tar_descricao, tar_inicio_previsto, tar_inicio_real, tar_termino_previsto, tar_termino_real from tar_tarefa";
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                Tarefa tarefa = new Tarefa();
                tarefa.setId(rs.getLong("tar_id"));
                tarefa.setDescricao(rs.getString("tar_descricao"));
                tarefa.setDataInicioPrevisto((Date)rs.getObject("tar_inicio_previsto"));
                tarefa.setDataInicioReal((Date)rs.getObject("tar_inicio_real"));
                tarefa.setDataFimPrevisto((Date)rs.getObject("tar_termino_previsto"));
                tarefa.setDataFimReal((Date)rs.getObject("tar_termino_real"));
                tarefas.add(tarefa);
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
        return tarefas;
    }*/

