/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.bean;

import java.util.ArrayList;

/**
 *
 * @author HPC
 */
public class Cliente {
    
    private String nome;
    private String endereço;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;
    private String data_de_nascimento;
    private Boolean situaçao_de_inadimplência;
    
    public Cliente(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public Boolean getSituaçao_de_inadimplência() {
        return situaçao_de_inadimplência;
    }

    public void setSituaçao_de_inadimplência(Boolean situaçao_de_inadimplência) {
        this.situaçao_de_inadimplência = situaçao_de_inadimplência;
    }
    
  
}

