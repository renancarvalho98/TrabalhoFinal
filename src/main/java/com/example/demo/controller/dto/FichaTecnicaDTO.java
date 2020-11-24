/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.dto;

import com.example.demo.model.EnumMedida;
import com.example.demo.model.EnumPeso;
import com.example.demo.model.FichaTecnica;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FichaTecnicaDTO {
    
    private Long idFichaTecnica;
    private String cor;
    private String marca;
    private Date validade;
    private double valor;
    private String unidadeMedidaPeso;
    private double altura;
    private double largura;
    private double profundidade;
    private String unidadeMedidaTam;
    
    public static List<FichaTecnicaDTO> parse(List<FichaTecnica> fichas) {
         List<FichaTecnicaDTO> dtos = new ArrayList<>();
         
         for(FichaTecnica ficha: fichas){
             dtos.add(new FichaTecnicaDTO(ficha));
         }        

         return dtos;    
    }
    
    public FichaTecnicaDTO(FichaTecnica ficha){
        this.idFichaTecnica = ficha.getIdFichaTecnica();
        this.cor = ficha.getCor();
        this.marca = ficha.getMarca();
        this.validade = ficha.getValidade();
        this.valor = ficha.getPeso().getValor();
        this.unidadeMedidaPeso = ficha.getPeso().getUnidadeMedidaPeso().getDescricao();
        this.altura = ficha.getTamanho().getAltura();
        this.largura = ficha.getTamanho().getLargura();
        this.profundidade = ficha.getTamanho().getProfundidade();
        this.unidadeMedidaTam = ficha.getTamanho().getUnidadeMedidaTam().getDescricao();
    }

    public Long getIdFichaTecnica() {
        return idFichaTecnica;
    }

    public void setIdFichaTecnica(Long idFichaTecnica) {
        this.idFichaTecnica = idFichaTecnica;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidadeMedidaPeso() {
        return unidadeMedidaPeso;
    }

    public void setUnidadeMedidaPeso(String unidadeMedidaPeso) {
        this.unidadeMedidaPeso = unidadeMedidaPeso;
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

    public String getUnidadeMedidaTam() {
        return unidadeMedidaTam;
    }

    public void setUnidadeMedidaTam(String unidadeMedidaTam) {
        this.unidadeMedidaTam = unidadeMedidaTam;
    }
    
}
