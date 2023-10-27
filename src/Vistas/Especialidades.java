/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.EspecialidadData;
import AccesoADatos.PrestadorData;
import Principal.Especialidad;
import Principal.Prestador;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iarak
 */
public class Especialidades extends javax.swing.JInternalFrame {

    private DefaultTableModel modelotablaEspecialidad = new DefaultTableModel();
    private DefaultTableModel modelotablaPrestador = new DefaultTableModel();
    private String valorNombre;
    private int seleccionarFila;
    private int idEsp;
    EspecialidadData ed = new EspecialidadData();
    PrestadorData pd = new PrestadorData();
    
    public Especialidades() {
        initComponents();
        armarCabeceraEspecialidad();
        armarCabeceraPrestadores();
        cargarTablaEspecialidades();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTespecialidades = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTprestadores = new javax.swing.JTable();
        JBguardarCambios = new javax.swing.JButton();
        JBañadir = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        JBayuda = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFañadirEspecialidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTespecialidades.setBackground(new java.awt.Color(183, 230, 167));
        JTespecialidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTespecialidades.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JTespecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        JTespecialidades.setCellSelectionEnabled(true);
        JTespecialidades.setRowHeight(40);
        JTespecialidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTespecialidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTespecialidades);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 150, 440, 430));

        JTprestadores.setBackground(new java.awt.Color(183, 230, 167));
        JTprestadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTprestadores.setModel(new javax.swing.table.DefaultTableModel(
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
        JTprestadores.setRowHeight(30);
        jScrollPane2.setViewportView(JTprestadores);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, 430));

        JBguardarCambios.setText("Guardar cambios");
        JBguardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarCambiosActionPerformed(evt);
            }
        });
        jPanel2.add(JBguardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        JBañadir.setText("Añadir");
        JBañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBañadirActionPerformed(evt);
            }
        });
        jPanel2.add(JBañadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, -1, -1));

        salir.setBackground(new java.awt.Color(255, 51, 51));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setToolTipText("Salir.");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 90, 90));

        JBayuda.setBackground(new java.awt.Color(158, 158, 198));
        JBayuda.setForeground(new java.awt.Color(158, 158, 198));
        JBayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        JBayuda.setToolTipText("Ayuda.");
        JBayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBayudaActionPerformed(evt);
            }
        });
        jPanel2.add(JBayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 100, 90));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Prestadores");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 440, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Disponibles");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 440, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Agregar especialidad:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, -1, -1));
        jPanel2.add(JTFañadirEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 270, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Especialidades");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1020, 70));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 680));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BG.png"))); // NOI18N
        jPanel2.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTespecialidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTespecialidadesMouseClicked
        // TODO add your handling code here:
        seleccionarFila = JTespecialidades.rowAtPoint(evt.getPoint());
        valorNombre = JTespecialidades.getValueAt(seleccionarFila, 0).toString();
        idEsp = ed.NombreAID(valorNombre);
        cargarTablaPrestadores();
    }//GEN-LAST:event_JTespecialidadesMouseClicked

    
    private void JBañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBañadirActionPerformed
        // TODO add your handling code here:
        ed.añadirEspecialidad(JTFañadirEspecialidad.getText());
        JTFañadirEspecialidad.setText("");
        cargarTablaEspecialidades();
    }//GEN-LAST:event_JBañadirActionPerformed

    private void JBguardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarCambiosActionPerformed
        // TODO add your handling code here:
         valorNombre = (String) JTespecialidades.getValueAt(seleccionarFila, 0);
        JTespecialidades.setValueAt(valorNombre , seleccionarFila, 0);
        ed.modificarEspecialidad(idEsp, valorNombre);
        cargarTablaEspecialidades();
    }//GEN-LAST:event_JBguardarCambiosActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void JBayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBayudaActionPerformed
        JLabel label = new JLabel("<html>Para listar los prestadores por especialidad hay que presionar una especialidad en la tabla.<br> Haciendo doble cliqueo en la filas te permite editar el nombre y luego gurdar los cambios con el botón. <br> Más abajo están el campo y botón para añadir una nueva especialidad. <br> Dichas especialidades no se puede eliminar una vez ingresadas.</html>");
        label.setFont(new Font("Dialog", Font.BOLD, 18));
        JOptionPane.showMessageDialog(this, label, "Ayuda", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_JBayudaActionPerformed
   
    private void armarCabeceraEspecialidad() {
        modelotablaEspecialidad.addColumn("Nombre de la especialidad");
        JTespecialidades.setModel(modelotablaEspecialidad);
    }

    private void armarCabeceraPrestadores() {
        modelotablaPrestador.addColumn("Nombre y apellido");
        modelotablaPrestador.addColumn("DNI");
        JTprestadores.setModel(modelotablaPrestador);
    }

    private void cargarTablaEspecialidades() {
        borrarFilasEspecialidades();
        List<Especialidad> listarEspecialidades = ed.listarEspecialidades();
        for (Especialidad esp : listarEspecialidades) {
            modelotablaEspecialidad.addRow(new Object[]{esp.getTipo()});
        }
    }

    private void cargarTablaPrestadores() {
        borrarFilasPrestadores();
        int valorId = ed.NombreAID(valorNombre);
        List<Prestador> listarPrestadoresPorEspecialidad = pd.listarPrestadoresPorEspecialidad(valorId);
        for(Prestador pres : listarPrestadoresPorEspecialidad){
            System.out.println(pres);
            modelotablaPrestador.addRow(new Object[]{pres.getNombre() + " " + pres.getApellido(), pres.getDNI()});
        }
    }

    private void borrarFilasEspecialidades() {
        ((DefaultTableModel) JTespecialidades.getModel()).setRowCount(0);
    }

    private void borrarFilasPrestadores() {
        ((DefaultTableModel) JTprestadores.getModel()).setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBayuda;
    private javax.swing.JButton JBañadir;
    private javax.swing.JButton JBguardarCambios;
    private javax.swing.JTextField JTFañadirEspecialidad;
    private javax.swing.JTable JTespecialidades;
    private javax.swing.JTable JTprestadores;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
