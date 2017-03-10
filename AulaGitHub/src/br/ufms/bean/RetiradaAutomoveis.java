/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.bean;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class RetiradaAutomoveis {
    private String dataRetirada;
    private String horaRetirada;
    private String dataDevolucao;
    private String horaDevolucao;
    private double kmRetirada;
    private double desconto;
    
    public RetiradaAutomoveis(){
    }
    
    public static final ArrayList<RetiradaAutomoveis> listaRetirada = new ArrayList<RetiradaAutomoveis>();
    
    public void cadastrarRetiradaAutomovel(RetiradaAutomoveis Retirada){
        listaRetirada.add(Retirada);
    }
    
    public String getDataRetirada(){
        return dataRetirada;
    }
    
    public void setDataRetirada(String dataRetirada){
        this.dataRetirada = dataRetirada;
    }
    
    public String getHoraRetirada(){
        return horaRetirada;
    }
    
    public void setHoraRetirada(String horaRetirada){
        this.horaRetirada = horaRetirada;
    }
    
    public String getDataDevolucao(){
        return dataDevolucao;
    }
    
    public void setDataDevolucao(String dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    
    public String getHoraDevolucao(){
        return horaDevolucao;
    }
    
    public void setHoraDevolucao(String horaDevolucao){
        this.horaDevolucao = horaDevolucao;
    }
    
    public double getKmRetirada(){
        return kmRetirada;
    }
    
    public void setKmRetirada(double kmRetirada){
        this.kmRetirada = kmRetirada;
    }
    
    public double getDesconto(){
        return desconto;
    }
    
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }
    
    public static ArrayList<RetiradaAutomoveis> getRetiradaAutomoveis(){
     return listaRetirada;
    }
}
