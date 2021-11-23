/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import entidades.login;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import metodoSQL.bancoSQL;

/**
 *
 * @author Jefferson Naravaez
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    login acceso;
    bancoSQL metodos = new bancoSQL();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        numeroIdentificacion = new javax.swing.JLabel();
        txtNumeroIdentificacion = new javax.swing.JTextField();
        contrasena = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Area de acceso");
        setPreferredSize(new java.awt.Dimension(450, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Area de acceso");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 40));

        numeroIdentificacion.setText("Numero de identificacion");
        getContentPane().add(numeroIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtNumeroIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroIdentificacionKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumeroIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 240, -1));

        contrasena.setText("Contraseña");
        getContentPane().add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
            }
        });
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 240, -1));

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 80, 40));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 80, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        acceso = new login(Long.parseLong(txtNumeroIdentificacion.getText()), txtContrasena.getText());
        String respuesta = metodos.consultarUsuario(acceso);
        if (respuesta.equalsIgnoreCase("Se encontro")) {
            CRUD ob = new CRUD();
            ob.setVisible(true);
            ob.limpiarCajas();
            String sesion = metodos.consultarNomApellUsuario(acceso);
            ob.inicioSesion(sesion);
            this.dispose();
            
        } else {
            JOptionPane.showMessageDialog(null, "Datos incorrectos", "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
        }
        limpiarCajas();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNumeroIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroIdentificacionKeyTyped
        if (txtNumeroIdentificacion.getText().length() >= 10) {
            getToolkit().beep();
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if (Character.isLetter(c) || c == ' ') {
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtNumeroIdentificacionKeyTyped

    private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyTyped
        if (txtContrasena.getText().length() >=20){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtContrasenaKeyTyped

    private void txtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            btnIniciar.doClick();
        }
    }//GEN-LAST:event_txtContrasenaKeyPressed

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
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel contrasena;
    private javax.swing.JLabel numeroIdentificacion;
    private javax.swing.JLabel titulo;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtNumeroIdentificacion;
    // End of variables declaration//GEN-END:variables

    public void limpiarCajas() {
        txtNumeroIdentificacion.setText("");
        txtContrasena.setText("");
    }

}
