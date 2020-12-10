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
public class Venda {
    
    private Integer id;
    private String Data;
    private Double valorTotal;
    
    private Animal animal;
    private List<ItemVenda> itensVenda = new ArrayList();

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
        for(ItemVenda item : this.itensVenda) {
            valorTotal += item.getProduto().getPreco() * item.getQtdeUnidades();
        }
        this.valorTotal = valorTotal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    public void adicionarItemVenda(ItemVenda itemVenda) throws Exception {
        for(ItemVenda item : this.itensVenda) {
            if(itemVenda.getProduto().getId() == item.getProduto().getId()) {
                throw new Exception("Item já adicionado!");
            }
        }
        this.itensVenda.add(itemVenda);
    }
    
    public List<ItemVenda> getListaItensVenda() {
        return this.itensVenda;
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
        final Venda other = (Venda) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
