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
import java.util.InputMismatchException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Autor;

/**
 *
 * @author enzoappi
 */
public class AutorDao {
    private static List<Autor> autores = new ArrayList<>();
    
    public void gravar(Autor autor) {
        this.autores.add(autor);
        salvar();
    }
    
    public void salvar() {
        XStream xs = new XStream();
        String xml = xs.toXML(this.autores);
        
        
        try {
            FileWriter fw = new FileWriter("autores.xml");
            fw.write(xml);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AutorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluir(Autor autor) {
        this.autores.remove(autor);
        salvar();
    }
    
    public List<Autor> getAutores() {
        try{
            XStream xs = new XStream();
            this.autores = (List<Autor>) xs.fromXML(new File("autores.xml"));
        }catch(Exception e) {
            salvar();
            getAutores();
        }
        return this.autores;
    }
    
    public void testarArquivoAutores() {
        getAutores();
        if(this.autores.isEmpty()) {
            throw new InputMismatchException("Não há autores cadastrados no Sistema.\nSolicitar o Cadastro ao Bibliotecario, antes de prosseguir.");
        }
    }
}
