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
import org.femass.model.Produto;

/**
 *
 * @author enzoappi
 */
public class ProdutoDao extends Dao implements Persistencia{
    
    @Override
    public void gravar(Object object) throws SQLException {
        Produto produto = (Produto) object;
        String sql = "INSERT into produto (nome, preco) values (?, ?)";
        PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, produto.getNome());
        ps.setDouble(2, produto.getPreco());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        produto.setId(chaves.getInt(1));
    }

    @Override
    public void alterar(Object object) throws SQLException {
        Produto produto = (Produto) object;
        String sql = "UPDATE produto set nome = ?, preco = ?, qtde_unidades = ? WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, produto.getNome());
        ps.setDouble(2, produto.getPreco());
        ps.setInt(3, produto.getQdteUnidades());
        ps.setInt(4, produto.getId());
        
        ps.executeUpdate();
    }

    @Override
    public void apagar(Object object) throws SQLException {
        Produto produto = (Produto) object;
        String sql = "DELETE FROM produto WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, produto.getId());
        
        ps.executeUpdate();
    }
    
    @Override
    public List<Produto> getLista() throws SQLException {
        String sql = "Select * from produto order by nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        List<Produto> produtos = new ArrayList();
        while(rs.next()) {
            Produto produto = new Produto();
            produto.setId(rs.getInt("id"));
            produto.setNome(rs.getString("nome"));
            produto.setPreco(rs.getDouble("preco"));
            produto.setQdteUnidades(rs.getInt("qtde_unidades"));
            produtos.add(produto);
        }
        return produtos;
    }
}
