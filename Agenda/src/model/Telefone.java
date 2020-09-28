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
public class Telefone {
    private String ddd;
    private String numero;
    private TipoContato tipoContato;

    public Telefone(String ddd, String numero, TipoContato tipoContato) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipoContato = tipoContato;
    }

    public Telefone(String numero, TipoContato tipoContato) {
        this.ddd = "22";
        this.numero = numero;
        this.tipoContato = tipoContato;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    @Override
    public String toString() {
        return "(" + this.ddd + ") " + numero;
    }
    
    
    
}
