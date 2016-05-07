package com.geolitic.model;

import com.geolitic.POJO.LoginBean;
import java.beans.PropertyVetoException;
import java.sql.SQLException;

public class AccionLogin {
    
    private String nombre;
    private String pass;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
            
    public String execute() throws PropertyVetoException, SQLException{
        LoginBean lb = new LoginBean();        
        if(lb.validateUser(getNombre(), getPass())){
            return "Exito";
        }else{
            return "Fracaso";
        }
    }
    
}
