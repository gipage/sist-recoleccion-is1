/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 */
public class Camion {
    private String patente;
    private String modelo;
    private String estado; 
    private ArrayList<Empleado> arr_emp;
    
    public Camion(){}

    public Camion(String patente, String modelo, String estado) {
        this.patente = patente;
        this.modelo = modelo;
        this.estado = estado;
        this.arr_emp = new ArrayList<Empleado>();
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
       
}
