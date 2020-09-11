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
public class Quadrado {
    
    private Reta lado;
    
    public Quadrado(Double x1, Double y1, Double x2, Double y2, Double x3, Double y3) {
    
        if(!(x2.equals(x1))) {
            throw new IllegalArgumentException("x1 e x2 devem ser iguais!");
        }
        if(!(y2.equals(y3))) {
            throw new IllegalArgumentException("y1 e y3 devem ser iguais!");
        }
        
        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);
        Ponto p3 = new Ponto(x3, y3);
        
        if(!(p2.getDistancia(p1).equals(p2.getDistancia(p3)))) {
            throw new IllegalArgumentException("Os lados do quadrado precisam ter tamanhos iguais!");
        }
        
        this.lado = new Reta(p1, p2);
    }

    public Reta getLado() {
        return this.lado;
    }
    
    public Double getArea() {
        return Math.pow(this.lado.getTamanho(), 2);
    }
    
    public Double getPerimetro() {
        return 4*this.lado.getTamanho();
    }
    
}
