/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;


/**
 *
 * @author tayara.5970
 */
public class Televisao extends Produto{
    private String modelo;
    

    public Televisao() {
        
    }

    //public Televisao(String modelo) {
        //this.modelo = modelo;
    //}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString() {
        return "Nome: " + super.getNome() +
               " | Preço: " + super.getPreco() +
               " | Modelo: " + this.modelo;
                 
    }
}