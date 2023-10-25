package Vistas;

import AccesoADatos.AfiliadoData;
import Principal.Afiliado;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Afiliados extends javax.swing.JInternalFrame {

    AfiliadoData ad = new AfiliadoData();

    public Afiliados() {
        initComponents();
        Jltx.setText("Crear un nuevo afiliado.");
        JBma.setEnabled(false);
        JBaa.setEnabled(true);
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        JPescritorio = new javax.swing.JPanel();
        jcbbs = new javax.swing.JComboBox<>();
        btnbs = new javax.swing.JButton();
        ctbs = new javax.swing.JTextField();
        JBma = new javax.swing.JButton();
        JBaa = new javax.swing.JButton();
        JBayuda = new javax.swing.JButton();
        ID = new javax.swing.JPanel();
        JLnombre = new javax.swing.JLabel();
        JLapellido = new javax.swing.JLabel();
        JLdomicilio = new javax.swing.JLabel();
        JLtelefono = new javax.swing.JLabel();
        JLdni = new javax.swing.JLabel();
        Jltx = new javax.swing.JLabel();
        IDicon = new javax.swing.JLabel();
        textf = new javax.swing.JPanel();
        JTnombre = new javax.swing.JTextField();
        JTdni = new javax.swing.JTextField();
        JTdomicilio = new javax.swing.JTextField();
        JTel = new javax.swing.JTextField();
        JRBactivo = new javax.swing.JRadioButton();
        JTapellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBlimpiar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        JCBa = new javax.swing.JComboBox<>();
        textop = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setMaximumSize(new java.awt.Dimension(1025, 739));
        setMinimumSize(new java.awt.Dimension(1025, 739));
        setPreferredSize(new java.awt.Dimension(1025, 739));
        setRequestFocusEnabled(false);

        JPescritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbbs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre y apellido", "DNI" }));
        JPescritorio.add(jcbbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        btnbs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        btnbs.setToolTipText("Búsqueda de personas.");
        btnbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbsActionPerformed(evt);
            }
        });
        JPescritorio.add(btnbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        ctbs.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JPescritorio.add(ctbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 210, -1));

        JBma.setBackground(new java.awt.Color(0, 153, 0));
        JBma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        JBma.setToolTipText("Editar el afiliado actual.");
        JBma.setMaximumSize(new java.awt.Dimension(110, 90));
        JBma.setMinimumSize(new java.awt.Dimension(110, 90));
        JBma.setPreferredSize(new java.awt.Dimension(110, 90));
        JBma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmaActionPerformed(evt);
            }
        });
        JPescritorio.add(JBma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 110, 90));

        JBaa.setBackground(new java.awt.Color(0, 153, 0));
        JBaa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/afiliadoMas.png"))); // NOI18N
        JBaa.setToolTipText("Añadir un nuevo afiliado.");
        JBaa.setMaximumSize(new java.awt.Dimension(110, 90));
        JBaa.setMinimumSize(new java.awt.Dimension(110, 90));
        JBaa.setPreferredSize(new java.awt.Dimension(110, 90));
        JBaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBaaActionPerformed(evt);
            }
        });
        JPescritorio.add(JBaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 110, 90));

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

        Jltx.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        Jltx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jltx.setText("Crear un nuevo afiliado.");

        javax.swing.GroupLayout IDLayout = new javax.swing.GroupLayout(ID);
        ID.setLayout(IDLayout);
        IDLayout.setHorizontalGroup(
            IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDLayout.createSequentialGroup()
                .addComponent(Jltx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(Jltx)
                .addGap(12, 12, 12))
        );

        JPescritorio.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 470, 240));

        IDicon.setBackground(new java.awt.Color(0, 153, 0));
        IDicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/idGrande.png"))); // NOI18N
        JPescritorio.add(IDicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 490, 240));
        IDicon.getAccessibleContext().setAccessibleParent(JPescritorio);

        textf.setOpaque(false);

        JTnombre.setToolTipText("Nombre del afiliado.");
        JTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTnombreKeyReleased(evt);
            }
        });

        JTdni.setToolTipText("DNI numérico y único del afiliado.");
        JTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTdniKeyReleased(evt);
            }
        });

        JTdomicilio.setToolTipText("Domicilio en nombre y numeración del afiliado.");
        JTdomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTdomicilioKeyReleased(evt);
            }
        });

        JTel.setToolTipText("Teléfono completo del afiliado.");
        JTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTelKeyReleased(evt);
            }
        });

        JRBactivo.setBackground(new java.awt.Color(204, 255, 204));
        JRBactivo.setToolTipText("Estado de actividad del afiliado.");

        JTapellido.setToolTipText("Apellido del afialido.");
        JTapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTapellidoKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Nombre:");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("DNI:");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("Teléfono:");

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

        javax.swing.GroupLayout textfLayout = new javax.swing.GroupLayout(textf);
        textf.setLayout(textfLayout);
        textfLayout.setHorizontalGroup(
            textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textfLayout.createSequentialGroup()
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addGap(24, 24, 24)
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textfLayout.createSequentialGroup()
                        .addComponent(JRBactivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addComponent(JBlimpiar)
                        .addGap(29, 29, 29))
                    .addGroup(textfLayout.createSequentialGroup()
                        .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTdni)
                            .addComponent(JTdomicilio))
                        .addContainerGap())))
            .addGroup(textfLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(28, 28, 28)
                .addComponent(JTel)
                .addContainerGap())
            .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(textfLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(textfLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(35, 35, 35)
                            .addComponent(JTnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                        .addGroup(textfLayout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(textfLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(33, 33, 33)
                            .addComponent(JTapellido)))
                    .addContainerGap()))
        );
        textfLayout.setVerticalGroup(
            textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textfLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(JTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBlimpiar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textfLayout.createSequentialGroup()
                        .addComponent(JRBactivo)
                        .addGap(12, 12, 12)))
                .addContainerGap())
            .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(textfLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(JTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(textfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(JTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(216, 216, 216)
                    .addComponent(jLabel18)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );

        JPescritorio.add(textf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 460, 350));

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

        JCBa.setBackground(new java.awt.Color(0, 153, 0));
        JCBa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JCBa.setToolTipText("Lista de afiliados por nombre y apellido mas el DNI.");
        JCBa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBaActionPerformed(evt);
            }
        });
        JPescritorio.add(JCBa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 370, 70));

        textop.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        textop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textop.setText("Afiliados");
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

    private void JBmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmaActionPerformed
        // TODO add your handling code here:
        Afiliado afiliado = new Afiliado(JTnombre.getText(), JTapellido.getText(), Integer.parseInt(JTdni.getText()), JRBactivo.isEnabled(), JTdomicilio.getText(), Integer.parseInt(JTel.getText()));
        ad.modificarAfiliado(afiliado);
        afiliado = ad.listarAfiliadoPorDNI(Integer.parseInt(JTdni.getText()));
        JLnombre.setText(afiliado.getNombre());
        JLapellido.setText(afiliado.getApellido());
        JLdni.setText(String.valueOf(afiliado.getDNI()));
        JLdomicilio.setText(afiliado.getDomicilio());
        JLtelefono.setText(String.valueOf(afiliado.getTelefono()));
        Jltx.setText("Afiliado editado con éxito.");
        JTnombre.setText(afiliado.getNombre());
        JTdomicilio.setText(afiliado.getDomicilio());
        JTapellido.setText(afiliado.getApellido());
        JTel.setText(String.valueOf(afiliado.getTelefono()));
        JRBactivo.setSelected(afiliado.isEstado());
        JBma.setEnabled(true);
        cargarCombo();
        JCBa.getModel().setSelectedItem(afiliado);
        Jltx.setText("Acción realizada con éxito.");
    }//GEN-LAST:event_JBmaActionPerformed

    private void JBaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBaaActionPerformed
        // TODO add your handling code here:
        try {
            Afiliado afiliado = new Afiliado(JTnombre.getText(), JTapellido.getText(), Integer.parseInt(JTdni.getText()), JRBactivo.isEnabled(), JTdomicilio.getText(), Integer.parseInt(JTel.getText()));
            ad.añadirAfiliado(afiliado);
            cargarCombo();
            Jltx.setText("Acción realizada con éxito.");
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La información ingresada no es correcta.");
        }
    }//GEN-LAST:event_JBaaActionPerformed

    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        // TODO add your handling code here:
        JTdni.setBackground(Color.white);
        JTel.setBackground(Color.white);
        if (JCBa.getSelectedIndex() == 0) {
            JTnombre.setText("");
            JTdni.setText("");
            JTdomicilio.setText("");
            JTapellido.setText("");
            JTel.setText("");
            JRBactivo.setSelected(false);
            JBma.setEnabled(false);
            JBaa.setEnabled(true);
        } else {
            JTnombre.setText("");
            JTdomicilio.setText("");
            JTapellido.setText("");
            JTel.setText("");
            JRBactivo.setSelected(false);
            JBma.setEnabled(true);
            JBaa.setEnabled(false);
        }
    }//GEN-LAST:event_JBlimpiarActionPerformed

    private void JTdniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTdniKeyReleased
        // TODO add your handling code here:
        if (JTdni.getText().isEmpty()) {
            JTdni.setBackground(Color.white);
        } else {
            try {
                Afiliado afiliado = ad.listarAfiliadoPorDNI(Integer.parseInt(JTdni.getText()));
                if (afiliado == null) {
                    Jltx.setText("Crear un nuevo afiliado.");
                    JBma.setEnabled(false);
                    JTdni.setBackground(Color.white);
                } else {
                    JTdni.setBackground(Color.red);
                }
            } catch (NullPointerException ex) {
                Jltx.setText("Crear un nuevo afiliado.");
                JBma.setEnabled(false);
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

    private void JCBaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBaActionPerformed
        // TODO add your handling code here:
        if (JCBa.getSelectedIndex() == 0 || JCBa.getItemAt(0) == null) {
            JLnombre.setText("Nombre");
            JLapellido.setText("Apellido");
            JLdni.setText("DNI");
            JLdomicilio.setText("Domicilio");
            JLtelefono.setText("Teléfono");
            Jltx.setText("Crear un nuevo afiliado.");
            JBma.setEnabled(false);
            JBaa.setEnabled(true);
            JTdni.setEditable(true);
            JBlimpiarActionPerformed(evt);
        } else {
            Afiliado afiliado = (Afiliado) JCBa.getSelectedItem();
            JLnombre.setText(afiliado.getNombre());
            JLapellido.setText(afiliado.getApellido());
            JLdni.setText(String.valueOf(afiliado.getDNI()));
            JLdomicilio.setText(afiliado.getDomicilio());
            JLtelefono.setText(String.valueOf(afiliado.getTelefono()));
            Jltx.setText("Persona existente.");
            JTdni.setEditable(false);
            rellenarCampos();
        }
    }//GEN-LAST:event_JCBaActionPerformed

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

    private void btnbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbsActionPerformed
        // TODO add your handling code here:
        try {
            if (jcbbs.getSelectedIndex() == 0) {
                String bs = ctbs.getText();
                String[] partes = bs.split(" ");
                String nombre = partes[0];
                String apellido = partes[1];
                Afiliado a = ad.listarAfiliadoPorNombreApellido(nombre, apellido);
                System.out.println(a);
                JCBa.getModel().setSelectedItem(a);
                ctbs.setText("");
                rellenarCampos();
            } else if (jcbbs.getSelectedIndex() == 1) {
                Afiliado a = ad.listarAfiliadoPorDNI(Integer.parseInt(ctbs.getText()));
                System.out.println(a);
                JCBa.getModel().setSelectedItem(a);
                ctbs.setText("");
                rellenarCampos();
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NullPointerException ez) {
            JOptionPane.showMessageDialog(this, "La búsqueda no ha encontrado nada.");
        }
    }//GEN-LAST:event_btnbsActionPerformed

    private void JTnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTnombreKeyReleased
       if(JTnombre.getText().isEmpty()){
         }else{
        if (!Character.isLetter(evt.getKeyChar())){
            JTnombre.setText("");
       }}
    }//GEN-LAST:event_JTnombreKeyReleased

    private void JTapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTapellidoKeyReleased
          if(JTapellido.getText().isEmpty()){
         }else{
        if (!Character.isLetter(evt.getKeyChar())){
            JTapellido.setText("");
       }
    }     
    }//GEN-LAST:event_JTapellidoKeyReleased

    private void JTdomicilioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTdomicilioKeyReleased
        if(JTdomicilio.getText().isEmpty()){
         }else{
        if (!Character.isLetter(evt.getKeyChar())){
            JTdomicilio.setText("");
       }
    }     
    }//GEN-LAST:event_JTdomicilioKeyReleased

    private void rellenarCampos() {
        Afiliado afiliado = ad.listarAfiliadoPorDNI(Integer.parseInt(JLdni.getText()));
        JTnombre.setText(afiliado.getNombre());
        JTapellido.setText(afiliado.getApellido());
        JTdni.setText(String.valueOf(afiliado.getDNI()));
        JTdomicilio.setText(afiliado.getDomicilio());
        JTel.setText(String.valueOf(afiliado.getTelefono()));
        JRBactivo.setSelected(afiliado.isEstado());
        JBma.setEnabled(true);
        JBaa.setEnabled(false);
    }

    private void cargarCombo() {
        JCBa.removeAllItems();
        Afiliado a = new Afiliado();
        JCBa.addItem(a);
        Jltx.setText("Crear un nuevo afiliado.");
        for (Afiliado afiliado : ad.listarAfiliados()) {
            JCBa.addItem(afiliado);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ID;
    private javax.swing.JLabel IDicon;
    private javax.swing.JButton JBaa;
    private javax.swing.JButton JBayuda;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JButton JBma;
    private javax.swing.JComboBox<Afiliado> JCBa;
    private javax.swing.JLabel JLapellido;
    private javax.swing.JLabel JLdni;
    private javax.swing.JLabel JLdomicilio;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLtelefono;
    private javax.swing.JPanel JPescritorio;
    private javax.swing.JRadioButton JRBactivo;
    private javax.swing.JTextField JTapellido;
    private javax.swing.JTextField JTdni;
    private javax.swing.JTextField JTdomicilio;
    private javax.swing.JTextField JTel;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JLabel Jltx;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnbs;
    private javax.swing.JTextField ctbs;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jcbbs;
    private javax.swing.JButton salir;
    private javax.swing.JPanel textf;
    private javax.swing.JLabel textop;
    // End of variables declaration//GEN-END:variables
}
