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
import org.femass.model.Curso;
import org.femass.model.Disciplina;
import org.femass.model.Professor;

/**
 *
 * @author enzoappi
 */
public class ProfessorDao extends Dao implements Persistencia{

    @Override
    public void gravar(Object object) throws SQLException {
        Professor professor = (Professor) object;
        String sql = "Insert into leitor (nome) values (?)";
        PreparedStatement psLeitor = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //O segundo parametro eh pra que as chaves sejam retornadas ao serem criadas no banco
        psLeitor.setString(1, professor.getNome());
        
        psLeitor.executeUpdate();
        
        ResultSet chaves = psLeitor.getGeneratedKeys(); //pegar as chaves que sao retornadas apos o comando sql cria-las
        chaves.next(); //fazer com que o ponteiro ande na pilha ou lista de retorno.
        professor.setId(chaves.getInt(1));
        
        sql = "Insert into professor (id, id_disciplina) values (?, ?)";
        PreparedStatement psProfessor = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //O segundo parametro eh pra que as chaves sejam retornadas ao serem criadas no banco
        psProfessor.setInt(1, professor.getId());
        psProfessor.setInt(2, professor.getDisciplina().getId());
        
        psProfessor.executeUpdate(); 
    }

    @Override
    public void alterar(Object object) throws SQLException {
        Professor professor = (Professor) object; //parse de object para Aluno afim de que a implementação do metodo se faça.
        String sql = "update leitor set nome = ? where id = ?";
        PreparedStatement psLeitor = getConexao().prepareStatement(sql);
        psLeitor.setString(1, professor.getNome());
        psLeitor.setInt(2, professor.getId());
        
        psLeitor.executeUpdate();
        
        sql = "update professor set id_disciplina = ? where id = ?";
        PreparedStatement psProfessor = getConexao().prepareStatement(sql);
        psProfessor.setInt(1, professor.getDisciplina().getId());
        psProfessor.setString(2, professor.getNome());
        
        psProfessor.executeUpdate();
    }

    @Override
    public void apagar(Object object) throws SQLException {
        Professor professor = (Professor) object; //parse de object para Aluno afim de que a implementação do metodo se faça.
        String sql = "delete from professor where id = ?";
        PreparedStatement psProfessor = getConexao().prepareStatement(sql);
        psProfessor.setInt(1, professor.getId());
        psProfessor.executeUpdate();
        
        sql = "delete from leitor where id = ?";
        PreparedStatement psLeitor = getConexao().prepareStatement(sql);
        psLeitor.setInt(1, professor.getId());
        psLeitor.executeUpdate();
    }

    @Override
    public List getLista() throws SQLException {
        String sql = "Select "
                + "leitor.id as id_leitor, "
                + "leitor.nome as nome_leitor, "
                + "disciplina.id as id_disciplina, "
                + "disciplina.nome as nome_disciplina, "
                + "disciplina.curso as curso_disciplina "
                + "from "
                + "professor "
                + "inner join leitor on professor.id = leitor.id "
                + "inner join disciplina on professor.id_disciplina = disciplina.id "
                + "order by "
                + "leitor.nome"; //constroi-se a query
        PreparedStatement ps = getConexao().prepareStatement(sql); //conecto-me ao banco
        
        ResultSet rs = ps.executeQuery(); //executo a query
        
        List<Professor> professores = new ArrayList(); //instancio a List para armazenar os valores de retorno da query
        while(rs.next()) { //enquanto nao chego ao fim da lista de retorno
            Professor professor = new Professor(); //instancio um professor para gravar os valores
            professor.setId(rs.getInt("id_leitor"));
            professor.setNome(rs.getString("nome_leitor"));
            
            Disciplina disciplina = new Disciplina();
            disciplina.setId(rs.getInt("id_disciplina"));
            disciplina.setNome(rs.getString("nome_disciplina"));
            disciplina.setCurso(Curso.valueOf(rs.getString("curso_disciplina")));
            
            professor.setDisciplina(disciplina);
            professores.add(professor);
        }
        return professores; //retorno todos os alunos gravados na List
    }
    
}
