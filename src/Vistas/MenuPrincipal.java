/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author iarak
 */
public class MenuPrincipal extends javax.swing.JFrame {
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

        jPanel1 = new javax.swing.JPanel();
        JBafiliados = new javax.swing.JButton();
        JBordenes = new javax.swing.JButton();
        JBprestadores = new javax.swing.JButton();
        JBespecialidades = new javax.swing.JButton();
        JBayuda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBafiliados.setText("Afiliados");
        JBafiliados.setToolTipText("Modifique, edite o liste los afiliados habilitados.");
        jPanel1.add(JBafiliados, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 160, 30));

        JBordenes.setText("Ordenes");
        JBordenes.setToolTipText("Cree y administre las ordenes.");
        JBordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBordenesActionPerformed(evt);
            }
        });
        jPanel1.add(JBordenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 150, -1));

        JBprestadores.setText("Prestadores");
        JBprestadores.setToolTipText("Modifique, edite o liste los prestadores habilitados.");
        jPanel1.add(JBprestadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 160, -1));

        JBespecialidades.setText("Especialidades");
        JBespecialidades.setToolTipText("Administre,cree o liste las especialidades.");
        jPanel1.add(JBespecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 170, -1));

        JBayuda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JBayuda.setText("Ayuda");
        JBayuda.setToolTipText("Reciba ayuda sobre el programa.");
        jPanel1.add(JBayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 70, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\iarak\\OneDrive\\Imágenes\\massalud2.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 720));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBordenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBordenesActionPerformed

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
    private javax.swing.JButton JBafiliados;
    private javax.swing.JButton JBayuda;
    private javax.swing.JButton JBespecialidades;
    private javax.swing.JButton JBordenes;
    private javax.swing.JButton JBprestadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
  
    
}
