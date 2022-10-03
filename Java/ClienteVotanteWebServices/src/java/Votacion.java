
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Votacion extends javax.swing.JFrame {

    Tabla modelo;
    Thread thread;
    Vector v;
    int contadorDatos = 0;

    public Votacion() {
        initComponents();
        txtMensaje.setVisible(false);
        panelVotantes.setVisible(false);
        panelCandidatos.setVisible(false);

        String[] titulos = {"Candidatos", "ClaveElector"};
        modelo = new Tabla(null, titulos);
        tblCandidatos.setModel(modelo);
        tblCandidatos.removeColumn(tblCandidatos.getColumnModel().getColumn(1));
        tblCandidatos.getTableHeader().setReorderingAllowed(false);
        mostrarDatos();
        refresco();
    }

    public void refresco() {
        thread = new Thread() {
            public void run() {
                com.servidor.Conector_Service service = new com.servidor.Conector_Service();
                com.servidor.Conector port = service.getConectorPort();
                while (true) {
                    try {
                        Thread.sleep(3000);

                        if (Integer.parseInt(port.contarCandidatos()) > contadorDatos) {

                            limpiarModel();
                            mostrarDatos();
                            System.out.println("Lista Actualizada");
                        }

                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }

    public void mostrarDatos() {
        contadorDatos = 0;
        com.servidor.Conector_Service service = new com.servidor.Conector_Service();
        com.servidor.Conector port = service.getConectorPort();

        if (Integer.parseInt(port.contarCandidatos()) != 0) {
            String listaDatos = port.mostrarCandidatosParaVotantes();

            String[] datos = listaDatos.split("-");
            String cadenaTemporal = "";

            for (int i = 0; i < datos.length; i++) {
                cadenaTemporal += datos[i];
            }

            String[] datosArreglados = listaDatos.split("/");
            String temporal = "";

            String[] array = new String[datosArreglados.length];

            Object[] dt = new Object[2];

            for (int i = 0; i < datosArreglados.length; i++) {
                array[i] = datosArreglados[i];
            }

            for (int i = 0; i < array.length; i++) {
                String[] c;
                c = array[i].split("-");

                dt[0] = c[1] + " " + c[2] + " " + c[3];
                dt[1] = c[0];
                modelo.addRow(dt);
                contadorDatos++;
            }
        }

    }

    public void limpiarModel() {
        try {

            if (modelo.getRowCount() > 0) {
                for (int i = modelo.getRowCount() - 1; i > -1; i--) {
                    modelo.removeRow(i);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtClaveElector = new javax.swing.JTextField();
        txtMensaje = new javax.swing.JLabel();
        panelVotantes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSeccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCredencial = new javax.swing.JTextField();
        panelCandidatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCandidatos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtCandidatoSeleccionado = new javax.swing.JTextField();
        btnVotar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Clave Elector:");

        txtClaveElector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveElectorKeyTyped(evt);
            }
        });

        txtMensaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtMensaje.setText("Ya Votaste");

        jLabel3.setText("Nombre:");

        txtNombre.setEditable(false);

        jLabel4.setText("Apellido Paterno:");

        txtApellidoPaterno.setEditable(false);

        jLabel5.setText("Apellido Materno:");

        txtApellidoMaterno.setEditable(false);

        jLabel6.setText("Seccion:");

        txtSeccion.setEditable(false);

        jLabel2.setText("Credencial Vencimiento:");

        txtCredencial.setEditable(false);

        javax.swing.GroupLayout panelVotantesLayout = new javax.swing.GroupLayout(panelVotantes);
        panelVotantes.setLayout(panelVotantesLayout);
        panelVotantesLayout.setHorizontalGroup(
            panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVotantesLayout.createSequentialGroup()
                .addGroup(panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVotantesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))))
                    .addGroup(panelVotantesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtApellidoPaterno)
                    .addComponent(txtApellidoMaterno)
                    .addComponent(txtSeccion)
                    .addComponent(txtCredencial, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelVotantesLayout.setVerticalGroup(
            panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVotantesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelVotantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCredencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tblCandidatos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCandidatosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblCandidatos);

        jLabel7.setText("Votartas por:");

        txtCandidatoSeleccionado.setEditable(false);

        btnVotar.setText("Confirmar");
        btnVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Candidatos");

        javax.swing.GroupLayout panelCandidatosLayout = new javax.swing.GroupLayout(panelCandidatos);
        panelCandidatos.setLayout(panelCandidatosLayout);
        panelCandidatosLayout.setHorizontalGroup(
            panelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCandidatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCandidatosLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCandidatoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(panelCandidatosLayout.createSequentialGroup()
                .addGroup(panelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCandidatosLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel8))
                    .addGroup(panelCandidatosLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnVotar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCandidatosLayout.setVerticalGroup(
            panelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCandidatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCandidatoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnVotar)
                .addContainerGap())
        );

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClaveElector, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelVotantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(txtMensaje)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClaveElector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(35, 35, 35)
                .addComponent(txtMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelVotantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        com.servidor.Conector_Service service = new com.servidor.Conector_Service();
        com.servidor.Conector port = service.getConectorPort();

        if (txtClaveElector.getText().equals(port.verificarCiudadano(txtClaveElector.getText()))) {

            String cadena = port.mostrarDatosCiudadanoEspecifico(txtClaveElector.getText());

            String[] arrayCadena = cadena.split("-");

            txtNombre.setText(arrayCadena[1]);
            txtApellidoPaterno.setText(arrayCadena[2]);
            txtApellidoMaterno.setText(arrayCadena[3]);
            txtSeccion.setText(arrayCadena[5]);
            txtCredencial.setText(arrayCadena[6]);
            panelVotantes.setVisible(true);
            txtMensaje.setVisible(false);
            String vigencia = port.verificarVotante(txtClaveElector.getText());

            if (Integer.parseInt(vigencia) >= 2022) {
                if (port.verificarVoto(txtClaveElector.getText())) {
                    if (thread != null) {
                        thread.stop();
                    }

                    panelCandidatos.setVisible(false);
                    txtMensaje.setVisible(true);
                    txtMensaje.setText("Ya votaste");

                } else {
                    panelCandidatos.setVisible(true);
                }

            } else {
                if (thread != null) {
                    thread.stop();
                }
                panelCandidatos.setVisible(false);
                txtMensaje.setVisible(true);
                txtMensaje.setText("Tu credencial esta vencidad");
            }

        } else {
            System.out.println("no esta el ciudadano");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtClaveElectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveElectorKeyTyped
        if (txtClaveElector.getText().length() >= 18) {

            evt.consume();

        }
    }//GEN-LAST:event_txtClaveElectorKeyTyped

    private void tblCandidatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCandidatosMousePressed

        if (evt.getButton() == MouseEvent.BUTTON1) {
            v = (Vector) modelo.getDataVector().elementAt(tblCandidatos.getSelectedRow());
            txtCandidatoSeleccionado.setText(v.get(0).toString());
            System.out.println(v.get(1));
            btnVotar.setEnabled(true);
        }


    }//GEN-LAST:event_tblCandidatosMousePressed

    private void btnVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotarActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(null, "Estas seguro de votar por el", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
            try {
                
                //WebServices Elecciones
                com.servidor.Conector_Service service = new com.servidor.Conector_Service();
                com.servidor.Conector port = service.getConectorPort();

                //Web Services Gratuito
                org.tempuri.Calculator serviceWebGratuito = new org.tempuri.Calculator();
                org.tempuri.CalculatorSoap portGratuito = serviceWebGratuito.getCalculatorSoap();

                if (v.get(1).toString().equals(port.verificarCandidatoSiEsta(v.get(1).toString()))) {
                    //Aqui si el candidato esta
                    int votosTotales = Integer.parseInt(port.obtenerVotosTotalesCandidato(v.get(1).toString()));
                    
                    //Aqui se hace el llamado para ocupar el web services gratuito
                    votosTotales = portGratuito.add(votosTotales, 1);
                    String idCandidato = port.obtenerIdCandidato(v.get(1).toString());
                    port.actualizarUrna(idCandidato, String.valueOf(votosTotales));

                } else {
                    //si el candidato no esta
                    String idCandidato = port.obtenerIdCandidato(v.get(1).toString());
                    port.insertarUrna(idCandidato, "1");
                }

                port.actualizarVotante("true", txtClaveElector.getText());

                panelCandidatos.setVisible(false);
                txtMensaje.setVisible(true);
                txtMensaje.setText("Ya votaste");
                if (thread != null) {
                    thread.stop();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_btnVotarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Votacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVotar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCandidatos;
    private javax.swing.JPanel panelVotantes;
    private javax.swing.JTable tblCandidatos;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCandidatoSeleccionado;
    private javax.swing.JTextField txtClaveElector;
    private javax.swing.JTextField txtCredencial;
    private javax.swing.JLabel txtMensaje;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSeccion;
    // End of variables declaration//GEN-END:variables

}
