package br.ufms.view;

import br.ufms.bean.Automovel;
import br.ufms.bean.Categorias;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author leolo
 */
public class CadastroAutomovel extends javax.swing.JFrame {

    private final DefaultComboBoxModel modelCategorias;

    /**
     * Creates new form CadastroAutomovel
     */
    
    public CadastroAutomovel() {
        initComponents();
        
        this.modelCategorias = new DefaultComboBoxModel();
        this.comboBoxCategoria.setModel(this.modelCategorias);
        this.atualizarCategorias();
    }

    public CadastroAutomovel(Automovel auto) {
        this();
        
        this.textFieldAno.setText(Integer.toString(auto.getAno()));
        this.textFieldChassi.setText(auto.getChassi());
        this.textFieldFabricante.setText(auto.getFabricante());
        this.textFieldMarca.setText(auto.getMarca());
        this.textFieldModelo.setText(auto.getModelo());
        this.textFieldPlaca.setText(auto.getPlaca());
        this.comboBoxCategoria.setSelectedIndex(Categorias.buscaIndiceCategoria(auto.getCategoria().getcodCategoria()));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTitulo = new java.awt.Label();
        buttonVoltar = new javax.swing.JButton();
        labelPlaca = new javax.swing.JLabel();
        labelChassi = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        labelFabricante = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelAno = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        textFieldFabricante = new javax.swing.JTextField();
        textFieldMarca = new javax.swing.JTextField();
        textFieldModelo = new javax.swing.JTextField();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        buttonSalvar = new javax.swing.JButton();
        textFieldPlaca = new javax.swing.JFormattedTextField();
        textFieldChassi = new javax.swing.JFormattedTextField();
        textFieldAno = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Automóvel");

        menuTitulo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        menuTitulo.setText("Cadastro Automóvel");

        buttonVoltar.setText("Voltar");
        buttonVoltar.setPreferredSize(new java.awt.Dimension(67, 24));
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        labelPlaca.setText("Placa");

        labelChassi.setText("Chassi");

        labelCategoria.setText("Categoria");

        labelFabricante.setText("Fabricante");

        labelMarca.setText("Marca");

        labelAno.setText("Ano");

        labelModelo.setText("Modelo");

        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item" }));

        buttonSalvar.setText("Salvar");
        buttonSalvar.setPreferredSize(new java.awt.Dimension(67, 24));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        try {
            textFieldPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("???-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textFieldChassi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA AAAAAA AA AAAAAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textFieldAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMarca)
                            .addComponent(labelAno)
                            .addComponent(labelModelo))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldAno)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textFieldMarca)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelFabricante)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelChassi)
                                    .addGap(38, 38, 38)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPlaca)
                                    .addComponent(labelCategoria))
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldPlaca)
                            .addComponent(textFieldChassi)
                            .addComponent(comboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldFabricante)))
                    .addComponent(menuTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(menuTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(textFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelChassi)
                    .addComponent(textFieldChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria)
                    .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFabricante)
                    .addComponent(textFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAno)
                    .addComponent(textFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModelo))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if(!this.checkInputFields()) return;
        
        Automovel auto = new Automovel();
        auto.setAno(Integer.parseInt(this.textFieldAno.getText()));
        Categorias categoria = Categorias.buscarCatAutomoveisLista(this.comboBoxCategoria.getSelectedIndex());
        auto.setCategoria(categoria);
        auto.setChassi(this.textFieldChassi.getText());
        auto.setFabricante(this.textFieldFabricante.getText());
        auto.setMarca(this.textFieldMarca.getText());
        auto.setModelo(this.textFieldModelo.getText());
        auto.setPlaca(this.textFieldPlaca.getText());
        Automovel.cadastrarAutomovel(auto);
        
        JOptionPane.showMessageDialog(null, "Automóvel cadastrado com sucesso!", "Cadatro Realizado", JOptionPane.INFORMATION_MESSAGE);
        
        MenuAutomovel.atualizarList();
        dispose();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private boolean checkInputFields(){
        String regexPlaca = "^[a-zA-Z]{3}(-)?[0-9]{4}$";
        String regexChassi = "^[a-zA-Z0-9]{3}( )?[a-zA-Z0-9]{6}( )?[a-zA-Z0-9]{2}( )?[a-zA-Z0-9]{6}$";
        String regexTextoNome = "^([A-Za-zÀ-ú0-9]| )+$";
        String regexAno = "^[0-9]{4}$";
        
        if(!Pattern.compile(regexPlaca).matcher(this.textFieldPlaca.getText()).find()){
            JOptionPane.showMessageDialog(this, "Placa Incorreta!\n3 letras seguido por 4 números.", "Valor Incorreto", JOptionPane.ERROR_MESSAGE);
            this.textFieldPlaca.requestFocus();
            return false;
        }
        else if(!Pattern.compile(regexChassi).matcher(this.textFieldChassi.getText()).find()){
            JOptionPane.showMessageDialog(this, "Chassi Incorreta!\nApenas caracteres alfanuméricos.", "Valor Incorreto", JOptionPane.ERROR_MESSAGE);
            this.textFieldChassi.requestFocus();
            return false;
        }
        else if(!Pattern.compile(regexTextoNome).matcher(this.textFieldFabricante.getText()).find()){
            JOptionPane.showMessageDialog(this, "Fabricante Preenchimento Incorreto!\nApenas caracteres alfanuméricos.", "Valor Incorreto", JOptionPane.ERROR_MESSAGE);
            this.textFieldFabricante.requestFocus();
            return false;
        }
        else if(!Pattern.compile(regexTextoNome).matcher(this.textFieldMarca.getText()).find()){
            JOptionPane.showMessageDialog(this, "Marca Preenchimento Incorreto!\nApenas caracteres alfanuméricos.", "Valor Incorreto", JOptionPane.ERROR_MESSAGE);
            this.textFieldMarca.requestFocus();
            return false;
        }
        else if(!Pattern.compile(regexAno).matcher(this.textFieldAno.getText()).find()){
            JOptionPane.showMessageDialog(this, "Ano Preenchimento Incorreto!\nApenas 4 números.", "Valor Incorreto", JOptionPane.ERROR_MESSAGE);
            this.textFieldAno.requestFocus();
            return false;
        }
        else if(!Pattern.compile(regexTextoNome).matcher(this.textFieldModelo.getText()).find()){
            JOptionPane.showMessageDialog(this, "Modelo Preenchimento Incorreto!\nApenas caracteres alfanuméricos.", "Valor Incorreto", JOptionPane.ERROR_MESSAGE);
            this.textFieldModelo.requestFocus();
            return false;
        }
        
        return true;
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
            java.util.logging.Logger.getLogger(CadastroAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroAutomovel().setVisible(true);
            }
        });
    }

    private void atualizarCategorias() {
        for(Categorias categoria : Categorias.getListaCategorias()){
            this.modelCategorias.addElement(categoria.getdescCategoria());
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JComboBox<String> comboBoxCategoria;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelChassi;
    private javax.swing.JLabel labelFabricante;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPlaca;
    private java.awt.Label menuTitulo;
    private javax.swing.JFormattedTextField textFieldAno;
    private javax.swing.JFormattedTextField textFieldChassi;
    private javax.swing.JTextField textFieldFabricante;
    private javax.swing.JTextField textFieldMarca;
    private javax.swing.JTextField textFieldModelo;
    private javax.swing.JFormattedTextField textFieldPlaca;
    // End of variables declaration//GEN-END:variables
}
