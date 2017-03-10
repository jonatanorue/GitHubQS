/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.bean;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HPC
 */
public class ClienteJuridico extends Cliente{
    
    public static ArrayList<ClienteJuridico> listaClienteJuridico = new ArrayList<ClienteJuridico>();
    private String nomeFantasia;
    private String cnpj;
    
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
   

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    public void cadastraClienteJuridico(ClienteJuridico cj){
       listaClienteJuridico.add(cj);
       
    }
    public boolean removerClienteJuridico(String cnpjBusca){
        boolean status = false;
        for(int i = 0; i < listaClienteJuridico.size(); i++){
            if(listaClienteJuridico.get(i).getCnpj().equals(cnpjBusca)){
                listaClienteJuridico.remove(i);
                status = true;
            }
        }
        return status;
    }
    public ClienteJuridico buscaClienteJuridico(String cnpjBusca){
        boolean status = false;
        for(int i = 0; i < listaClienteJuridico.size(); i++){
            if(listaClienteJuridico.get(i).getCnpj().equals(cnpjBusca)){
                return listaClienteJuridico.get(i);
            }
        }
        return null;
    }
    
    
}
