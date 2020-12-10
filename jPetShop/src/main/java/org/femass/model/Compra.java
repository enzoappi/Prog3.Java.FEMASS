/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author enzoappi
 */
public class Compra {
    
    private Integer id;
    private String Data;
    private Double valorTotal;
    
    private Fornecedor fornecedor;
    private List<ItemCompra> itensCompra = new ArrayList();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return Data;
    }

    public void setData() {
        this.Data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
        Double valorTotal = 0.0;
        for(ItemCompra item : this.itensCompra) {
            valorTotal += item.getProduto().getPreco() * item.getQtdeUnidades();
        }
        this.valorTotal = valorTotal;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public void adicionarItemCompra(ItemCompra itemCompra) throws Exception {
        for(ItemCompra item : this.itensCompra) {
            if(itemCompra.getProduto().getId() == item.getProduto().getId()) {
                throw new Exception("Item já adicionado!");
            }
        }
        this.itensCompra.add(itemCompra);
    }
    
    public List<ItemCompra> getListaItensCompra() {
        return this.itensCompra;
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", Data=" + Data + ", valorTotal=" + valorTotal;
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
        final Compra other = (Compra) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
