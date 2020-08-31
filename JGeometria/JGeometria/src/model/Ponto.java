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
public class Ponto {
    private Double x;
    private Double y;
    
    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    
    public Double getX() {
        return this.x;
    }
    
    public Double getY() {
        return this.y;
    }
    
}
