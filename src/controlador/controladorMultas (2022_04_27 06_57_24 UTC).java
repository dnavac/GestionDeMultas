package controlador;

import java.util.ArrayList;
import modelo.Multa;
public class controladorMultas {
    
    ArrayList<Multa> multa=new ArrayList<>();
    
    public void agregar(Multa mul){
        multa.add(mul);
    }
    public Multa buscar(String ID){
     for(Multa Y: multa){
         if(Y.getID().equalsIgnoreCase(ID)){
             return Y;
         }
     }
        return null;
    }
    
    public ArrayList<Multa> multa(){
        return multa;
    }
  
    }

