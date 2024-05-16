/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.alegaciones;
import java.util.ArrayList;
public class controladorAlegaciones {

ArrayList<alegaciones> multa=new ArrayList<>();

    public void guardar(alegaciones y){
        multa.add(y);
    }
    
    public alegaciones consultar(String ID){
        for(alegaciones Y: multa){
       if(Y.getAlegacion().equalsIgnoreCase(ID)){
           
       }     
        }
        return null;
    }
    public ArrayList<alegaciones> lister(){
        return multa;
    }
    public int numerodeProyecto(String estado){
        int num=0;
        for(alegaciones y: multa){
            if(y.getEstado().equalsIgnoreCase(estado)){
        }
    }
    return num;
    }
    public String[] estadoVal(){
    return new String[]{
        "Iniciado","Finalizado","Espera"
    };
    }
    private String alegacion;

    public String getalegacion() {
        return alegacion;
    }

    public void setalegacion(String Alegacion) {
        this.alegacion = Alegacion;
    }

}
    

