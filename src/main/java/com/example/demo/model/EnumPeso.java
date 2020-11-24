/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

public enum EnumPeso {
    QUILO("quilo"),
    GRAMA("grama"),
    LITRO("litro");
    
    private String descricao;
    
    EnumPeso(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
