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
 * @author RVM
 */
public class ComprovanteDevolucao {

    private static String pasta = "relatorios/Devoluções/";
    private final DevolucaoAutomoveis dev;

    public ComprovanteDevolucao(DevolucaoAutomoveis dev) {
        this.dev = dev;
    }

    public void salvaComprovanteDevolucao() {
        String arquivo = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(Calendar.getInstance().getTime()) + ".txt";

    }
}
