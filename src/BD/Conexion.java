/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 */
public class Conexion {
    Connection conn = null;
    String url = "jdbc:postgresql://localhost:5432/Residuos_Veronav5";
    String usuario = "postgres";
    String clave = "gino";
   
    public Connection Conectar(){
    try{   
    Class.forName("org.postgresql.Driver");
    conn = DriverManager.getConnection(url, usuario, clave);
    System.out.println("Conexion exitosa");   
    }catch(Exception e){
    System.out.println("Conexion fallida"); 
    }
        return conn;
    }
    
    public Connection Cerrar(){
        try{
            conn.close();
            System.out.println("Desconexion exitosa"); 
        }catch(Exception e){
            System.out.println("Desconexion fallida"); 
        }
        return conn;
    }
    
}
