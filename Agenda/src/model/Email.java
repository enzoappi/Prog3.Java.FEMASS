/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author enzoappi
 */
public class Email {
    private String endereco;
    private TipoContato tipoContato;

    public Email(String endereco, TipoContato tipoContato) {
        this.endereco = endereco;
        this.tipoContato = tipoContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    @Override
    public String toString() {
        return this.endereco;
    }
    
}
