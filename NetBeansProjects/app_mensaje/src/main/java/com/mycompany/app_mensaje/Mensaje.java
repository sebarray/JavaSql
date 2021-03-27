/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app_mensaje;

/**
 *
 * @author sebas
 */
public class Mensaje {
    int id;
    String mensaje;
    String autor;
    String  fecha;
    
    public Mensaje(){
    }

    public Mensaje(String mensaje, String autor, String fecha) {
        this.mensaje = mensaje;
        this.autor = autor;
        this.fecha = fecha;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
