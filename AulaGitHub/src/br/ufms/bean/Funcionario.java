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
    private String telefone1;
    private String telefone2;
    private Date dataDeNascimento;
    private String login;
    private String senha;
    private int nivelDeAcesso;

    public Funcionario() {

    }

    public static final ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();

    public boolean CadastrarFuncionario(Funcionario funcionario) {
        if (!verificaFuncionarioLogin(funcionario.getLogin())) {
            listaDeFuncionarios.add(funcionario);
            return true;
        }
        return false;
    }

    public boolean removeFuncionario(String Login) {
        for (int x = 0; x < listaDeFuncionarios.size(); x++) {
            if(listaDeFuncionarios.get(x).getLogin().equals(Login)) {
                listaDeFuncionarios.remove(x);
                return true;
            }
        }
        return false;
    }

    public boolean alteraFuncionario(String login, Funcionario funcionario) {
        for (int x = 0; x < listaDeFuncionarios.size(); x++) {
            if (login.equals(listaDeFuncionarios.get(x).getLogin()) ) {
                
                listaDeFuncionarios.get(x).setNome(funcionario.getNome());
                listaDeFuncionarios.get(x).setEndereco(funcionario.getEndereco());
                listaDeFuncionarios.get(x).setCidade(funcionario.getCidade());
                listaDeFuncionarios.get(x).setEstado(funcionario.getEstado());
                listaDeFuncionarios.get(x).setDataDeNascimento(funcionario.getDataDeNascimento()); 
                listaDeFuncionarios.get(x).setLogin(funcionario.getLogin());
                listaDeFuncionarios.get(x).setSenha(funcionario.getSenha());
                listaDeFuncionarios.get(x).setNivelDeAcesso(funcionario.getNivelDeAcesso());
                listaDeFuncionarios.get(x).setTelefone1(funcionario.getTelefone1());
                listaDeFuncionarios.get(x).setTelefone2(funcionario.getTelefone2());
                return true;
            }
        }
        return false;
    }
    
    

    public boolean verificaFuncionarioLogin(String Login) {
        return listaDeFuncionarios.stream().anyMatch((func) -> (func.getLogin().equals(Login)));
    }


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
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
    public int getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    /**
     * @param nivelDeAcesso the nivelDeAcesso to set
     */
    public void setNivelDeAcesso(int nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public Funcionario buscarFuncionario(String Login) {
        for (Funcionario x : listaDeFuncionarios) {
            if (x.getLogin().equals(Login)) {
                return x;
            }
        }        
        return null;
    }

    /**
     * @return the telefone1
     */
    public String getTelefone1() {
        return telefone1;
    }

    /**
     * @param telefone1 the telefone1 to set
     */
    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    /**
     * @return the telefone2
     */
    public String getTelefone2() {
        return telefone2;
    }

    /**
     * @param telefone2 the telefone2 to set
     */
    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
}


