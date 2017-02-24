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
    
    public static final ArrayList<Automovel> listaAutomovel = new ArrayList<Automovel>();
    
    public Automovel(String placa, String chassi, Categorias categoria, String fabricante, String marca, int ano, String modelo){
        this.placa = placa;
        this.chassi = chassi;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }
    
    public static void cadastrarAutomovel(Automovel automovel){
        Automovel.listaAutomovel.add(automovel);
        MenuAutomovel.atualizarList();
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    
}
