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
public class ServicosAdicionais {
    public static ArrayList<ServicosAdicionais> listaServicos = new ArrayList<>();
    private String tipo_servico;
    private String descricao_servico;
    private double preco_servico;
    
    
    
    public ServicosAdicionais() {
        
       
    }
    
    public String getServico(){
        return tipo_servico;
    }
    
    
    public void setServico(String tiposerv){
        this.tipo_servico = tiposerv;
    }
    
    
    public String getDescricao(){
        return descricao_servico;
    }
    
    
    public void setDescricao(String descserv){
        this.descricao_servico = descserv;
    }
    
    
    public double getPreco(){
        return preco_servico;
    }
    
    
    public void setPreco(double precoserv){
        this.preco_servico = precoserv;
    }
    
    public void addServAdicional(ServicosAdicionais SA){
        listaServicos.add(SA);
    }
    
    public ServicosAdicionais BuscaServAdicional(String TipoServico){
        for(int i = 0; i<listaServicos.size();i++){
            if(listaServicos.get(i).getServico().equals(TipoServico)){
                return listaServicos.get(i);
            }
        }
        return null;
    }
    
    public boolean RemoveServAdicional(String TipoServico){
        boolean status = false;
        for(int i = 0; i<listaServicos.size();i++){
            if(listaServicos.get(i).getServico().equals(TipoServico)){
                listaServicos.remove(i);
            }
        }
        return status;
    }
    
    public boolean AlterarServAdicional(ServicosAdicionais Servico){
        boolean status = false;
        for(int i = 0; i<listaServicos.size();i++){
            if(listaServicos.get(i).getServico().equals(Servico)){
               listaServicos.get(i).setServico(Servico.getServico());
               listaServicos.get(i).setDescricao(Servico.getDescricao());
               listaServicos.get(i).setPreco(Servico.getPreco());
               status = true;
            }
        }
        return status;
    }

    public boolean removeServicoAdicional(String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
