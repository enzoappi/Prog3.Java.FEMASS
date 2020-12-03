/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.model;

/**
 *
 * @author enzoappi
 */
public enum TipoAnimal {
    CA("Cachorro"),
    CO("Coelho"),
    GA("Gato"),
    PA("Pássaro"),
    PE("Peixe"),
    RA("Rato");
    
    public String nome;
    
    TipoAnimal(String _nome) {
        this.nome = _nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    public static TipoAnimal get(String tipo) {
        if (tipo.equalsIgnoreCase("Cachorro")) return TipoAnimal.CA;
        if (tipo.equalsIgnoreCase("Coelho")) return TipoAnimal.CO;
        if (tipo.equalsIgnoreCase("Gato")) return TipoAnimal.GA;
        if (tipo.equalsIgnoreCase("Pássaro")) return TipoAnimal.PA;
        if (tipo.equalsIgnoreCase("Peixe")) return TipoAnimal.PE;
        if (tipo.equalsIgnoreCase("Rato")) return TipoAnimal.RA;
        return null;
    }
}
