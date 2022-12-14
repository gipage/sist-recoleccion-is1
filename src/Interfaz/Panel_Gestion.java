/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import javax.swing.JPanel;

/**
 *
 * @author ginop
 */
public class Panel_Gestion extends javax.swing.JPanel {
    
    /**
     * Creates new form Panel_Gestion
     */
    public Panel_Gestion() {
        initComponents();
        boton_cargar.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boton_cargar = new javax.swing.JRadioButton();
        boton_eliminar = new javax.swing.JRadioButton();
        aceptarlabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(18, 22, 24));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de empleados");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione una opción:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        buttonGroup1.add(boton_cargar);
        boton_cargar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        boton_cargar.setForeground(new java.awt.Color(255, 255, 255));
        boton_cargar.setText("Cargar Empleado");
        add(boton_cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        buttonGroup1.add(boton_eliminar);
        boton_eliminar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        boton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminar.setText("Eliminar Empleado");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });
        add(boton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        aceptarlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_checked_checkbox_50px_1.png"))); // NOI18N
        aceptarlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarlabelMouseClicked(evt);
            }
        });
        add(aceptarlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void aceptarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarlabelMouseClicked
       if(boton_cargar.isSelected()){
            PantallaCargarEmpleado emple = new PantallaCargarEmpleado();
            emple.setVisible(true);
            boton_cargar.setSelected(false);
        }
        if(boton_eliminar.isSelected()){
            PantallaEliminarEmp emp = new PantallaEliminarEmp();
            emp.setVisible(true);
            boton_eliminar.setSelected(false);
        }
    }//GEN-LAST:event_aceptarlabelMouseClicked
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceptarlabel;
    private javax.swing.JRadioButton boton_cargar;
    private javax.swing.JRadioButton boton_eliminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
