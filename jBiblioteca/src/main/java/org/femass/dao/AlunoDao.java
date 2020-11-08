/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.dao;

import java.sql.SQLException;
import java.util.List;
import org.femass.model.Aluno;

/**
 *
 * @author enzoappi
 */
public class AlunoDao extends Dao implements Persistencia{

    @Override
    public void gravar(Object object) throws SQLException {
        Aluno aluno = (Aluno) object;
    }

    @Override
    public void alterar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getLista() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
