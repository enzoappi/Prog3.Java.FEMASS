/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;

/**
 *
 * @author enzoappi
 */
public class ExemplarLivro {
    private String codExemplarLivro;
    private String dataAquisicaoExemplarLivro;

    public ExemplarLivro(String codExemplarLivro) {
        this.codExemplarLivro = codExemplarLivro;
    }

    public ExemplarLivro(String codExemplarLivro, String dataAquisicaoExemplarLivro) {
        this.codExemplarLivro = codExemplarLivro;
        this.dataAquisicaoExemplarLivro = dataAquisicaoExemplarLivro;
    }

    public String getCodExemplarLivro() {
        return codExemplarLivro;
    }

    public void setCodExemplarLivro(String codExemplarLivro) {
        this.codExemplarLivro = codExemplarLivro;
    }

    public String getDataAquisicaoExemplarLivro() {
        return dataAquisicaoExemplarLivro;
    }

    public void setDataAquisicaoExemplarLivro(String dataAquisicaoExemplarLivro) {
        this.dataAquisicaoExemplarLivro = dataAquisicaoExemplarLivro;
    }
    
    @Override
    public String toString() {
        return codExemplarLivro;
    }
    
    public void testarCampos() {
        this.dataAquisicaoExemplarLivro = this.dataAquisicaoExemplarLivro.replace("/", "");
        if(this.codExemplarLivro.isEmpty() || this.dataAquisicaoExemplarLivro.isEmpty() || this.dataAquisicaoExemplarLivro.isBlank()) {
            throw new InputMismatchException("Você deve preencher todos os campos antes de adicionar um exemplar.");
        }
    }
}
