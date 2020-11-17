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
import org.femass.model.Aluno;
import org.femass.model.Leitor;

/**
 *
 * @author enzoappi
 */
public class LeitorDao extends Dao implements Persistencia{

    @Override
    public void gravar(Object object) throws SQLException {
        return;
    }

    @Override
    public void alterar(Object object) throws SQLException {
        return;
    }

    @Override
    public void apagar(Object object) throws SQLException {
        return;
    }

    @Override
    public List getLista() throws SQLException {
        String sql = "Select leitor.id as id, leitor.nome as nome from leitor order by leitor.nome"; //constroi-se a query
        PreparedStatement ps = getConexao().prepareStatement(sql); //conecto-me ao banco
        
        ResultSet rs = ps.executeQuery(); //executo a query
        
        List<Leitor> leitores = new ArrayList(); //instancio a List para armazenar os valores de retorno da query
        while(rs.next()) { //enquanto nao chego ao fim da lista de retorno
            Leitor leitor = new Leitor(); //instancio um aluno para gravar os valores
            leitor.setId(rs.getInt("id"));
            leitor.setNome(rs.getString("nome"));
            leitores.add(leitor); //adiciono um aluno a List
        }
        return leitores; //retorno todos os alunos gravados na List
    }
}
