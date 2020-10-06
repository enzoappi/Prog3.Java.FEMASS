/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.AutorDao;
import dao.LivroDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Livro;

/**
 *
 * @author enzoappi
 */
public class GuiCadastroLivro extends javax.swing.JFrame {
    private List<Livro> livros = new ArrayList();
    /**
     * Creates new form GuiLivro
     */
    public GuiCadastroLivro() {
        initComponents();
//        lstLivros.setListData(new LivroDao().getLivros().toArray());
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
        lstLivros = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodLivro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTituloLivro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtanoPublicacao = new javax.swing.JTextField();
        btnInserirAutor = new javax.swing.JButton();
        btnGravarLivro = new javax.swing.JButton();
        btnInserirExemplar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVoltarMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE LIVROS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 90));

        lstLivros.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstLivrosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstLivros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        jPanel2.setMinimumSize(new java.awt.Dimension(100, 90));

        jLabel1.setText("Codigo");

        jLabel2.setText("Titulo");

        jLabel3.setText("Ano");

        btnInserirAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/escritor_16px.png"))); // NOI18N
        btnInserirAutor.setText("Inserir Autor");
        btnInserirAutor.setMaximumSize(new java.awt.Dimension(164, 32));
        btnInserirAutor.setMinimumSize(new java.awt.Dimension(164, 32));
        btnInserirAutor.setPreferredSize(new java.awt.Dimension(164, 32));
        btnInserirAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirAutorActionPerformed(evt);
            }
        });

        btnGravarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/floppy-disk_24px.png"))); // NOI18N
        btnGravarLivro.setText("Gravar");
        btnGravarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarLivroActionPerformed(evt);
            }
        });

        btnInserirExemplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/epsWhite_16px.png"))); // NOI18N
        btnInserirExemplar.setText("Inserir Exemplar");
        btnInserirExemplar.setToolTipText("");
        btnInserirExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirExemplarActionPerformed(evt);
            }
        });

        jLabel4.setText("Autores");

        jLabel5.setText("Exemplares");

        btnVoltarMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/undo_24px.png"))); // NOI18N
        btnVoltarMenuPrincipal.setText("Voltar");
        btnVoltarMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInserirAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(btnInserirExemplar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(txtanoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTituloLivro)
                                    .addComponent(txtCodLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(btnGravarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVoltarMenuPrincipal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtanoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnInserirAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnInserirExemplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btnGravarLivro)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarMenuPrincipal)
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirAutorActionPerformed
        // TODO add your handling code here:
        Livro livro = (Livro) lstLivros.getSelectedValue();
        try{
            if(livro == null) {
                JOptionPane.showMessageDialog(null, "Você deve criar um livro antes de inserir um autor");
                return;
            }
            new GuiSelecaoAutorLivro(null, true, livro).setVisible(true);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "É necessário ter autores cadastrados no Sistema, para adiciona-los à algum livro!");
        }
    }//GEN-LAST:event_btnInserirAutorActionPerformed

    private void btnGravarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarLivroActionPerformed
        // TODO add your handling code here:
        Livro livro = new Livro(txtCodLivro.getText(), txtTituloLivro.getText(), txtanoPublicacao.getText());
        if(livro.getCodLivro().isEmpty() || livro.getTituloLivro().isEmpty() || livro.getAnoPublicacao().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos antes de gravar");
            return;
        }
        new LivroDao().gravar(livro);
        lstLivros.setListData(new LivroDao().getLivros().toArray());
        txtCodLivro.setText("");
        txtTituloLivro.setText("");
        txtanoPublicacao.setText("");
    }//GEN-LAST:event_btnGravarLivroActionPerformed

    private void lstLivrosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstLivrosValueChanged
        // TODO add your handling code here:
        Livro livro = (Livro)lstLivros.getSelectedValue();
        if(livro == null) return;
        txtCodLivro.setText(livro.getCodLivro());
        txtTituloLivro.setText(livro.getTituloLivro());
        txtanoPublicacao.setText(livro.getAnoPublicacao());
    }//GEN-LAST:event_lstLivrosValueChanged

    private void btnInserirExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirExemplarActionPerformed
        // TODO add your handling code here:
        Livro livro = (Livro)lstLivros.getSelectedValue();
        if(livro == null) {
            JOptionPane.showMessageDialog(null, "Você deve criar um livro ou selecionar da lista, antes de inserir um exemplar");
            return;
        }
        new GuiInclusaoExemplarLivro(null, true, livro).setVisible(true);
    }//GEN-LAST:event_btnInserirExemplarActionPerformed

    private void btnVoltarMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuPrincipalActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVoltarMenuPrincipalActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        lstLivros.setListData(new LivroDao().getLivros().toArray());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(GuiCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravarLivro;
    private javax.swing.JButton btnInserirAutor;
    private javax.swing.JButton btnInserirExemplar;
    private javax.swing.JButton btnVoltarMenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstLivros;
    private javax.swing.JTextField txtCodLivro;
    private javax.swing.JTextField txtTituloLivro;
    private javax.swing.JTextField txtanoPublicacao;
    // End of variables declaration//GEN-END:variables
}
