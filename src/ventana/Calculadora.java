/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Jefferson Naravaez
 */
public class Calculadora extends javax.swing.JFrame implements KeyListener {

    /**
     * Creates new form Calculadora
     * @return 
     */
    
    
    public Image ImagenVentana() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagen/calculadora.png"));
        return retValue;
    }

    public Calculadora() {
        initComponents();
        this.setFocusable(true);
        addKeyListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        operacion = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        Boton = new javax.swing.JPanel();
        btnDivi = new javax.swing.JButton();
        btnExpo = new javax.swing.JButton();
        btnCe = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnNocturno = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JButton();
        marcaAgua = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora");
        setIconImage(ImagenVentana());
        setPreferredSize(new java.awt.Dimension(437, 555));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        operacion.setBackground(new java.awt.Color(102, 102, 102));
        operacion.setFocusable(false);

        txtOperacion.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(0, 204, 0));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtOperacion.setText("1+1");
        txtOperacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOperacion.setFocusable(false);

        txtResultado.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(0, 204, 0));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtResultado.setText("2");
        txtResultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtResultado.setFocusable(false);

        javax.swing.GroupLayout operacionLayout = new javax.swing.GroupLayout(operacion);
        operacion.setLayout(operacionLayout);
        operacionLayout.setHorizontalGroup(
            operacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, operacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(operacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                .addContainerGap())
        );
        operacionLayout.setVerticalGroup(
            operacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 130));

        Boton.setBackground(new java.awt.Color(102, 102, 102));
        Boton.setFocusable(false);
        Boton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotonKeyPressed(evt);
            }
        });
        Boton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDivi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDivi.setText("/");
        btnDivi.setFocusable(false);
        btnDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiviActionPerformed(evt);
            }
        });
        Boton.add(btnDivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 50, 40));

        btnExpo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExpo.setText("^");
        btnExpo.setFocusable(false);
        btnExpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpoActionPerformed(evt);
            }
        });
        Boton.add(btnExpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 50, 40));

        btnCe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCe.setText("CE");
        btnCe.setFocusable(false);
        btnCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeActionPerformed(evt);
            }
        });
        Boton.add(btnCe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 50, 40));

        btnC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnC.setText("C");
        btnC.setFocusable(false);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        Boton.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 40));

        btnMulti.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMulti.setText("*");
        btnMulti.setFocusable(false);
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        Boton.add(btnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 40));

        btnNueve.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNueve.setText("9");
        btnNueve.setFocusable(false);
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        Boton.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 40));

        btnOcho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOcho.setText("8");
        btnOcho.setFocusable(false);
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        Boton.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 40));

        btnSiete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSiete.setText("7");
        btnSiete.setFocusable(false);
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        Boton.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 40));

        btnSuma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSuma.setText("+");
        btnSuma.setFocusable(false);
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        Boton.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 50, 40));

        btnSeis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSeis.setText("6");
        btnSeis.setFocusable(false);
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        Boton.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 50, 40));

        btnCinco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCinco.setText("5");
        btnCinco.setFocusable(false);
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        Boton.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 50, 40));

        btnCuatro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.setFocusable(false);
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        Boton.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 40));

        btnMenos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMenos.setText("-");
        btnMenos.setFocusable(false);
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        Boton.add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 50, 40));

        btnTres.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTres.setText("3");
        btnTres.setFocusable(false);
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        Boton.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 50, 40));

        btnDos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDos.setText("2");
        btnDos.setFocusable(false);
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        Boton.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 50, 40));

        btnUno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUno.setText("1");
        btnUno.setFocusable(false);
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        Boton.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 50, 40));

        btnIgual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setFocusable(false);
        btnIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIgualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIgualMouseExited(evt);
            }
        });
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        Boton.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 50, 40));

        btnPunto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPunto.setText(".");
        btnPunto.setFocusable(false);
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        Boton.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 50, 40));

        btnCero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCero.setText("0");
        btnCero.setFocusable(false);
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        Boton.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, 40));

        btnNocturno.setBackground(new java.awt.Color(255, 51, 51));
        btnNocturno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNocturno.setText("Nocturno");
        btnNocturno.setToolTipText("Activar modo nocturno");
        btnNocturno.setBorderPainted(false);
        btnNocturno.setFocusable(false);
        btnNocturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNocturnoActionPerformed(evt);
            }
        });
        Boton.add(btnNocturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 90, 50));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        Boton.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 90, 50));

        marcaAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/calculadora.png"))); // NOI18N
        marcaAgua.setFocusable(false);
        marcaAgua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                marcaAguaMousePressed(evt);
            }
        });
        Boton.add(marcaAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 60, 60));

        getContentPane().add(Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 430, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        agregarDato("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        agregarDato("0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        int secuencia = 0;
        for (int i = 0; i < txtOperacion.getText().length();i++) {
            if (txtOperacion.getText().charAt(i)=='.'){
                secuencia++;
            }
        }
        if (secuencia!=2){
            agregarDato(".");
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        String operacion = null;
        int numeroFin = 0;
        for (int i = 0; i < txtOperacion.getText().length(); i++) {
            if (txtOperacion.getText().charAt(i) == '+') {
                operacion = "suma";
                numeroFin = i;
                break;
            }
            if (txtOperacion.getText().charAt(i) == '-') {
                operacion = "resTa";
                numeroFin = i;
                break;
            }
            if (txtOperacion.getText().charAt(i) == '*') {
                operacion = "multiplicacion";
                numeroFin = i;
                break;
            }
            if (txtOperacion.getText().charAt(i) == '/') {
                operacion = "division";
                numeroFin = i;
                break;
            }
        }
        double num1 = Double.parseDouble(txtOperacion.getText().substring(0, numeroFin));
        double num2 = Double.parseDouble(txtOperacion.getText().substring(numeroFin + 1, txtOperacion.getText().length()));
        operacion = operacion.toLowerCase();
        double resultado = 0;

        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                break;
            case "division":
                resultado = num1 / num2;
                break;
        }
        txtResultado.setText(Double.toString(resultado));
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        agregarDato("1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        agregarDato("2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        agregarDato("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if (txtResultado.getText().isEmpty() == false) {
            txtOperacion.setText(txtResultado.getText() + "-");
            txtResultado.setText("");
        } else if (txtOperacion.getText().contains("+") || txtOperacion.getText().contains("-") || txtOperacion.getText().contains("*") || txtOperacion.getText().contains("/")) {
            //
        } else {
            agregarDato("-");
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        agregarDato("4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        agregarDato("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        if (txtResultado.getText().isEmpty() == false) {
            txtOperacion.setText(txtResultado.getText() + "+");
            txtResultado.setText("");
        } else if (txtOperacion.getText().contains("+") || txtOperacion.getText().contains("-") || txtOperacion.getText().contains("*") || txtOperacion.getText().contains("/")) {
            //
        } else {
            agregarDato("+");
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        agregarDato("7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        agregarDato("8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        agregarDato("9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        if (txtResultado.getText().isEmpty() == false) {
            txtOperacion.setText(txtResultado.getText() + "*");
            txtResultado.setText("");
        } else if (txtOperacion.getText().contains("+") || txtOperacion.getText().contains("-") || txtOperacion.getText().contains("*") || txtOperacion.getText().contains("/")) {
            //
        } else {
            agregarDato("*");
        }
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeActionPerformed
        txtOperacion.setText(txtOperacion.getText().substring(0, txtOperacion.getText().length() - 1));
    }//GEN-LAST:event_btnCeActionPerformed

    private void btnExpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpoActionPerformed
        if (txtResultado.getText().isEmpty() == false) {
            txtOperacion.setText(txtResultado.getText() + "*" + txtResultado.getText());
            txtResultado.setText("");
        } else if (txtOperacion.getText().contains("+") || txtOperacion.getText().contains("-") || txtOperacion.getText().contains("*") || txtOperacion.getText().contains("/")) {
            //
        } else if (txtOperacion.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Inserte un numero");
        } else {
            txtOperacion.setText(txtOperacion.getText() + "*" + txtOperacion.getText());
        }
    }//GEN-LAST:event_btnExpoActionPerformed

    private void btnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiviActionPerformed
        if (txtResultado.getText().isEmpty() == false) {
            txtOperacion.setText(txtResultado.getText() + "/");
            txtResultado.setText("");
        } else if (txtOperacion.getText().contains("+") || txtOperacion.getText().contains("-") || txtOperacion.getText().contains("*") || txtOperacion.getText().contains("/")) {
            //
        } else {
            agregarDato("/");
        }
    }//GEN-LAST:event_btnDiviActionPerformed

    private void btnNocturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNocturnoActionPerformed
        if (btnNocturno.isSelected()) {
            btnNocturno.setBackground(Color.green);
            btnNocturno.setToolTipText("Desactivar modo nocturno");
        } else {
            btnNocturno.setBackground(Color.red);
            btnNocturno.setToolTipText("Activar modo nocturno");
        }
    }//GEN-LAST:event_btnNocturnoActionPerformed

    private void BotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonKeyPressed

    }//GEN-LAST:event_BotonKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        CRUD ob = new CRUD();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void marcaAguaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcaAguaMousePressed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/iconInformativo.png"));
        JOptionPane.showMessageDialog(null, "Autor Dimitry Miroliubov", "Autor", JOptionPane.PLAIN_MESSAGE, icono);
    }//GEN-LAST:event_marcaAguaMousePressed

    private void btnIgualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIgualMouseEntered
        btnIgual.setBackground(new Color(85, 246, 56));
    }//GEN-LAST:event_btnIgualMouseEntered

    private void btnIgualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIgualMouseExited
        btnIgual.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_btnIgualMouseExited

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Boton;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCe;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivi;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnExpo;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMulti;
    private javax.swing.JToggleButton btnNocturno;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel marcaAgua;
    private javax.swing.JPanel operacion;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables

    public void agregarDato(String dato) {
        txtOperacion.setText(txtOperacion.getText() + dato);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getExtendedKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                btnC.doClick();
                break;
            case KeyEvent.VK_BACK_SPACE:
                btnCe.doClick();
                break;
            case KeyEvent.VK_0:
            case KeyEvent.VK_NUMPAD0:
                btnCero.doClick();
                break;
            case KeyEvent.VK_1:
            case KeyEvent.VK_NUMPAD1:
                btnUno.doClick();
                break;
            case KeyEvent.VK_2:
            case KeyEvent.VK_NUMPAD2:
                btnDos.doClick();
                break;
            case KeyEvent.VK_3:
            case KeyEvent.VK_NUMPAD3:
                btnTres.doClick();
                break;
            case KeyEvent.VK_4:
            case KeyEvent.VK_NUMPAD4:
                btnCuatro.doClick();
                break;
            case KeyEvent.VK_5:
            case KeyEvent.VK_NUMPAD5:
                btnCinco.doClick();
                break;
            case KeyEvent.VK_6:
            case KeyEvent.VK_NUMPAD6:
                btnSeis.doClick();
                break;
            case KeyEvent.VK_7:
            case KeyEvent.VK_NUMPAD7:
                btnSiete.doClick();
                break;
            case KeyEvent.VK_8:
            case KeyEvent.VK_NUMPAD8:
                btnOcho.doClick();
                break;
            case KeyEvent.VK_9:
            case KeyEvent.VK_NUMPAD9:
                btnNueve.doClick();
                break;
            case KeyEvent.VK_ENTER:
                btnIgual.doClick();
                break;
            case KeyEvent.VK_ADD:
                btnSuma.doClick();
                break;
            case KeyEvent.VK_SUBTRACT:
                btnMenos.doClick();
                break;
            case KeyEvent.VK_DIVIDE:
                btnDivi.doClick();
                break;
            case KeyEvent.VK_MULTIPLY:
                btnMulti.doClick();
                break;
            case KeyEvent.VK_DEAD_ACUTE:
                btnExpo.doClick();
                break;
            case KeyEvent.VK_DECIMAL:
                btnPunto.doClick();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
