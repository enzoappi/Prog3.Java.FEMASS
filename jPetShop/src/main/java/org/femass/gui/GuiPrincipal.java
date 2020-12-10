/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.gui;

/**
 *
 * @author enzoappi
 */
public class GuiPrincipal extends javax.swing.JFrame {

    public GuiPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mnuFornecedor = new javax.swing.JMenuItem();
        mnuCliente = new javax.swing.JMenuItem();
        mnuAnimal = new javax.swing.JMenuItem();
        mnuProduto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuVenda = new javax.swing.JMenuItem();
        mnuComprar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cadastros");

        mnuFornecedor.setMnemonic('o');
        mnuFornecedor.setText("Fornecedor");
        mnuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFornecedorActionPerformed(evt);
            }
        });
        fileMenu.add(mnuFornecedor);

        mnuCliente.setText("Cliente");
        mnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClienteActionPerformed(evt);
            }
        });
        fileMenu.add(mnuCliente);

        mnuAnimal.setText("Animal");
        mnuAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAnimalActionPerformed(evt);
            }
        });
        fileMenu.add(mnuAnimal);

        mnuProduto.setText("Produto");
        mnuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProdutoActionPerformed(evt);
            }
        });
        fileMenu.add(mnuProduto);

        menuBar.add(fileMenu);

        jMenu1.setText("Transação");

        mnuVenda.setText("Venda");
        mnuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVendaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuVenda);

        mnuComprar.setText("Compra");
        mnuComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuComprarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuComprar);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFornecedorActionPerformed
        // TODO add your handling code here:
        GuiFornecedor gF = GuiFornecedor.abrir();
        if(gF == null) return;
        desktopPane.add(gF);
        gF.setVisible(true);
    }//GEN-LAST:event_mnuFornecedorActionPerformed

    private void mnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClienteActionPerformed
        // TODO add your handling code here:
        GuiCliente gC = GuiCliente.abrir();
        if(gC == null) return;
        desktopPane.add(gC);
        gC.setVisible(true);
    }//GEN-LAST:event_mnuClienteActionPerformed

    private void mnuAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAnimalActionPerformed
        // TODO add your handling code here:
        GuiAnimal gA = GuiAnimal.abrir();
        if(gA == null) return;
        desktopPane.add(gA);
        gA.setVisible(true);
    }//GEN-LAST:event_mnuAnimalActionPerformed

    private void mnuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProdutoActionPerformed
        // TODO add your handling code here:
        GuiProduto gP = GuiProduto.abrir();
        if(gP == null) return;
        desktopPane.add(gP);
        gP.setVisible(true);
    }//GEN-LAST:event_mnuProdutoActionPerformed

    private void mnuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVendaActionPerformed
        // TODO add your handling code here:
        GuiVenda gV = GuiVenda.abrir();
        if(gV == null) return;
        desktopPane.add(gV);
        gV.setVisible(true);
    }//GEN-LAST:event_mnuVendaActionPerformed

    private void mnuComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuComprarActionPerformed
        // TODO add your handling code here:
        GuiCompra gC = GuiCompra.abrir();
        if(gC == null) return;
        desktopPane.add(gC);
        gC.setVisible(true);
    }//GEN-LAST:event_mnuComprarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuAnimal;
    private javax.swing.JMenuItem mnuCliente;
    private javax.swing.JMenuItem mnuComprar;
    private javax.swing.JMenuItem mnuFornecedor;
    private javax.swing.JMenuItem mnuProduto;
    private javax.swing.JMenuItem mnuVenda;
    // End of variables declaration//GEN-END:variables

}
