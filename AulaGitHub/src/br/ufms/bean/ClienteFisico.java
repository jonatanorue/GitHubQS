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
public class ClienteFisico extends Cliente{
    
    
    private static ArrayList<ClienteFisico> listaClienteFisico = new ArrayList<ClienteFisico>();
    private String cpf;
    
      public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void cadastraClienteFisico(ClienteFisico cf){
       listaClienteFisico.add(cf);
       
    }
  
    public boolean removerClienteFisico(String cpfBusca){
        boolean status = false;
        for(int i = 0; i < listaClienteFisico.size(); i++){
            if(listaClienteFisico.get(i).getCpf().equals(cpfBusca)){
                listaClienteFisico.remove(i);
                status = true;
            }
        }
        return status;
    }
    
    public ClienteFisico buscaClienteFisico(String cpfBusca){
        boolean status = false;
        for(int i = 0; i < listaClienteFisico.size(); i++){
            if(listaClienteFisico.get(i).getCpf().equals(cpfBusca)){
                return listaClienteFisico.get(i);
            }
        }
        return null;
    }
    
}
