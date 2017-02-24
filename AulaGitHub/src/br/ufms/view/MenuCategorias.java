/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.view;

import br.ufms.bean.Categorias;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class MenuCategorias extends javax.swing.JFrame {

    /**
     * Creates new form MenuCatAutomoveis
     */
    public MenuCategorias() {
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

        jLabel1 = new javax.swing.JLabel();
        btnAddCat = new javax.swing.JButton();
        btnEditCat = new javax.swing.JButton();
        btnDeleteCat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Categorias de Automóveis");

        jLabel1.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        jLabel1.setText("Categorias de Automóveis");

        btnAddCat.setText("Adicionar Nova Categoria");
        btnAddCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCatActionPerformed(evt);
            }
        });

        btnEditCat.setText("Editar Categoria");
        btnEditCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCatActionPerformed(evt);
            }
        });

        btnDeleteCat.setText("Excluir Categoria");
        btnDeleteCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDeleteCat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditCat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddCat, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(btnAddCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteCat)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCatActionPerformed
        // TODO add your handling code here:
        
        CadastrarCategorias add = new CadastrarCategorias();
        add.setVisible(true);
    }//GEN-LAST:event_btnAddCatActionPerformed

    private void btnEditCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCatActionPerformed
        // TODO add your handling code here:
        String buscar = JOptionPane.showInputDialog("Digite o código da categoria a buscar");
        if(buscar == null){
            JOptionPane.showMessageDialog(null, "Nada digitado, tente novamente.");
        }else{
            Categorias edit = new Categorias();
            Categorias buscaCat = edit.buscarCatAutomoveis(buscar);
            
            CadastrarCategorias show = new CadastrarCategorias(buscaCat);
            show.setVisible(true);
        }
    }//GEN-LAST:event_btnEditCatActionPerformed

    private void btnDeleteCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCatActionPerformed
        // TODO add your handling code here:
        String buscar = JOptionPane.showInputDialog("Digite o código da categoria a ser deletada");
        Categorias delete = new Categorias();
        if(delete.removerCatAutomoveis(buscar) == true){
            JOptionPane.showMessageDialog(null, "Categoria deletada com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao deletar categoria, tente novamente");
        }
    }//GEN-LAST:event_btnDeleteCatActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCategorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCat;
    private javax.swing.JButton btnDeleteCat;
    private javax.swing.JButton btnEditCat;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
