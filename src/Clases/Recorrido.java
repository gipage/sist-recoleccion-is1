/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 */
public class Recorrido {
    private Date fecha;
    private String ruta;
    private Zona zona;
    private Camion camion;

    public Recorrido(Date fecha, String ruta) {
        this.fecha = fecha;
        this.ruta = ruta;
        this.zona = new Zona();
        this.camion =new Camion();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
    
    
}
