/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.model;

/**
 *
 * @author enzoappi
 */
public enum Curso {
    SI("Sistemas de Informação"),
    ADM("Administração"),
    MAT("Matemática"),
    EP("Engenharia de Produção");

    public String nome;

    Curso(String _nome) {
        this.nome = _nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
