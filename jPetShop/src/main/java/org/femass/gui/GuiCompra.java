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
import org.femass.dao.Persistencia;
import org.femass.dao.ProdutoDao;
import org.femass.dao.CompraDao;
import org.femass.dao.FornecedorDao;
import org.femass.model.Compra;
import org.femass.model.ItemCompra;
import org.femass.model.Produto;
import org.femass.model.Fornecedor;

/**
 *
 * @author enzoappi
 */
public class GuiCompra extends javax.swing.JInternalFrame {
    private Persistencia persistencia = new CompraDao();
    private Compra compra = new Compra();
    Integer index;
    
    
    private static boolean janelaAberta = false;
    
    public static GuiCompra abrir() { 
        if(!janelaAberta) {
            GuiCompra gC = new GuiCompra(); 
            janelaAberta = true;
            return gC;
        } else {
            return null;
        }
    }

    private GuiCompra() {
        initComponents();
        this.compra.setData();
        txtData.setText(this.compra.getData());
        try {
            List<Fornecedor> fornecedores = new FornecedorDao().getLista();
            cboFornecedores.removeAllItems();
            for(Fornecedor fornecedor: fornecedores) {
                cboFornecedores.addItem(fornecedor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuiCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            List<Produto> produtos = new ProdutoDao().getLista();
            cboProdutos.removeAllItems();
            for(Produto produto: produtos) {
                cboProdutos.addItem(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuiCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFornecedor = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        btnExcluirItem = new javax.swing.JButton();
        cboFornecedores = new javax.swing.JComboBox();
        cboProdutos = new javax.swing.JComboBox();
        lblData = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        txtQtdeProduto = new javax.swing.JTextField();
        btnAlterarItem = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItensCompra = new javax.swing.JTable();
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

        lblFornecedor.setText("Fornecedor");

        lblProduto.setText("Produto");

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

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        txtData.setEditable(false);
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tblItensCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        tblItensCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItensCompraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblItensCompra);

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
                            .addComponent(lblFornecedor)
                            .addComponent(lblProduto)
                            .addComponent(lblQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboFornecedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(btnComprar)
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
                            .addComponent(lblFornecedor)
                            .addComponent(cboFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProduto)
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
                    .addComponent(btnComprar)
                    .addComponent(lblValorTotal)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        // TODO add your handling code here:
        try{
            this.compra.getListaItensCompra().remove(compra.getListaItensCompra().get(this.index));
            DefaultTableModel modelo = (DefaultTableModel) tblItensCompra.getModel();
            int qtd = modelo.getRowCount();
            for(int i = 0; i < qtd; i++) {
                modelo.removeRow(0);
            }
            for(ItemCompra item : compra.getListaItensCompra()) {
                Object linha[] = {item.getProduto().getId(), item.getProduto(), item.getQtdeUnidades(), item.getProduto().getPreco()};
                modelo.addRow(linha);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        compra.setValorTotal();
        txtValorTotal.setText(compra.getValorTotal().toString());
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        janelaAberta = false;
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnAlterarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarItemActionPerformed
        // TODO add your handling code here:
        try{
            this.compra.getListaItensCompra().get(index).setQtdeUnidades(Integer.parseInt(txtQtdeProduto.getText()));
            DefaultTableModel modelo = (DefaultTableModel) tblItensCompra.getModel();
            int qtd = modelo.getRowCount();
            for(int i = 0; i < qtd; i++) {
                modelo.removeRow(0);
            }
            for(ItemCompra item : compra.getListaItensCompra()) {
                Object linha[] = {item.getProduto().getId(), item.getProduto(), item.getQtdeUnidades(), item.getProduto().getPreco()};
                modelo.addRow(linha);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        compra.setValorTotal();
        txtValorTotal.setText(compra.getValorTotal().toString());
    }//GEN-LAST:event_btnAlterarItemActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        try{
            this.compra.setFornecedor((Fornecedor) cboFornecedores.getSelectedItem());
            ItemCompra itemCompra = new ItemCompra();
            itemCompra.setProduto((Produto)cboProdutos.getSelectedItem());
            itemCompra.setQtdeUnidades(Integer.parseInt(txtQtdeProduto.getText()));
            this.compra.adicionarItemCompra(itemCompra);
            
            DefaultTableModel modelo = (DefaultTableModel) tblItensCompra.getModel();
            
            int qtd = modelo.getRowCount();
            for(int i = 0; i < qtd; i++) {
                modelo.removeRow(0);
            }
            
            for(ItemCompra item : this.compra.getListaItensCompra()) {
                Object linha[] = {item.getProduto().getId(), item.getProduto(), item.getQtdeUnidades(), item.getProduto().getPreco()};
                modelo.addRow(linha);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        this.compra.setValorTotal();
        txtValorTotal.setText(this.compra.getValorTotal().toString());
    }//GEN-LAST:event_btnAddItemActionPerformed
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        try {
            this.persistencia.gravar(this.compra);
            txtIdVenda.setText(this.compra.getId().toString());
            this.persistencia.gravar(evt);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void tblItensCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItensCompraMouseClicked
        // TODO add your handling code here:
        try{
            this.index = tblItensCompra.getSelectedRow();
            cboFornecedores.setSelectedItem(compra.getFornecedor());
            cboProdutos.setSelectedItem(compra.getListaItensCompra().get(this.index).getProduto());
            txtQtdeProduto.setText(compra.getListaItensCompra().get(this.index).getQtdeUnidades().toString());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tblItensCompraMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAlterarItem;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JComboBox cboFornecedores;
    private javax.swing.JComboBox cboProdutos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblVenda;
    private javax.swing.JTable tblItensCompra;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtIdVenda;
    private javax.swing.JTextField txtQtdeProduto;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
