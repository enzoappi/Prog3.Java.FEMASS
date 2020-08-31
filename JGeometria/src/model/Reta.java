/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author acg
 */
public class Reta {
    private Ponto p1;
    private Ponto p2;
    
    public Reta(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Reta (Double x1, Double y1, Double x2, Double y2) {
        this.p1 = new Ponto(x1, y1);
        this.p2 = new Ponto(x2, y2);
    }
    
    public Double getTamanho() {
        return this.p1.getDistancia(this.p2);
    }
    
    public Ponto getP1() {
        return this.p1;
    }

    public Ponto getP2() {
        return this.p2;
    }
    
}
