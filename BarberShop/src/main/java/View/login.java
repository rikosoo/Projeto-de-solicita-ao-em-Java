/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Henrique
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextUsuario = new javax.swing.JTextField();
        TextSenha = new javax.swing.JPasswordField();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUser1 = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelMeiodaTela = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 220, 30));
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 220, 30));

        jLabelPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Senha");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 130, 40));

        jLabelUser1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUser1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelUser1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser1.setText("Usuario");
        getContentPane().add(jLabelUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 130, 40));

        jLabelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogin.setText("Login");
        getContentPane().add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 220, 40));

        jLabelMeiodaTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/painel-login.png"))); // NOI18N
        getContentPane().add(jLabelMeiodaTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 510));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Logo.jpg"))); // NOI18N
        jLabelFundo.setText("jLabel1");
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 780, 1107));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMeiodaTela;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUser1;
    // End of variables declaration//GEN-END:variables
}
