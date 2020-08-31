/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Retangulo;

/**
 *
 * @author enzoappi
 */
public class RetanguloTest {
    public static void main(String[] args) {
        
        Retangulo rt1 = new Retangulo(1.1, 2.2, 0.0, -1.2, 2.0, 2.2, 3.4, 3.2);
        
        System.out.println(rt1.getR1().getTamanho());
        System.out.println(rt1.getR2().getTamanho());
        System.out.println("Area = " + rt1.getArea() + "m2");
        System.out.println("Perimetro = " + rt1.getPerimetro() + "m");
        
    }
}
