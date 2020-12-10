/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author enzoappi
 */
public interface Persistencia {
    
    public void gravar(Object object) throws SQLException;
    public void alterar(Object object) throws SQLException;
    public void apagar(Object object) throws SQLException;
    public List getLista() throws SQLException;
    
}
