package br.ufms.bean;

import br.ufms.view.Principal;

/**
 * Função para Inicialização de Valores
 * @author leolo
 */
public class Main {
    public static void main(String[] args) {
	System.out.println("--> Main.java");
        
        //ClienteFisico c = ClienteFisico.buscaClienteFisico("11");
        
         ClienteFisico c = new ClienteFisico();
         c = c.buscaClienteFisico("11");
        
        Main.valorInicialCategorias();
        Main.valorInicialAutomovel();
        
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

    private static void valorInicialAutomovel() {
        // Automovel 1
        Automovel auto1 = new Automovel();
        auto1.setAno(2010);
        auto1.setChassi("111 111111 11 111111");
        auto1.setFabricante("John Inc");
        auto1.setMarca("Ford");
        auto1.setModelo("Fordinho");
        auto1.setPlaca("aaa-1221");
        auto1.setCategoria(Categorias.buscarCatAutomoveisLista(0));
        Automovel.cadastrarAutomovel(auto1);
        // Automovel 2
        Automovel auto2 = new Automovel();
        auto2.setAno(2016);
        auto2.setChassi("123 123123 12 312312");
        auto2.setFabricante("John Inc");
        auto2.setMarca("Ford");
        auto2.setModelo("Fordão");
        auto2.setPlaca("bca-3443");
        auto2.setCategoria(Categorias.buscarCatAutomoveisLista(1));
        Automovel.cadastrarAutomovel(auto2);
    }
}
