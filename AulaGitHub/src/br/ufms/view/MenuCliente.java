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
public class MenuCliente extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        novoclientebtn = new javax.swing.JButton();
        editarClienteCpfbtn = new javax.swing.JButton();
        excluirClienteCpfbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        excluirclienteCnpjbtn = new javax.swing.JButton();
        editarClienteCnpjbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");

        novoclientebtn.setText("NOVO");
        novoclientebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoclientebtnActionPerformed(evt);
            }
        });

        editarClienteCpfbtn.setText("EDITAR - FÍSICO");
        editarClienteCpfbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClienteCpfbtnActionPerformed(evt);
            }
        });

        excluirClienteCpfbtn.setText("EXCLUIR - FÍSICO");
        excluirClienteCpfbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirClienteCpfbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LOCAÇÃO DE AUTOMÓVEIS");

        excluirclienteCnpjbtn.setText("EXCLUIR - JURÍDICO");
        excluirclienteCnpjbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirclienteCnpjbtnActionPerformed(evt);
            }
        });

        editarClienteCnpjbtn.setText("EDITAR - JURÍDICO");
        editarClienteCnpjbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClienteCnpjbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(novoclientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editarClienteCnpjbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarClienteCpfbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(excluirClienteCpfbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excluirclienteCnpjbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(novoclientebtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(excluirClienteCpfbtn)
                            .addComponent(editarClienteCpfbtn))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluirclienteCnpjbtn)
                    .addComponent(editarClienteCnpjbtn))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarClienteCpfbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarClienteCpfbtnActionPerformed
        // TODO add your handling code here:
        String buscar = JOptionPane.showInputDialog("Digite o CPF do cliente a ser buscado");
         if(buscar == null){
            JOptionPane.showMessageDialog(null, "ERRO");
        }else{
            ClienteFisico c = new ClienteFisico();
            ClienteFisico buscaC = c.buscaClienteFisico(buscar);

            CadastroClientes cs = new CadastroClientes(buscaC);
            cs.setVisible(true);
           
        }
        
                
    }//GEN-LAST:event_editarClienteCpfbtnActionPerformed

    private void novoclientebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoclientebtnActionPerformed
        // TODO add your handling code here:
        CadastroClientes c = new CadastroClientes();
        c.setVisible(true);
    }//GEN-LAST:event_novoclientebtnActionPerformed

    private void excluirClienteCpfbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirClienteCpfbtnActionPerformed
        // TODO add your handling code here:
        String buscar = JOptionPane.showInputDialog("Digite o CPF do cliente a ser buscado");
        ClienteFisico cf = new ClienteFisico();
        if(cf.removerClienteFisico(buscar) == true){
            JOptionPane.showMessageDialog(null, "Removido com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "ERRO");
        }
               
    }//GEN-LAST:event_excluirClienteCpfbtnActionPerformed

    private void excluirclienteCnpjbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirclienteCnpjbtnActionPerformed
        // TODO add your handling code here:
        String buscar = JOptionPane.showInputDialog("Digite o CNPJ do cliente a ser buscado");
        ClienteJuridico cj = new ClienteJuridico();
        if(cj.removerClienteJuridico(buscar) == true){
            JOptionPane.showMessageDialog(null, "Removido com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "ERRO");
        }
    }//GEN-LAST:event_excluirclienteCnpjbtnActionPerformed

    private void editarClienteCnpjbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarClienteCnpjbtnActionPerformed
        // TODO add your handling code here:
        String buscar = JOptionPane.showInputDialog("Digite o cliente a ser buscado");
        if(buscar == null){
            JOptionPane.showMessageDialog(null, "ERRO");
        }else{
        ClienteJuridico c = new ClienteJuridico();
        ClienteJuridico buscaC = c.buscaClienteJuridico(buscar);
                
                
                
        CadastroClientes cs = new CadastroClientes(buscaC);
        cs.setVisible(true);
        }     
    }//GEN-LAST:event_editarClienteCnpjbtnActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarClienteCnpjbtn;
    private javax.swing.JButton editarClienteCpfbtn;
    private javax.swing.JButton excluirClienteCpfbtn;
    private javax.swing.JButton excluirclienteCnpjbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton novoclientebtn;
    // End of variables declaration//GEN-END:variables
}