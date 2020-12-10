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
import org.femass.model.Cliente;

/**
 *
 * @author enzoappi
 */
public class ClienteDao extends Dao implements Persistencia{
    
    @Override
    public void gravar(Object object) throws SQLException {
        Cliente cliente = (Cliente) object; 
        String sql = "Insert into cliente (nome, cpf, endereco, telefone, email) values (?, ?, ?, ?, ?)";
        PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getCpf());
        ps.setString(3, cliente.getEndereco());
        ps.setString(4, cliente.getTelefone());
        ps.setString(5, cliente.getEmail());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        cliente.setId(chaves.getInt(1));
    }

    @Override
    public void alterar(Object object) throws SQLException {
        Cliente cliente = (Cliente) object;
        String sql = "UPDATE cliente set nome = ?, cpf = ?, endereco = ?, telefone = ?, email = ? WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getCpf());
        ps.setString(3, cliente.getEndereco());
        ps.setString(4, cliente.getTelefone());
        ps.setString(5, cliente.getEmail());
        ps.setInt(6, cliente.getId());
        
        ps.executeUpdate();
    }

    @Override
    public void apagar(Object object) throws SQLException {
        Cliente cliente = (Cliente) object;
        String sql = "delete from cliente where id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, cliente.getId());
        
        ps.executeUpdate();
    }

    @Override
    public List<Cliente> getLista() throws SQLException {
        String sql = "Select * from cliente order by nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        List<Cliente> clientes = new ArrayList();
        while(rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setEndereco(rs.getString("endereco"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setEmail(rs.getString("email"));
            clientes.add(cliente);
        }
        return clientes;
    }
    
}
