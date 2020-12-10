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
import org.femass.model.Compra;
import org.femass.model.ItemCompra;

/**
 *
 * @author enzoappi
 */
public class CompraDao extends Dao implements Persistencia{
    
    @Override
    public void gravar(Object object) throws SQLException {
        Compra compra = (Compra) object;
        String sql = "Insert into compra (data, id_fornecedor, valor_total) values (?, ?, ?)";
        PreparedStatement ps = getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, compra.getData());
        ps.setInt(2, compra.getFornecedor().getId());
        ps.setDouble(3, compra.getValorTotal());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        compra.setId(chaves.getInt(1));
        
        for(ItemCompra iC : compra.getListaItensCompra()) {
            compra = (Compra) object;
            String sql1 = "Insert into itemcompra (id_produto, id_compra, qtde_unidades) values (?, ?, ?) on conflict do nothing";
            PreparedStatement ps2 = getConexao().prepareStatement(sql1);
            ps2.setInt(1, iC.getProduto().getId());
            ps2.setInt(2, compra.getId());
            ps2.setDouble(3, iC.getQtdeUnidades());
            
            ps2.executeUpdate();
            
            String sql2 = "update produto set qtde_unidades = ? WHERE id = ?";
            PreparedStatement ps3 = getConexao().prepareStatement(sql2);
            ps3.setInt(1, (iC.getProduto().getQdteUnidades() + iC.getQtdeUnidades()));
            ps3.setInt(2, iC.getProduto().getId());
            
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
    public List<Compra> getLista() throws SQLException {
        List<Compra> compras = null;
        return compras;
    }
}
