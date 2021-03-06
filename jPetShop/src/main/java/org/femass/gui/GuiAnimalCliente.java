/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.femass.dao.AnimalDao;
import org.femass.dao.ClienteDao;
import org.femass.model.Animal;
import org.femass.model.Cliente;

/**
 *
 * @author enzoappi
 */
public class GuiAnimalCliente extends javax.swing.JDialog {
    private Animal animal;
    
    
    public GuiAnimalCliente(java.awt.Frame parent, boolean modal, Animal animal) {
        super(parent, modal);
        initComponents();
        this.animal = animal;
        lblAnimal.setText("Animal: " + this.animal.getNome());
        try {
            lstClientesDisponiveis.setListData(new ClienteDao().getLista().toArray());
            lstClientesRespAnimal.setListData(this.animal.getClientes().toArray());
        } catch (SQLException ex) {
            Logger.getLogger(GuiAnimalCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstClientesDisponiveis = new javax.swing.JList();
        lblClientesDisponiveis = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstClientesRespAnimal = new javax.swing.JList();
        lblClientesRespAnimal = new javax.swing.JLabel();
        lblAnimal = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Autores do Livro");

        jScrollPane1.setViewportView(lstClientesDisponiveis);

        lblClientesDisponiveis.setText("Clientes disponiveis");

        jScrollPane2.setViewportView(lstClientesRespAnimal);

        lblClientesRespAnimal.setText("Clientes resp Animal");

        lblAnimal.setText("Animal");

        btnAdicionar.setText(">");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("<");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnimal)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblClientesDisponiveis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdicionar)
                            .addComponent(btnRemover))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(lblClientesRespAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAnimal)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClientesRespAnimal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblClientesDisponiveis))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnAdicionar)
                        .addGap(49, 49, 49)
                        .addComponent(btnRemover)
                        .addContainerGap(133, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        Cliente cliente = (Cliente) lstClientesDisponiveis.getSelectedValue();
        this.animal.adicionarCliente(cliente);
        try {
            new AnimalDao().alterar(this.animal);
        } catch (SQLException ex) {
            Logger.getLogger(GuiAnimalCliente.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        lstClientesRespAnimal.setListData(this.animal.getClientes().toArray());
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        Cliente cliente = (Cliente) lstClientesRespAnimal.getSelectedValue();
        this.animal.removerAutor(cliente);
        try {
            new AnimalDao().alterar(this.animal);
        } catch (SQLException ex) {
            Logger.getLogger(GuiAnimalCliente.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        lstClientesRespAnimal.setListData(this.animal.getClientes().toArray());
    }//GEN-LAST:event_btnRemoverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnimal;
    private javax.swing.JLabel lblClientesDisponiveis;
    private javax.swing.JLabel lblClientesRespAnimal;
    private javax.swing.JList lstClientesDisponiveis;
    private javax.swing.JList lstClientesRespAnimal;
    // End of variables declaration//GEN-END:variables
}
