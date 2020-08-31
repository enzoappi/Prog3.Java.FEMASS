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

    //Atributos
    private Double x;
    private Double y;

    //Métodos construtores
    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    //Métodos de Acesso
    //get ou is (para o caso boolean)
    public Double getX() {
        return this.x;
    }

    public Double getY() {
        return this.y;
    }

    //Métodos Modificadores
    //set - altera os valores das variáveis
    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setCoordenadas(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    //Outros métodos
    public String getLocalizacao() {
        if (this.x > 0 && this.y > 0) {
            return "1o Quadrante";
        } else {
            if (this.x < 0 && this.y > 0) {
                return "2o Quadrante";
            } else {
                if (this.x < 0 && this.y < 0) {
                    return "3o Quadrante";
                } else {
                    if (this.x > 0 && this.y < 0) {
                        return "4o Quadrante";
                    } else {
                        if (this.x == 0 && this.y == 0) {
                            return "Origem";
                        } else {
                            if (this.y == 0) {
                                return "Eixo de X";
                            } else {
                                return "Eixo de Y";
                            }
                        }
                    }
                }
            }
        }

    }

    public Double getDistancia(Ponto p) {
        Double x2 = p.getX();
        Double x1 = this.x;
        Double y2 = p.getY();
        Double y1 = this.y;
        
        Double dist = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2 - y1, 2)));
        return dist;
    }

}
