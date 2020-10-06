/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author enzoappi
 */
public class Leitor {
    private String codigoLeitor;
    private String nomeLeitor;
    private Endereco enderecoLeitor;
    
    private List<Telefone> telefones = new ArrayList();

    public Leitor(String codigoLeitor, String nomeLeitor) {
        this.codigoLeitor = codigoLeitor;
        this.nomeLeitor = nomeLeitor;
    }

    public String getCodigoLeitor() {
        return codigoLeitor;
    }

    public void setCodigoLeitor(String codigoLeitor) {
        this.codigoLeitor = codigoLeitor;
    }

    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }

    public Endereco getEnderecoLeitor() {
        return enderecoLeitor;
    }

    public void setEnderecoLeitor(Endereco enderecoLeitor) {
        this.enderecoLeitor = enderecoLeitor;
    }
    
    public void adicionarTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }
    
    public void removerTelefone(Telefone telefone) {
        this.telefones.remove(telefone);
    }
    
    public List<Telefone> getTelefones() {
        return this.telefones;
    }

    @Override
    public String toString() {
        return nomeLeitor;
    }
}
