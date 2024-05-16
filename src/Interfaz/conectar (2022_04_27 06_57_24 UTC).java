/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class conectar {
     Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/multas";
    
    public void conectar(){
        con=null;
        try{
            Class.forName(driver);
            con=(Connection)DriverManager.getConnection(url,user,pass);
            if (con!= null){
                System.out.println("Conexión Establecida");
            }
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Error de conexión"+e);
        }
    }
}


