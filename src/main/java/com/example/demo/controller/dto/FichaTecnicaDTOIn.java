/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.dto;

import com.example.demo.model.EnumMedida;
import com.example.demo.model.EnumPeso;
import com.example.demo.model.FichaTecnica;
import com.example.demo.model.Peso;
import com.example.demo.model.Tamanho;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FichaTecnicaDTOIn {
    
    @NotEmpty
    private String cor;
    
    @NotEmpty
    private String marca;
    
    private Date validade;
    private double valor;
    private String unidadeMedidaPeso;
    private double altura;
    private double largura;
    private double profundidade;
    private String unidadeMedidaTam;
    
    public FichaTecnicaDTOIn(){
        
    }
    
    public Peso retornaPeso(){
        EnumPeso peso=null;
        switch(unidadeMedidaPeso.toLowerCase()){
            case "quilo":
                peso=EnumPeso.QUILO;
                break;
            case "grama":
                peso=EnumPeso.GRAMA;
                break;
            
            case "litro":
                peso=EnumPeso.LITRO;
                break;
        }
        Peso pesoNovo = new Peso(this.getValor(), peso);
        return pesoNovo;
    }

    
    public Tamanho retornaTamanho(){
        EnumMedida tam =null;
        
        switch(unidadeMedidaTam.toLowerCase()){
            case "metro":
                tam = EnumMedida.METRO;
                break;
                
            case "centimetro":
                tam = EnumMedida.CENTIMETRO;
                break;
            
            case "imperial":
                tam = EnumMedida.IMPERIAL;
                break; 
        }
        Tamanho tamanhoNovo = new Tamanho(this.getAltura(), this.getLargura(), this.getProfundidade(), tam);
        return tamanhoNovo;
    }
    
    public static List<FichaTecnica> parse(List<FichaTecnicaDTOIn> fichasIn){
        
        List<FichaTecnica> fichas = new ArrayList<>();
        for(FichaTecnicaDTOIn obj: fichasIn){
            
            FichaTecnica ft = new FichaTecnica( obj.getCor(), obj.getMarca(), obj.getValidade(),
            obj.retornaPeso(), obj.retornaTamanho());
            
            if(ft.getPeso().getUnidadeMedidaPeso() == null || ft.getTamanho().getUnidadeMedidaTam() == null){
                return null;
            }
                
            fichas.add(ft);
            
        }
        
        return fichas;
        
    }
    
    public FichaTecnicaDTOIn(String cor, String marca, Date validade){
        this.cor = cor;
        this.marca = marca;
        this.validade = validade;
    }

    public FichaTecnicaDTOIn(String cor, String marca, Date validade, double valor, String unidadeMedidaPeso, double altura, double largura, double profundidade, String unidadeMedidaTam) {
        this.cor = cor;
        this.marca = marca;
        this.validade = validade;
        this.valor = valor;
        this.unidadeMedidaPeso = unidadeMedidaPeso;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.unidadeMedidaTam = unidadeMedidaTam;
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
