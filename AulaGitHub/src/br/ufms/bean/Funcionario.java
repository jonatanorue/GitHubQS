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
 * @author RVM
 */
public class Funcionario {
    
   private String nome;
   private String endereco;
   private String cidade;
   private String estado;
   private ArrayList<String> telefones;
   private Date dataDeNascimento;
   private String login;
   private String senha;
   private String nivelDeAcesso;
   
   public Funcionario(){
       
   }
   
   private static final ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();
   
   public boolean CadastrarFuncionario(Funcionario funcionario){
        if(! verificaFuncionarioLogin(funcionario.getLogin())){
        listaDeFuncionarios.add(funcionario);
        return true;
        }
        return false;
   }
   
   public boolean removeFuncionario(String Nome,String Login){
       for(int x =0 ;x< listaDeFuncionarios.size();x++){
           if(listaDeFuncionarios.get(x).getNome().equals(Nome)
              && listaDeFuncionarios.get(x).getLogin().equals(Login)){
               listaDeFuncionarios.remove(x);
               return true;
           }
       }
       return false;
   }
   
   public boolean alteraFuncionario(Funcionario func,Funcionario funcionario){
        for(int x = 0 ; x<listaDeFuncionarios.size();x++){
            if(func.getLogin().equals(listaDeFuncionarios.get(x).getLogin())){
                if(! verificaFuncionarioLogin(funcionario.getLogin())){
              
                    listaDeFuncionarios.get(x).setNome(funcionario.getNome());
                    listaDeFuncionarios.get(x).setEndereco(funcionario.getEndereco());
                    listaDeFuncionarios.get(x).setCidade(funcionario.getCidade());
                    listaDeFuncionarios.get(x).setEstado(funcionario.getEstado());
                    listaDeFuncionarios.get(x).setDataDeNascimento(funcionario.getDataDeNascimento());
                    listaDeFuncionarios.get(x).setLogin(funcionario.getLogin());
                    listaDeFuncionarios.get(x).setSenha(funcionario.getSenha());
                    listaDeFuncionarios.get(x).setNivelDeAcesso(funcionario.getNivelDeAcesso());
                    for(String tel : funcionario.getTelefones()){
                         listaDeFuncionarios.get(x).getTelefones().add(tel);
                    }
                    return true;
                }
              return false;
            }
        }
        return false;
   }
   
   public boolean verificaFuncionarioLogin(String Login){
       
       return listaDeFuncionarios.stream().anyMatch((func) -> (func.getLogin().equals(Login)));      
   }
   
   public Funcionario getFuncionario(String nome,String Login){
       for(Funcionario x : listaDeFuncionarios){
           if(x.getNome().equals(nome) && x.getNome().equals(Login))
               return x;
       }
       return null;
   }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the telefones
     */
    public ArrayList<String> getTelefones() {
        return telefones;
    }

    /**
     * @param telefones the telefones to set
     */
    public void setTelefones(ArrayList<String> telefones) {
        this.telefones = telefones;
    }

    /**
     * @return the dataDeNascimento
     */
    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    /**
     * @param dataDeNascimento the dataDeNascimento to set
     */
    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    /**
     * @return the Login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param Login the Login to set
     */
    public void setLogin(String Login) {
        this.login = Login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nivelDeAcesso
     */
    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    /**
     * @param nivelDeAcesso the nivelDeAcesso to set
     */
    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }
   
   
}
