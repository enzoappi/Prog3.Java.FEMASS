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

/**
 *
 * @author enzoappi
 */
public class DisciplinaDao extends Dao implements Persistencia{
    
    @Override
    public void gravar(Object object) throws SQLException {
        Disciplina disciplina = (Disciplina) object; //parse de object para Autor afim de que a implementação do metodo se faça.
        String sql = "INSERT into disciplina (nome, curso) values (?, ?)";
        PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, disciplina.getNome());
        ps.setString(2, disciplina.getCurso().toString());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        disciplina.setId(chaves.getInt(1));
    }

    @Override
    public void alterar(Object object) throws SQLException {
        Disciplina disciplina = (Disciplina) object; //parse de object para Autor afim de que a implementação do metodo se faça.
        String sql = "UPDATE disciplina set nome = ?, curso = ? WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, disciplina.getNome());
        ps.setString(2, disciplina.getCurso().toString());
        ps.setInt(3, disciplina.getId());
        
        ps.executeUpdate();
    }

    @Override
    public void apagar(Object object) throws SQLException {
        Disciplina disciplina = (Disciplina) object; //parse de object para Autor afim de que a implementação do metodo se faça.
        String sql = "DELETE FROM disciplina WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, disciplina.getId());
        
        ps.executeUpdate();
    }

    @Override
    public List<Disciplina> getLista() throws SQLException {
        String sql = "SELECT * FROM disciplina ORDER BY nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        List<Disciplina> disciplinas = new ArrayList();
        while(rs.next()) {
            Disciplina disciplina = new Disciplina();
            disciplina.setId(rs.getInt("id"));
            disciplina.setNome(rs.getString("nome"));
            disciplina.setCurso(Curso.valueOf(rs.getString("curso")));
            disciplinas.add(disciplina);
        }
        return disciplinas;
    }
    
}
