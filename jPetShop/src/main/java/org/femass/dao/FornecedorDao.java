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
import org.femass.model.Fornecedor;

/**
 *
 * @author enzoappi
 */
public class FornecedorDao extends Dao implements Persistencia{
    
    @Override
    public void gravar(Object object) throws SQLException {
        Fornecedor fornecedor = (Fornecedor) object; 
        String sql = "Insert into fornecedor (nome, cnpj, endereco, telefone, email) values (?, ?, ?, ?, ?)";
        PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, fornecedor.getNome());
        ps.setString(2, fornecedor.getCnpj());
        ps.setString(3, fornecedor.getEndereco());
        ps.setString(4, fornecedor.getTelefone());
        ps.setString(5, fornecedor.getEmail());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        fornecedor.setId(chaves.getInt(1));
    }

    @Override
    public void alterar(Object object) throws SQLException {
        Fornecedor fornecedor = (Fornecedor) object;
        String sql = "UPDATE fornecedor set nome = ?, cnpj = ?, endereco = ?, telefone = ?, email = ? WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, fornecedor.getNome());
        ps.setString(2, fornecedor.getCnpj());
        ps.setString(3, fornecedor.getEndereco());
        ps.setString(4, fornecedor.getTelefone());
        ps.setString(5, fornecedor.getEmail());
        ps.setInt(6, fornecedor.getId());
        
        ps.executeUpdate();
    }

    @Override
    public void apagar(Object object) throws SQLException {
        Fornecedor fornecedor = (Fornecedor) object;
        String sql = "delete from fornecedor where id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, fornecedor.getId());
        
        ps.executeUpdate();
    }

    @Override
    public List<Fornecedor> getLista() throws SQLException {
        String sql = "Select * from fornecedor order by nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        List<Fornecedor> fornecedores = new ArrayList();
        while(rs.next()) {
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setId(rs.getInt("id"));
            fornecedor.setNome(rs.getString("nome"));
            fornecedor.setCnpj(rs.getString("cnpj"));
            fornecedor.setEndereco(rs.getString("endereco"));
            fornecedor.setTelefone(rs.getString("telefone"));
            fornecedor.setEmail(rs.getString("email"));
            fornecedores.add(fornecedor); //adiciono um autor a List
        }
        return fornecedores; //retorno todos os autores gravados na List
    }
    
}
