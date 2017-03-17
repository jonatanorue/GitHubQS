/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.bean;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author leolo
 */
public class ComprovanteRetiradaAutomoveis {
    
    private static String pasta = "relatorios/";
    private RetiradaAutomoveis ret;
    
    public ComprovanteRetiradaAutomoveis(RetiradaAutomoveis ret){
        this.ret = ret;
    }
    
    public void salvarComprovante(){
        String arquivo = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(Calendar.getInstance().getTime()) + ".txt";
        try{
            PrintWriter writer = new PrintWriter(this.pasta+arquivo, "utf-8");
            // nome do cliente
            // documento do cliente
            ClienteFisico cli = new ClienteFisico().buscaClienteFisico(ret.getCpf_Cnpj());
            ClienteJuridico emp = new ClienteJuridico().buscaClienteJuridico(ret.getCpf_Cnpj());
            writer.println("Comprovante de Retirada\n");
            if(cli != null){
                writer.println("Cliente Fisico: "+cli.getNome());
                writer.println("Documento: "+cli.getCpf());
            }
            else if(emp != null){
                writer.println("Cliente Juridico: "+emp.getNomeFantasia());
                writer.println("Documento: "+emp.getCnpj());
            }
            else System.err.println("ComprovanteRetiradaAutomoveis > Não existe cliente!");
            // data de retirada e previsão de devolução
            writer.println("Retirada realizada em: "+ret.getDataRetirada()+" às "+ret.getHoraRetirada());
            writer.println("Devolução prevista : "+ret.getDataDevolucao()+" às "+ret.getHoraDevolucao());
            // valor da diária
            // --> não implementado
            // servições adicionais utilizados
            // --> não implementado
            writer.println("\n\n____________________________________________\nAssinatura do Cliente");
            writer.close();
            JOptionPane.showMessageDialog(null, "O comprovante da retirada foi salvo!\nArquivo: "+this.pasta+arquivo, "Comprovante de Retirada", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Não foi possível imprimir o comprovante da retirada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
