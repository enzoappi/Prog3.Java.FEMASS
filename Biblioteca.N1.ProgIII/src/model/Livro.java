/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 *
 * @author enzoappi
 */
public class Livro {
    private String codLivro;
    private String tituloLivro;
    private String anoPublicacao;
    
    private List<Autor> autores = new ArrayList();
    private List<ExemplarLivro> exemplaresLivros= new ArrayList();

    public Livro(String codLivro, String tituloLivro, String anoPublicacao) {
        this.codLivro = codLivro;
        this.tituloLivro = tituloLivro;
        this.anoPublicacao = anoPublicacao;
    }

    public String getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(String codLivro) {
        this.codLivro = codLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    }
    
    public void removerAutor(Autor autor) {
        this.autores.remove(autor);
    }
    
    public List<Autor> getAutores() {
        return this.autores;
    }
    
    public void adicionarExemplarLivro(ExemplarLivro exemplarLivro) {
        this.exemplaresLivros.add(exemplarLivro);
    }
    
    public void removerExemplarLivro(ExemplarLivro exemplarLivro) {
        this.exemplaresLivros.remove(exemplarLivro);
    }
    
    public List<ExemplarLivro> getExemplaresLivros() {
        return this.exemplaresLivros;
    }

    @Override
    public String toString() {
        return tituloLivro;
    }
    
    public void testarCampos() {
        if(this.codLivro.isEmpty() || this.tituloLivro.isEmpty() || this.anoPublicacao.isEmpty()) {
            throw new InputMismatchException("Você deve preencher todos os campos antes de gravar!");
        }
    }
    
 }
