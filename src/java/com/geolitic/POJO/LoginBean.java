package com.geolitic.POJO;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginBean {
    
    private String nombre ="";
    private String pass="";
    
    public boolean validateUser(String name,String password) throws PropertyVetoException, SQLException{
        Connection con = null;
        Statement s = null;
        ResultSet rs = null;        
        try{            
            con = DataSource.getInstance().getConnection();
            s = con.createStatement();
            rs = s.executeQuery("SELECT nombre,pass FROM Usuarios WHERE nombre = '"+name+"' and pass = '"+password+"';");            
            while(rs.next()){
                nombre = rs.getString("nombre");
                pass = rs.getString("pass");
            }           
        }catch(SQLException es){            
        }catch(IOException ioe){            
        }     
        if(nombre.compareTo(name) == 0){
            if(pass.compareTo(password) == 0){
                return true;
            }
        }        
        return false;           
    }
    
}
