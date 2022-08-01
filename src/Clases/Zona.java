/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import BD.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 */
public class Zona {
    private String nombre;
    private String descripcion;
    private String hora;
    private ArrayList<Empleado> arr_emp;
    private ArrayList<Camion> arr_camion;
    
    
    public Zona(){}
    
    public Zona(String nombre, String descripcion, String hora) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.hora = hora;
        this.arr_emp = new ArrayList<Empleado>();
        this.arr_camion= new ArrayList<Camion>();
    }
    
    public Zona(Zona zona){
        this.nombre=zona.nombre;
        this.descripcion=zona.descripcion;
        this.hora=zona.hora;
        this.arr_emp = new ArrayList<Empleado>();
        this.arr_camion= new ArrayList<Camion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    public ArrayList<Empleado> obtenerArrayListEmpleado(){
        return this.arr_emp;
    }
    
    public ArrayList<Camion> obtenerArrayListCamion(){
        return this.arr_camion;
    }
        
   
   
    
    public void consultar_emp_zona(){
  
    //si la query es vacio no cargue
    //comparar por dni 
    ResultSet rs;
    java.sql.Statement st;
    Conexion con = new Conexion(); 
    try{
            Connection conexion = con.Conectar();
            st = conexion.createStatement();
            String sql = "SELECT empleados.edni,enombre,elegajo,etel,edireccion, ecargo FROM recorrido,trabajan, empleados WHERE recorrido.cpatente=trabajan.cpatente and znbre='"+this.getNombre()+"'and trabajan.edni=empleados.edni";
            rs = st.executeQuery(sql);
             while(rs.next()){
              Empleado emp= new Empleado();
              emp.setDni(rs.getString(1));
              emp.setNombre(rs.getString(2));
              emp.setLegajo(rs.getString(3));
              emp.setTelefono(rs.getString(4));
              emp.setDireccion(rs.getString(5));
              emp.setCargo(rs.getString(6));
              this.arr_emp.add(emp);
               
          }
        //quiza hacerlo en el main y no aca.
       st.close();
       conexion = con.Cerrar();//Cierro la conexion

    }catch (Exception e){System.out.println("Error en el try");}
         
    
    
        }
    
    
    
    
    public void consultar_camiones(){
    ResultSet rs;
    java.sql.Statement st;
    Conexion con = new Conexion();    
        try{
            Connection conexion = con.Conectar();
            st = conexion.createStatement();
            String sql = "SELECT cestado, cmodelo, recorrido.cpatente FROM recorrido, camiones WHERE recorrido.znbre='"+this.getNombre()+"' and recorrido.cpatente=camiones.cpatente and camiones.cestado='ACTIVO'";
            rs = st.executeQuery(sql);
             while(rs.next()){
              Camion C= new Camion();
              C.setEstado(rs.getString("cestado"));
              C.setModelo(rs.getString("cmodelo"));
              C.setPatente(rs.getString("cpatente"));
              this.arr_camion.add(C);
              /*if(!ArrCamion.contains(C)){//Consultar si usamos C o C.patente
              ArrCamion.add(C);
              }*/
          }

    }catch (Exception e){System.out.println("Error en el try");}
     //cerrar bd   

    }
    
    
    }
    

