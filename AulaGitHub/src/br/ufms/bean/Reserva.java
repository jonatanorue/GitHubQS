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
    private Date HoraRetirada;
    private Date DataDevolucao;
    private Date HoraDevolucao;
    private Cliente IDCliente;
    private Categorias CatAutomovel;
    private float Locacao;
    private ServicosAdicionais Servico;
    private float TaxaMulta;
    private String CartaoCliente;
    private float Desconto;
    
    
    public Reserva(){
        
    }
    
    private static final ArrayList<Reserva> listaReservas = new ArrayList<>();
    
    public Date getDataRetirada(){
        return DataRetirada;
    }
    public void setDataRetirada(Date dataretirada){
        this.DataRetirada = dataretirada;
    }
    public void setHoraRetirada(Date horaretirada){
        this.HoraRetirada = horaretirada;
    }
    public Date getHoraRetirada(){
        return HoraRetirada;
    }
    public Date getDataDevolucao(){
        return DataDevolucao;
    }
    public void setDataDevolucao(Date datadevolucao){
        this.DataDevolucao = datadevolucao;
    }
    public Date getHoraDevolucao(){
        return HoraDevolucao;
    }
    public void setHoraDevolucao(Date horadevolucao){
        this.HoraDevolucao = horadevolucao;
    }
    public Cliente getCliente(){
        return IDCliente;
    }
    public void setCliente(Cliente cliente){
        this.IDCliente = cliente;
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
}
