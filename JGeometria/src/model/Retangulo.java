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
public class Retangulo {
    
    private Reta r1;
    private Reta r2;

    public Retangulo(Reta r1, Reta r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public Retangulo(Double x1, Double y1, Double x2, Double y2, Double x3, Double y3, Double x4, Double y4) {
        this.r1 = new Reta(x1, y1, x2, y2);
        this.r2 = new Reta(x3, y3, x4, y4);
    }

    public Reta getR1() {
        return r1;
    }

    public Reta getR2() {
        return r2;
    }
    
    public Double getArea() {
        return this.r1.getTamanho()*this.r2.getTamanho();
    }
    
    public Double getPerimetro() {
        return this.r1.getTamanho()*2+this.r2.getTamanho()*2;
    }
    
}
