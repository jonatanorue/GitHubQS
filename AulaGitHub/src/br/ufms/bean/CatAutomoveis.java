/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.bean;

/**
 *
 * @author Nicolas
 */
public class CatAutomoveis {
    private String codCategoria;
    private String descCategoria;
    private String valorDiario;
    private String valorSemanal;
    private String valorMensal;
    private String valorKM;
    private String qtdAutomoveis;
    
    public CatAutomoveis(){
        
    }
    
    public String getcodCategoria(){
        return codCategoria;
    }
    
    public void setcodCategoria(String codCategoria){
        this.codCategoria = codCategoria;
    }
    
    public String getdescCategoria(){
        return descCategoria;
    }
    
    public void setdescCategoria(String descCategoria){
        this.descCategoria = descCategoria;
    }
    
    public String getvalorDiario(){
        return valorDiario;
    }
    
    public void setvalorDiario(String valorDiario){
        this.valorDiario = valorDiario;
    }
    
    public String getvalorSemanal(){
        return valorSemanal;
    }
    
    public void setvalorSemanal(String valorSemanal){
        this.valorSemanal = valorSemanal;
    }
    
    public String getvalorMensal(){
        return valorMensal;
    }
    
    public void setvalorMensal(String valorMensal){
        this.valorMensal = valorMensal;
    }
    
    public String getvalorKM(){
        return valorKM;
    }
    
    public void setvalorKM(String valorKM){
        this.valorKM = valorKM;
    }
    
    public String getqtdAutomoveis(){
        return qtdAutomoveis;
    }
    
    public void setqtdAutomoveis(String qtdAutomoveis){
        this.qtdAutomoveis = qtdAutomoveis;
    }
}
