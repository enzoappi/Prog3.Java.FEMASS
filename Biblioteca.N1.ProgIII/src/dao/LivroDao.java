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
import model.Livro;

/**
 *
 * @author enzoappi
 */
public class LivroDao {
    private static List<Livro> livros = new ArrayList<>();
    
    public void gravar(Livro livro) {
        this.livros.add(livro);
        salvar();
    }
    
    public void salvar() {
        XStream xs = new XStream();
        String xml = xs.toXML(livros);
        
        
        try {
            FileWriter fw = new FileWriter("livros.xml");
            fw.write(xml);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(LivroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluir(Livro livro) {
        this.livros.remove(livro);
    }
    
    public List<Livro> getLivros() {
        try{
            XStream xs = new XStream();
            this.livros = (List<Livro>) xs.fromXML(new File("livros.xml"));
            return this.livros;
        } catch(Exception e) {
            salvar();
            getLivros();
        }
        return this.livros;
    }
}
