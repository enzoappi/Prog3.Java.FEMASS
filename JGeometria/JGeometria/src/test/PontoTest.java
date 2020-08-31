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
        Ponto p = new Ponto(3.0,9.0);
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
    
}
