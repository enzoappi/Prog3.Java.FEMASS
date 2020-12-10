/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author enzoappi
 */
public class Produto {
    
    private Integer id;
    private String nome;
    private Double preco;
    private Integer qdteUnidades;
    private Fornecedor fornecedor;
    
    private List<ItemVenda> itensVenda = new ArrayList();
    private List<ItemCompra> itensCompra = new ArrayList();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQdteUnidades() {
        return qdteUnidades;
    }

    public void setQdteUnidades(Integer qdteUnidades) {
        this.qdteUnidades = qdteUnidades;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    public void vendaProduto(Integer qdteUnidades) {
            this.qdteUnidades -= qdteUnidades;
    }
    
    public void compraProduto(Integer qdteUnidades) {
            this.qdteUnidades += qdteUnidades;
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
