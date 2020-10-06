/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.LivroDao;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ExemplarLivro;
import model.Livro;
/**
 *
 * @author enzoappi
 */
public class GuiInclusaoExemplarLivro extends javax.swing.JDialog {
    private Livro livro;
    private DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    /**
     * Creates new form GuiInclusaoExemplarLivro
     * @param parent
     * @param modal
     * @param livro
     */
    public GuiInclusaoExemplarLivro(java.awt.Frame parent, boolean modal, Livro livro) {
        super(parent, modal);
        this.livro = livro;
        initComponents();
        lstExemplares.setListData(this.livro.getExemplaresLivros().toArray());
    }

    private GuiInclusaoExemplarLivro(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        lstExemplares = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodExemplar = new javax.swing.JTextField();
        lblDataAquisExempl = new javax.swing.JLabel();
        btnAddExemplar = new javax.swing.JButton();
        btnVoltarMenuCadLivro = new javax.swing.JButton();
        txtDataAquisicaoExemplar = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE EXEMPLARES DOS LIVROS");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        lstExemplares.setMaximumSize(new java.awt.Dimension(100, 90));
        lstExemplares.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstExemplaresValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstExemplares);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        jPanel2.setMinimumSize(new java.awt.Dimension(100, 90));

        jLabel1.setText("Codigo");

        lblDataAquisExempl.setText("Data de Aquisição");

        btnAddExemplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Addarquivo_16px.png"))); // NOI18N
        btnAddExemplar.setText("Adicionar");
        btnAddExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExemplarActionPerformed(evt);
            }
        });

        btnVoltarMenuCadLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/undo_16px.png"))); // NOI18N
        btnVoltarMenuCadLivro.setText("Voltar");
        btnVoltarMenuCadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuCadLivroActionPerformed(evt);
            }
        });

        try {
            txtDataAquisicaoExemplar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataAquisicaoExemplar.setMinimumSize(new java.awt.Dimension(15, 23));
        txtDataAquisicaoExemplar.setPreferredSize(new java.awt.Dimension(15, 23));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(txtCodExemplar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVoltarMenuCadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDataAquisExempl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDataAquisicaoExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddExemplar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataAquisicaoExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataAquisExempl))
                .addGap(28, 28, 28)
                .addComponent(btnAddExemplar)
                .addGap(27, 27, 27)
                .addComponent(btnVoltarMenuCadLivro)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExemplarActionPerformed
        // TODO add your handling code here:
        try{
            ExemplarLivro exemplarLivro = exemplarLivro = new ExemplarLivro(txtCodExemplar.getText());
            LocalDate dataAquisicaoExemplar = LocalDate.parse(txtDataAquisicaoExemplar.getText(), this.form);
            exemplarLivro.setDataAquisicaoExemplarLivro(dataAquisicaoExemplar);
            this.livro.adicionarExemplarLivro(exemplarLivro);
            new LivroDao().salvar();
            lstExemplares.setListData(this.livro.getExemplaresLivros().toArray());
            txtCodExemplar.setText("");
            txtDataAquisicaoExemplar.setText("");
        }catch(DateTimeException dte) {
            JOptionPane.showMessageDialog(null, "Você deve inserir um valor válido antes de adicionar o Exemplar");
        }
    }//GEN-LAST:event_btnAddExemplarActionPerformed

    private void lstExemplaresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstExemplaresValueChanged
        // TODO add your handling code here:
        ExemplarLivro exemplarLivro = (ExemplarLivro) lstExemplares.getSelectedValue();
        if(exemplarLivro == null) return;
        txtCodExemplar.setText(exemplarLivro.getCodExemplarLivro());
        txtDataAquisicaoExemplar.setText(exemplarLivro.getDataAquisicaoExemplarLivro().format(this.form));
    }//GEN-LAST:event_lstExemplaresValueChanged

    private void btnVoltarMenuCadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuCadLivroActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVoltarMenuCadLivroActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddExemplar;
    private javax.swing.JButton btnVoltarMenuCadLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataAquisExempl;
    private javax.swing.JList lstExemplares;
    private javax.swing.JTextField txtCodExemplar;
    private javax.swing.JFormattedTextField txtDataAquisicaoExemplar;
    // End of variables declaration//GEN-END:variables
}