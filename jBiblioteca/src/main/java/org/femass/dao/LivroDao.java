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
import org.femass.model.Livro;

/**
 *
 * @author enzoappi
 */
public class LivroDao extends Dao implements Persistencia{
    
    @Override
    public void gravar(Object object) throws SQLException {
        Livro livro = (Livro) object; //parse de object para Autor afim de que a implementação do metodo se faça.
        String sql = "INSERT into livro (nome, editora) values (?, ?)";
        PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, livro.getNome());
        ps.setString(2, livro.getEditora());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        livro.setId(chaves.getInt(1));
    }

    @Override
    public void alterar(Object object) throws SQLException {
        Livro livro = (Livro) object; //parse de object para Autor afim de que a implementação do metodo se faça.
        String sql = "UPDATE livro set nome = ?, editora = ? WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, livro.getNome());
        ps.setString(2, livro.getEditora().toString());
        ps.setInt(3, livro.getId());
        
        ps.executeUpdate();
    }

    @Override
    public void apagar(Object object) throws SQLException {
        Livro livro = (Livro) object; //parse de object para Autor afim de que a implementação do metodo se faça.
        String sql = "DELETE FROM livro WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, livro.getId());
        
        ps.executeUpdate();
    }

    @Override
    public List<Livro> getLista() throws SQLException {
        String sql = "SELECT * FROM livro ORDER BY nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        List<Livro> livros = new ArrayList();
        while(rs.next()) {
            Livro livro = new Livro();
            livro.setId(rs.getInt("id"));
            livro.setNome(rs.getString("nome"));
            livro.setEditora(rs.getString("editora"));
            livros.add(livro);
        }
        return livros;
    }
    
}
