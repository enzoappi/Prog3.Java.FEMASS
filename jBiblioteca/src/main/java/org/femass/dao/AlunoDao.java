/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.femass.model.Aluno;

/**
 *
 * @author enzoappi
 */
public class AlunoDao extends Dao implements Persistencia{

    @Override
    public void gravar(Object object) throws SQLException {
        Aluno aluno = (Aluno) object;
        String sql = "Insert into leitor (nome) values (?)";
        PreparedStatement psLeitor = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //O segundo parametro eh pra que as chaves sejam retornadas ao serem criadas no banco
        psLeitor.setString(1, aluno.getNome());
        
        psLeitor.executeUpdate();
        
        ResultSet chaves = psLeitor.getGeneratedKeys(); //pegar as chaves que sao retornadas apos o comando sql cria-las
        chaves.next(); //fazer com que o ponteiro ande na pilha ou lista de retorno.
        aluno.setId(chaves.getInt(1));
        
        sql = "Insert into aluno (id, matricula) values (?, ?)";
        PreparedStatement psAluno = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //O segundo parametro eh pra que as chaves sejam retornadas ao serem criadas no banco
        psAluno.setInt(1, aluno.getId());
        psAluno.setString(2, aluno.getMatricula());
        
        psAluno.executeUpdate(); 
    }

    @Override
    public void alterar(Object object) throws SQLException {
        Aluno aluno = (Aluno) object; //parse de object para Aluno afim de que a implementação do metodo se faça.
        String sql = "update leitor set nome = ? where id = ?";
        PreparedStatement psLeitor = getConexao().prepareStatement(sql);
        psLeitor.setString(1, aluno.getNome());
        psLeitor.setInt(2, aluno.getId());
        
        psLeitor.executeUpdate();
        
        sql = "update aluno set matricula = ? where id = ?";
        PreparedStatement psAluno = getConexao().prepareStatement(sql);
        psAluno.setString(1, aluno.getNome());
        psAluno.setInt(2, aluno.getId());
        
        psAluno.executeUpdate();
    }

    @Override
    public void apagar(Object object) throws SQLException {
        Aluno aluno = (Aluno) object; //parse de object para Aluno afim de que a implementação do metodo se faça.
        String sql = "delete from aluno where id = ?";
        PreparedStatement psAluno = getConexao().prepareStatement(sql);
        psAluno.setInt(1, aluno.getId());
        psAluno.executeUpdate();
        
        sql = "delete from leitor where id = ?";
        PreparedStatement psLeitor = getConexao().prepareStatement(sql);
        psLeitor.setInt(1, aluno.getId());
        psLeitor.executeUpdate();
    }

    @Override
    public List getLista() throws SQLException {
        String sql = "Select leitor.id as id, leitor.nome as nome, aluno.matricula as matricula from aluno inner join leitor on aluno.id = leitor.id order by leitor.nome"; //constroi-se a query
        PreparedStatement ps = getConexao().prepareStatement(sql); //conecto-me ao banco
        
        ResultSet rs = ps.executeQuery(); //executo a query
        
        List<Aluno> alunos = new ArrayList(); //instancio a List para armazenar os valores de retorno da query
        while(rs.next()) { //enquanto nao chego ao fim da lista de retorno
            Aluno aluno = new Aluno(); //instancio um aluno para gravar os valores
            aluno.setId(rs.getInt("id"));
            aluno.setNome(rs.getString("nome"));
            aluno.setMatricula(rs.getString("matricula"));
            alunos.add(aluno); //adiciono um aluno a List
        }
        return alunos; //retorno todos os alunos gravados na List
    }
    
}
