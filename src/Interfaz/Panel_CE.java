/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;
import Clases .*;
import BD.*;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author ginop
 */
public class Panel_CE extends javax.swing.JPanel{

    /**
     * Creates new form Panel_CE
     */
    public Panel_CE() {
        initComponents();
        jTableCE.getTableHeader().setFont(new Font("Roboto",Font.BOLD,12));
        jTableCE.getTableHeader().setOpaque(false);
        jTableCE.getTableHeader().setBackground(new Color(102,0,204));
        jTableCE.getTableHeader().setForeground(new Color(102,0,204));
        jTableCE.setRowHeight(25);
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nombrezonaTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCE = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        accept = new javax.swing.JLabel();
        vaciarlabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(18, 22, 24));
        setPreferredSize(new java.awt.Dimension(650, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese la zona:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 30));

        nombrezonaTF.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombrezonaTF.setToolTipText("");
        nombrezonaTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 204), 2));
        nombrezonaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrezonaTFActionPerformed(evt);
            }
        });
        add(nombrezonaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 100, 30));

        jTableCE.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTableCE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "NOMBRE", "LEGAJO", "TELEFONO", "DIRECCION", "CARGO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableCE.setFocusable(false);
        jTableCE.setGridColor(new java.awt.Color(204, 204, 204));
        jTableCE.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableCE.setName(""); // NOI18N
        jTableCE.setRowHeight(25);
        jTableCE.setSelectionBackground(new java.awt.Color(204, 0, 255));
        jTableCE.setShowVerticalLines(false);
        jTableCE.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableCE);
        if (jTableCE.getColumnModel().getColumnCount() > 0) {
            jTableCE.getColumnModel().getColumn(0).setResizable(false);
            jTableCE.getColumnModel().getColumn(1).setResizable(false);
            jTableCE.getColumnModel().getColumn(2).setResizable(false);
            jTableCE.getColumnModel().getColumn(3).setResizable(false);
            jTableCE.getColumnModel().getColumn(4).setResizable(false);
            jTableCE.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 680, 340));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Empleados por zona");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_checked_checkbox_50px_1.png"))); // NOI18N
        accept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptMouseClicked(evt);
            }
        });
        add(accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        vaciarlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_waste_50px.png"))); // NOI18N
        vaciarlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vaciarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vaciarlabelMouseClicked(evt);
            }
        });
        add(vaciarlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, 50));
    }// </editor-fold>//GEN-END:initComponents

   
    private void nombrezonaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrezonaTFActionPerformed
        
    }//GEN-LAST:event_nombrezonaTFActionPerformed

    private void acceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptMouseClicked
    borrarFilaATabla(); //vacia la jtable
    int tam_arrayemp=0;
    String nzona;
    nzona=nombrezonaTF.getText(); //recuper del textfiled la zona
    if(!(nzona.equals(""))){ //si jtexfield no esta vacio prosigo
        if((PPv3.obtenerZona(nzona))!=null){
        Zona zaux=new Zona(PPv3.obtenerZona(nzona)); //se pasa por dir pero no copio el arraylist jeje
            zaux.consultar_emp_zona();
            tam_arrayemp=zaux.obtenerArrayListEmpleado().size(); 
            for(int i=0;i<tam_arrayemp;i++){
              agregarFilaATabla(new Object[]{zaux.obtenerArrayListEmpleado().get(i).getDni(),zaux.obtenerArrayListEmpleado().get(i).getNombre(),zaux.obtenerArrayListEmpleado().get(i).getLegajo(),zaux.obtenerArrayListEmpleado().get(i).getDireccion(),zaux.obtenerArrayListEmpleado().get(i).getTelefono(),zaux.obtenerArrayListEmpleado().get(i).getCargo()});
                }
        }else{JOptionPane.showMessageDialog(this,"Zona invalida");}
    }else{JOptionPane.showMessageDialog(this,"Debe ingresar una zona");}
    }//GEN-LAST:event_acceptMouseClicked

    private void vaciarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaciarlabelMouseClicked
        borrarFilaATabla();
        nombrezonaTF.setText(null);
    }//GEN-LAST:event_vaciarlabelMouseClicked

// Metodo que agrega un nuevo dato a la tabla principal: 
    public void agregarFilaATabla(Object[] datoFila)
    {
        DefaultTableModel modelo = (DefaultTableModel) jTableCE.getModel();
        modelo.addRow(datoFila);
    }

    public void borrarFilaATabla(){
    DefaultTableModel modelo = (DefaultTableModel)jTableCE.getModel();
    modelo.setRowCount(0);
    
    }
   
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCE;
    private javax.swing.JTextField nombrezonaTF;
    private javax.swing.JLabel vaciarlabel;
    // End of variables declaration//GEN-END:variables
}
