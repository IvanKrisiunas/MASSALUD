package Vistas;

import AccesoADatos.AfiliadoData;
import Principal.Afiliado;

public class Afiliados extends javax.swing.JInternalFrame {

    public Afiliados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        JPescritorio = new javax.swing.JPanel();
        JBmodificarAfiliado = new javax.swing.JButton();
        JBagregarAfiliado = new javax.swing.JButton();
        JBeliminarAfiliado = new javax.swing.JButton();
        JBbuscarAfiliado = new javax.swing.JButton();
        JBayuda = new javax.swing.JButton();
        JTnombre = new javax.swing.JTextField();
        JTdni = new javax.swing.JTextField();
        JTdomicilio = new javax.swing.JTextField();
        JTtelefono = new javax.swing.JTextField();
        JRBactivo = new javax.swing.JRadioButton();
        JBlimpiar = new javax.swing.JButton();
        JTapellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        JPescritorio.add(JBmodificarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 240, 50));

        JBagregarAfiliado.setBackground(new java.awt.Color(0, 153, 0));
        JBagregarAfiliado.setText("Agregar afiliado");
        JBagregarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBagregarAfiliadoActionPerformed(evt);
            }
        });
        JPescritorio.add(JBagregarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 240, 50));

        JBeliminarAfiliado.setBackground(new java.awt.Color(0, 153, 0));
        JBeliminarAfiliado.setText("Eliminar afiliado");
        JPescritorio.add(JBeliminarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 240, 50));

        JBbuscarAfiliado.setBackground(new java.awt.Color(0, 153, 0));
        JBbuscarAfiliado.setText("Buscar afiliado");
        JPescritorio.add(JBbuscarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 240, 50));

        JBayuda.setIcon(new javax.swing.ImageIcon("C:\\Users\\iarak\\OneDrive\\Imágenes\\ayuda.png")); // NOI18N
        JPescritorio.add(JBayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 160, 130));
        JPescritorio.add(JTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 330, -1));
        JPescritorio.add(JTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 330, -1));
        JPescritorio.add(JTdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 330, -1));
        JPescritorio.add(JTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 330, -1));

        JRBactivo.setBackground(new java.awt.Color(204, 255, 204));
        JPescritorio.add(JRBactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        JBlimpiar.setBackground(new java.awt.Color(0, 153, 0));
        JBlimpiar.setText("Limpiar");
        JBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimpiarActionPerformed(evt);
            }
        });
        JPescritorio.add(JBlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, -1, -1));
        JPescritorio.add(JTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 330, -1));

        jLabel14.setText("Nombre:");
        JPescritorio.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel15.setText("DNI:");
        JPescritorio.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jLabel17.setText("Telefono:");
        JPescritorio.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel18.setText("Activo:");
        JPescritorio.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        jLabel16.setText("Domicilio:");
        JPescritorio.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jLabel3.setText("Apellido:");
        JPescritorio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Afiliados");
        JPescritorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 240, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\iarak\\OneDrive\\Imágenes\\massalud.png")); // NOI18N
        JPescritorio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1010, 680));

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
    }//GEN-LAST:event_JBmodificarAfiliadoActionPerformed

    private void JBagregarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBagregarAfiliadoActionPerformed
        // TODO add your handling code here:

        Afiliado afiliado = new Afiliado (JTnombre.getText(), JTapellido.getText(), Integer.parseInt(JTdni.getText()),JRBactivo.isEnabled(), JTdomicilio.getText(),Integer.parseInt(JTtelefono.getText()));
        AfiliadoData ad = new AfiliadoData();
        ad.añadirAfiliado(afiliado);
    }//GEN-LAST:event_JBagregarAfiliadoActionPerformed

    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        // TODO add your handling code here:
        JTnombre.setText("");
        JTdni.setText("");
        JTdomicilio.setText("");
        JRBactivo.setSelected(false);
    }//GEN-LAST:event_JBlimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBagregarAfiliado;
    private javax.swing.JButton JBayuda;
    private javax.swing.JButton JBbuscarAfiliado;
    private javax.swing.JButton JBeliminarAfiliado;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JButton JBmodificarAfiliado;
    private javax.swing.JPanel JPescritorio;
    private javax.swing.JRadioButton JRBactivo;
    private javax.swing.JTextField JTapellido;
    private javax.swing.JTextField JTdni;
    private javax.swing.JTextField JTdomicilio;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JTextField JTtelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
