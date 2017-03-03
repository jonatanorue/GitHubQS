package br.ufms.bean;

import br.ufms.view.MenuAutomovel;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 * Classe responsável pelo cadastro dos Automóveis
 * @author leolo
 */
public class Automovel {
    
    private String placa; //7 caracteres alfanuméricos
    private String chassi; //17 caracteres alfanuméricos
    private Categorias categoria; //Tipo automóvel
    private String fabricante;
    private String marca;
    private int ano;
    private String modelo;
    
    private static final ArrayList<Automovel> listaAutomovel = new ArrayList<Automovel>();
    
    public Automovel(){}
    
    public static void cadastrarAutomovel(Automovel automovel){
        Automovel.listaAutomovel.add(automovel);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public static ArrayList<Automovel> getListaAutomovel(){
        return listaAutomovel;
    }
    
    public static Automovel getAutomovel(int ind){
        return listaAutomovel.get(ind);
    }
    
    public static Automovel getAutomovelPorChassi(String chassi){
        for(Automovel auto : listaAutomovel){
            if(auto.getChassi().equals(chassi))
                return auto;
        }
        return null;
    }
    
    
    public static void removeIndexListaAutomovel(int ind){
        listaAutomovel.remove(ind);
    }
}
