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
import org.femass.dao.DisciplinaDao;
import org.femass.model.Disciplina;

/**
 *
 * @author enzoappi
 */
public class PnlDisciplina extends javax.swing.JPanel {
    private boolean alterando;
    private Disciplina disciplina;
    /**
     * Creates new form PnlDisciplina
     */
    public PnlDisciplina() {
        initComponents();
        
        try {
            lstDisciplinas.setListData(new DisciplinaDao().getDisciplinas().toArray());
        } catch (SQLException ex) {
            Logger.getLogger(PnlDisciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCurso = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDisciplinas = new javax.swing.JList();
        btnApagar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(622, 272));

        lblId.setText("Id");

        txtId.setEditable(false);

        lblNome.setText("Nome");

        txtNome.setEditable(false);

        lblCurso.setText("Curso");

        txtCurso.setEditable(false);

        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        lstDisciplinas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lstDisciplinas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDisciplinasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstDisciplinas);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIncluir)
                    .addComponent(lblCurso)
                    .addComponent(lblNome)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCurso)
                    .addComponent(txtNome)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(btnApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCurso)
                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGravar)
                            .addComponent(btnApagar)
                            .addComponent(btnAlterar)
                            .addComponent(btnIncluir)
                            .addComponent(btnCancelar))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
//        Disciplina disciplina = new Disciplina();
        disciplina.setNome(txtNome.getText());
        disciplina.setCurso(txtCurso.getText());
        try {
            if(alterando) {
                new DisciplinaDao().alterarDisciplina(disciplina);
            } else {
            new DisciplinaDao().gravarDisciplina(disciplina);
            txtId.setText(disciplina.getId().toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PnlDisciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            lstDisciplinas.setListData(new DisciplinaDao().getDisciplinas().toArray());
        } catch (SQLException ex) {
            Logger.getLogger(PnlDisciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
        desabilitar();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void lstDisciplinasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDisciplinasValueChanged
        // TODO add your handling code here:
        Disciplina disciplina = null;
        try {
            disciplina = (Disciplina) lstDisciplinas.getSelectedValue();
        } catch (Exception e) {
            return;
        }
        txtId.setText(disciplina.getId().toString());
        txtNome.setText(disciplina.getNome());
        txtCurso.setText(disciplina.getCurso());
    }//GEN-LAST:event_lstDisciplinasValueChanged

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        Disciplina disciplina = (Disciplina) lstDisciplinas.getSelectedValue();
        try {
            new DisciplinaDao().apagarDisciplina(disciplina);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        try {
            lstDisciplinas.setListData(new DisciplinaDao().getDisciplinas().toArray());
        } catch (SQLException ex) {
            Logger.getLogger(PnlDisciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        this.disciplina = (Disciplina) lstDisciplinas.getSelectedValue();
        this.alterando = true;
        habilitar();
        txtNome.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
        this.disciplina = new Disciplina();
        this.alterando = false;
        habilitar();
        txtCurso.setText("");
        txtNome.setText("");
        txtNome.requestFocus();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        desabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void habilitar() {
        txtCurso.setEditable(true);
        txtNome.setEditable(true);
        btnAlterar.setEnabled(false);
        btnApagar.setEnabled(false);
        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnIncluir.setEnabled(false);
        lstDisciplinas.setEnabled(false);
        lstDisciplinas.setEnabled(false);
    }
    
    public void desabilitar() {
        txtCurso.setEditable(false);
        txtNome.setEditable(false);
        btnAlterar.setEnabled(true);
        btnApagar.setEnabled(true);
        btnGravar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnIncluir.setEnabled(true);
        lstDisciplinas.setEnabled(true);
        lstDisciplinas.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JList lstDisciplinas;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
