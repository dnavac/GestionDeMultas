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
public class Multa {

    String codigo;
    String fecha;
    String hora;
    String persona;
    String motivo;
    String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public Multa(String codigo, String fecha, String hora, String persona, String motivo, String descripcion, String ID) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.persona = persona;
        this.motivo = motivo;
        this.descripcion = descripcion;
        this.ID = ID;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }


}
