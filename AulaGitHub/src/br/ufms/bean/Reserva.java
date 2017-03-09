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
 * @author Plabiany
 */
public class Reserva {
    private Date DataRetirada;
    private Date DataDevolucao;
    private ClienteFisico clienteF;
    private ClienteJuridico clienteJ;
    private String cpfCnpj;
    private Categorias CatAutomovel;
    private float Locacao;
    private ServicosAdicionais Servico;
    private float TaxaMulta;
    private String CartaoCliente;
    private float Desconto;
    private Automovel carro;
   
    
    
    public Reserva(){
        
    }
    
    private static final ArrayList<Reserva> listaReservas = new ArrayList<>();
    
    public ClienteFisico getClienteFisico(){
        return clienteF;
    }
    public void setClienteFisico(ClienteFisico CF){
        this.clienteF = CF;
    }
    
    public ClienteJuridico getClienteJuridico(){
        return clienteJ;
    }
    
    public void setClienteJuridico(ClienteJuridico CJ){
        this.clienteJ = CJ;
    }
    
    
    public Date getDataRetirada(){
        return DataRetirada;
    }
    public void setDataRetirada(Date dataretirada){
        this.DataRetirada = dataretirada;
    }
    
    public Date getDataDevolucao(){
        return DataDevolucao;
    }
    public void setDataDevolucao(Date datadevolucao){
        this.DataDevolucao = datadevolucao;
    }
    
    public Categorias getCategoria(){
        return CatAutomovel;
    }
    public void setCategoria(Categorias categoria){
        this.CatAutomovel = categoria;
    }
    public float getLocacao(){
        return Locacao;
    }
    public void setLocacao(float locacao){
        this.Locacao = locacao;
    }
    public ServicosAdicionais getServico(){
        return Servico;
    }
    public void setServicoAdc(ServicosAdicionais servico){
        this.Servico = servico;
    }
    public float getTaxaMulta(){
        return TaxaMulta;
    }
    public void setTaxaMulta(float taxa){
        this.TaxaMulta = taxa;
    }
    public String getCartaoCliente(){
        return CartaoCliente;
    }
    public void setCartaoCliente(String cartaocliente){
        this.CartaoCliente = cartaocliente;
    }
    public float getDesconto(){
        return Desconto;
    }
    public void setDesconto(float desconto){
        this.Desconto = desconto;
    }
    public static void cadastrarReserva(Reserva reserva){
        Reserva.listaReservas.add(reserva);
    }

    /**
     * @return the cpfCnpj
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * @param cpfCnpj the cpfCnpj to set
     */
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
    public Reserva buscarReserva(String cpfcnpj){
        for(int i = 0; i < listaReservas.size(); i++){
            if(listaReservas.get(i).getCpfCnpj().equals(cpfcnpj)){
                return listaReservas.get(i);
            }
        }
        
        return null;
    }
    
    public boolean removerReserva(String cpfcnpj){
        boolean status = false;
        for(int i = 0; i < listaReservas.size(); i++){
            if(listaReservas.get(i).getCpfCnpj().equals(cpfcnpj)){
               listaReservas.remove(i);
                status = true;
            }
        }
        return status;
    }
  
    public static int buscaIndiceReserva(String IndiceReserva){
        int indice = -1;
        for(int i = 0; i < listaReservas.size(); i++){
            if(listaReservas.get(i).getCpfCnpj().equals(IndiceReserva)){
                indice = i;
            }
        }
        return indice;
    }
}

