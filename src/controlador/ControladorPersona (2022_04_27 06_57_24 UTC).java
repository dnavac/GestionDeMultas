/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import java.util.List;
import modelo.Multa;
import modelo.Persona;
public class ControladorPersona {

    List<Persona> persona=new LinkedList();
    
    public void agregar(Persona per){
        persona.add(per);
    }
    public void buscar(Persona ID){
        persona.add(ID);
    }
    
    public List<Persona> getMulta(){
        return persona;
    }
    public void setPersona(List<Persona> persona) {
        this.persona=persona;
    }
}
