/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.bean;

import br.ufms.view.MenuServicosAdicionais;
import java.util.ArrayList;
/**
 *
 * @author plabiany.acosta
 */
public class ServicosAdicionais {
    
    private String tipo_servico;
    private String descricao_servico;
    private double preco_servico;
    
    public static final ArrayList<ServicosAdicionais> listaServicos = new ArrayList<ServicosAdicionais>();
    
    public ServicosAdicionais(String tiposerv,String descserv,double precoserv) {
        this.tipo_servico = tiposerv;
        this.descricao_servico = descserv;
        this.preco_servico = precoserv;
       
    }

    public ServicosAdicionais() {
        
    }
    public void cadastrarServico(ServicosAdicionais SA){
        listaServicos.add(SA);
    }
    

    
    public String getServico(){
        return tipo_servico;
    }
    
    
    
    public String getDescricao(){
        return descricao_servico;
    }
        
    
    public double getPreco(){
        return preco_servico;
    }  
    public void setServico(String tiposerv){
        this.tipo_servico = tiposerv;
    }
    public void setDescricao(String descserv){
        this.descricao_servico = descserv;
    }
    public void setPreco(double precoserv){
        this.preco_servico = precoserv;
    }
    
    public int buscaindiceSA(String Ind){
        int indice = -1;
        for(int i = 0; i<listaServicos.size(); i++){
            if(listaServicos.get(i).getServico().equals(Ind)){
                indice = i;
            }
        }return indice;
    }
    public ServicosAdicionais buscarSA(String tiposerv){
        for(int i = 0 ; i<listaServicos.size();i++){
            if(listaServicos.get(i).getServico().equals(tiposerv)){
                return listaServicos.get(i);
            }
        }
        return null;
        
    }
    
    public static ServicosAdicionais buscarDescricao(String descserv){
        for(int i = 0 ; i<listaServicos.size();i++){
            if(listaServicos.get(i).getDescricao().equals(descserv)){
                return listaServicos.get(i);
            }
        }
        return null;
        
    }
    public boolean RemoverSA(String tiposerv){
        boolean status = false;
        for(int i = 0; i<listaServicos.size();i++){
        if(listaServicos.get(i).getServico().equals(tiposerv)){
            listaServicos.remove(i);
            status = true;
        }
        }
        return status;
    }
    
    public static ArrayList<ServicosAdicionais> getListaServicos(){
        return listaServicos;
    }
}
