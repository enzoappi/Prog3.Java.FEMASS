/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Pessoa;
/**
 *
 * @author enzoappi
 */
public class PessoaDao {
    private static List<Pessoa> pessoas = new ArrayList<>();
    
    public void gravar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    
    public void excluir(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }
    
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
