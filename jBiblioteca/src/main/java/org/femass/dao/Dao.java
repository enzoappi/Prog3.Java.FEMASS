/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author enzoappi
 */
public class Dao {
    
    public Connection getConexao() throws SQLException {
        String dataBase = "bdbiblioteca";
        String ip = "localhost";
        String usuario = "postgres";
        String senha = "postgres";
        String url = "jdbc:postgresql://" + ip + ":5432/" + dataBase; //configuracao da url seguindo os preceitos encontrado no google (url jdbc postgres)
        Connection con = DriverManager.getConnection(url, usuario, senha);
        return con;
    }
    
}
