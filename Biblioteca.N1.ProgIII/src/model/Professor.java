/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author enzoappi
 */
public class Professor extends Leitor{
    private String disciplinaMinistrada;

    public Professor(String disciplinaMinistrada, String codigoLeitor, String nomeLeitor) {
        super(codigoLeitor, nomeLeitor);
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }
}
