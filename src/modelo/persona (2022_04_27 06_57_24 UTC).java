/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author lenovo
 */
public class Persona {
    String nombre;
    String nCelular;
    String correo;
    String cc;
    String id;

    public Persona(String nombre, String nCelular, String correo, String cc, String id) {
        this.nombre = nombre;
        this.nCelular = nCelular;
        this.correo = correo;
        this.cc = cc;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnCelular() {
        return nCelular;
    }

    public void setnCelular(String nCelular) {
        this.nCelular = nCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}