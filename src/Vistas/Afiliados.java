package Vistas;

import AccesoADatos.AfiliadoData;
import Principal.Afiliado;
import javax.swing.JOptionPane;

public class Afiliados extends javax.swing.JInternalFrame {

    AfiliadoData ad = new AfiliadoData();

    public Afiliados() {
        initComponents();
        JLtextoAdv.setVisible(false);
        JBrellenarCampos.setEnabled(false);
        JBmodificarAfiliado.setEnabled(false);
        JBagregarAfiliado.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        JPescritorio = new javax.swing.JPanel();
        JBmodificarAfiliado = new javax.swing.JButton();
        JBagregarAfiliado = new javax.swing.JButton();
        JBrellenarCampos = new javax.swing.JButton();
        JBayuda = new javax.swing.JButton();
        JTnombre = new javax.swing.JTextField();
        JTdni = new javax.swing.JTextField();
        JTdomicilio = new javax.swing.JTextField();
        JTtelefono = new javax.swing.JTextField();
        JRBactivo = new javax.swing.JRadioButton();
        JBlimpiar = new javax.swing.JButton();
        JTapellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLnombre = new javax.swing.JLabel();
        JLapellido = new javax.swing.JLabel();
        JLdni = new javax.swing.JLabel();
        JLdomicilio = new javax.swing.JLabel();
        JLtelefono = new javax.swing.JLabel();
        JLtextoAdv = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setMaximumSize(new java.awt.Dimension(1025, 739));
        setMinimumSize(new java.awt.Dimension(1025, 739));
        setPreferredSize(new java.awt.Dimension(1025, 739));
        setRequestFocusEnabled(false);

        JPescritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBmodificarAfiliado.setBackground(new java.awt.Color(0, 153, 0));
        JBmodificarAfiliado.setText("Modificar afiliados");
        JBmodificarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmodificarAfiliadoActionPerformed(evt);
            }
        });
        JPescritorio.add(JBmodificarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 240, 50));

        JBagregarAfiliado.setBackground(new java.awt.Color(0, 153, 0));
        JBagregarAfiliado.setText("Agregar afiliado");
        JBagregarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBagregarAfiliadoActionPerformed(evt);
            }
        });
        JPescritorio.add(JBagregarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 50));

        JBrellenarCampos.setBackground(new java.awt.Color(0, 153, 0));
        JBrellenarCampos.setText("Rellenar Campos");
        JBrellenarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBrellenarCamposActionPerformed(evt);
            }
        });
        JPescritorio.add(JBrellenarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 240, 50));

        JBayuda.setIcon(new javax.swing.ImageIcon("C:\\Users\\iarak\\OneDrive\\Imágenes\\ayuda.png")); // NOI18N
        JPescritorio.add(JBayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 160, 130));
        JPescritorio.add(JTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 330, -1));

        JTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTdniKeyReleased(evt);
            }
        });
        JPescritorio.add(JTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 330, -1));
        JPescritorio.add(JTdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 330, -1));
        JPescritorio.add(JTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 330, -1));

        JRBactivo.setBackground(new java.awt.Color(204, 255, 204));
        JPescritorio.add(JRBactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, -1, -1));

        JBlimpiar.setBackground(new java.awt.Color(0, 153, 0));
        JBlimpiar.setText("Limpiar");
        JBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimpiarActionPerformed(evt);
            }
        });
        JPescritorio.add(JBlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, -1, -1));
        JPescritorio.add(JTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 330, -1));

        jLabel4.setBackground(new java.awt.Color(0, 153, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\iarak\\OneDrive\\Imágenes\\icono usuario.png")); // NOI18N
        JPescritorio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 140, 150));

        jLabel14.setText("Nombre:");
        JPescritorio.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        jLabel15.setText("DNI:");
        JPescritorio.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        jLabel17.setText("Telefono:");
        JPescritorio.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, -1, -1));

        jLabel18.setText("Activo:");
        JPescritorio.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        jLabel16.setText("Domicilio:");
        JPescritorio.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        jLabel3.setText("Apellido:");
        JPescritorio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        JLnombre.setText("Nombre");
        JPescritorio.add(JLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 80, -1));

        JLapellido.setText("Apellido");
        JPescritorio.add(JLapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 90, -1));

        JLdni.setText("DNI");
        JPescritorio.add(JLdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 50, -1));

        JLdomicilio.setText("Domicilio");
        JPescritorio.add(JLdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 90, -1));

        JLtelefono.setText("Telefono");
        JPescritorio.add(JLtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 90, -1));

        JLtextoAdv.setText("No existe el afiliado");
        JPescritorio.add(JLtextoAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JPescritorio.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Afiliados");
        JPescritorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 240, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\iarak\\OneDrive\\Imágenes\\massalud.png")); // NOI18N
        JPescritorio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1010, 680));

        jLabel13.setText("jLabel13");
        JPescritorio.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, 380, -1));

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

    private void JBmodificarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmodificarAfiliadoActionPerformed
        // TODO add your handling code here:
        Afiliado afiliado = new Afiliado(JTnombre.getText(), JTapellido.getText(), Integer.parseInt(JTdni.getText()), JRBactivo.isEnabled(), JTdomicilio.getText(), Integer.parseInt(JTtelefono.getText()));
        ad.modificarAfiliado(afiliado);
        

        afiliado = ad.listarAfiliadoPorDNI(Integer.parseInt(JTdni.getText()));
        JLnombre.setText(afiliado.getNombre());
        JLapellido.setText(afiliado.getApellido());
        JLdni.setText(String.valueOf(afiliado.getDNI()));
        JLdomicilio.setText(afiliado.getDomicilio());
        JLtelefono.setText(String.valueOf(afiliado.getTelefono()));
        JLtextoAdv.setVisible(false);
        JBrellenarCampos.setEnabled(true);
        JTnombre.setText("");
        JTdomicilio.setText("");
        JTapellido.setText("");
        JTtelefono.setText("");
        JRBactivo.setSelected(false);
        JBmodificarAfiliado.setEnabled(false);
        
    }//GEN-LAST:event_JBmodificarAfiliadoActionPerformed

    private void JBagregarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBagregarAfiliadoActionPerformed
        // TODO add your handling code here:
        Afiliado afiliado = new Afiliado(JTnombre.getText(), JTapellido.getText(), Integer.parseInt(JTdni.getText()), JRBactivo.isEnabled(), JTdomicilio.getText(), Integer.parseInt(JTtelefono.getText()));
        ad.añadirAfiliado(afiliado);
    }//GEN-LAST:event_JBagregarAfiliadoActionPerformed

    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        // TODO add your handling code here:
        JTnombre.setText("");
        JTdni.setText("");
        JTdomicilio.setText("");
        JTapellido.setText("");
        JTtelefono.setText("");
        JRBactivo.setSelected(false);
        JBmodificarAfiliado.setEnabled(false);
        JBrellenarCampos.setEnabled(false);
        JBagregarAfiliado.setEnabled(true);
    }//GEN-LAST:event_JBlimpiarActionPerformed

    private void JBrellenarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBrellenarCamposActionPerformed
        // TODO add your handling code here
        Afiliado afiliado = ad.listarAfiliadoPorDNI(Integer.parseInt(JTdni.getText()));
        JTnombre.setText(afiliado.getNombre());
        JTapellido.setText(afiliado.getApellido());
        JTdni.setText(String.valueOf(afiliado.getDNI()));
        JTdomicilio.setText(afiliado.getDomicilio());
        JTtelefono.setText(String.valueOf(afiliado.getTelefono()));
        JRBactivo.setSelected(afiliado.isEstado());
        JBmodificarAfiliado.setEnabled(true);
        JBagregarAfiliado.setEnabled(false);
    }//GEN-LAST:event_JBrellenarCamposActionPerformed

    private void JTdniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTdniKeyReleased
        // TODO add your handling code here:
        if (JTdni.getText().isEmpty()) {
            JLnombre.setText("Nombre");
            JLapellido.setText("Apellido");
            JLdni.setText("dni");
            JLdomicilio.setText("domicilio");
            JLtelefono.setText("telefono");
            JLtextoAdv.setVisible(false);
            JBrellenarCampos.setEnabled(false);
        } else {
            try {
                if (!JTdni.getText().isEmpty()) {
                    Afiliado afiliado = ad.listarAfiliadoPorDNI(Integer.parseInt(JTdni.getText()));
                    JLnombre.setText(afiliado.getNombre());
                    JLapellido.setText(afiliado.getApellido());
                    JLdni.setText(String.valueOf(afiliado.getDNI()));
                    JLdomicilio.setText(afiliado.getDomicilio());
                    JLtelefono.setText(String.valueOf(afiliado.getTelefono()));
                    JLtextoAdv.setVisible(false);
                    JBrellenarCampos.setEnabled(true);
                }
            } catch (NullPointerException ex) {
                JLtextoAdv.setVisible(true);
                JBrellenarCampos.setEnabled(false);

            } catch (NumberFormatException ez) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero de documento.");
                JLdni.setText("");
                JBrellenarCampos.setEnabled(false);

            }
        }

    }//GEN-LAST:event_JTdniKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBagregarAfiliado;
    private javax.swing.JButton JBayuda;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JButton JBmodificarAfiliado;
    private javax.swing.JButton JBrellenarCampos;
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
    private javax.swing.JTextField JTnombre;
    private javax.swing.JTextField JTtelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
