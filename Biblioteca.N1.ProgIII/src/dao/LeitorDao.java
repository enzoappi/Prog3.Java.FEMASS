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
import model.Leitor;

/**
 *
 * @author enzoappi
 */
public class LeitorDao {
    private static List<Leitor> leitores = new ArrayList<>();
    
    public void gravar(Leitor leitor) {
        this.leitores.add(leitor);
        salvar();
    }
    
    public void salvar() {
        XStream xs = new XStream();
        String xml = xs.toXML(this.leitores);
        
        try {
            FileWriter fw = new FileWriter("leitores.xml");
            fw.write(xml);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(LeitorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(Leitor leitor) {
        this.leitores.remove(leitor);
    }
    
    public List<Leitor> getLeitores() {
        try{
            XStream xs = new XStream();
            this.leitores = (List<Leitor>) xs.fromXML(new File("leitores.xml"));
        }catch(Exception e) {
            salvar();
            getLeitores();
        }
        return this.leitores;
    }
}
