/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.gui;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.femass.dao.AnimalDao;
import org.femass.dao.Persistencia;
import org.femass.dao.ProdutoDao;
import org.femass.dao.VendaDao;
import org.femass.model.Venda;
import org.femass.model.ItemVenda;
import org.femass.model.Produto;
import org.femass.model.Animal;

/**
 *
 * @author enzoappi
 */
public class GuiVenda extends javax.swing.JInternalFrame {
    private Persistencia persistencia = new VendaDao();
    private Venda venda = new Venda();
    Integer index;
    
    
    private static boolean janelaAberta = false;
    
    public static GuiVenda abrir() { 
        if(!janelaAberta) {
            GuiVenda gV = new GuiVenda(); 
            janelaAberta = true;
            return gV;
        } else {
            return null;
        }
    }

    private GuiVenda() {
        initComponents();
        this.venda.setData();
        txtData.setText(this.venda.getData());
        try {
            List<Animal> animais = new AnimalDao().getLista();
            cboAnimal.removeAllItems();
            for(Animal animal: animais) {
                cboAnimal.addItem(animal);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuiVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            List<Produto> produtos = new ProdutoDao().getLista();
            cboProdutos.removeAllItems();
            for(Produto produto: produtos) {
                cboProdutos.addItem(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuiVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnimal = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        btnExcluirItem = new javax.swing.JButton();
        cboAnimal = new javax.swing.JComboBox();
        cboProdutos = new javax.swing.JComboBox();
        lblData = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        txtQtdeProduto = new javax.swing.JTextField();
        btnAlterarItem = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItensVenda = new javax.swing.JTable();
        lblValorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        txtIdVenda = new javax.swing.JTextField();
        lblVenda = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Vender Produtos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblAnimal.setText("Animal");

        lblProdutos.setText("Produtos");

        btnExcluirItem.setText("Excluir Item");
        btnExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemActionPerformed(evt);
            }
        });

        lblData.setText("Data");

        lblQuantidade.setText("Quantidade");

        btnAlterarItem.setText("Alterar Item");
        btnAlterarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarItemActionPerformed(evt);
            }
        });

        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        txtData.setEditable(false);
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tblItensVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_produto", "produto", "quantidade", "valor unitario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItensVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItensVendaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblItensVenda);

        lblValorTotal.setText("Valor Total: ");

        txtValorTotal.setEditable(false);

        lblVenda.setText("Id Venda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblAnimal)
                            .addComponent(lblProdutos)
                            .addComponent(lblQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboAnimal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtQtdeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarItem)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVenda))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnimal)
                            .addComponent(cboAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdutos)
                            .addComponent(cboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQtdeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantidade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluirItem)
                            .addComponent(btnAlterarItem)
                            .addComponent(btnAddItem)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnVender)
                    .addComponent(lblValorTotal)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        // TODO add your handling code here:
        try{
            this.venda.getListaItensVenda().remove(venda.getListaItensVenda().get(this.index));
            DefaultTableModel modelo = (DefaultTableModel) tblItensVenda.getModel();
            int qtd = modelo.getRowCount();
            for(int i = 0; i < qtd; i++) {
                modelo.removeRow(0);
            }
            for(ItemVenda item : venda.getListaItensVenda()) {
                Object linha[] = {item.getProduto().getId(), item.getProduto(), item.getQtdeUnidades(), item.getProduto().getPreco()};
                modelo.addRow(linha);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        venda.setValorTotal();
        txtValorTotal.setText(venda.getValorTotal().toString());
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        janelaAberta = false;
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnAlterarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarItemActionPerformed
        // TODO add your handling code here:
        try{
            this.venda.getListaItensVenda().get(index).setQtdeUnidades(Integer.parseInt(txtQtdeProduto.getText()));
            DefaultTableModel modelo = (DefaultTableModel) tblItensVenda.getModel();
            int qtd = modelo.getRowCount();
            for(int i = 0; i < qtd; i++) {
                modelo.removeRow(0);
            }
            for(ItemVenda item : venda.getListaItensVenda()) {
                Object linha[] = {item.getProduto().getId(), item.getProduto(), item.getQtdeUnidades(), item.getProduto().getPreco()};
                modelo.addRow(linha);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        venda.setValorTotal();
        txtValorTotal.setText(venda.getValorTotal().toString());
    }//GEN-LAST:event_btnAlterarItemActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        try{
            this.venda.setAnimal((Animal) cboAnimal.getSelectedItem());
            ItemVenda itemVenda = new ItemVenda();
            itemVenda.setProduto((Produto)cboProdutos.getSelectedItem());
            itemVenda.setQtdeUnidades(Integer.parseInt(txtQtdeProduto.getText()));
            this.venda.adicionarItemVenda(itemVenda);
            
            DefaultTableModel modelo = (DefaultTableModel) tblItensVenda.getModel();
            
            int qtd = modelo.getRowCount();
            for(int i = 0; i < qtd; i++) {
                modelo.removeRow(0);
            }
            
            for(ItemVenda item : this.venda.getListaItensVenda()) {
                Object linha[] = {item.getProduto().getId(), item.getProduto(), item.getQtdeUnidades(), item.getProduto().getPreco()};
                modelo.addRow(linha);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        this.venda.setValorTotal();
        txtValorTotal.setText(this.venda.getValorTotal().toString());
    }//GEN-LAST:event_btnAddItemActionPerformed
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        try {
            this.persistencia.gravar(this.venda);
            txtIdVenda.setText(this.venda.getId().toString());
            this.persistencia.gravar(evt);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void tblItensVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItensVendaMouseClicked
        // TODO add your handling code here:
        try{
            this.index = tblItensVenda.getSelectedRow();
            cboAnimal.setSelectedItem(venda.getAnimal());
            cboProdutos.setSelectedItem(venda.getListaItensVenda().get(this.index).getProduto());
            txtQtdeProduto.setText(venda.getListaItensVenda().get(this.index).getQtdeUnidades().toString());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tblItensVendaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAlterarItem;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnVender;
    private javax.swing.JComboBox cboAnimal;
    private javax.swing.JComboBox cboProdutos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnimal;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblVenda;
    private javax.swing.JTable tblItensVenda;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtIdVenda;
    private javax.swing.JTextField txtQtdeProduto;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
