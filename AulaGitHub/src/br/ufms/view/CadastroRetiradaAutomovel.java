/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.view;

import br.ufms.bean.Automovel;
import br.ufms.bean.Categorias;
import br.ufms.bean.Cliente;
import br.ufms.bean.ClienteFisico;
import br.ufms.bean.ComprovanteRetiradaAutomoveis;
import br.ufms.bean.Funcionario;
import br.ufms.bean.Reserva;
import br.ufms.bean.RetiradaAutomoveis;
import br.ufms.bean.ServicosAdicionais;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class CadastroRetiradaAutomovel extends javax.swing.JFrame {

    private final DefaultComboBoxModel modelServicos;
    private static DefaultListModel listModel;

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
    Date dataRetirada = new Date();
    /**
     *
     */
    public static final ArrayList<String> listServicosAdicionais = new ArrayList<>();

    /**
     * Creates new form CadastroRetiradaAutomovel
     */
    public CadastroRetiradaAutomovel() {
        ServicosAdicionais sa = new ServicosAdicionais();
        sa.setPreco(22.50);
        sa.setDescricao("Lavagem" + " - R$" + sa.getPreco());
        sa.cadastrarServico(sa);

        ServicosAdicionais sb = new ServicosAdicionais();
        sb.setPreco(47.50);
        sb.setDescricao("Alinhamento" + " - R$" + sb.getPreco());
        sb.cadastrarServico(sb);

        ServicosAdicionais sc = new ServicosAdicionais();
        sc.setPreco(30);
        sc.setDescricao("Não Sei" + " - R$" + sc.getPreco());
        sc.cadastrarServico(sc);

        ClienteFisico cf = new ClienteFisico();
        cf.setCpf("05654888560");
        cf.cadastraClienteFisico(cf);

        Categorias cat = new Categorias();
        cat.setcodCategoria("Cat123");
        cat.setdescCategoria("Nicolas");
        cat.setvalorDiario(10);
        cat.cadastrarCatAutomoveis(cat);

        initComponents();

        this.modelServicos = new DefaultComboBoxModel();
        this.servicosAdicionaisCombo.setModel(this.modelServicos);
        this.atualizarServicos();

        this.listModel = new DefaultListModel();
        this.servicosAdicionaisList.setModel(this.listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        tipoClienteBtnGrp = new javax.swing.ButtonGroup();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        dataRetiradaLbl = new javax.swing.JLabel();
        dataRetiradaTxt = new javax.swing.JLabel();
        horaRetiradaLbl = new javax.swing.JLabel();
        horaRetiradaTxt = new javax.swing.JLabel();
        dataLocacaoLbl = new javax.swing.JLabel();
        horaLocacaoLbl = new javax.swing.JLabel();
        dataDevolucaoTxt = new javax.swing.JFormattedTextField();
        horaDevolucaoTxt = new javax.swing.JFormattedTextField();
        tipoClienteLbl = new javax.swing.JLabel();
        clienteFisicoRadio = new javax.swing.JRadioButton();
        clienteJuridicoRadio = new javax.swing.JRadioButton();
        identificacaoClienteLbl = new javax.swing.JLabel();
        identificacaoClienteTxt = new javax.swing.JTextField();
        chassisAutomovelLbl = new javax.swing.JLabel();
        chassisAutomovelTxt = new javax.swing.JTextField();
        kmRetiradaLbl = new javax.swing.JLabel();
        kmRetiradaTxt = new javax.swing.JTextField();
        servicosAdicionaisLbl = new javax.swing.JLabel();
        servicosAdicionaisCombo = new javax.swing.JComboBox();
        adicionarServicoBtn = new javax.swing.JButton();
        removerServicoBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        servicosAdicionaisList = new javax.swing.JList();
        descontoLbl = new javax.swing.JLabel();
        descontoTxt = new javax.swing.JTextField();
        valorTotalLbl = new javax.swing.JLabel();
        valorTotalTxt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        salvarBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();
        calcularTotalBtn = new javax.swing.JButton();
        funcionarioRespLbl = new javax.swing.JLabel();
        funcionarioRespTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Retirada de Automóvel");

        dataRetiradaLbl.setText("Data da Retirada:");

        dataRetiradaTxt.setText(dateFormat.format(dataRetirada));

        horaRetiradaLbl.setText("Hora da Retirada:");

        DateFormat horaFormat = new SimpleDateFormat("HH:mm");
        Date horaRetirada = new Date();
        horaRetiradaTxt.setText(horaFormat.format(horaRetirada));

        dataLocacaoLbl.setText("Data da Devolução:");

        horaLocacaoLbl.setText("Hora da Devolução:");

        horaDevolucaoTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("HH:mm"))));
        horaDevolucaoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaDevolucaoTxtActionPerformed(evt);
            }
        });

        tipoClienteLbl.setText("Tipo de Cliente:");

        tipoClienteBtnGrp.add(clienteFisicoRadio);
        clienteFisicoRadio.setText("Físico");

        tipoClienteBtnGrp.add(clienteJuridicoRadio);
        clienteJuridicoRadio.setText("Jurídico");

        identificacaoClienteLbl.setText("CPF/CNPJ do Cliente:");

        chassisAutomovelLbl.setText("Chassis do Automóvel:");

        kmRetiradaLbl.setText("Quilometragem:");

        servicosAdicionaisLbl.setText("Serviços Adicionais:");

        servicosAdicionaisCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicosAdicionaisComboActionPerformed(evt);
            }
        });

        adicionarServicoBtn.setText("Adicionar");
        adicionarServicoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarServicoBtnActionPerformed(evt);
            }
        });

        removerServicoBtn.setText("Remover");
        removerServicoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerServicoBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(servicosAdicionaisList);

        descontoLbl.setText("Desconto:");

        valorTotalLbl.setText("Valor Total:");

        valorTotalTxt.setText("R$");

        salvarBtn.setText("Salvar");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }
        });

        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        calcularTotalBtn.setText("Calcular Total");
        calcularTotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularTotalBtnActionPerformed(evt);
            }
        });

        funcionarioRespLbl.setText("Funcionário Resp.:");

        funcionarioRespTxt.setText("Nícolas Alves Cruz");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(funcionarioRespLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataLocacaoLbl)
                                    .addComponent(tipoClienteLbl)
                                    .addComponent(dataRetiradaLbl))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(clienteFisicoRadio)
                                                .addGap(29, 29, 29)
                                                .addComponent(clienteJuridicoRadio))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(dataRetiradaTxt)
                                                    .addComponent(dataDevolucaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(horaRetiradaLbl)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(horaRetiradaTxt))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(horaLocacaoLbl)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(horaDevolucaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chassisAutomovelLbl)
                                    .addComponent(kmRetiradaLbl)
                                    .addComponent(servicosAdicionaisLbl)
                                    .addComponent(descontoLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(valorTotalTxt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(calcularTotalBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(adicionarServicoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(removerServicoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(servicosAdicionaisCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(chassisAutomovelTxt)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(kmRetiradaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(descontoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2))
                                            .addComponent(funcionarioRespTxt))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(identificacaoClienteLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(identificacaoClienteTxt))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(salvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valorTotalLbl)))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataRetiradaLbl)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataRetiradaTxt)
                            .addComponent(horaRetiradaLbl)
                            .addComponent(horaRetiradaTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horaLocacaoLbl)
                            .addComponent(dataDevolucaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horaDevolucaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataLocacaoLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clienteFisicoRadio)
                            .addComponent(clienteJuridicoRadio)
                            .addComponent(tipoClienteLbl))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identificacaoClienteLbl)
                    .addComponent(identificacaoClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chassisAutomovelLbl)
                    .addComponent(chassisAutomovelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kmRetiradaLbl)
                    .addComponent(kmRetiradaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(servicosAdicionaisCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionarServicoBtn)
                            .addComponent(servicosAdicionaisLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removerServicoBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descontoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descontoLbl)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorTotalLbl)
                    .addComponent(valorTotalTxt)
                    .addComponent(calcularTotalBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcionarioRespLbl)
                    .addComponent(funcionarioRespTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarServicoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarServicoBtnActionPerformed
        int flag = 0;
        for (int i = 0; i < listServicosAdicionais.size(); i++) {
            if (listServicosAdicionais.get(i).equals(servicosAdicionaisCombo.getSelectedItem().toString())) {
                flag = 1;
            }
        }
        if (flag == 0) {
            String aux = servicosAdicionaisCombo.getSelectedItem().toString();
            listServicosAdicionais.add(aux);
        } else {
            JOptionPane.showMessageDialog(this, "O serviço '" + servicosAdicionaisCombo.getSelectedItem().toString() + "' já foi adicionado.");
        }

        listModel.removeAllElements();

        for (int i = 0; i < listServicosAdicionais.size(); i++) {
            listModel.addElement(listServicosAdicionais.get(i));
        }
    }//GEN-LAST:event_adicionarServicoBtnActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void calcularTotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularTotalBtnActionPerformed
        this.calcularTotal();
    }//GEN-LAST:event_calcularTotalBtnActionPerformed

    private void servicosAdicionaisComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicosAdicionaisComboActionPerformed

    }//GEN-LAST:event_servicosAdicionaisComboActionPerformed

    private void removerServicoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerServicoBtnActionPerformed
        int ind = this.getIndexServicos();
        if (ind == -1) {
            return;
        }

        int dialogResult = JOptionPane.showConfirmDialog(this, "Certeza que deseja excluir este serviço?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            listServicosAdicionais.remove(ind);
        }

        listModel.removeAllElements();

        for (int i = 0; i < listServicosAdicionais.size(); i++) {
            listModel.addElement(listServicosAdicionais.get(i));
        }

    }//GEN-LAST:event_removerServicoBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed

        Reserva r = new Reserva();
        boolean status = false;
        ArrayList<Reserva> lista = r.buscaReservasCliente(identificacaoClienteTxt.getText());
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCarro().getChassi().equals(chassisAutomovelTxt.getText())) {
                status = true;

            }
        }
        if (!this.checkInputFields()) {
        }

        if (status == true) {
            RetiradaAutomoveis retirada = new RetiradaAutomoveis();
            retirada.setDataDevolucao(this.dataDevolucaoTxt.getText());
            retirada.setHoraDevolucao(this.horaDevolucaoTxt.getText());
            retirada.setDesconto(Integer.parseInt(this.descontoTxt.getText()));
            retirada.setKmRetirada(Integer.parseInt(this.kmRetiradaTxt.getText()));
        } else {
            JOptionPane.showMessageDialog(this, "Reserva não efetuada anteriormente", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        /*if (tipoClienteBtnGrp.isSelected(null)) {
            JOptionPane.showMessageDialog(this, "Selecione o tipo de cliente.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (clienteFisicoRadio.isSelected()) {
                int i = 0;
                if (identificacaoClienteTxt.getText().equals(ClienteFisico.listaClienteFisico.get(i).getCpf())) {
                    JOptionPane.showMessageDialog(this, "CPF: " + identificacaoClienteTxt.getText(), "ABC", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (clienteJuridicoRadio.isSelected()) {
                System.out.println("Cliente Juridico");
            }
        }*/
        
        // Comprovante de Retirada dos Automoveis
        ComprovanteRetiradaAutomoveis comprovante = new ComprovanteRetiradaAutomoveis(retirada);
        comprovante.salvarComprovante();
    }//GEN-LAST:event_salvarBtnActionPerformed

    private void horaDevolucaoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaDevolucaoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaDevolucaoTxtActionPerformed

    private int getIndexServicos() {
        int ind = this.servicosAdicionaisList.getSelectedIndex();
        if (ind == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um serviço.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return ind;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroRetiradaAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroRetiradaAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroRetiradaAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroRetiradaAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroRetiradaAutomovel().setVisible(true);
            }
        });
    }

    private void atualizarServicos() {
        for (ServicosAdicionais servicos : ServicosAdicionais.getListaServicos()) {
            this.modelServicos.addElement(servicos.getDescricao());
        }
    }

    public void calcularTotal() {
        double total = 0;
        int i = 0;

        Date data_retirada = null;
        Date data_devolucao = null;
        long diffDays = 0;

        try {
            data_retirada = dateFormat.parse(dataRetiradaTxt.getText());
            data_devolucao = dateFormat.parse(dataDevolucaoTxt.getText());

            long diff = data_devolucao.getTime() - data_retirada.getTime();

            diffDays = diff / (24 * 60 * 60 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        double qtdMes = diffDays / 30;
        double qtdSem = (diffDays % 30) / 7;
        double qtdDias = (diffDays % 30) % 7;

        for (i = 0; i < listServicosAdicionais.size(); i++) {
            ServicosAdicionais sa = ServicosAdicionais.buscarDescricao(listServicosAdicionais.get(i));
            total += sa.getPreco();
        }

        if (dataDevolucaoTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a data de devolução.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            for (i = 0; i < Automovel.listaAutomovel.size(); i++) {
                if (chassisAutomovelTxt.getText().equals(Automovel.listaAutomovel.get(i).getChassi())) {
                    total += qtdMes * Automovel.getAutomovelPorChassi(chassisAutomovelTxt.getText()).getCategoria().getvalorMensal()
                            + qtdSem * Automovel.getAutomovelPorChassi(chassisAutomovelTxt.getText()).getCategoria().getvalorSemanal()
                            + qtdDias * Automovel.getAutomovelPorChassi(chassisAutomovelTxt.getText()).getCategoria().getvalorDiario();
                }
            }
        }

        //Automovel.getAutomovelPorChassi(chassisAutomovelTxt.getText()).getCategoria().getvalorDiario()
        System.out.print(diffDays + " days ");

        if (descontoTxt.getText().equals("")) {
            valorTotalTxt.setText("R$" + total);
        } else {
            double desconto = Double.parseDouble(descontoTxt.getText());
            total -= (total * desconto) / 100;
            valorTotalTxt.setText("R$" + total);
        }
    }

    private boolean checkInputFields() {
        String regexDataDevolucao = "^[0-9]{2}(/)?[0-9]{2}(/)?[0-9]{4}$";
        String regexChassi = "^[a-zA-Z0-9]{3}( )?[a-zA-Z0-9]{6}( )?[a-zA-Z0-9]{2}( )?[a-zA-Z0-9]{6}$";
        String regexHoraDevolucao = "^[0-9]{2}(:)?[0-9]{2}$";
        String regexCpf = "^[0-9]{3}(.)?[0-9]{3}(.)?[0-9]{3}(-)?[0-9]{2}$";
        String regexCnpj = "^[0-9]{2}(.)?[0-9]{3}(.)?[0-9]{3}(/)?[0-9]{4}(-)?[0-9]{2}$";

        if (!Pattern.compile(regexDataDevolucao).matcher(this.dataDevolucaoTxt.getText()).find()) {
            JOptionPane.showMessageDialog(this, "Data Incorreta!\nExemplo correto '01/01/2017'.", "Valor Incorreto", JOptionPane.ERROR_MESSAGE);
            this.dataDevolucaoTxt.requestFocus();
            return false;
        } else if (!Pattern.compile(regexHoraDevolucao).matcher(this.horaDevolucaoTxt.getText()).find()) {
            JOptionPane.showMessageDialog(this, "Hora Incorreta!\nExemplo correto '19:50'.", "Valor Incorreto", JOptionPane.ERROR_MESSAGE);
            this.horaDevolucaoTxt.requestFocus();
            return false;
        } else if (clienteJuridicoRadio.isSelected() && !Pattern.compile(regexCnpj).matcher(this.identificacaoClienteTxt.getText()).find()) {
            JOptionPane.showMessageDialog(this, "CNPJ Incorreto!\nExemplo Correto '74.452.936/0001-90'.", "Valor Incorreto", JOptionPane.ERROR_MESSAGE);
            this.identificacaoClienteTxt.requestFocus();
            return false;
        } else if (clienteFisicoRadio.isSelected() && !Pattern.compile(regexCpf).matcher(this.identificacaoClienteTxt.getText()).find()) {
            JOptionPane.showMessageDialog(this, "CPF Incorreto!\nExemplo Correto '456.741.616-31'.", "Valor Incorreto", JOptionPane.ERROR_MESSAGE);
            this.identificacaoClienteTxt.requestFocus();
            return false;
        } else if (!Pattern.compile(regexChassi).matcher(this.chassisAutomovelTxt.getText()).find()) {
            JOptionPane.showMessageDialog(this, "Chassi Incorreta!\nApenas caracteres alfanuméricos.", "Valor Incorreto", JOptionPane.ERROR_MESSAGE);
            this.chassisAutomovelTxt.requestFocus();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarServicoBtn;
    private javax.swing.JButton calcularTotalBtn;
    private javax.swing.JLabel chassisAutomovelLbl;
    private javax.swing.JTextField chassisAutomovelTxt;
    private javax.swing.JRadioButton clienteFisicoRadio;
    private javax.swing.JRadioButton clienteJuridicoRadio;
    private javax.swing.JFormattedTextField dataDevolucaoTxt;
    private javax.swing.JLabel dataLocacaoLbl;
    private javax.swing.JLabel dataRetiradaLbl;
    private javax.swing.JLabel dataRetiradaTxt;
    private javax.swing.JLabel descontoLbl;
    private javax.swing.JTextField descontoTxt;
    private javax.swing.JLabel funcionarioRespLbl;
    private javax.swing.JLabel funcionarioRespTxt;
    private javax.swing.JFormattedTextField horaDevolucaoTxt;
    private javax.swing.JLabel horaLocacaoLbl;
    private javax.swing.JLabel horaRetiradaLbl;
    private javax.swing.JLabel horaRetiradaTxt;
    private javax.swing.JLabel identificacaoClienteLbl;
    private javax.swing.JTextField identificacaoClienteTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel kmRetiradaLbl;
    private javax.swing.JTextField kmRetiradaTxt;
    private javax.swing.JButton removerServicoBtn;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JComboBox servicosAdicionaisCombo;
    private javax.swing.JLabel servicosAdicionaisLbl;
    private javax.swing.JList servicosAdicionaisList;
    private javax.swing.ButtonGroup tipoClienteBtnGrp;
    private javax.swing.JLabel tipoClienteLbl;
    private javax.swing.JLabel valorTotalLbl;
    private javax.swing.JLabel valorTotalTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
