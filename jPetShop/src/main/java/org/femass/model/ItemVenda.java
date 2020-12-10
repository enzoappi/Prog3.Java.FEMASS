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
public class ItemVenda {
    
    private Integer qtdeUnidades;
    
    private Produto produto;
    private Venda venda;

    public Integer getQtdeUnidades() {
        return qtdeUnidades;
    }

    public void setQtdeUnidades(Integer qtdeUnidades) throws Exception{
        if(this.produto.getQdteUnidades() == 0 || this.produto.getQdteUnidades() == null) {
            throw new Exception("Não há itens suficientes no estoque!");
        }
        else if(this.produto.getQdteUnidades() - qtdeUnidades < 0){
            throw new Exception("Não há itens suficientes no estoque!");
        }
        else {
            this.qtdeUnidades = qtdeUnidades;
        }
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
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
        final ItemVenda other = (ItemVenda) obj;
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.venda, other.venda)) {
            return false;
        }
        return true;
    }
}
