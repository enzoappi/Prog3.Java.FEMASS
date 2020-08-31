/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Reta;

/**
 *
 * @author acg
 */
public class RetaTest {
    
    public static void main(String args[]) {
        Reta r1 = new Reta(1.1, 2.2,0.0, -1.2);
        
        System.out.println(r1.getP1().getLocalizacao());
        System.out.println(r1.getP2().getLocalizacao());
        System.out.println(r1.getTamanho());
        
    }
    
}
