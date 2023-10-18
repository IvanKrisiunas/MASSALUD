/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author iarak
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Afiliados af = new Afiliados();
    Prestadores pr = new Prestadores();
    Especialidades es = new Especialidades();
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDescritorio = new javax.swing.JDesktopPane();
        jPanel = new javax.swing.JPanel();
        JBafiliados = new javax.swing.JButton();
        JBordenes = new javax.swing.JButton();
        JBprestadores = new javax.swing.JButton();
        JBespecialidades = new javax.swing.JButton();
        JBayuda = new javax.swing.JButton();
        ImagenFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JDescritorio.setPreferredSize(new java.awt.Dimension(1025, 739));

        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBafiliados.setText("Afiliados");
        JBafiliados.setToolTipText("Modifique, edite o liste los afiliados habilitados.");
        JBafiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBafiliadosActionPerformed(evt);
            }
        });
        jPanel.add(JBafiliados, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 160, 30));

        JBordenes.setText("Ordenes");
        JBordenes.setToolTipText("Cree y administre las ordenes.");
        JBordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBordenesActionPerformed(evt);
            }
        });
        jPanel.add(JBordenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 150, -1));

        JBprestadores.setText("Prestadores");
        JBprestadores.setToolTipText("Modifique, edite o liste los prestadores habilitados.");
        JBprestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBprestadoresActionPerformed(evt);
            }
        });
        jPanel.add(JBprestadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 160, -1));

        JBespecialidades.setText("Especialidades");
        JBespecialidades.setToolTipText("Administre,cree o liste las especialidades.");
        JBespecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBespecialidadesActionPerformed(evt);
            }
        });
        jPanel.add(JBespecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 170, -1));

        JBayuda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JBayuda.setText("Ayuda");
        JBayuda.setToolTipText("Reciba ayuda sobre el programa.");
        jPanel.add(JBayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 70, 20));

        ImagenFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\iarak\\OneDrive\\Imágenes\\massalud2.png")); // NOI18N
        jPanel.add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 730));

        JDescritorio.setLayer(jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDescritorioLayout = new javax.swing.GroupLayout(JDescritorio);
        JDescritorio.setLayout(JDescritorioLayout);
        JDescritorioLayout.setHorizontalGroup(
            JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
            .addGroup(JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE))
        );
        JDescritorioLayout.setVerticalGroup(
            JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
            .addGroup(JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JDescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JDescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBordenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBordenesActionPerformed
   
    private void JBafiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBafiliadosActionPerformed
        // TODO add your handling code here:
        if (af.isVisible() == false) {
            JDescritorio.repaint();
            JDescritorio.add(af);
            af.setVisible(true);
            af.toFront();
            af.setResizable(false);
            //remove the listeners from UI which make the frame move
            BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) af.getUI());
            for (MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()) {
                basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
            }
        }

    }//GEN-LAST:event_JBafiliadosActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void JBprestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBprestadoresActionPerformed
        // TODO add your handling code here:
        if (pr.isVisible() == false) {
            JDescritorio.repaint();
            JDescritorio.add(pr);
            pr.setVisible(true);
            pr.toFront();
            pr.setResizable(false);
            //remove the listeners from UI which make the frame move
            BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) pr.getUI());
            for (MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()) {
                basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
            }
        }
    }//GEN-LAST:event_JBprestadoresActionPerformed

    private void JBespecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBespecialidadesActionPerformed
        // TODO add your handling code here:
        if (es.isVisible() == false) {
            JDescritorio.repaint();
            JDescritorio.add(es);
            es.setVisible(true);
            es.toFront();
            es.setResizable(false);
            //remove the listeners from UI which make the frame move
            BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) pr.getUI());
            for (MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()) {
                basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
            }
        }
    }//GEN-LAST:event_JBespecialidadesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JButton JBafiliados;
    private javax.swing.JButton JBayuda;
    private javax.swing.JButton JBespecialidades;
    private javax.swing.JButton JBordenes;
    private javax.swing.JButton JBprestadores;
    private javax.swing.JDesktopPane JDescritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables

}
