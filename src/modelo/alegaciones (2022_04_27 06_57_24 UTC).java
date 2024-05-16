/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class alegaciones {

String codigo;
String persona;
String alegacion;
String estado;

    public alegaciones(String codigo, String persona, String alegacion, String estado) {
        this.codigo = codigo;
        this.persona = persona;
        this.alegacion = alegacion;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getAlegacion() {
        return alegacion;
    }

    public void setAlegacion(String alegacion) {
        this.alegacion = alegacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

        
    
}
