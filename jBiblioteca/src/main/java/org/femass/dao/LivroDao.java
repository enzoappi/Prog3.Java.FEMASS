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
import org.femass.model.Autor;
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
        String sql = "UPDATE livro set nome = ?, editora = ?, emprestado = ? WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, livro.getNome());
        ps.setString(2, livro.getEditora().toString());
        ps.setBoolean(3, livro.getEmprestado());
        ps.setInt(4, livro.getId());
        
        ps.executeUpdate();
        
        sql = "delete from livroautor where id_livro = ?"; //apaga todos os autores para garantir que só tenhamos os atuais
        ps = getConexao().prepareStatement(sql);
        ps.setInt(1, livro.getId());
        
        ps.executeUpdate();
        
        for(Autor autor: livro.getAutores()) { //loop para ir inserindo os autores no relaconamento livroautor
            livro = (Livro) object; //parse de object para Livro afim de que a implementação do metodo se faça.
            sql = "INSERT INTO livroautor (id_livro, id_autor) values (?, ?) on conflict do nothing"; //consulta com parametro de nao faca nada caso informacoes ambiguas
            ps = getConexao().prepareStatement(sql);
            ps.setInt(1, livro.getId());
            ps.setInt(2, autor.getId());

            ps.executeUpdate();
        
        }
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
            livro.setEmprestado(rs.getBoolean("emprestado"));
            
            sql = "Select "
                    + "id_autor, "
                    + "autor.nome, "
                    + "autor.sobrenome, "
                    + "autor.nacionalidade "
                    + "from "
                    + "livroautor inner join autor on livroautor.id_autor = autor.id "
                    + "where id_livro = ?";
            
            PreparedStatement ps2 = getConexao().prepareStatement(sql);
            ps2.setInt(1, livro.getId()); //IMPORTANTISSIMO SETAR O PARAMETRO
            ResultSet rsA = ps2.executeQuery();
            
            while(rsA.next()) {
                Autor autor = new Autor();
                autor.setId(rsA.getInt("id_autor"));
                autor.setNacionalidade(rsA.getString("nacionalidade"));
                autor.setNome(rsA.getString("nome"));
                autor.setSobrenome(rsA.getString("sobrenome"));
                livro.adicionarAutor(autor);
            }
            
            livros.add(livro);
        }
        return livros;
    }
    
    public List<Livro> getListaEmprestado() throws SQLException {
        String sql = "SELECT * FROM livro WHERE emprestado = true ORDER BY nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        List<Livro> livros = new ArrayList();
        while(rs.next()) {
            Livro livro = new Livro();
            livro.setId(rs.getInt("id"));
            livro.setNome(rs.getString("nome"));
            livro.setEditora(rs.getString("editora"));
            livro.setEmprestado(rs.getBoolean("emprestado"));
            
            sql = "Select "
                    + "id_autor, "
                    + "autor.nome, "
                    + "autor.sobrenome, "
                    + "autor.nacionalidade "
                    + "from "
                    + "livroautor inner join autor on livroautor.id_autor = autor.id "
                    + "where id_livro = ?";
            
            PreparedStatement ps2 = getConexao().prepareStatement(sql);
            ps2.setInt(1, livro.getId()); //IMPORTANTISSIMO SETAR O PARAMETRO
            ResultSet rsA = ps2.executeQuery();
            
            while(rsA.next()) {
                Autor autor = new Autor();
                autor.setId(rsA.getInt("id_autor"));
                autor.setNacionalidade(rsA.getString("nacionalidade"));
                autor.setNome(rsA.getString("nome"));
                autor.setSobrenome(rsA.getString("sobrenome"));
                livro.adicionarAutor(autor);
            }
            
            livros.add(livro);
        }
        return livros;
    }
    
    public List<Livro> getListaDisponivel() throws SQLException {
        String sql = "SELECT * FROM livro WHERE emprestado = false ORDER BY nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        List<Livro> livros = new ArrayList();
        while(rs.next()) {
            Livro livro = new Livro();
            livro.setId(rs.getInt("id"));
            livro.setNome(rs.getString("nome"));
            livro.setEditora(rs.getString("editora"));
            livro.setEmprestado(rs.getBoolean("emprestado"));
            
            sql = "Select "
                    + "id_autor, "
                    + "autor.nome, "
                    + "autor.sobrenome, "
                    + "autor.nacionalidade "
                    + "from "
                    + "livroautor inner join autor on livroautor.id_autor = autor.id "
                    + "where id_livro = ?";
            
            PreparedStatement ps2 = getConexao().prepareStatement(sql);
            ps2.setInt(1, livro.getId()); //IMPORTANTISSIMO SETAR O PARAMETRO
            ResultSet rsA = ps2.executeQuery();
            
            while(rsA.next()) {
                Autor autor = new Autor();
                autor.setId(rsA.getInt("id_autor"));
                autor.setNacionalidade(rsA.getString("nacionalidade"));
                autor.setNome(rsA.getString("nome"));
                autor.setSobrenome(rsA.getString("sobrenome"));
                livro.adicionarAutor(autor);
            }
            
            livros.add(livro);
        }
        return livros;
    }
}
