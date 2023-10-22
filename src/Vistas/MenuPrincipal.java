/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Principal.Depuracion;
import java.awt.event.MouseListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author iarak
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Depuracion d = new Depuracion();
    Afiliados a = new Afiliados();
    Prestadores p = new Prestadores();
    Especialidades e = new Especialidades();
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        BtnDep.setVisible(true);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnDep = new javax.swing.JButton();
        JBafiliados = new javax.swing.JButton();
        JBordenes = new javax.swing.JButton();
        JBprestadores = new javax.swing.JButton();
        JBespecialidades = new javax.swing.JButton();
        JBayuda = new javax.swing.JButton();
        ImagenFondo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1025, 753));

        JDescritorio.setPreferredSize(new java.awt.Dimension(1025, 732));

        jPanel.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ordenGrande.png"))); // NOI18N
        jPanel.add(jLabel2);
        jLabel2.setBounds(670, 500, 160, 130);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/afilaidoGrande.png"))); // NOI18N
        jPanel.add(jLabel1);
        jLabel1.setBounds(180, 300, 160, 130);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prestadorGrande.png"))); // NOI18N
        jPanel.add(jLabel3);
        jLabel3.setBounds(180, 500, 160, 130);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/especialidadGrande.png"))); // NOI18N
        jPanel.add(jLabel4);
        jLabel4.setBounds(670, 300, 160, 130);

        BtnDep.setBackground(new java.awt.Color(158, 158, 198));
        BtnDep.setForeground(new java.awt.Color(158, 158, 198));
        BtnDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depuracion.png"))); // NOI18N
        BtnDep.setToolTipText("");
        BtnDep.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        BtnDep.setBorderPainted(false);
        BtnDep.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDepActionPerformed(evt);
            }
        });
        jPanel.add(BtnDep);
        BtnDep.setBounds(898, 10, 100, 60);

        JBafiliados.setBackground(new java.awt.Color(71, 71, 71));
        JBafiliados.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JBafiliados.setForeground(new java.awt.Color(255, 255, 255));
        JBafiliados.setText("Afiliados");
        JBafiliados.setToolTipText("Modifique, edite o liste los afiliados habilitados.");
        JBafiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBafiliadosActionPerformed(evt);
            }
        });
        jPanel.add(JBafiliados);
        JBafiliados.setBounds(180, 440, 160, 40);

        JBordenes.setBackground(new java.awt.Color(71, 71, 71));
        JBordenes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JBordenes.setForeground(new java.awt.Color(255, 255, 255));
        JBordenes.setText("Ordenes");
        JBordenes.setToolTipText("Cree y administre las ordenes.");
        JBordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBordenesActionPerformed(evt);
            }
        });
        jPanel.add(JBordenes);
        JBordenes.setBounds(670, 440, 160, 40);

        JBprestadores.setBackground(new java.awt.Color(71, 71, 71));
        JBprestadores.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JBprestadores.setForeground(new java.awt.Color(255, 255, 255));
        JBprestadores.setText("Prestadores");
        JBprestadores.setToolTipText("Modifique, edite o liste los prestadores habilitados.");
        JBprestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBprestadoresActionPerformed(evt);
            }
        });
        jPanel.add(JBprestadores);
        JBprestadores.setBounds(180, 640, 160, 40);

        JBespecialidades.setBackground(new java.awt.Color(71, 71, 71));
        JBespecialidades.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JBespecialidades.setForeground(new java.awt.Color(255, 255, 255));
        JBespecialidades.setText("Especialidades");
        JBespecialidades.setToolTipText("Administre,cree o liste las especialidades.");
        JBespecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBespecialidadesActionPerformed(evt);
            }
        });
        jPanel.add(JBespecialidades);
        JBespecialidades.setBounds(670, 640, 160, 40);

        JBayuda.setBackground(new java.awt.Color(71, 71, 71));
        JBayuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBayuda.setForeground(new java.awt.Color(255, 255, 255));
        JBayuda.setText("Ayuda");
        JBayuda.setToolTipText("Reciba ayuda sobre el programa.");
        jPanel.add(JBayuda);
        JBayuda.setBounds(474, 500, 80, 30);

        ImagenFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\MASSALUD\\src\\imagenes\\massalud2.png")); // NOI18N
        jPanel.add(ImagenFondo);
        ImagenFondo.setBounds(0, 0, 1030, 730);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/afilaidoGrande.png"))); // NOI18N
        jPanel.add(jLabel5);
        jLabel5.setBounds(180, 510, 160, 130);

        JDescritorio.setLayer(jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDescritorioLayout = new javax.swing.GroupLayout(JDescritorio);
        JDescritorio.setLayout(JDescritorioLayout);
        JDescritorioLayout.setHorizontalGroup(
            JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
            .addGroup(JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE))
        );
        JDescritorioLayout.setVerticalGroup(
            JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
            .addGroup(JDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
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
        try {
            if (a.isVisible() == false) {
                JDescritorio.repaint();
                JDescritorio.add(a);
                a.setVisible(true);
                a.toFront();
                a.setResizable(false);
                a.setBounds(0, -35, 1025, 769);
                //remove the listeners from UI which make the frame move
                BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) a.getUI());
                for (MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()) {
                    basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
                }
            }
        } catch (IllegalArgumentException ez) {
            if (a.isVisible() == false) {
                JDescritorio.repaint();
                JDescritorio.add(a);
                a.setVisible(true);
                a.toFront();
                a.setResizable(false);
                a.setBounds(0, -35, 1025, 769);
                //remove the listeners from UI which make the frame move
                BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) a.getUI());
                for (MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()) {
                    basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
                }
            }
        }
    }//GEN-LAST:event_JBafiliadosActionPerformed

    private void JBprestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBprestadoresActionPerformed
        // TODO add your handling code here:
        try {
            if (p.isVisible() == false) {
                JDescritorio.repaint();
                JDescritorio.add(p);
                p.setVisible(true);
                p.toFront();
                p.setResizable(false);
                p.setBounds(0, -35, 1025, 769);
                //remove the listeners from UI which make the frame move
                BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) p.getUI());
                for (MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()) {
                    basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
                }
            }
        } catch (IllegalArgumentException ez) {
            if (p.isVisible() == false) {
                JDescritorio.repaint();
                JDescritorio.add(p);
                p.setVisible(true);
                p.toFront();
                p.setResizable(false);
                p.setBounds(0, -35, 1025, 769);
                //remove the listeners from UI which make the frame move
                BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) p.getUI());
                for (MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()) {
                    basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
                }
            }
        }
    }//GEN-LAST:event_JBprestadoresActionPerformed

    private void JBespecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBespecialidadesActionPerformed
        // TODO add your handling code here:
        try {
            if (e.isVisible() == false) {
                JDescritorio.repaint();
                JDescritorio.add(e);
                e.setVisible(true);
                e.toFront();
                e.setResizable(false);
                //remove the listeners from UI which make the frame move
                BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) p.getUI());
                for (MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()) {
                    basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
                }
            }
        } catch (IllegalArgumentException ez) {
            if (e.isVisible() == false) {
                JDescritorio.repaint();
                JDescritorio.add(e);
                e.setVisible(true);
                e.toFront();
                e.setResizable(false);
                //remove the listeners from UI which make the frame move
                BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) p.getUI());
                for (MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()) {
                    basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
                }
            }
        }
    }//GEN-LAST:event_JBespecialidadesActionPerformed

    private void BtnDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDepActionPerformed
        // TODO add your handling code here:
        Depuracion.depuracion(null);
    }//GEN-LAST:event_BtnDepActionPerformed

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
    private javax.swing.JButton BtnDep;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JButton JBafiliados;
    private javax.swing.JButton JBayuda;
    private javax.swing.JButton JBespecialidades;
    private javax.swing.JButton JBordenes;
    private javax.swing.JButton JBprestadores;
    private javax.swing.JDesktopPane JDescritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables

}
