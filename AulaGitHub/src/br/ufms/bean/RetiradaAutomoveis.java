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
    private Date horaRetirada;
    private Date dataDevolucao;
    private Date horaDevolucao;
    private Automovel chassi;
    private ClienteFisico cpf;
    private ClienteJuridico cnpj;
    private ServicosAdicionais tipo_servico;
    private Funcionario nome;
    private int kmRetirada;
    private int desconto;
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
    
    public Date getHoraRetirada(){
        return horaRetirada;
    }
    
    public void setHoraRetirada(Date horaRetirada){
        this.horaRetirada = horaRetirada;
    }
    
    public Date getDataDevolucao(){
        return dataDevolucao;
    }
    
    public void setDataDevolucao(Date dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    
    public Date getHoraDevolucao(){
        return horaDevolucao;
    }
    
    public void setHoraDevolucao(Date horaDevolucao){
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
    
    public double getValorTotal(){
        return valor_total;
    }
    
    public void setValorTotal(double valor_total){
        this.valor_total = valor_total;
    }
    
    public static ArrayList<RetiradaAutomoveis> getRetiradaAutomoveis(){
        return listaRetirada;
    }
}
