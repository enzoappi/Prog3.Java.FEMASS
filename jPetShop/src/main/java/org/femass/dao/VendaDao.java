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
import java.util.List;
import org.femass.model.Venda;
import org.femass.model.ItemVenda;

/**
 *
 * @author enzoappi
 */
public class VendaDao extends Dao implements Persistencia{
    
    @Override
    public void gravar(Object object) throws SQLException {
        Venda venda = (Venda) object;
        String sql = "Insert into venda (data, id_animal, valor_total) values (?, ?, ?)";
        PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, venda.getData());
        ps.setInt(2, venda.getAnimal().getId());
        ps.setDouble(3, venda.getValorTotal());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        venda.setId(chaves.getInt(1));
        
        for(ItemVenda iV : venda.getListaItensVenda()) {
            venda = (Venda) object;
            String sql1 = "Insert into itemvenda (id_produto, id_venda, qtde_unidades) values (?, ?, ?) on conflict do nothing";
            PreparedStatement ps2 = getConexao().prepareStatement(sql1);
            ps2.setInt(1, iV.getProduto().getId());
            ps2.setInt(2, venda.getId());
            ps2.setDouble(3, iV.getQtdeUnidades());
            
            ps2.executeUpdate();
            
            String sql2 = "update produto set qtde_unidades = ? WHERE id = ?";
            PreparedStatement ps3 = getConexao().prepareStatement(sql2);
            ps3.setInt(1, (iV.getProduto().getQdteUnidades() - iV.getQtdeUnidades()));
            ps3.setInt(2, iV.getProduto().getId());
            
            ps3.executeUpdate();
        }
    }
    
    @Override
    public void alterar(Object object) throws SQLException {
    }

    @Override
    public void apagar(Object object) throws SQLException {
    }

    @Override
    public List<Venda> getLista() throws SQLException {
        List<Venda> vendas = null;
        return vendas;
    }
}
