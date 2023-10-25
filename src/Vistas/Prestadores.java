package Vistas;

import AccesoADatos.EspecialidadData;
import AccesoADatos.PrestadorData;
import Principal.Especialidad;
import Principal.Prestador;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Prestadores extends javax.swing.JInternalFrame {

    Especialidad e = new Especialidad();
    Especialidad ev = new Especialidad();
    PrestadorData pd = new PrestadorData();
    EspecialidadData ed = new EspecialidadData();

    public Prestadores() {
        initComponents();
        Jltx.setText("Crear un nuevo prestador.");
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
        jcbbs = new javax.swing.JComboBox<>();
        ctbs = new javax.swing.JTextField();
        btnbs = new javax.swing.JButton();
        JBmp = new javax.swing.JButton();
        JBap = new javax.swing.JButton();
        JBayuda = new javax.swing.JButton();
        ID = new javax.swing.JPanel();
        JLnombre = new javax.swing.JLabel();
        JLapellido = new javax.swing.JLabel();
        JLdomicilio = new javax.swing.JLabel();
        JLtelefono = new javax.swing.JLabel();
        JLdni = new javax.swing.JLabel();
        Jltx = new javax.swing.JLabel();
        jle = new javax.swing.JLabel();
        IDicon = new javax.swing.JLabel();
        textf = new javax.swing.JPanel();
        JCBe = new javax.swing.JComboBox<>();
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
        JBlc = new javax.swing.JButton();
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

        jcbbs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre y apellido", "DNI" }));
        JPescritorio.add(jcbbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        ctbs.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ctbs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ctbsKeyReleased(evt);
            }
        });
        JPescritorio.add(ctbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 210, -1));

        btnbs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        btnbs.setToolTipText("Búsqueda de personas.");
        btnbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbsActionPerformed(evt);
            }
        });
        JPescritorio.add(btnbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

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

        Jltx.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        Jltx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jltx.setText("Crear un nuevo prestador.");

        jle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jle.setText("Especialidad");

        javax.swing.GroupLayout IDLayout = new javax.swing.GroupLayout(ID);
        ID.setLayout(IDLayout);
        IDLayout.setHorizontalGroup(
            IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDLayout.createSequentialGroup()
                .addComponent(Jltx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(IDLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jle, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLdni, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JLnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLapellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLdomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        IDLayout.setVerticalGroup(
            IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(JLnombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLapellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLdomicilio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IDLayout.createSequentialGroup()
                        .addComponent(JLtelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLdni))
                    .addGroup(IDLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        JCBe.setForeground(new java.awt.Color(255, 255, 255));
        JCBe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JCBeKeyReleased(evt);
            }
        });

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

        JBlc.setBackground(new java.awt.Color(0, 153, 0));
        JBlc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarCampos.png"))); // NOI18N
        JBlc.setToolTipText("Limpiar los campos.");
        JBlc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlcActionPerformed(evt);
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                                .addComponent(JBlc)
                                .addGap(23, 23, 23))
                            .addComponent(JCBe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(JCBe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(JBlc))
                .addGap(73, 73, 73))
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
        Prestador prestador = new Prestador(JTnombre.getText(), JTapellido.getText(),Integer.parseInt(JTdni.getText()),JRBactivo.isSelected(),ed.NombreAID((String) JCBe.getSelectedItem()), Integer.parseInt(JTel.getText()), JTdomicilio.getText());
        pd.modificarPrestador(prestador);
        prestador = pd.listarPrestadorPorDNI(Integer.parseInt(JTdni.getText()));
        JLnombre.setText(prestador.getNombre());
        JLapellido.setText(prestador.getApellido());
        JLdni.setText(String.valueOf(prestador.getDNI()));
        JLdomicilio.setText(prestador.getDomicilio());
        JLtelefono.setText(String.valueOf(prestador.getTelefono()));
        jle.setText(ed.IdANombre(prestador.getIdEspecialidad()));
        Jltx.setText("Prestador editado con éxito.");
        JTnombre.setText(prestador.getNombre());
        JTdomicilio.setText(prestador.getDomicilio());
        JTapellido.setText(prestador.getApellido());
        JTel.setText(String.valueOf(prestador.getTelefono()));
        JRBactivo.setSelected(prestador.isEstado());
        JBmp.setEnabled(true);
        cargarCombo();
        JCBp.getModel().setSelectedItem(prestador);
        Jltx.setText("Acción realizada con éxito.");
    }//GEN-LAST:event_JBmpActionPerformed

    private void JBapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBapActionPerformed
        // TODO add your handling code here:
        try {
        Prestador prestador = new Prestador(JTnombre.getText(), JTapellido.getText(),Integer.parseInt(JTdni.getText()),JRBactivo.isEnabled(),ed.NombreAID(e.getTipo()), Integer.parseInt(JTel.getText()), JTdomicilio.getText());
        pd.añadirPrestador(prestador);
        cargarCombo();
        Jltx.setText("Acción realizada con éxito.");
        } catch (java.lang.NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "La información ingresada no es correcta.");
            }
    }//GEN-LAST:event_JBapActionPerformed

    private void JBlcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlcActionPerformed
        // TODO add your handling code here:
        JTdni.setBackground(Color.white);
        if (JCBp.getSelectedIndex() == 0) {
            JTnombre.setText("");
            JTdni.setText("");
            JTdomicilio.setText("");
            JTapellido.setText("");
            JTel.setText("");
            JCBe.setSelectedItem("");
            JRBactivo.setSelected(false);
            JBmp.setEnabled(false);
            JBap.setEnabled(true);
        } else {
            JTnombre.setText("");
            JTdomicilio.setText("");
            JTapellido.setText("");
            JTel.setText("");
            JCBe.setSelectedItem("");
            JRBactivo.setSelected(false);
            JBmp.setEnabled(true);
            JBap.setEnabled(false);
        }
    }//GEN-LAST:event_JBlcActionPerformed

    private void JTdniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTdniKeyReleased
        // TODO add your handling code here:
        if (JTdni.getText().isEmpty()) {
            JTdni.setBackground(Color.white);
        } else {
            try {
                Prestador prestador = pd.listarPrestadorPorDNI(Integer.parseInt(JTdni.getText()));
                if (prestador == null) {
                    Jltx.setText("Crear un nuevo prestador.");
                    JBmp.setEnabled(false);
                    JTdni.setBackground(Color.white);
                } else {
                    JTdni.setBackground(Color.red);
                }
            } catch (NullPointerException ex) {
                Jltx.setText("Crear un nuevo prestador.");
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
            jle.setText("Especialidad");
            Jltx.setText("Crear un nuevo prestador.");
            JCBe.setSelectedItem("");
            JBmp.setEnabled(false);
            JBap.setEnabled(true);
            JTdni.setEditable(true);
            JBlcActionPerformed(evt);
        } else {
            Prestador prestador = (Prestador) JCBp.getSelectedItem();
            JLnombre.setText(prestador.getNombre());
            JLapellido.setText(prestador.getApellido());
            JLdni.setText(String.valueOf(prestador.getDNI()));
            JLdomicilio.setText(prestador.getDomicilio());
            JLtelefono.setText(String.valueOf(prestador.getTelefono()));
            jle.setText(ed.IdANombre(prestador.getIdEspecialidad()));
            Jltx.setText("Persona existente.");
            JTdni.setEditable(false);
            rellenarCampos();
        }
    }//GEN-LAST:event_JCBpActionPerformed

    private void JTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTelKeyReleased
        // TODO add your handling code here:
          if ("".equals(JTel.getText())) {
            JTel.setBackground(Color.white);
        } else {
            try {
                int i;
                JTel.setBackground(Color.white);
                i = Integer.parseInt(JTel.getText());
            } catch (java.lang.RuntimeException ex) {
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
                Prestador p = pd.listarPrestadorPorNombreApellido(nombre, apellido);
                System.out.println(p);
                JCBp.getModel().setSelectedItem(p);
                ctbs.setText("");
                rellenarCampos();
            } else if (jcbbs.getSelectedIndex() == 1) {
                Prestador p = pd.listarPrestadorPorDNI(Integer.parseInt(ctbs.getText()));
                System.out.println(p);
                JCBp.getModel().setSelectedItem(p);
                ctbs.setText("");
                rellenarCampos();
            } 
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NullPointerException ez) {
        JOptionPane.showMessageDialog(this, "La búsqueda no ha encontrado nada.");
        }
    }//GEN-LAST:event_btnbsActionPerformed

    private void ctbsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctbsKeyReleased
        // TODO add your handling code here:
        if ("".equals(ctbs.getText())) {
            ctbs.setBackground(Color.white);
        } else {
            if (jcbbs.getSelectedIndex() == 1) {
                try {
                    int i;
                    ctbs.setBackground(Color.white);
                    i = Integer.parseInt(ctbs.getText());
                } catch (java.lang.RuntimeException ex) {
                    ctbs.setBackground(Color.red);
                }
            }
        }
    }//GEN-LAST:event_ctbsKeyReleased

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

    private void JCBeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCBeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBeKeyReleased

    private void JTdomicilioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTdomicilioKeyReleased
         if(JTdomicilio.getText().isEmpty()){
         }else{
        if (!Character.isLetter(evt.getKeyChar())){
            JTdomicilio.setText("");
       }
    }     
    }//GEN-LAST:event_JTdomicilioKeyReleased
    
    private void rellenarCampos() {
        Prestador prestador = pd.listarPrestadorPorDNI(Integer.parseInt(JLdni.getText()));
        Especialidad espe = new Especialidad(prestador.getIdEspecialidad(), ed.IdANombre(prestador.getIdEspecialidad()));
        JTnombre.setText(prestador.getNombre());
        JTapellido.setText(prestador.getApellido());
        JTdni.setText(String.valueOf(prestador.getDNI()));
        JTdomicilio.setText(prestador.getDomicilio());
        JTel.setText(String.valueOf(prestador.getTelefono()));
        JCBe.setSelectedItem(espe.getTipo());
        JRBactivo.setSelected(prestador.isEstado());
        JBmp.setEnabled(true);
        JBap.setEnabled(false);
    }

    private void cargarCombo() {
        JCBp.removeAllItems();
        Prestador p = new Prestador();
        JCBp.addItem(p);
        Jltx.setText("Crear un nuevo prestador.");
        for (Prestador prestador : pd.listarPrestadores()) {
            JCBp.addItem(prestador);
        }
    }
    
    private void cargarComboE() {
        JCBe.removeAllItems();   
        JCBe.addItem("");
        for (Especialidad especialidad : ed.listarEspecialidades()) {
            JCBe.addItem(especialidad.getTipo());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ID;
    private javax.swing.JLabel IDicon;
    private javax.swing.JButton JBap;
    private javax.swing.JButton JBayuda;
    private javax.swing.JButton JBlc;
    private javax.swing.JButton JBmp;
    private javax.swing.JComboBox<String> JCBe;
    private javax.swing.JComboBox<Prestador> JCBp;
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JComboBox<String> jcbbs;
    private javax.swing.JLabel jle;
    private javax.swing.JLabel ldni;
    private javax.swing.JButton salir;
    private javax.swing.JPanel textf;
    private javax.swing.JLabel textop;
    // End of variables declaration//GEN-END:variables
}
