/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.bean;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class Categorias {
    private String codCategoria;
    private String descCategoria;

    private double valorDiario;
    private double valorSemanal;
    private double valorMensal;
    private double valorKM;
    private String qtdAutomoveis;
    
    public Categorias(){
        
    }
    
    public static final ArrayList<Categorias> listaCategorias = new ArrayList<Categorias>();
    
    public void cadastrarCatAutomoveis(Categorias Categoria){
        listaCategorias.add(Categoria);
    }
    
    public boolean removerCatAutomoveis(String categoriaBusca){
        boolean status = false;
        for(int i = 0; i < listaCategorias.size(); i++){
            if(listaCategorias.get(i).getcodCategoria().equals(categoriaBusca)){
                listaCategorias.remove(i);
                status = true;
            }
        }
        return status;
    }
    
    public static Categorias buscarCatAutomoveis(String codCategoriabusca){
        for(int i = 0; i < listaCategorias.size(); i++){
            if(listaCategorias.get(i).getcodCategoria().equals(codCategoriabusca)){
                return listaCategorias.get(i);
            }
        }
        
        return null;
    }
    
    public static int buscaIndiceCategoria(String codCategoriaBusca){
        int indice = -1;
        for(int i = 0; i < listaCategorias.size(); i++){
            if(listaCategorias.get(i).getcodCategoria().equals(codCategoriaBusca)){
                indice = i;
            }
        }
        return indice;
    }
    
    public String getcodCategoria(){
        return codCategoria;
    }
    
    public void setcodCategoria(String codCategoria){
        this.codCategoria = codCategoria;
    }
    
    public String getdescCategoria(){
        return descCategoria;
    }
    
    public void setdescCategoria(String descCategoria){
        this.descCategoria = descCategoria;
    }
    
    public double getvalorDiario(){
        return valorDiario;
    }
    
    public void setvalorDiario(double valorDiario){
        this.valorDiario = valorDiario;
    }
    
    public double getvalorSemanal(){
        return valorSemanal;
    }
    
    public void setvalorSemanal(double valorSemanal){
        this.valorSemanal = valorSemanal;
    }
    
    public double getvalorMensal(){
        return valorMensal;
    }
    
    public void setvalorMensal(double valorMensal){
        this.valorMensal = valorMensal;
    }
    
    public double getvalorKM(){
        return valorKM;
    }
    
    public void setvalorKM(double valorKM){
        this.valorKM = valorKM;
    }
    
    public String getqtdAutomoveis(){
        return qtdAutomoveis;
    }
    
    public void setqtdAutomoveis(String qtdAutomoveis){
        this.qtdAutomoveis = qtdAutomoveis;
    }
    
    public static ArrayList<Categorias> getListaCategorias() {
        return listaCategorias;
    }
    
    public static Categorias buscarCatAutomoveisLista(int ind){
        return listaCategorias.get(ind);
    }
    public static Categorias buscaCatDesCat(String descricao){
        for(int i = 0; i < listaCategorias.size(); i++){
            if(listaCategorias.get(i).getdescCategoria().equals(descricao)){
                return listaCategorias.get(i);
            }
        }
        return null;
    }
}
