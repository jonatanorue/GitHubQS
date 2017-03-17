/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.bean;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nicolas
 */
public class RetiradaAutomoveis {
    private Date dataRetirada;
    private String horaRetirada;
    private Date dataDevolucao;
    private String horaDevolucao;
    private String chassi;
    private String cpf_cnpj;
    private ArrayList<String> listaServicosAdicionais;
    private String nome_funcionario;
    private int kmRetirada;
    private double valor_total;
    
    public RetiradaAutomoveis(){
    }
    
    public static final ArrayList<RetiradaAutomoveis> listaRetirada = new ArrayList<RetiradaAutomoveis>();
    
    public void cadastrarRetiradaAutomovel(RetiradaAutomoveis Retirada){
        listaRetirada.add(Retirada);
    }
    
    public Date getDataRetirada(){
        return dataRetirada;
    }
    
    public void setDataRetirada(Date dataRetirada){
        this.dataRetirada = dataRetirada;
    }
    
    public String getHoraRetirada(){
        return horaRetirada;
    }
    
    public void setHoraRetirada(String horaRetirada){
        this.horaRetirada = horaRetirada;
    }
    
    public Date getDataDevolucao(){
        return dataDevolucao;
    }
    
    public void setDataDevolucao(Date dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    
    public String getHoraDevolucao(){
        return horaDevolucao;
    }
    
    public void setHoraDevolucao(String horaDevolucao){
        this.horaDevolucao = horaDevolucao;
    }
    
    public String getChassi(){
        return chassi;
    }
    
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    
    public String getCpf_Cnpj(){
        return cpf_cnpj;
    }
    
    public void setCpf_Cnpj(String cpf_cnpj){
        this.cpf_cnpj = cpf_cnpj;
    }
    public String getFuncionario(){
        return nome_funcionario;
    }
    
    public void setFuncionario(String nome_funcionario){
        this.nome_funcionario = nome_funcionario;
    }
    
    public int getKmRetirada(){
        return kmRetirada;
    }
    
    public void setKmRetirada(int kmRetirada){
        this.kmRetirada = kmRetirada;
    }
    
    public double getValorTotal(){
        return valor_total;
    }
    
    public void setValorTotal(double valor_total){
        this.valor_total = valor_total;
    }
    
    public static ArrayList<RetiradaAutomoveis> getRetiradaAutomoveis(){
        return listaRetirada;
    }

    /**
     * @return the listaServicosAdicionais
     */
    public ArrayList<String> getListaServicosAdicionais() {
        return listaServicosAdicionais;
    }

    /**
     * @param listaServicosAdicionais the listaServicosAdicionais to set
     */
    public void setListaServicosAdicionais(ArrayList<String> listaServicosAdicionais) {
        this.listaServicosAdicionais = listaServicosAdicionais;
    }
}
