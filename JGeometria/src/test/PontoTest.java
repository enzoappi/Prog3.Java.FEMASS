/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Ponto;

/**
 *
 * @author acg
 */
public class PontoTest {
    
    public static void main(String args[]) {
        Ponto p1 = new Ponto(2.0, 10.0);
        System.out.println(p1.getLocalizacao());
        
        Ponto p2 = new Ponto(3.0, -10.0);
        System.out.println(p2.getLocalizacao());
        
        System.out.println(p1.getDistancia(p2));
       
        Ponto p3 = new Ponto();
        p3.setX(3.0);
        p3.setY(4.1);
        
    }
    
}
