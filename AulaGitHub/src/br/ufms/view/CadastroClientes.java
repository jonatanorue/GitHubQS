/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.view;

import br.ufms.bean.Cliente;
import br.ufms.bean.ClienteFisico;
import br.ufms.bean.ClienteJuridico;
import javax.swing.JOptionPane;


/**
 *
 * @author HPC
 */
public class CadastroClientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public CadastroClientes() {
        initComponents();
    }

    public CadastroClientes(ClienteFisico c) {
        initComponents();
        nometxt.setText(c.getNome());
        enderecotxt.setText(c.getEndereço());
        cidadetxt.setText(c.getCidade());
        estadotxt.setText(c.getEstado());
        telefone1txt.setText(c.getTelefone());
        telefone2txt.setText(c.getTelefone());
        emailtxt.setText(c.getEmail());
        cpfradio.setSelected(true);
        cpftxt.setText(c.getCpf());
        datanascimentotxt.setText(c.getData_de_nascimento());
        inadimplenciaradio.isSelected();

    }

    public CadastroClientes(ClienteJuridico c) {
        initComponents();
        nometxt.setText(c.getNome());
        enderecotxt.setText(c.getEndereço());
        cidadetxt.setText(c.getCidade());
        estadotxt.setText(c.getEstado());
        telefone1txt.setText(c.getTelefone());
        telefone2txt.setText(c.getTelefone());
        emailtxt.setText(c.getEmail());
        cnpjradio.setSelected(true);
        cnpjtxt.setText(c.getCnpj());
        nomeFantasiatxt.setText(c.getNomeFantasia());
        datanascimentotxt.setText(c.getData_de_nascimento());
        inadimplenciaradio.isSelected();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nometxt = new javax.swing.JTextField();
        enderecotxt = new javax.swing.JTextField();
        cidadetxt = new javax.swing.JTextField();
        estadotxt = new javax.swing.JTextField();
        telefone1txt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        cpftxt = new javax.swing.JTextField();
        salvarbotao = new javax.swing.JButton();
        datanascimentotxt = new javax.swing.JFormattedTextField();
        telefone2txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        inadimplenciaradio = new javax.swing.JRadioButton();
        cpfradio = new javax.swing.JRadioButton();
        cnpjradio = new javax.swing.JRadioButton();
        voltarBotao = new javax.swing.JButton();
        cnpjtxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        nomeFantasiatxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("CADASTRO CLIENTE");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Cidade:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Telefone:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("CPF");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Data de Nascimento:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Situação de Inadimplência:");

        nometxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nometxtActionPerformed(evt);
            }
        });

        enderecotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecotxtActionPerformed(evt);
            }
        });

        cidadetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadetxtActionPerformed(evt);
            }
        });

        telefone1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone1txtActionPerformed(evt);
            }
        });

        cpftxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpftxtActionPerformed(evt);
            }
        });

        salvarbotao.setText("SALVAR");
        salvarbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarbotaoActionPerformed(evt);
            }
        });

        datanascimentotxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("CNPJ");

        inadimplenciaradio.setText("APTO");

        buttonGroup1.add(cpfradio);

        buttonGroup1.add(cnpjradio);
        cnpjradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjradioActionPerformed(evt);
            }
        });

        voltarBotao.setText("VOLTAR");
        voltarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBotaoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Nome Fantasia");

        nomeFantasiatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFantasiatxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(8, 8, 8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(enderecotxt)
                                        .addComponent(nometxt)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(23, 23, 23)
                                            .addComponent(datanascimentotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(inadimplenciaradio))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(telefone1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(telefone2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nomeFantasiatxt))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cnpjradio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cnpjtxt))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(cpfradio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cpftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 252, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estadotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidadetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salvarbotao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(voltarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(nometxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(enderecotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cidadetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(estadotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(telefone1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefone2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8))
                            .addComponent(cpftxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cpfradio))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(cnpjradio)
                    .addComponent(cnpjtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nomeFantasiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(datanascimentotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(inadimplenciaradio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarbotao)
                    .addComponent(voltarBotao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cidadetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadetxtActionPerformed

    private void cpftxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpftxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpftxtActionPerformed

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_voltarBotaoActionPerformed

    private void salvarbotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarbotaoActionPerformed
        if (nometxt.getText() == null || enderecotxt.getText()== null || cidadetxt.getText() == null|| estadotxt.getText() == null|| telefone1txt.getText() == null|| telefone2txt.getText() == null || emailtxt.getText() == null || cpftxt.getText() == null || datanascimentotxt.getText() == null || inadimplenciaradio.isSelected() == false);
        JOptionPane.showMessageDialog(null, "INFORMAR TODOS OS CAMPOS");
        // TODO add your handling code here:
        if (cpfradio.isSelected()) {
            ClienteFisico cf = new ClienteFisico();
            // se existir cliente alterar direto na lista, caso não adicione um novo
            int indice = cf.buscaClienteFisicoB(cpftxt.getText());
            System.out.println(indice);
            if (indice >= 0) {
                cf.listaClienteFisico.get(indice).setNome(nometxt.getText());
                cf.listaClienteFisico.get(indice).setEndereço(enderecotxt.getText());
                cf.listaClienteFisico.get(indice).setCidade(cidadetxt.getText());
                cf.listaClienteFisico.get(indice).setEstado(estadotxt.getText());
                cf.listaClienteFisico.get(indice).setTelefone(telefone1txt.getText());
                cf.listaClienteFisico.get(indice).setTelefone(telefone2txt.getText());
                cf.listaClienteFisico.get(indice).setEmail(emailtxt.getText());
                cf.listaClienteFisico.get(indice).setCpf(cpftxt.getText());
                cf.listaClienteFisico.get(indice).setData_de_nascimento(datanascimentotxt.getText());
                cf.listaClienteFisico.get(indice).setSituaçao_de_inadimplência(inadimplenciaradio.isSelected());
                JOptionPane.showMessageDialog(null, "Editado com Sucesso");
            } else {
                cf.setNome(nometxt.getText());
                cf.setEndereço(enderecotxt.getText());
                cf.setCidade(cidadetxt.getText());
                cf.setEstado(estadotxt.getText());
                cf.setTelefone(telefone1txt.getText());
                cf.setTelefone(telefone2txt.getText());
                cf.setEmail(emailtxt.getText());
                cf.setCpf(cpftxt.getText());
                cf.setData_de_nascimento(datanascimentotxt.getText());
                cf.setSituaçao_de_inadimplência(inadimplenciaradio.isSelected());
                cf.cadastraClienteFisico(cf);
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
            }
        } else if (cnpjradio.isSelected()) {
            ClienteJuridico cj = new ClienteJuridico();
            cj.setNome(nometxt.getText());
            cj.setEndereço(enderecotxt.getText());
            cj.setCidade(cidadetxt.getText());
            cj.setEstado(estadotxt.getText());
            cj.setTelefone(telefone1txt.getText());
            cj.setTelefone(telefone2txt.getText());
            cj.setEmail(emailtxt.getText());
            cj.setCnpj(cnpjtxt.getText());
            cj.setNomeFantasia(nomeFantasiatxt.getText());
            cj.setData_de_nascimento(datanascimentotxt.getText());
            cj.setSituaçao_de_inadimplência(inadimplenciaradio.isSelected());
            cj.cadastraClienteJuridico(cj);
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");

        } else {
            JOptionPane.showMessageDialog(null, "Selecione CPF ou CNPJ");
        }

        dispose();

    }//GEN-LAST:event_salvarbotaoActionPerformed

    private void nomeFantasiatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFantasiatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFantasiatxtActionPerformed

    private void nometxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nometxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nometxtActionPerformed

    private void enderecotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecotxtActionPerformed

    private void cnpjradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjradioActionPerformed

    private void telefone1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone1txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone1txtActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cidadetxt;
    private javax.swing.JRadioButton cnpjradio;
    private javax.swing.JTextField cnpjtxt;
    private javax.swing.JRadioButton cpfradio;
    private javax.swing.JTextField cpftxt;
    private javax.swing.JFormattedTextField datanascimentotxt;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField enderecotxt;
    private javax.swing.JTextField estadotxt;
    private javax.swing.JRadioButton inadimplenciaradio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomeFantasiatxt;
    private javax.swing.JTextField nometxt;
    private javax.swing.JButton salvarbotao;
    private javax.swing.JTextField telefone1txt;
    private javax.swing.JTextField telefone2txt;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables
}
