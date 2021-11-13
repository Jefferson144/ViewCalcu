/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import AppPackage.AnimationClass;
import entidades.Persona;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jefferson Naravaez
 */
public class CRUD extends javax.swing.JFrame {

    /**
     * Creates new form CRUD
     */
    public CRUD() {
        initComponents();
        tabla();
    }

    Persona dato;
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        inicio_sesion = new javax.swing.JLabel();
        mundo = new javax.swing.JLabel();
        Calculadora = new javax.swing.JLabel();
        contribucion = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        datos = new javax.swing.JPanel();
        numeroIdentificacion = new javax.swing.JLabel();
        txtNumeroIdentificacion = new javax.swing.JTextField();
        primerNombre = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        primerApellido = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        boton = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTdatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagina principal");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Create Read Update Delete");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 590, 50));

        inicio_sesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inicio_sesion.setForeground(new java.awt.Color(255, 255, 255));
        inicio_sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_sesion.setText("ADMIN");
        getContentPane().add(inicio_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 30));

        mundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mundo.png"))); // NOI18N
        mundo.setToolTipText("Click para abrir el navegador");
        mundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mundoMouseClicked(evt);
            }
        });
        getContentPane().add(mundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 210, -1, -1));

        Calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/calculadora2.png"))); // NOI18N
        Calculadora.setToolTipText("Click para abrir calculadora");
        Calculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalculadoraMouseClicked(evt);
            }
        });
        getContentPane().add(Calculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 290, -1, -1));

        contribucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/colaboracion.png"))); // NOI18N
        contribucion.setToolTipText("Click para observar contrubuidores");
        contribucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contribucionMouseClicked(evt);
            }
        });
        getContentPane().add(contribucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 380, -1, -1));

        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/usuario.png"))); // NOI18N
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        fondo.setBackground(new java.awt.Color(102, 102, 102));
        fondo.setFocusable(false);
        fondo.setOpaque(true);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 480));

        datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numeroIdentificacion.setText("Numero de identificacion");
        datos.add(numeroIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 20));

        txtNumeroIdentificacion.setForeground(new java.awt.Color(153, 153, 153));
        txtNumeroIdentificacion.setText("Ej : 1110474610");
        txtNumeroIdentificacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroIdentificacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroIdentificacionFocusLost(evt);
            }
        });
        txtNumeroIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroIdentificacionActionPerformed(evt);
            }
        });
        txtNumeroIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroIdentificacionKeyTyped(evt);
            }
        });
        datos.add(txtNumeroIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 20));

        primerNombre.setText("Primer nombre");
        datos.add(primerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 20));

        txtPrimerNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtPrimerNombre.setText("Ej : Jefferson");
        txtPrimerNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrimerNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrimerNombreFocusLost(evt);
            }
        });
        txtPrimerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimerNombreKeyTyped(evt);
            }
        });
        datos.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 20));

        txtPrimerApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtPrimerApellido.setText("Ej : Narvaez");
        txtPrimerApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrimerApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrimerApellidoFocusLost(evt);
            }
        });
        txtPrimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimerApellidoKeyTyped(evt);
            }
        });
        datos.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 20));

        primerApellido.setText("Primer apellido");
        datos.add(primerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 20));

        telefono.setText("Telefono");
        datos.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 20));

        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setText("Ej : 3118122494");
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        datos.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 20));

        getContentPane().add(datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 350, 150));

        boton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        boton.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        boton.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        boton.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        btnEliminar.setText("Eliminar reg.");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        boton.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 50, 100, -1));

        btnLimpiar.setText("Limpiar box");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        boton.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 50, 90, -1));

        getContentPane().add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 230, 140));
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 590, 30));

        JTdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTdatos.setEnabled(false);
        JTdatos.setRowHeight(25);
        JTdatos.getTableHeader().setReorderingAllowed(false);
        JTdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTdatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTdatos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 570, 160));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        AnimationClass animacion = new AnimationClass();
        if (mundo.getX() == -70) {
            animacion.jLabelXRight(-70, 70, 8, 4, mundo);
            animacion.jLabelXRight(-70, 70, 10, 3, Calculadora);
            animacion.jLabelXRight(-70, 70, 12, 3, contribucion);
        } else {
            animacion.jLabelXLeft(70, -70, 8, 5, mundo);
            animacion.jLabelXLeft(70, -70, 10, 5, Calculadora);
            animacion.jLabelXLeft(70, -70, 12, 5, contribucion);
        }
    }//GEN-LAST:event_usuarioMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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

    private void txtNumeroIdentificacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroIdentificacionFocusGained
        if (txtNumeroIdentificacion.getText().equalsIgnoreCase("Ej : 1110474610")) {
            txtNumeroIdentificacion.setText("");
            txtNumeroIdentificacion.setForeground(Color.white);
        }
    }//GEN-LAST:event_txtNumeroIdentificacionFocusGained

    private void txtNumeroIdentificacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroIdentificacionFocusLost
        if (txtNumeroIdentificacion.getText().equalsIgnoreCase("")) {
            txtNumeroIdentificacion.setText("Ej : 1110474610");
            txtNumeroIdentificacion.setForeground(new Color(10066329));
        }
    }//GEN-LAST:event_txtNumeroIdentificacionFocusLost

    private void txtPrimerNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerNombreKeyTyped
        if (txtPrimerNombre.getText().length() >= 15) {
            getToolkit().beep();
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if (Character.isDigit(c) || c == ' ') {
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtPrimerNombreKeyTyped

    private void txtPrimerNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerNombreFocusGained
        if (txtPrimerNombre.getText().equalsIgnoreCase("Ej : Jefferson")) {
            txtPrimerNombre.setText("");
            txtPrimerNombre.setForeground(Color.white);
        }
    }//GEN-LAST:event_txtPrimerNombreFocusGained

    private void txtPrimerNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerNombreFocusLost
        if (txtPrimerNombre.getText().equalsIgnoreCase("")) {
            txtPrimerNombre.setText("Ej : Jefferson");
            txtPrimerNombre.setForeground(new Color(10066329));
        }
    }//GEN-LAST:event_txtPrimerNombreFocusLost

    private void txtPrimerApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerApellidoKeyTyped
        if (txtPrimerApellido.getText().length() >= 15) {
            getToolkit().beep();
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if (Character.isDigit(c) || c == ' ') {
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtPrimerApellidoKeyTyped

    private void txtPrimerApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerApellidoFocusGained
        if (txtPrimerApellido.getText().equalsIgnoreCase("Ej : Narvaez")) {
            txtPrimerApellido.setText("");
            txtPrimerApellido.setForeground(Color.white);
        }
    }//GEN-LAST:event_txtPrimerApellidoFocusGained

    private void txtPrimerApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerApellidoFocusLost
        if (txtPrimerApellido.getText().equalsIgnoreCase("")) {
            txtPrimerApellido.setText("Ej : Narvaez");
            txtPrimerApellido.setForeground(new Color(10066329));
        }
    }//GEN-LAST:event_txtPrimerApellidoFocusLost

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() >= 10) {
            getToolkit().beep();
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if (Character.isLetter(c) || c == ' ') {
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        if (txtTelefono.getText().equalsIgnoreCase("Ej : 3118122494")) {
            txtTelefono.setText("");
            txtTelefono.setForeground(Color.white);
        }
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if (txtTelefono.getText().equalsIgnoreCase("")) {
            txtTelefono.setText("Ej : 3118122494");
            txtTelefono.setForeground(new Color(10066329));
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (txtNumeroIdentificacion.getText().equalsIgnoreCase("Ej : 1110474610") || txtPrimerNombre.getText().equalsIgnoreCase("Ej : Jefferson") || txtPrimerApellido.getText().equalsIgnoreCase("Ej : Narvaez") || txtTelefono.getText().equalsIgnoreCase("Ej : 3118122494")) {
            JOptionPane.showMessageDialog(null, "Digite datos reales", "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int persona = 0;
            for (int i = 0; i < JTdatos.getRowCount(); i++) {
                if (String.valueOf(JTdatos.getValueAt(i, 0)).equalsIgnoreCase(txtNumeroIdentificacion.getText()) || String.valueOf(JTdatos.getValueAt(i, 3)).equalsIgnoreCase(txtTelefono.getText())) {
                    persona = 1;
                    break;
                }
            }
            if (persona == 0) {
                dato = new Persona(Long.parseLong(txtNumeroIdentificacion.getText()), txtPrimerNombre.getText(), txtPrimerApellido.getText(), Long.parseLong(txtTelefono.getText()));
                Object[] datos = new Object[4];
                datos[0] = dato.getNumeroIdentificacion();
                datos[1] = dato.getNombre();
                datos[2] = dato.getApellido();
                datos[3] = dato.getTelefono();
                modelo.addRow(datos);
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Ya se encuentra un usuario con los mismos datos", "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtNumeroIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroIdentificacionActionPerformed

    }//GEN-LAST:event_txtNumeroIdentificacionActionPerformed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnInsertar.doClick();
        }
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void JTdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTdatosMouseClicked
        int indice = JTdatos.rowAtPoint(evt.getPoint());
        txtNumeroIdentificacion.setText(String.valueOf(JTdatos.getValueAt(indice, 0)));
        txtPrimerNombre.setText(String.valueOf(JTdatos.getValueAt(indice, 1)));
        txtPrimerApellido.setText(String.valueOf(JTdatos.getValueAt(indice, 2)));
        txtTelefono.setText(String.valueOf(JTdatos.getValueAt(indice, 3)));
        txtNumeroIdentificacion.setForeground(Color.white);
        txtPrimerNombre.setForeground(Color.white);
        txtPrimerApellido.setForeground(Color.white);
        txtTelefono.setForeground(Color.white);
    }//GEN-LAST:event_JTdatosMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de abandonar?", "Incognita", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtNumeroIdentificacion.getText().equalsIgnoreCase("Ej : 1110474610") || txtPrimerNombre.getText().equalsIgnoreCase("Ej : Jefferson") || txtPrimerApellido.getText().equalsIgnoreCase("Ej : Narvaez") || txtTelefono.getText().equalsIgnoreCase("Ej : 3118122494")) {
            JOptionPane.showMessageDialog(null, "Digite datos reales", "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int persona = 0, indice = 0, fila = 0;
            for (int i = 0; i < JTdatos.getRowCount(); i++) {
                if (String.valueOf(JTdatos.getValueAt(i, 0)).equalsIgnoreCase(txtNumeroIdentificacion.getText())) {
                    persona = 1;
                    fila = i;
                    break;
                }
            }
            if (persona == 1) {
                for (int i = 0; i < JTdatos.getRowCount(); i++) {
                    if (String.valueOf(JTdatos.getValueAt(i, 3)).equalsIgnoreCase(txtTelefono.getText())) {
                        indice = 1;
                        break;
                    }
                }
                if (indice == 0) {
                    dato = new Persona();
                    dato.setNombre(txtPrimerNombre.getText());
                    dato.setApellido(txtPrimerApellido.getText());
                    dato.setTelefono(Long.parseLong(txtTelefono.getText()));
                    JTdatos.setValueAt(dato.getNombre(), fila, 1);
                    JTdatos.setValueAt(dato.getApellido(), fila, 2);
                    JTdatos.setValueAt(dato.getTelefono(), fila, 3);
                } else {
                    JOptionPane.showMessageDialog(null, "El numero ya se encuentra en uso", "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya se encuentra un usuario con los mismos datos", "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        limpiarCajas();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtNumeroIdentificacion.getText().equalsIgnoreCase("Ej : 1110474610")) {
            JOptionPane.showMessageDialog(null, "Digite una referencia real", "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int persona = 0, indice = 0;
            for (int i = 0; i < JTdatos.getRowCount(); i++) {
                if (String.valueOf(JTdatos.getValueAt(i, 0)).equalsIgnoreCase(txtNumeroIdentificacion.getText())) {
                    persona = 1;
                    indice = i;
                    break;
                }
            }
            if (persona == 1) {
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar registro?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
                if (respuesta == 0) {
                    modelo.removeRow(indice);
                    JOptionPane.showMessageDialog(null, "Se elimino el registro correctamente", "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Se cancelo la accion", "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registro de la persona", "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        limpiarCajas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void CalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculadoraMouseClicked
        Calculadora ob = new Calculadora();
        ob.setVisible(true);
    }//GEN-LAST:event_CalculadoraMouseClicked

    private void mundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mundoMouseClicked
         if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI url = new java.net.URI("https://google.com");
                    desktop.browse(url);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error es: " + e, "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
                }
            }          
        }
    }//GEN-LAST:event_mundoMouseClicked

    private void contribucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contribucionMouseClicked
        JOptionPane.showMessageDialog(null,"Proximamente","???",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_contribucionMouseClicked

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
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Calculadora;
    private javax.swing.JTable JTdatos;
    private javax.swing.JPanel boton;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel contribucion;
    private javax.swing.JPanel datos;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel inicio_sesion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mundo;
    private javax.swing.JLabel numeroIdentificacion;
    private javax.swing.JLabel primerApellido;
    private javax.swing.JLabel primerNombre;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtNumeroIdentificacion;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    public void tabla() {
        JTdatos.setModel(modelo);
        modelo.addColumn("Num. identificacion");
        modelo.addColumn("Primer nombre");
        modelo.addColumn("Primer apellido");
        modelo.addColumn("Telefono");
    }

    public void limpiarCajas() {
        txtNumeroIdentificacion.setText("Ej : 1110474610");
        txtPrimerNombre.setText("Ej : Jefferson");
        txtPrimerApellido.setText("Ej : Narvaez");
        txtTelefono.setText("Ej : 3118122494");
        txtNumeroIdentificacion.setForeground(new Color(10066329));
        txtPrimerNombre.setForeground(new Color(10066329));
        txtPrimerApellido.setForeground(new Color(10066329));
        txtTelefono.setForeground(new Color(10066329));
    }
    
}
