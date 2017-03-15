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
    private Automovel chassi;
    private ClienteFisico cpf;
    private ClienteJuridico cnpj;
    private ServicosAdicionais tipo_servico;
    private Funcionario nome;
    private int kmRetirada;
    private int desconto;
    
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
    
    public Automovel getChassi(){
        return chassi;
    }
    
    public void setChassi(Automovel chassi){
        this.chassi = chassi;
    }
    
    public ClienteFisico getCpf(){
        return cpf;
    }
    
    public void setCpf(ClienteFisico cpf){
        this.cpf = cpf;
    }
    
    public ClienteJuridico getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(ClienteJuridico cnpj){
        this.cnpj = cnpj;
    }
    
    public ServicosAdicionais getServico(){
        return tipo_servico;
    }
    
    public void setServico(ServicosAdicionais tipo_servico){
        this.tipo_servico = tipo_servico;
    }
    
    public Funcionario getFuncionario(){
        return nome;
    }
    
    public void setFuncionario(Funcionario nome){
        this.nome = nome;
    }
    
    public int getKmRetirada(){
        return kmRetirada;
    }
    
    public void setKmRetirada(int kmRetirada){
        this.kmRetirada = kmRetirada;
    }
    
    public int getDesconto(){
        return desconto;
    }
    
    public void setDesconto(int desconto){
        this.desconto = desconto;
    }
    
    public static ArrayList<RetiradaAutomoveis> getRetiradaAutomoveis(){
     return listaRetirada;
    }
}
