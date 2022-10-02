/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cliente;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alber
 */
public class PanelCiudadanos extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    Vector v;

    public PanelCiudadanos() {
        initComponents();
        String[] titulos = {"CLAVE ELECTOR", "NOMBRE", "APELLIDO PARTERNO", "APELLIDO MATERNO", "DOMICILIO", "SECCION", "VIGENCIA"};
        modelo = new DefaultTableModel(null, titulos);
        tblCiudadanos.setModel(modelo);
        tblCiudadanos.getTableHeader().setReorderingAllowed(false);
        mostrarDatos();
    }

    public void mostrarDatos() {
        com.servidor.Conector_Service service = new com.servidor.Conector_Service();
        com.servidor.Conector port = service.getConectorPort();

        if (!port.mostrarDatos().isEmpty()) {
            String listaDatos = port.mostrarDatos();

            String[] datos = listaDatos.split("-");
            String cadenaTemporal = "";

            for (int i = 0; i < datos.length; i++) {
                cadenaTemporal += datos[i];
            }

            String[] datosArreglados = listaDatos.split("/");
            String temporal = "";

            String[] array = new String[datosArreglados.length];

            Object[] dt = new Object[7];

            for (int i = 0; i < datosArreglados.length; i++) {
                array[i] = datosArreglados[i];
            }

            for (int i = 0; i < array.length; i++) {
                String[] c;
                c = array[i].split("-");

                dt[0] = c[0];
                dt[1] = c[1];
                dt[2] = c[2];
                dt[3] = c[3];
                dt[4] = c[4];
                dt[5] = c[5];
                dt[6] = c[6];

                modelo.addRow(dt);
            }
        }

    }

    public void limpiarModel() {
        if (modelo.getRowCount() > 0) {
            for (int i = modelo.getRowCount() - 1; i > -1; i--) {
                modelo.removeRow(i);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtClaveElector = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtSeccion = new javax.swing.JTextField();
        txtCredencialVigencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCiudadanos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido Paterno:");

        jLabel3.setText("Apellido Materno:");

        jLabel4.setText("Clave Elector:");

        jLabel5.setText("Domicilio:");

        jLabel6.setText("Seccion");

        jLabel7.setText("Credencial vigencia:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });

        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });

        txtClaveElector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveElectorKeyTyped(evt);
            }
        });

        txtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDomicilioKeyTyped(evt);
            }
        });

        txtSeccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSeccionKeyTyped(evt);
            }
        });

        txtCredencialVigencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCredencialVigenciaKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Administrar Ciudadano");

        tblCiudadanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCiudadanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCiudadanosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblCiudadanos);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCredencialVigencia, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(txtDomicilio)
                    .addComponent(txtApellidoMaterno)
                    .addComponent(txtNombre))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtClaveElector, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCredencialVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(txtClaveElector, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar)
                            .addComponent(btnCancelar))
                        .addGap(23, 23, 23)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Character c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        Character c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        Character c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

    private void txtClaveElectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveElectorKeyTyped
        Character c = evt.getKeyChar();

        if (c != KeyEvent.VK_SPACE) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtClaveElectorKeyTyped

    private void txtDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDomicilioKeyTyped

    }//GEN-LAST:event_txtDomicilioKeyTyped

    private void txtCredencialVigenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCredencialVigenciaKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txtCredencialVigencia.getText().length() >= 4) {

            evt.consume();

        }
    }//GEN-LAST:event_txtCredencialVigenciaKeyTyped

    private void txtSeccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeccionKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txtSeccion.getText().length() >= 4) {

            evt.consume();

        }
    }//GEN-LAST:event_txtSeccionKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        com.servidor.Conector_Service service = new com.servidor.Conector_Service();
        com.servidor.Conector port = service.getConectorPort();
        if (!txtNombre.getText().isEmpty()
                || !txtApellidoPaterno.getText().isEmpty()
                || !txtApellidoMaterno.getText().isEmpty()
                || !txtClaveElector.getText().isEmpty()
                || !txtDomicilio.getText().isEmpty()
                || !txtSeccion.getText().isEmpty()
                || !txtCredencialVigencia.getText().isEmpty()) {

            if (!txtClaveElector.getText().equals(port.verificarCiudadano(txtClaveElector.getText()))) {
                port.insertarCiudadano(txtClaveElector.getText(),
                        txtNombre.getText(), txtApellidoPaterno.getText(),
                        txtApellidoMaterno.getText(), txtDomicilio.getText(),
                        txtSeccion.getText(), txtCredencialVigencia.getText());

                if (Integer.parseInt(txtCredencialVigencia.getText()) >= 2022) {
                    port.insertarVotante(txtClaveElector.getText());
                }

                txtNombre.setText("");
                txtApellidoPaterno.setText("");
                txtApellidoMaterno.setText("");
                txtClaveElector.setText("");
                txtDomicilio.setText("");
                txtSeccion.setText("");
                txtCredencialVigencia.setText("");
                JOptionPane.showConfirmDialog(null, "Se inserto un dato correctamente", "Aceptado", JOptionPane.DEFAULT_OPTION);

                limpiarModel();
                mostrarDatos();
            } else {
                JOptionPane.showMessageDialog(null, "Clave Elector Repetida");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Hay algun campo vacio");
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblCiudadanosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCiudadanosMousePressed

        if (evt.getButton() == MouseEvent.BUTTON1) {
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnAgregar.setEnabled(false);

            v = (Vector) modelo.getDataVector().elementAt(tblCiudadanos.getSelectedRow());
            txtClaveElector.setText(v.get(0).toString());
            txtNombre.setText(v.get(1).toString());
            txtApellidoPaterno.setText(v.get(2).toString());
            txtApellidoMaterno.setText(v.get(3).toString());
            txtDomicilio.setText(v.get(4).toString());
            txtSeccion.setText(v.get(5).toString());
            txtCredencialVigencia.setText(v.get(6).toString());
        }
    }//GEN-LAST:event_tblCiudadanosMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar?", "Alerta!", JOptionPane.YES_NO_OPTION);

        
        if (respuesta == 0) {
            com.servidor.Conector_Service service = new com.servidor.Conector_Service();
            com.servidor.Conector port = service.getConectorPort();

            port.eliminarCiudadno(v.get(0).toString());

            limpiarModel();
            mostrarDatos();

            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnAgregar.setEnabled(true);

            txtNombre.setText("");
            txtApellidoPaterno.setText("");
            txtApellidoMaterno.setText("");
            txtClaveElector.setText("");
            txtDomicilio.setText("");
            txtSeccion.setText("");
            txtCredencialVigencia.setText("");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        com.servidor.Conector_Service service = new com.servidor.Conector_Service();
        com.servidor.Conector port = service.getConectorPort();
        if (!txtNombre.getText().isEmpty()
                || !txtApellidoPaterno.getText().isEmpty()
                || !txtApellidoMaterno.getText().isEmpty()
                || !txtClaveElector.getText().isEmpty()
                || !txtDomicilio.getText().isEmpty()
                || !txtSeccion.getText().isEmpty()
                || !txtCredencialVigencia.getText().isEmpty()) {

            if (v.get(0).toString().equals(txtClaveElector.getText())) {

                port.actualizarCiudadano(v.get(0).toString(), txtClaveElector.getText(), txtNombre.getText(), txtApellidoPaterno.getText(),
                        txtApellidoMaterno.getText(), txtDomicilio.getText(),
                        txtSeccion.getText(), txtCredencialVigencia.getText());

                if (!v.get(6).toString().equals(txtCredencialVigencia.getText())) {
                    if (Integer.parseInt(txtCredencialVigencia.getText()) >= 2022) {
                        port.insertarVotante(txtClaveElector.getText());
                    } else {
                        port.eliminarVotante(v.get(0).toString());
                    }
                }

                txtNombre.setText("");
                txtApellidoPaterno.setText("");
                txtApellidoMaterno.setText("");
                txtClaveElector.setText("");
                txtDomicilio.setText("");
                txtSeccion.setText("");
                txtCredencialVigencia.setText("");
                JOptionPane.showConfirmDialog(null, "Se actualizo correctamente", "Actualizado", JOptionPane.DEFAULT_OPTION);

                btnActualizar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnAgregar.setEnabled(true);

                limpiarModel();
                mostrarDatos();
            } else {
                if (!txtClaveElector.getText().equals(port.verificarCiudadano(txtClaveElector.getText()))) {
                    port.actualizarCiudadano(v.get(0).toString(), txtClaveElector.getText(), txtNombre.getText(), txtApellidoPaterno.getText(),
                            txtApellidoMaterno.getText(), txtDomicilio.getText(),
                            txtSeccion.getText(), txtCredencialVigencia.getText());

                    txtNombre.setText("");
                    txtApellidoPaterno.setText("");
                    txtApellidoMaterno.setText("");
                    txtClaveElector.setText("");
                    txtDomicilio.setText("");
                    txtSeccion.setText("");
                    txtCredencialVigencia.setText("");
                    JOptionPane.showConfirmDialog(null, "Se actualizo correctamente", "Actualizado", JOptionPane.DEFAULT_OPTION);

                    btnActualizar.setEnabled(false);
                    btnEliminar.setEnabled(false);
                    btnCancelar.setEnabled(false);
                    btnAgregar.setEnabled(true);

                    limpiarModel();
                    mostrarDatos();
                } else {
                    JOptionPane.showMessageDialog(null, "La clave de elector ya existe");
                    txtClaveElector.setText(v.get(0).toString());
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Hay algun campo vacio");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        btnCancelar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnAgregar.setEnabled(true);

        txtNombre.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtClaveElector.setText("");
        txtDomicilio.setText("");
        txtSeccion.setText("");
        txtCredencialVigencia.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(PanelCiudadanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelCiudadanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelCiudadanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelCiudadanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelCiudadanos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCiudadanos;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtClaveElector;
    private javax.swing.JTextField txtCredencialVigencia;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSeccion;
    // End of variables declaration//GEN-END:variables

    private static void insertarCiudadano(java.lang.String nombreCiudadano, java.lang.String apellidoPaterno, java.lang.String apellidoMaterno, java.lang.String claveElectoral, java.lang.String domicilio, java.lang.String seccion, java.lang.String vigencia) {
        com.servidor.Conector_Service service = new com.servidor.Conector_Service();
        com.servidor.Conector port = service.getConectorPort();
        port.insertarCiudadano(nombreCiudadano, apellidoPaterno, apellidoMaterno, claveElectoral, domicilio, seccion, vigencia);
    }

    private static void insertarCiudadano_1(java.lang.String nombreCiudadano, java.lang.String apellidoPaterno, java.lang.String apellidoMaterno, java.lang.String claveElectoral, java.lang.String domicilio, java.lang.String seccion, java.lang.String vigencia) {
        com.servidor.Conector_Service service = new com.servidor.Conector_Service();
        com.servidor.Conector port = service.getConectorPort();
        port.insertarCiudadano(nombreCiudadano, apellidoPaterno, apellidoMaterno, claveElectoral, domicilio, seccion, vigencia);
    }
}
