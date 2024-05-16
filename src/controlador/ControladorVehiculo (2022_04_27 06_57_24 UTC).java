/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import java.util.List;
import modelo.Persona;
import modelo.Vehiculo;


public class ControladorVehiculo {
    List<Vehiculo> vehiculo=new LinkedList();
    
    public void agregar(Vehiculo veh){
        vehiculo.add(veh);
    }
    public void buscar(Vehiculo ID){
        vehiculo.add(ID);
    }
    
    public List<Vehiculo> getMulta(){
        return vehiculo;
    }
    public void setPersona(List<Vehiculo> vehiculo) {
        this.vehiculo=vehiculo;
    }
}
