/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import BD.Conexion;
import Clases.Empleado;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;



/**
 *
 */
public class PantallaCargarEmpleado extends javax.swing.JFrame {
    
    /**
     * Creates new form JframeEmpleado
     */
    public PantallaCargarEmpleado() {
        initComponents();
        this.setTitle("Cargar empleado");
        this.setLocationRelativeTo(null);
    }
    
    public void limpiar(){
        jTFnom.setText("");
        jTFdni.setText("");
        jTFlegajo.setText("");
        jTFtel.setText("");
        jTFdir.setText("");
    }

public void Cargar (){
    
  if((jTFnom.getText().trim().isEmpty())|| (jTFdni.getText().trim().isEmpty()) || (jTFlegajo.getText().trim().isEmpty()) || (jTFtel.getText().isEmpty()) || (jTFdir.getText().trim().isEmpty())){
      JOptionPane.showMessageDialog(this, "Complete todos los campos.");
      
      }
  else{     
        Empleado emp = new Empleado(jTFnom.getText(), jTFdni.getText(),jTFlegajo.getText(), jTFtel.getText(), jTFdir.getText(), (String) jCBcargo.getSelectedItem());
         
        Conexion con  = new Conexion();//creo la conexion
        
        try{
             Connection connect  = con.Conectar();//abro la conexion
             java.sql.Statement st = connect.createStatement(); //objeto para realizar la consulta
             String sql = "SELECT enombre FROM empleados where edni='"+emp.getDni()+"' or elegajo='"+emp.getLegajo()+"';";
             ResultSet rs = st.executeQuery(sql);
             if(rs.next()){ //SI SE ENCONTRÓ DNI O LEGAJO
             JOptionPane.showMessageDialog(this, "Empleado ya registrado.");
             }
             else{
             sql = "INSERT INTO empleados(edni, enombre, elegajo, etel, edireccion, ecargo) VALUES ('"+emp.getDni()+"', '"+emp.getNombre()+"', '"+emp.getLegajo()+"', '"+emp.getTelefono()+"', '"+emp.getDireccion()+"', '"+emp.getCargo()+"');";
             st.execute(sql);
             JOptionPane.showMessageDialog(this, "Carga exitosa.");}
             st.close();
             connect = con.Cerrar();//cierro la conexion
             limpiar();
             this.setVisible(false);

        }catch(Exception e)
        {
        JOptionPane.showMessageDialog(this, "Carga Fallida.");
        limpiar();
        this.setVisible(false);
        }
      } 
  
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
        jLdireccion = new javax.swing.JLabel();
        jLtel = new javax.swing.JLabel();
        jLlegajo = new javax.swing.JLabel();
        jLdni = new javax.swing.JLabel();
        JLnombre = new javax.swing.JLabel();
        aceptlabel = new javax.swing.JLabel();
        jLcargo = new javax.swing.JLabel();
        jTFnom = new javax.swing.JTextField();
        jTFdni = new javax.swing.JTextField();
        jTFlegajo = new javax.swing.JTextField();
        jTFtel = new javax.swing.JTextField();
        jTFdir = new javax.swing.JTextField();
        jCBcargo = new javax.swing.JComboBox<>();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(18, 22, 24));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(30, 36, 39));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLdireccion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLdireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLdireccion.setText("Dirección");
        jPanel1.add(jLdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLtel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLtel.setForeground(new java.awt.Color(255, 255, 255));
        jLtel.setText("Teléfono");
        jPanel1.add(jLtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, -1));

        jLlegajo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLlegajo.setForeground(new java.awt.Color(255, 255, 255));
        jLlegajo.setText("Legajo");
        jPanel1.add(jLlegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 49, -1));

        jLdni.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLdni.setForeground(new java.awt.Color(255, 255, 255));
        jLdni.setText("DNI");
        jPanel1.add(jLdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 49, -1));

        JLnombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JLnombre.setForeground(new java.awt.Color(255, 255, 255));
        JLnombre.setText("Nombre");
        jPanel1.add(JLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, -1));

        aceptlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_checked_checkbox_50px_1.png"))); // NOI18N
        aceptlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptlabelMouseClicked(evt);
            }
        });
        jPanel1.add(aceptlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        jLcargo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLcargo.setForeground(new java.awt.Color(255, 255, 255));
        jLcargo.setText("Cargo");
        jPanel1.add(jLcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jTFnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFnomKeyTyped(evt);
            }
        });
        jPanel1.add(jTFnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 185, -1));

        jTFdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFdniKeyTyped(evt);
            }
        });
        jPanel1.add(jTFdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 185, -1));

        jTFlegajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFlegajoKeyTyped(evt);
            }
        });
        jPanel1.add(jTFlegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 185, -1));

        jTFtel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFtelKeyTyped(evt);
            }
        });
        jPanel1.add(jTFtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 185, -1));
        jPanel1.add(jTFdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 185, -1));

        jCBcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recolector", "Chofer" }));
        jPanel1.add(jCBcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 185, -1));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_add_60px_2.png"))); // NOI18N
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFnomKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();        //se almacena el caracter de la tecla presionada
        boolean mayusculas = key>=65 && key<=90;    //ASCII 
        boolean minusculas = key>=97 && key<=122;
        boolean espacio = key==32;
        if(!(mayusculas||minusculas||espacio)){
            evt.consume();                 //no recibe los caracteres
        }
        
        
    }//GEN-LAST:event_jTFnomKeyTyped

    private void jTFdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFdniKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();        //se almacena el caracter de la tecla presionada
        boolean numeros = key>=48 && key<=57;    //ASCII números
        if(!numeros){
            evt.consume();                 //no recibe los caracteres
        }
        
        if(jTFdni.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_jTFdniKeyTyped

    private void jTFtelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFtelKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();        //se almacena el caracter de la tecla presionada
        boolean numeros = key>=48 && key<=57;    //ASCII números
        if(!numeros){
            evt.consume();                 //no recibe los caracteres
        }
        if(jTFtel.getText().length()>=20){
            evt.consume();
        }
    }//GEN-LAST:event_jTFtelKeyTyped

    private void jTFlegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFlegajoKeyTyped
        // TODO add your handling code here:
       if(jTFlegajo.getText().length() >=6 ){ evt.consume(); }
    }//GEN-LAST:event_jTFlegajoKeyTyped

    private void aceptlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptlabelMouseClicked
        Cargar();
    }//GEN-LAST:event_aceptlabelMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel aceptlabel;
    private javax.swing.JLabel icon;
    private javax.swing.JComboBox<String> jCBcargo;
    private javax.swing.JLabel jLcargo;
    private javax.swing.JLabel jLdireccion;
    private javax.swing.JLabel jLdni;
    private javax.swing.JLabel jLlegajo;
    private javax.swing.JLabel jLtel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFdir;
    private javax.swing.JTextField jTFdni;
    private javax.swing.JTextField jTFlegajo;
    private javax.swing.JTextField jTFnom;
    private javax.swing.JTextField jTFtel;
    // End of variables declaration//GEN-END:variables
}