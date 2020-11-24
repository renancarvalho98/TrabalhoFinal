/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Peso {
    
    private double valor;
    
    @Enumerated(EnumType.STRING)
    private EnumPeso unidadeMedidaPeso;
    
    public Peso(){
        //
    }

    public Peso(double valor, EnumPeso unidadeMedidaPeso) {
        this.valor = valor;
        this.unidadeMedidaPeso = unidadeMedidaPeso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public EnumPeso getUnidadeMedidaPeso() {
        return unidadeMedidaPeso;
    }

    public void setUnidadeMedidaPeso(EnumPeso unidadeMedidaPeso) {
        this.unidadeMedidaPeso = unidadeMedidaPeso;
    }
    
}
