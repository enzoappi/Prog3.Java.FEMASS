/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.femass.dao.AnimalDao;
import org.femass.dao.Persistencia;
import org.femass.model.Animal;
import org.femass.model.TipoAnimal;

/**
 *
 * @author enzoappi
 */
public class PnlAnimal extends javax.swing.JPanel {
    private Persistencia persistencia = new AnimalDao();
    private boolean alterando;
    private Animal animal;
    /**
     * Creates new form PnlAutor
     */
    public PnlAnimal() {
        initComponents();
        try {
            lstAnimais.setListData(this.persistencia.getLista().toArray());
            cboTipoAnimal.removeAllItems();
            for(TipoAnimal tipoAnimal : TipoAnimal.values()) {
                cboTipoAnimal.addItem(tipoAnimal);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PnlAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEditora = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAnimais = new javax.swing.JList();
        btnApagar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtRaca = new javax.swing.JTextField();
        btnClientes = new javax.swing.JButton();
        lblIdade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        lblPorte = new javax.swing.JLabel();
        txtPorte = new javax.swing.JTextField();
        lblEditora4 = new javax.swing.JLabel();
        cboTipoAnimal = new javax.swing.JComboBox();

        lblId.setText("Id");

        txtId.setEditable(false);

        lblNome.setText("Nome");

        txtNome.setEditable(false);

        lblEditora.setText("Raca");

        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        lstAnimais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lstAnimais.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAnimaisValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstAnimais);

        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtRaca.setEditable(false);

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        lblIdade.setText("Idade");

        txtIdade.setEditable(false);

        txtPeso.setEditable(false);

        lblPeso.setText("Peso");

        lblPorte.setText("Porte");

        txtPorte.setEditable(false);

        lblEditora4.setText("Tipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblId))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(317, 317, 317)
                                .addComponent(btnApagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnIncluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGravar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar))
                                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                                .addGap(252, 252, 252))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEditora)
                                    .addComponent(lblIdade)
                                    .addComponent(lblPeso)
                                    .addComponent(lblPorte))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRaca)
                                    .addComponent(txtNome)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                        .addComponent(txtPorte, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIdade, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(cboTipoAnimal, 0, 293, Short.MAX_VALUE)))
                            .addComponent(lblEditora4))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditora4)
                            .addComponent(cboTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditora)
                            .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdade)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeso)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPorte)
                            .addComponent(txtPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnApagar)
                    .addComponent(btnAlterar)
                    .addComponent(btnIncluir)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
        this.animal.setNome(txtNome.getText());
        this.animal.setRaca(txtRaca.getText());
        this.animal.setIdade(Integer.parseInt(txtIdade.getText()));
        this.animal.setPeso(Double.parseDouble(txtPeso.getText()));
        this.animal.setTipoAnimal((TipoAnimal) cboTipoAnimal.getSelectedItem());
        this.animal.setPorte(txtPorte.getText());
        
        try {
            if(alterando) {
                this.persistencia.alterar(this.animal);
            } else {
                this.persistencia.gravar(this.animal);
                txtId.setText(this.animal.getId().toString());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        try {
            lstAnimais.setListData(this.persistencia.getLista().toArray());
        } catch (SQLException ex) {
            Logger.getLogger(PnlAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
        desabilitar();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void lstAnimaisValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAnimaisValueChanged
        // TODO add your handling code here:
        Animal animal = null;
        try {
            animal = (Animal) lstAnimais.getSelectedValue();
            txtId.setText(animal.getId().toString());
            txtNome.setText(animal.getNome());
            txtRaca.setText(animal.getRaca());
            txtIdade.setText(animal.getIdade().toString());
            txtPeso.setText(animal.getPeso().toString());
            cboTipoAnimal.setSelectedItem(animal.getTipoAnimal());
            txtPorte.setText(animal.getPorte());
        } catch (Exception e) {
            return;
        }
    }//GEN-LAST:event_lstAnimaisValueChanged

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        Animal animal = (Animal) lstAnimais.getSelectedValue();
        try {
            this.persistencia.apagar(animal);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        try {
            lstAnimais.setListData(this.persistencia.getLista().toArray());
        } catch (SQLException ex) {
            Logger.getLogger(PnlAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        this.animal = (Animal) lstAnimais.getSelectedValue();
        alterando = true;
        habilitar();
        txtNome.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
        this.animal = new Animal();
        alterando = false;
        habilitar();
        txtId.setText("");
        txtNome.setText("");
        txtRaca.setText("");
        txtIdade.setText("");
        txtPeso.setText("");
        txtPorte.setText("");
        txtNome.requestFocus();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        desabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        this.animal = (Animal) lstAnimais.getSelectedValue();
        new GuiAnimalCliente(null, true, this.animal).setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    public void habilitar() {
        txtNome.setEditable(true);
        txtRaca.setEditable(true);
        txtIdade.setEditable(true);
        txtPeso.setEditable(true);
        cboTipoAnimal.setEnabled(true);
        txtPorte.setEditable(true);
        btnAlterar.setEnabled(false);
        btnApagar.setEnabled(false);
        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnClientes.setEnabled(false);
        btnIncluir.setEnabled(false);
        lstAnimais.setEnabled(false);
    }
    
    public void desabilitar() {
        txtNome.setEditable(false);
        txtRaca.setEditable(false);
        txtIdade.setEditable(false);
        txtPeso.setEditable(false);
        cboTipoAnimal.setEnabled(false);
        txtPorte.setEditable(false);
        btnAlterar.setEnabled(true);
        btnApagar.setEnabled(true);
        btnGravar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnClientes.setEnabled(true);
        btnIncluir.setEnabled(true);
        lstAnimais.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JComboBox cboTipoAnimal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEditora;
    private javax.swing.JLabel lblEditora4;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPorte;
    private javax.swing.JList lstAnimais;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPorte;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}
