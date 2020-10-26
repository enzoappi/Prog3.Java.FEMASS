/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.femass.model.Disciplina;

/**
 *
 * @author enzoappi
 */
public class DisciplinaDao {
    
    public Connection getConexao() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/bdbiblioteca";
        Connection conexao = DriverManager.getConnection(url, "postgres", "postgres");
        return conexao;
    }

    public void gravarDisciplina(Disciplina disciplina) throws SQLException {
        String sql = "INSERT into disciplina (nome, curso) values (?, ?)";
        PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, disciplina.getNome());
        ps.setString(2, disciplina.getCurso());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        disciplina.setId(chaves.getInt(1));
    }
    
    public void alterarDisciplina(Disciplina disciplina) throws SQLException {
        String sql = "UPDATE disciplina set nome = ?, curso = ? WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, disciplina.getNome());
        ps.setString(2, disciplina.getCurso());
        ps.setInt(3, disciplina.getId());
        
        ps.executeUpdate();
    }
    
    public void apagarDisciplina(Disciplina disciplina) throws SQLException {
        String sql = "DELETE FROM disciplina WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, disciplina.getId());
        
        ps.executeUpdate();
    }
    
    public List<Disciplina> getDisciplinas() throws SQLException {
        String sql = "SELECT * FROM disciplina ORDER BY nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        List<Disciplina> disciplinas = new ArrayList();
        while(rs.next()) {
            Disciplina disciplina = new Disciplina();
            disciplina.setId(rs.getInt("id"));
            disciplina.setNome(rs.getString("nome"));
            disciplina.setCurso(rs.getString("curso"));
            disciplinas.add(disciplina);
        }
        return disciplinas;
    }
    
}
