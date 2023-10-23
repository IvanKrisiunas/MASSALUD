package Vistas;

import AccesoADatos.EspecialidadData;
import AccesoADatos.PrestadorData;
import Principal.Especialidad;
import Principal.Prestador;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Prestadores extends javax.swing.JInternalFrame {

    Especialidad e = new Especialidad();
    PrestadorData pd = new PrestadorData();
    EspecialidadData ed = new EspecialidadData();

    public Prestadores() {
        initComponents();
        JLtextoAdv.setText("Crear un nuevo prestador.");
        JBmp.setEnabled(false);
        JBap.setEnabled(true);
        cargarCombo();
        cargarComboE();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jSpinField1 = new com.toedter.components.JSpinField();
        JPescritorio = new javax.swing.JPanel();
        JBmp = new javax.swing.JButton();
        JBap = new javax.swing.JButton();
        JBayuda = new javax.swing.JButton();
        ID = new javax.swing.JPanel();
        JLnombre = new javax.swing.JLabel();
        JLapellido = new javax.swing.JLabel();
        JLdomicilio = new javax.swing.JLabel();
        JLtelefono = new javax.swing.JLabel();
        JLdni = new javax.swing.JLabel();
        JLtextoAdv = new javax.swing.JLabel();
        IDicon = new javax.swing.JLabel();
        textf = new javax.swing.JPanel();
        JCBespecialidad = new javax.swing.JComboBox<>();
        JTnombre = new javax.swing.JTextField();
        JTdni = new javax.swing.JTextField();
        JTdomicilio = new javax.swing.JTextField();
        JTel = new javax.swing.JTextField();
        JRBactivo = new javax.swing.JRadioButton();
        JTapellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ldni = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBlimpiar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        JCBp = new javax.swing.JComboBox<>();
        textop = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setMaximumSize(new java.awt.Dimension(1025, 739));
        setMinimumSize(new java.awt.Dimension(1025, 739));
        setPreferredSize(new java.awt.Dimension(1025, 739));
        setRequestFocusEnabled(false);

        JPescritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBmp.setBackground(new java.awt.Color(0, 153, 0));
        JBmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        JBmp.setToolTipText("Editar el afiliado actual.");
        JBmp.setMaximumSize(new java.awt.Dimension(110, 90));
        JBmp.setMinimumSize(new java.awt.Dimension(110, 90));
        JBmp.setPreferredSize(new java.awt.Dimension(110, 90));
        JBmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmpActionPerformed(evt);
            }
        });
        JPescritorio.add(JBmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 110, 90));

        JBap.setBackground(new java.awt.Color(0, 153, 0));
        JBap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prestadorMas.png"))); // NOI18N
        JBap.setToolTipText("Añadir un nuevo afiliado.");
        JBap.setMaximumSize(new java.awt.Dimension(110, 90));
        JBap.setMinimumSize(new java.awt.Dimension(110, 90));
        JBap.setPreferredSize(new java.awt.Dimension(110, 90));
        JBap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBapActionPerformed(evt);
            }
        });
        JPescritorio.add(JBap, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 110, 90));

        JBayuda.setBackground(new java.awt.Color(158, 158, 198));
        JBayuda.setForeground(new java.awt.Color(158, 158, 198));
        JBayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        JBayuda.setToolTipText("Ayuda.");
        JPescritorio.add(JBayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 100, 90));

        ID.setOpaque(false);

        JLnombre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        JLnombre.setText("Nombre");

        JLapellido.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        JLapellido.setText("Apellido");

        JLdomicilio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        JLdomicilio.setText("Domicilio");

        JLtelefono.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        JLtelefono.setText("Teléfono");

        JLdni.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLdni.setText("DNI");

        JLtextoAdv.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        JLtextoAdv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLtextoAdv.setText("Crear un nuevo prestador.");

        javax.swing.GroupLayout IDLayout = new javax.swing.GroupLayout(ID);
        ID.setLayout(IDLayout);
        IDLayout.setHorizontalGroup(
            IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDLayout.createSequentialGroup()
                .addComponent(JLtextoAdv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IDLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLapellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLdomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(IDLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(JLdni, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IDLayout.setVerticalGroup(
            IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLnombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLapellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLdomicilio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLtelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLdni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLtextoAdv)
                .addGap(12, 12, 12))
        );

        JPescritorio.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 470, 240));

        IDicon.setBackground(new java.awt.Color(0, 153, 0));
        IDicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/idGrande.png"))); // NOI18N
        JPescritorio.add(IDicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 490, 240));
        IDicon.getAccessibleContext().setAccessibleParent(JPescritorio);

        textf.setOpaque(false);

        JCBespecialidad.setForeground(new java.awt.Color(255, 255, 255));
        JCBespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBespecialidadActionPerformed(evt);
            }
        });

        JTnombre.setToolTipText("Nombre del afiliado.");

        JTdni.setToolTipText("DNI numérico y único del afiliado.");
        JTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTdniKeyReleased(evt);
            }
        });

        JTdomicilio.setToolTipText("Domicilio en nombre y numeración del afiliado.");

        JTel.setToolTipText("Teléfono completo del afiliado.");
        JTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTelKeyReleased(evt);
            }
        });

        JRBactivo.setBackground(new java.awt.Color(204, 255, 204));
        JRBactivo.setToolTipText("Estado de actividad del afiliado.");

        JTapellido.setToolTipText("Apellido del afialido.");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Nombre:");

        ldni.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ldni.setText("DNI:");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("Telefono:");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("Activo:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Domicilio:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Apellido:");

        JBlimpiar.setBackground(new java.awt.Color(0, 153, 0));
        JBlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarCampos.png"))); // NOI18N
        JBlimpiar.setToolTipText("Limpiar los campos.");
        JBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimpiarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setText("Esp.:");

        javax.swing.GroupLayout textfLayout = new javax.swing.GroupLayout(textf);
        textf.setLayout(textfLayout);
        textfLayout.setHorizontalGroup(
            textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textfLayout.createSequentialGroup()
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textfLayout.createSequentialGroup()
                        .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(ldni))
                        .addGap(23, 23, 23)
                        .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTdomicilio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTdni)))
                    .addGroup(textfLayout.createSequentialGroup()
                        .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(28, 28, 28)
                        .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(textfLayout.createSequentialGroup()
                                .addComponent(JRBactivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                                .addComponent(JBlimpiar)
                                .addGap(23, 23, 23))
                            .addComponent(JCBespecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTel)))
                    .addGroup(textfLayout.createSequentialGroup()
                        .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTapellido)
                            .addComponent(JTnombre))))
                .addContainerGap())
        );
        textfLayout.setVerticalGroup(
            textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textfLayout.createSequentialGroup()
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(JTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ldni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(28, 28, 28)
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(26, 26, 26)
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(JTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JRBactivo)
                        .addComponent(jLabel18))
                    .addComponent(JBlimpiar))
                .addContainerGap())
        );

        JPescritorio.add(textf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 460, 430));

        salir.setBackground(new java.awt.Color(255, 51, 51));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setToolTipText("Salir.");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        JPescritorio.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 20, 90, 90));

        JCBp.setBackground(new java.awt.Color(0, 153, 0));
        JCBp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JCBp.setToolTipText("Lista de afiliados por nombre y apellido mas el DNI.");
        JCBp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBpActionPerformed(evt);
            }
        });
        JPescritorio.add(JCBp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 370, 70));

        textop.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        textop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textop.setText("Prestadores");
        JPescritorio.add(textop, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 240, 70));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BG.png"))); // NOI18N
        JPescritorio.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmpActionPerformed
        // TODO add your handling code here:
        Prestador prestador = new Prestador(JTnombre.getText(), JTapellido.getText(),Integer.parseInt(JTdni.getText()),JRBactivo.isEnabled(),ed.especialidadPorId(e.getTipo()), Integer.parseInt(JTel.getText()), JTdomicilio.getText());
        pd.modificarPrestador(prestador);
        prestador = pd.listarPrestadorPorDNI(Integer.parseInt(JTdni.getText()));
        JLnombre.setText(prestador.getNombre());
        JLapellido.setText(prestador.getApellido());
        JLdni.setText(String.valueOf(prestador.getDNI()));
        JLdomicilio.setText(prestador.getDomicilio());
        JLtelefono.setText(String.valueOf(prestador.getTelefono()));
        JLtextoAdv.setText("Prestador editado con éxito.");
        JTnombre.setText(prestador.getNombre());
        JTdomicilio.setText(prestador.getDomicilio());
        JTapellido.setText(prestador.getApellido());
        JTel.setText(String.valueOf(prestador.getTelefono()));
        JRBactivo.setSelected(prestador.isEstado());
        JBmp.setEnabled(true);
    }//GEN-LAST:event_JBmpActionPerformed

    private void JBapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBapActionPerformed
        // TODO add your handling code here:
        try {
        Prestador prestador = new Prestador(JTnombre.getText(), JTapellido.getText(),Integer.parseInt(JTdni.getText()),JRBactivo.isEnabled(),ed.especialidadPorId(e.getTipo()), Integer.parseInt(JTel.getText()), JTdomicilio.getText());
        pd.añadirPrestador(prestador);
        cargarCombo();
        } catch (java.lang.NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "La información ingresada no es correcta.");
            }
    }//GEN-LAST:event_JBapActionPerformed

    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        // TODO add your handling code here:
        JTdni.setBackground(Color.white);
        if (JCBp.getSelectedIndex() == 0) {
            JTnombre.setText("");
            JTdni.setText("");
            JTdomicilio.setText("");
            JTapellido.setText("");
            JTel.setText("");
            JRBactivo.setSelected(false);
            JBmp.setEnabled(false);
            JBap.setEnabled(true);
        } else {
            JTnombre.setText("");
            JTdomicilio.setText("");
            JTapellido.setText("");
            JTel.setText("");
            JRBactivo.setSelected(false);
            JBmp.setEnabled(true);
            JBap.setEnabled(false);
        }
    }//GEN-LAST:event_JBlimpiarActionPerformed

    private void JTdniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTdniKeyReleased
        // TODO add your handling code here:
        if (JTdni.getText().isEmpty()) {
            JTdni.setBackground(Color.white);
        } else {
            try {
                Prestador prestador = pd.listarPrestadorPorDNI(Integer.parseInt(JTdni.getText()));
                if (prestador == null) {
                    JLtextoAdv.setText("Crear un nuevo prestador.");
                    JBmp.setEnabled(false);
                    JTdni.setBackground(Color.white);
                } else {
                    JTdni.setBackground(Color.red);
                }
            } catch (NullPointerException ex) {
                JLtextoAdv.setText("Crear un nuevo prestador.");
                JBmp.setEnabled(false);
                JTdni.setBackground(Color.white);

            } catch (NumberFormatException ez) {
                JTdni.setBackground(Color.red);
            }
        }

    }//GEN-LAST:event_JTdniKeyReleased

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void JCBpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBpActionPerformed
        // TODO add your handling code here:
        if (JCBp.getSelectedIndex() == 0 || JCBp.getItemAt(0) == null) {
            JLnombre.setText("Nombre");
            JLapellido.setText("Apellido");
            JLdni.setText("DNI");
            JLdomicilio.setText("Domicilio");
            JLtelefono.setText("Teléfono");
            JLtextoAdv.setText("Crear un nuevo prestador.");
            JBmp.setEnabled(false);
            JBap.setEnabled(true);
            JTdni.setEditable(true);
            JBlimpiarActionPerformed(evt);
        } else {
            Prestador prestador = (Prestador) JCBp.getSelectedItem();
            JLnombre.setText(prestador.getNombre());
            JLapellido.setText(prestador.getApellido());
            JLdni.setText(String.valueOf(prestador.getDNI()));
            JLdomicilio.setText(prestador.getDomicilio());
            JLtelefono.setText(String.valueOf(prestador.getTelefono()));
            JLtextoAdv.setText("Persona existente.");
            JTdni.setEditable(false);
            rellenarCampos();
        }
    }//GEN-LAST:event_JCBpActionPerformed

    private void JTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTelKeyReleased
        // TODO add your handling code here:
        if (JTel.getText().isEmpty()) {
            JTel.setBackground(Color.white);
        } else {
            try {
            } catch (NullPointerException ex) {
                JTel.setBackground(Color.white);
            } catch (NumberFormatException ez) {
                JTel.setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_JTelKeyReleased

    private void JCBespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBespecialidadActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_JCBespecialidadActionPerformed

    private void rellenarCampos() {
        Prestador prestador = pd.listarPrestadorPorDNI(Integer.parseInt(JLdni.getText()));
        JTnombre.setText(prestador.getNombre());
        JTapellido.setText(prestador.getApellido());
        JTdni.setText(String.valueOf(prestador.getDNI()));
        JTdomicilio.setText(prestador.getDomicilio());
        JTel.setText(String.valueOf(prestador.getTelefono()));
        JRBactivo.setSelected(prestador.isEstado());
        JBmp.setEnabled(true);
        JBap.setEnabled(false);
    }

    private void cargarCombo() {
        JCBp.removeAllItems();
        Prestador p = new Prestador();
        JCBp.addItem(p);
        JLtextoAdv.setText("Crear un nuevo prestador.");
        for (Prestador prestador : pd.listarPrestadores()) {
            JCBp.addItem(prestador);
        }
    }
    
    private void cargarComboE() {
        for (Especialidad especialidad : ed.listarEspecialidades()) {
            JCBespecialidad.addItem(especialidad);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ID;
    private javax.swing.JLabel IDicon;
    private javax.swing.JButton JBap;
    private javax.swing.JButton JBayuda;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JButton JBmp;
    private javax.swing.JComboBox<Especialidad> JCBespecialidad;
    private javax.swing.JComboBox<Prestador> JCBp;
    private javax.swing.JLabel JLapellido;
    private javax.swing.JLabel JLdni;
    private javax.swing.JLabel JLdomicilio;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLtelefono;
    private javax.swing.JLabel JLtextoAdv;
    private javax.swing.JPanel JPescritorio;
    private javax.swing.JRadioButton JRBactivo;
    private javax.swing.JTextField JTapellido;
    private javax.swing.JTextField JTdni;
    private javax.swing.JTextField JTdomicilio;
    private javax.swing.JTextField JTel;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JLabel ldni;
    private javax.swing.JButton salir;
    private javax.swing.JPanel textf;
    private javax.swing.JLabel textop;
    // End of variables declaration//GEN-END:variables
}
