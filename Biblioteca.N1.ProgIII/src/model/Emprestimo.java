/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author enzoappi
 */
public class Emprestimo {
    private String codEmprestimo;
    private Date dataInicio;
    private Date dataFim;
    
    private List<ExemplarLivro> exemplaresLivros = new ArrayList();
    private List<Leitor> leitores = new ArrayList();

    public Emprestimo(String codEmprestimo, Date dataInicio) {
        this.codEmprestimo = codEmprestimo;
        this.dataInicio = dataInicio;
    }

    public String getCodEmprestimo() {
        return codEmprestimo;
    }

    public void setCodEmprestimo(String codEmprestimo) {
        this.codEmprestimo = codEmprestimo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public List<ExemplarLivro> getExemplaresLivros() {
        return exemplaresLivros;
    }

    public void addExemplarLivro(ExemplarLivro exemplaresLivros) {
        this.exemplaresLivros.add(exemplaresLivros);
    }

    public List<Leitor> getLeitores() {
        return leitores;
    }

    public void addLeitor(Leitor leitores) {
        this.leitores.add(leitores);
    }

    
    
}
