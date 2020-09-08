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
    
    public Retangulo(Ponto pto1, Ponto pto2, Ponto pto3) {
        if(!(pto2.getX().equals(pto1.getX()))) {
            throw new IllegalArgumentException("Os pontos 1 e 2 tem que ter o mesmo valor em X!");
        }
        if(!(pto2.getY().equals(pto3.getY()))) {
            throw new IllegalArgumentException("Os pontos 2 e 3 tem que ter o mesmo valor em Y!");
        }
        if(pto2.getX()>=pto3.getX()) {
            throw new IllegalArgumentException("O ponto 3 tem ter o valor em X, maior que o ponto 2!");
        }
        if(pto2.getY()>=(pto1.getY())) {
            throw new IllegalArgumentException("O ponto 1 tem ter o valor em X, maior que o ponto 2!");
        }
        
        this.r1 = new Reta(pto2, pto3);
        this.r2 = new Reta(pto1, pto2);
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
