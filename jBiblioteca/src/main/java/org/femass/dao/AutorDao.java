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

/**
 *
 * @author enzoappi
 */
public class AutorDao extends Dao implements Persistencia{
    
    @Override
    public void gravar(Object object) throws SQLException {
        Autor autor = (Autor) object; //parse de object para Autor afim de que a implementação do metodo se faça.
        String sql = "Insert into autor (nome, sobrenome, nacionalidade) values (?, ?, ?)";
        PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //O segundo parametro eh pra que as chaves sejam retornadas ao serem criadas no banco
        ps.setString(1, autor.getNome());
        ps.setString(2, autor.getSobrenome());
        ps.setString(3, autor.getNacionalidade());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys(); //pegar as chaves que sao retornadas apos o comando sql cria-las
        chaves.next(); //fazer com que o ponteiro ande na pilha ou lista de retorno.
        autor.setId(chaves.getInt(1));
    }

    @Override
    public void alterar(Object object) throws SQLException {
        Autor autor = (Autor) object; //parse de object para Autor afim de que a implementação do metodo se faça.
        String sql = "update autor set nome = ?, sobrenome = ?, nacionalidade = ? where id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, autor.getNome());
        ps.setString(2, autor.getSobrenome());
        ps.setString(3, autor.getNacionalidade());
        ps.setInt(4, autor.getId());
        
        ps.executeUpdate();
    }

    @Override
    public void apagar(Object object) throws SQLException {
        Autor autor = (Autor) object; //parse de object para Autor afim de que a implementação do metodo se faça.
        String sql = "delete from autor where id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, autor.getId());
        
        ps.executeUpdate();
    }

    @Override
    public List<Autor> getLista() throws SQLException {
        String sql = "Select * from autor order by sobrenome"; //constroi-se a query
        PreparedStatement ps = getConexao().prepareStatement(sql); //conecto-me ao banco
        
        ResultSet rs = ps.executeQuery(); //executo a query
        
        List<Autor> autores = new ArrayList(); //instancio a List para armazenar os valores de retorno da query
        while(rs.next()) { //enquanto nao chego ao fim da lista de retorno
            Autor autor = new Autor(); //instancio um autor para gravar os valores
            autor.setId(rs.getInt("id"));
            autor.setNome(rs.getString("nome"));
            autor.setSobrenome(rs.getString("sobrenome"));
            autor.setNacionalidade(rs.getString("nacionalidade"));
            autores.add(autor); //adiciono um autor a List
        }
        return autores; //retorno todos os autores gravados na List
    }
}
