/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.LeitorDao;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import model.Leitor;
import model.Telefone;
import model.TipoContato;

/**
 *
 * @author enzoappi
 */
public class GuiCadastroTelefone extends javax.swing.JDialog {
    private Leitor leitor;
    
    /**
     * Creates new form GuiEmail
     */
    public GuiCadastroTelefone(java.awt.Frame parent, boolean modal, Leitor leitor) {
        super(parent, modal);
        initComponents();
        this.leitor = leitor;
        LstTelefone.setListData(leitor.getTelefones().toArray());
        
        //preencher a combo
        for(TipoContato tc : TipoContato.values()) {
            CboTipo.addItem(tc);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstTelefone = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtDdd = new javax.swing.JTextField();
        BtnGravar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CboTipo = new javax.swing.JComboBox();
        TxtNumero = new javax.swing.JTextField();
        btnVoltarMenuLeitor = new javax.swing.JButton();
        btnLimparTela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        LstTelefone.setMinimumSize(new java.awt.Dimension(100, 90));
        LstTelefone.setName(""); // NOI18N
        LstTelefone.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LstTelefoneValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(LstTelefone);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1);

        jLabel1.setText("Telefone");

        BtnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/floppy-disk_24px.png"))); // NOI18N
        BtnGravar.setText("Gravar");
        BtnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGravarActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo");

        btnVoltarMenuLeitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/undo_24px.png"))); // NOI18N
        btnVoltarMenuLeitor.setText("Voltar");
        btnVoltarMenuLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuLeitorActionPerformed(evt);
            }
        });

        btnLimparTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir_24px.png"))); // NOI18N
        btnLimparTela.setText("Limpar Tela");
        btnLimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVoltarMenuLeitor)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnGravar)
                            .addComponent(btnLimparTela)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarMenuLeitor)
                    .addComponent(btnLimparTela))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGravarActionPerformed
        // TODO add your handling code here:
        Telefone telefone = new Telefone(TxtDdd.getText(), TxtNumero.getText(), (TipoContato) CboTipo.getSelectedItem());
        try {
            telefone.testarCampos();
            this.leitor.adicionarTelefone(telefone);
        }catch(InputMismatchException ime) {
            JOptionPane.showMessageDialog(null, ime.getMessage());
        }
        new LeitorDao().salvar(); //faco isso para garantir que o arquivo xml Xstream seja atualizado antes de qualquer operacao
        LstTelefone.setListData(this.leitor.getTelefones().toArray());
        
        //Limpar a tela apos gravar
        TxtDdd.setText("");
        TxtNumero.setText("");
        CboTipo.setSelectedItem(TipoContato.Pessoal);
        
        TxtDdd.requestFocus();
    }//GEN-LAST:event_BtnGravarActionPerformed

    private void LstTelefoneValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LstTelefoneValueChanged
        // TODO add your handling code here:
        //quando a pessoa quer alterar o valor escolhido
        Telefone telefone = (Telefone) LstTelefone.getSelectedValue();
        TxtDdd.setText(telefone.getDdd());
        TxtNumero.setText(telefone.getNumero());
        CboTipo.setSelectedItem(telefone.getTipoContato());
    }//GEN-LAST:event_LstTelefoneValueChanged

    private void btnVoltarMenuLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuLeitorActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVoltarMenuLeitorActionPerformed

    private void btnLimparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTelaActionPerformed
        // TODO add your handling code here:
        TxtDdd.setText("");
        TxtNumero.setText("");
        CboTipo.setSelectedItem(TipoContato.Pessoal);
        
        TxtDdd.requestFocus();
    }//GEN-LAST:event_btnLimparTelaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGravar;
    private javax.swing.JComboBox CboTipo;
    private javax.swing.JList LstTelefone;
    private javax.swing.JTextField TxtDdd;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JButton btnLimparTela;
    private javax.swing.JButton btnVoltarMenuLeitor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
