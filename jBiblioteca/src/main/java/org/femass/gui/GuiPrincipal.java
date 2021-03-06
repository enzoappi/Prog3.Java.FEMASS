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

    /**
     * Creates new form GuiPrincipal
     */
    public GuiPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH); //Faz com que a janela inicie-se do tamanha maximo da tela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mnuAutor = new javax.swing.JMenuItem();
        mnuDisciplina = new javax.swing.JMenuItem();
        mnuLeitor = new javax.swing.JMenu();
        mnuAluno = new javax.swing.JMenuItem();
        mnuProfessor = new javax.swing.JMenuItem();
        mnuLivro = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuEmprestar = new javax.swing.JMenuItem();
        mnuDevolucao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cadastro");

        mnuAutor.setMnemonic('o');
        mnuAutor.setText("Autor");
        mnuAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAutorActionPerformed(evt);
            }
        });
        fileMenu.add(mnuAutor);

        mnuDisciplina.setMnemonic('s');
        mnuDisciplina.setText("Disciplina");
        mnuDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDisciplinaActionPerformed(evt);
            }
        });
        fileMenu.add(mnuDisciplina);

        mnuLeitor.setText("Leitor");

        mnuAluno.setText("Aluno");
        mnuAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAlunoActionPerformed(evt);
            }
        });
        mnuLeitor.add(mnuAluno);

        mnuProfessor.setText("Professor");
        mnuProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProfessorActionPerformed(evt);
            }
        });
        mnuLeitor.add(mnuProfessor);

        fileMenu.add(mnuLeitor);

        mnuLivro.setText("Livro");
        mnuLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLivroActionPerformed(evt);
            }
        });
        fileMenu.add(mnuLivro);

        menuBar.add(fileMenu);

        jMenu1.setText("Emprestimos");

        mnuEmprestar.setText("Emprestar");
        mnuEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEmprestarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuEmprestar);

        mnuDevolucao.setText("Devolucao");
        mnuDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDevolucaoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDevolucao);

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

    private void mnuAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAutorActionPerformed
        // TODO add your handling code here:
        GuiAutor gA = GuiAutor.abrir(); //chama o metodo em GuiAutor que fara o controle de abertura ou nao de janela
        if(gA == null) return; //testo se a janela esta aberta,e, caso positivo nao faco nada
        desktopPane.add(gA);
        gA.setVisible(true);
    }//GEN-LAST:event_mnuAutorActionPerformed

    private void mnuDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDisciplinaActionPerformed
        // TODO add your handling code here:
        GuiDisciplina gD = GuiDisciplina.abrir(); //chama o metodo em GuiDisciplina que fara o controle de abertura ou nao de janela
        if(gD == null) return; //testo se a janela esta aberta,e, caso positivo nao faco nada
        desktopPane.add(gD);
        gD.setVisible(true);
    }//GEN-LAST:event_mnuDisciplinaActionPerformed

    private void mnuAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAlunoActionPerformed
        // TODO add your handling code here:
        GuiAluno gAl = GuiAluno.abrir(); //chama o metodo em GuiAluno que fara o controle de abertura ou nao de janela
        if(gAl == null) return; //testo se a janela esta aberta,e, caso positivo nao faco nada
        desktopPane.add(gAl);
        gAl.setVisible(true);
    }//GEN-LAST:event_mnuAlunoActionPerformed

    private void mnuProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProfessorActionPerformed
        // TODO add your handling code here:
        GuiProfessor gP = GuiProfessor.abrir(); //chama o metodo em GuiProfessor que fara o controle de abertura ou nao de janela
        if(gP == null) return; //testo se a janela esta aberta,e, caso positivo nao faco nada
        desktopPane.add(gP);
        gP.setVisible(true);
    }//GEN-LAST:event_mnuProfessorActionPerformed

    private void mnuLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLivroActionPerformed
        // TODO add your handling code here:
        GuiLivro gL = GuiLivro.abrir(); //chama o metodo em GuiProfessor que fara o controle de abertura ou nao de janela
        if(gL == null) return; //testo se a janela esta aberta,e, caso positivo nao faco nada
        desktopPane.add(gL);
        gL.setVisible(true);
    }//GEN-LAST:event_mnuLivroActionPerformed

    private void mnuEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEmprestarActionPerformed
        // TODO add your handling code here:
        GuiEmprestimo gE = GuiEmprestimo.abrir(); //chama o metodo em GuiProfessor que fara o controle de abertura ou nao de janela
        if(gE == null) return; //testo se a janela esta aberta,e, caso positivo nao faco nada
        desktopPane.add(gE);
        gE.setVisible(true);
    }//GEN-LAST:event_mnuEmprestarActionPerformed

    private void mnuDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDevolucaoActionPerformed
        // TODO add your handling code here:
        GuiDevolucao gD = GuiDevolucao.abrir(); //chama o metodo em GuiProfessor que fara o controle de abertura ou nao de janela
        if(gD == null) return; //testo se a janela esta aberta,e, caso positivo nao faco nada
        desktopPane.add(gD);
        gD.setVisible(true);
    }//GEN-LAST:event_mnuDevolucaoActionPerformed

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
    private javax.swing.JMenuItem mnuAluno;
    private javax.swing.JMenuItem mnuAutor;
    private javax.swing.JMenuItem mnuDevolucao;
    private javax.swing.JMenuItem mnuDisciplina;
    private javax.swing.JMenuItem mnuEmprestar;
    private javax.swing.JMenu mnuLeitor;
    private javax.swing.JMenuItem mnuLivro;
    private javax.swing.JMenuItem mnuProfessor;
    // End of variables declaration//GEN-END:variables

}
