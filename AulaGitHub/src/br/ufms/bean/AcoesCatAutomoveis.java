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
public class AcoesCatAutomoveis extends CatAutomoveis{
    private static final ArrayList<AcoesCatAutomoveis> listaCatAutomoveis = new ArrayList<>();
    
    public void cadastrarCatAutomoveis(AcoesCatAutomoveis Categoria){
        listaCatAutomoveis.add(Categoria);
    }
    
    public boolean removerCatAutomoveis(String categoriaBusca){
        boolean status = false;
        for(int i = 0; i < listaCatAutomoveis.size(); i++){
            if(listaCatAutomoveis.get(i).getcodCategoria().equals(categoriaBusca)){
                listaCatAutomoveis.remove(i);
                status = true;
            }
        }
        return status;
    }
    
    public AcoesCatAutomoveis buscarCatAutomoveis(String codCategoriabusca){
        for(int i = 0; i < listaCatAutomoveis.size(); i++){
            if(listaCatAutomoveis.get(i).getcodCategoria().equals(codCategoriabusca)){
                return listaCatAutomoveis.get(i);
            }
        }
        
        return null;
    }
}
