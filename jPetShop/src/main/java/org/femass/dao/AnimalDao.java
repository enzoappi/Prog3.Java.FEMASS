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
import org.femass.model.Animal;
import org.femass.model.TipoAnimal;

/**
 *
 * @author enzoappi
 */
public class AnimalDao extends Dao implements Persistencia{
    
    @Override
    public void gravar(Object object) throws SQLException {
        Animal animal = (Animal) object;
        String sql = "INSERT into animal (nome, raca, idade, peso, tipo, porte) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, animal.getNome());
        ps.setString(2, animal.getRaca());
        ps.setInt(3, animal.getIdade());
        ps.setDouble(4, animal.getPeso());
        ps.setString(5, String.valueOf(animal.getTipoAnimal()));
        ps.setString(6, animal.getPorte());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        animal.setId(chaves.getInt(1));
    }

    @Override
    public void alterar(Object object) throws SQLException {
        Animal animal = (Animal) object;
        String sql = "UPDATE animal set nome = ?, raca = ?, idade = ?, peso = ?, tipo = ?, porte = ? WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, animal.getNome());
        ps.setString(2, animal.getRaca());
        ps.setInt(3, animal.getIdade());
        ps.setDouble(4, animal.getPeso());
        ps.setString(5, animal.getTipoAnimal().toString());
        ps.setString(6, animal.getPorte());
        ps.setInt(7, animal.getId());
        
        ps.executeUpdate();
        
        sql = "delete from animalcliente where id_animal = ?";
        ps = getConexao().prepareStatement(sql);
        ps.setInt(1, animal.getId());
        
        ps.executeUpdate();
        
        for(Cliente cliente: animal.getClientes()) {
            animal = (Animal) object;
            sql = "INSERT INTO animalcliente (id_animal, id_cliente) values (?, ?) on conflict do nothing";
            ps = getConexao().prepareStatement(sql);
            ps.setInt(1, animal.getId());
            ps.setInt(2, cliente.getId());

            ps.executeUpdate();
        
        }
    }

    @Override
    public void apagar(Object object) throws SQLException {
        Animal animal = (Animal) object;
        String sql = "DELETE FROM animal WHERE id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, animal.getId());
        
        ps.executeUpdate();
    }

    @Override
    public List<Animal> getLista() throws SQLException {
        String sql = "SELECT * FROM animal ORDER BY nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        List<Animal> animais = new ArrayList();
        while(rs.next()) {
            Animal animal = new Animal();
            animal.setId(rs.getInt("id"));
            animal.setNome(rs.getString("nome"));
            animal.setRaca(rs.getString("raca"));
            animal.setIdade(rs.getInt("idade"));
            animal.setPeso(rs.getDouble("peso"));
            animal.setTipoAnimal(TipoAnimal.get(rs.getString("tipo")));
            animal.setPorte(rs.getString("porte"));
            
            sql = "Select "
                    + "id_cliente, "
                    + "cliente.nome, "
                    + "cliente.cpf, "
                    + "cliente.endereco, "
                    + "cliente.telefone, "
                    + "cliente.email "
                    + "from "
                    + "animalcliente inner join cliente on animalcliente.id_cliente = cliente.id "
                    + "where id_animal = ?";
            
//            System.out.println(sql);
            
            PreparedStatement ps2 = getConexao().prepareStatement(sql);
            ps2.setInt(1, animal.getId());
            ResultSet rsA = ps2.executeQuery();
            
            while(rsA.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rsA.getInt("id_cliente"));
                cliente.setNome(rsA.getString("nome"));
                cliente.setCpf(rsA.getString("cpf"));
                cliente.setEndereco(rsA.getString("endereco"));
                cliente.setTelefone(rsA.getString("telefone"));
                cliente.setEmail(rsA.getString("email"));
                animal.adicionarCliente(cliente);
            }
            
            animais.add(animal);
        }
        return animais;
    }
}
