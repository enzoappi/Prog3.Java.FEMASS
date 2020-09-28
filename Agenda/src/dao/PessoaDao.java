/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pessoa;
/**
 *
 * @author enzoappi
 */
public class PessoaDao {
    private static List<Pessoa> pessoas = new ArrayList<>();
    
    public void gravar(Pessoa pessoa) {
        pessoas.add(pessoa);
        salvar();
    }
    
    public void salvar() {
        XStream xs = new XStream();
        String xml = xs.toXML(pessoas);
        
        try {
            FileWriter fw = new FileWriter("pessoas.xml");
            fw.write(xml);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }
    
    public List<Pessoa> getPessoas() {
        XStream xs = new XStream();
        pessoas = (List<Pessoa>) xs.fromXML(new File("pessoas.xml"));
        return pessoas;
    }
}
