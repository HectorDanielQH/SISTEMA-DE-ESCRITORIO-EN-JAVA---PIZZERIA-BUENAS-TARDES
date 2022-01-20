/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria_buenas_tardes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hdani
 */
public class MENU extends javax.swing.JInternalFrame {

    /**
     * Creates new form MENU
     */
    JDesktopPane escritorio=null;
    public MENU(JDesktopPane panel) {
        initComponents();
        escritorio=panel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonRound2 = new rojerusan.RSButtonRound();
        rSButtonRound3 = new rojerusan.RSButtonRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro1();
        IMAGENPIZZA = new rojeru_san.rspanel.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        preciopizza = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombrepizza = new javax.swing.JLabel();
        tamanopizza = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("MENU");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonRound2.setBackground(new java.awt.Color(153, 153, 0));
        rSButtonRound2.setText("CREAR NUEVO MENU");
        rSButtonRound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound2ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        rSButtonRound3.setBackground(new java.awt.Color(255, 153, 51));
        rSButtonRound3.setText("EDITAR ELEMENTO");
        rSButtonRound3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound3ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 602, 300));

        javax.swing.GroupLayout IMAGENPIZZALayout = new javax.swing.GroupLayout(IMAGENPIZZA);
        IMAGENPIZZA.setLayout(IMAGENPIZZALayout);
        IMAGENPIZZALayout.setHorizontalGroup(
            IMAGENPIZZALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        IMAGENPIZZALayout.setVerticalGroup(
            IMAGENPIZZALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        getContentPane().add(IMAGENPIZZA, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 160, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Precio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        preciopizza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        preciopizza.setText("0.0");
        getContentPane().add(preciopizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Tamaño");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        nombrepizza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombrepizza.setText("NOMBRE_PIZZA");
        getContentPane().add(nombrepizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 360, -1));

        tamanopizza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tamanopizza.setText("FAMILIAR-MEDIANA-...");
        getContentPane().add(tamanopizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound2ActionPerformed
        NewJInternalFrame x= new NewJInternalFrame(escritorio);
// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound2ActionPerformed

    private void rSButtonRound3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound3ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Conexion x=new Conexion();
        x.Mostrar_menu(tabla);
    }//GEN-LAST:event_formInternalFrameActivated

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int index_fila_seleccionada = tabla.getSelectedRow();
        DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
        nombrepizza.setText(modelo.getValueAt(index_fila_seleccionada, 1).toString());
        tamanopizza.setText(modelo.getValueAt(index_fila_seleccionada, 3).toString());
        preciopizza.setText(modelo.getValueAt(index_fila_seleccionada, 2).toString());
        ImageIcon icono=new ImageIcon(modelo.getValueAt(index_fila_seleccionada, 4).toString());
        IMAGENPIZZA.setImagen(icono);
// TODO add your handling code here:
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rspanel.RSPanelImage IMAGENPIZZA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombrepizza;
    private javax.swing.JLabel preciopizza;
    private rojerusan.RSButtonRound rSButtonRound2;
    private rojerusan.RSButtonRound rSButtonRound3;
    private rojerusan.RSTableMetro1 tabla;
    private javax.swing.JLabel tamanopizza;
    // End of variables declaration//GEN-END:variables
}