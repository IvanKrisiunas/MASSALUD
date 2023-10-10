
package imagenes;


public class Afiliados extends javax.swing.JInternalFrame {

    Afiliados af = new Afiliados();

    
    public Afiliados() {
        initComponents();
        af.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPescritorio = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        JPagregarafiliado = new javax.swing.JPanel();
        JPmodificarAfiliado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        JPescritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Modificar afiliados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JPescritorio.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 240, 50));

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setText("Agregar afiliado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        JPescritorio.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 240, 50));

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setText("Eliminar afiliado");
        JPescritorio.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 240, 50));

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setText("Buscar afiliado");
        JPescritorio.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 240, 50));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\iarak\\OneDrive\\Imágenes\\ayuda.png")); // NOI18N
        JPescritorio.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 160, 130));

        javax.swing.GroupLayout JPagregarafiliadoLayout = new javax.swing.GroupLayout(JPagregarafiliado);
        JPagregarafiliado.setLayout(JPagregarafiliadoLayout);
        JPagregarafiliadoLayout.setHorizontalGroup(
            JPagregarafiliadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        JPagregarafiliadoLayout.setVerticalGroup(
            JPagregarafiliadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        JPescritorio.add(JPagregarafiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 580, 200));

        javax.swing.GroupLayout JPmodificarAfiliadoLayout = new javax.swing.GroupLayout(JPmodificarAfiliado);
        JPmodificarAfiliado.setLayout(JPmodificarAfiliadoLayout);
        JPmodificarAfiliadoLayout.setHorizontalGroup(
            JPmodificarAfiliadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        JPmodificarAfiliadoLayout.setVerticalGroup(
            JPmodificarAfiliadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        JPescritorio.add(JPmodificarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 370, 230));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if (af.isVisible() == false) {
            JPescritorio.repaint();
            JPescritorio.add(af);
            af.setVisible(true);
            af.toFront();
//            af.setBounds(110, 10, 598, 487);
        }


    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPagregarafiliado;
    private javax.swing.JPanel JPescritorio;
    private javax.swing.JPanel JPmodificarAfiliado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
