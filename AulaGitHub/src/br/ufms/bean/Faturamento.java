/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.bean;

import java.util.ArrayList;

/**
 *
 * @author plabiany.acosta
 */
public class Faturamento {
    private String dataInicio;
    private String dataFinal;
    private double valorlocacao;
    private double valorServAdc;
    private double desconto;
    private double total;
    
    public Faturamento(){
        
    }
    
    public static final ArrayList <Faturamento> ListaFaturamento = new ArrayList<Faturamento>();
    
    public String getDataInicio(){
        return dataInicio;
    }
    public void setDataInicio(String DI){
        this.dataInicio = DI;
    }
    public String getDataFinal(){
        return dataFinal;
    }
    public void setDataFinal(String DF){
        this.dataFinal = DF;
    }
    public double getValorLocacao(){
        return valorlocacao;
    }
    public void setValorLocacao(double VL){
        this.valorlocacao = VL;
    }
    public double getvalorServAdc(){
        return valorServAdc;
    }
    public void setvalorSerAdc(double SA){
        this.valorServAdc = SA;
    }
    public double getDesconto(){
        return desconto;
    }
    public void setDesconto(double DESC){
        this.desconto = DESC;
    }
    public double getTotal(){
        return total;
    }
    public void setTotal(double ttl){
        this.total = ttl;
    }
    
}
