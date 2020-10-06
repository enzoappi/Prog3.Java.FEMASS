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
public class Aluno extends Leitor{
    private String matriculaAluno;

    public Aluno(String matriculaAluno, String codigoLeitor, String nomeLeitor) {
        super(codigoLeitor, nomeLeitor);
        this.matriculaAluno = matriculaAluno;
    }
    
    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }
}
