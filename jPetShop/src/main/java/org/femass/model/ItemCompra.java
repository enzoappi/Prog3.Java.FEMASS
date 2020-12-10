/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.model;

import java.util.Objects;

/**
 *
 * @author enzoappi
 */
public class ItemCompra {
    
    private Integer qtdeUnidades;
    
    private Produto produto;
    private Compra compra;

    public Integer getQtdeUnidades() {
        return qtdeUnidades;
    }

    public void setQtdeUnidades(Integer qtdeUnidades) throws Exception{
        this.qtdeUnidades = qtdeUnidades;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Compra getCompra() {
        return this.compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return produto + " || " + qtdeUnidades + "unidades";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemCompra other = (ItemCompra) obj;
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.compra, other.compra)) {
            return false;
        }
        return true;
    }
}
