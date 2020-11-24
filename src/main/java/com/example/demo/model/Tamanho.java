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
public class Tamanho {
    
    private double altura;
    private double largura;
    private double profundidade;
    
    @Enumerated(EnumType.STRING)
    private EnumMedida unidadeMedidaTam;
    
    public Tamanho(){
        //
    }

    public Tamanho(double altura, double largura, double profundidade, EnumMedida unidadeMedidaTam) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.unidadeMedidaTam = unidadeMedidaTam;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public EnumMedida getUnidadeMedidaTam() {
        return unidadeMedidaTam;
    }

    public void setUnidadeMedidaTam(EnumMedida unidadeMedidaTam) {
        this.unidadeMedidaTam = unidadeMedidaTam;
    }
     
}
