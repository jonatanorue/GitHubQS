package br.ufms.bean;

import br.ufms.view.Principal;

/**
 * Função para Inicialização de Valores
 * @author leolo
 */
public class Main {
    public static void main(String[] args) {
	System.out.println("--> Main.java");
        
        Main.valorInicialCategorias();
        
        Principal janela = new Principal();
        janela.setVisible(true);
    }
    
    private static void valorInicialCategorias(){
        // Exemplo 1 - Cod. 1
        Categorias cat1 = new Categorias();
        cat1.setcodCategoria("1");
        cat1.setdescCategoria("Exemplo 1");
        cat1.setvalorDiario(10);
        cat1.setvalorSemanal(70);
        cat1.setvalorMensal(300);
        cat1.setvalorKM(30);
        cat1.setqtdAutomoveis("12");
        cat1.cadastrarCatAutomoveis(cat1);
        // Exemplo 2 - Cod. 2
        Categorias cat2 = new Categorias();
        cat2.setcodCategoria("2");
        cat2.setdescCategoria("Exemplo 2");
        cat2.setvalorDiario(15);
        cat2.setvalorSemanal(90);
        cat2.setvalorMensal(450);
        cat2.setvalorKM(50);
        cat2.setqtdAutomoveis("45");
        cat2.cadastrarCatAutomoveis(cat2);
    }
}
