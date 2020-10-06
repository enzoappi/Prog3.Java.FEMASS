/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author enzoappi
 */
public class ExemplarLivro {
    private String codExemplarLivro;
    private LocalDate dataAquisicaoExemplarLivro;

    public ExemplarLivro(String codExemplarLivro) {
        this.codExemplarLivro = codExemplarLivro;
    }

    public String getCodExemplarLivro() {
        return codExemplarLivro;
    }

    public void setCodExemplarLivro(String codExemplarLivro) {
        this.codExemplarLivro = codExemplarLivro;
    }

    public LocalDate getDataAquisicaoExemplarLivro() {
        return dataAquisicaoExemplarLivro;
    }

    public void setDataAquisicaoExemplarLivro(LocalDate dataAquisicaoExemplarLivro) {
        this.dataAquisicaoExemplarLivro = dataAquisicaoExemplarLivro;
    }
    
    @Override
    public String toString() {
        return codExemplarLivro;
    }
}
