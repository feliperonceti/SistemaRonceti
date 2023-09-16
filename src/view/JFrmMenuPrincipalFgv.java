/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Gustavo
 */
public class JFrmMenuPrincipalFgv extends javax.swing.JFrame {

    /**
     * Creates new form JFrmMenuPrincipalFgv
     */
    public JFrmMenuPrincipalFgv() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menu Principal");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnuUsuario = new javax.swing.JMenuItem();
        jMnuCliente = new javax.swing.JMenuItem();
        jMnuProduto = new javax.swing.JMenuItem();
        jMnuPedido = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMnuCompra = new javax.swing.JMenuItem();
        jMnuCompraproduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Compra de Telefone");

        jMenu1.setText("Cadastro");

        jMnuUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuario.setText("Usuario");
        jMnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuUsuario);

        jMnuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCliente.setText("Cliente");
        jMnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuCliente);

        jMnuProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProduto.setText("Produto");
        jMnuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuProduto);

        jMnuPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMnuPedido.setText("Pedido");
        jMnuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuPedidoActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuPedido);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimento");

        jMnuCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCompra.setText("Compra");
        jMnuCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCompraActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuCompra);

        jMnuCompraproduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCompraproduto.setText("Compra Produto");
        jMnuCompraproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCompraprodutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuCompraproduto);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuarioActionPerformed
         JDlgUsuarioFgv cliente = new JDlgUsuarioFgv(null, true);
        cliente.setVisible(true);
    }//GEN-LAST:event_jMnuUsuarioActionPerformed

    private void jMnuCompraprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCompraprodutoActionPerformed
         JDlgCompraProdutoFgv cliente = new JDlgCompraProdutoFgv(null, true);
        cliente.setVisible(true);
    }//GEN-LAST:event_jMnuCompraprodutoActionPerformed

    private void jMnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClienteActionPerformed
       JDlgClienteFgv cliente = new JDlgClienteFgv(null, true);
        cliente.setVisible(true);
    }//GEN-LAST:event_jMnuClienteActionPerformed

    private void jMnuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuPedidoActionPerformed
       JDlgPedidoFgv cliente = new JDlgPedidoFgv(null, true);
        cliente.setVisible(true);
    }//GEN-LAST:event_jMnuPedidoActionPerformed

    private void jMnuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCompraActionPerformed
         JDlgCompraFgv cliente = new JDlgCompraFgv(null, true);
        cliente.setVisible(true);
    }//GEN-LAST:event_jMnuCompraActionPerformed

    private void jMnuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutoActionPerformed
       JDlgProdutoFgv cliente = new JDlgProdutoFgv(null, true);
        cliente.setVisible(true);
    }//GEN-LAST:event_jMnuProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmMenuPrincipalFgv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipalFgv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipalFgv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipalFgv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmMenuPrincipalFgv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnuCliente;
    private javax.swing.JMenuItem jMnuCompra;
    private javax.swing.JMenuItem jMnuCompraproduto;
    private javax.swing.JMenuItem jMnuPedido;
    private javax.swing.JMenuItem jMnuProduto;
    private javax.swing.JMenuItem jMnuUsuario;
    // End of variables declaration//GEN-END:variables
}
