/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.InputMismatchException;

/**
 *
 * @author enzoappi
 */
public class Autor {
    private String codigoAutor;
    private String nomeAutor;
    private String nacionalidadeAutor;

    public Autor(String codigoAutor, String nomeAutor, String nacionalidadeAutor) {
        this.codigoAutor = codigoAutor;
        this.nomeAutor = nomeAutor;
        this.nacionalidadeAutor = nacionalidadeAutor;
    }

    public String getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(String codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getNomeAutor() {
        return this.nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getNacionalidadeAutor() {
        return nacionalidadeAutor;
    }

    public void setNacionalidadeAutor(String nacionalidadeAutor) {
        this.nacionalidadeAutor = nacionalidadeAutor;
    }

    @Override
    public String toString() {
        return this.nomeAutor;
    }
    
    public void testarCampos() {
        if(this.codigoAutor.isEmpty() || this.nacionalidadeAutor.isEmpty() || this.nomeAutor.isEmpty()) {
            throw new InputMismatchException("Você precisa preencher todos os campos antes de gravar!");
        }
    }
}
