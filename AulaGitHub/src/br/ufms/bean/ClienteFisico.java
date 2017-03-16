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
    
    public ClienteFisico(){
        super();
        this.cpf = "";
    }
    
    public static ArrayList<ClienteFisico> listaClienteFisico = new ArrayList<>();
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
    
    public  ClienteFisico buscaClienteFisico(String cpfBusca){
        for(int i = 0; i < listaClienteFisico.size(); i++){
            if(listaClienteFisico.get(i).getCpf().equals(cpfBusca)){
                return listaClienteFisico.get(i);
            }
        }
        return new ClienteFisico();
    }
    
    public int buscaClienteFisicoB(String cpfBusca){
        int indice = -1;
        for(int i = 0; i < listaClienteFisico.size(); i++){
            if(listaClienteFisico.get(i).getCpf().equals(cpfBusca)){
                indice = i;
            }
        }
        return indice;
    }
    
   /* public boolean editarClienteFisico(ClienteFisico c){
        boolean status = false;
        for(int i = 0; i < listaClienteFisico.size(); i++){
                if(listaClienteFisico.get(i).getCpf().equals(c.getCpf())){
                    listaClienteFisico.add(i, c);
                    status = true;
                }
        }
        return status;
    }*/
    
}
