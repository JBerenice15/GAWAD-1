package com.geolitic.model;

import com.geolitic.POJO.LoginBean;
import java.beans.PropertyVetoException;
import java.sql.SQLException;

public class AccionLogin {
    
    private String nombre;
    private String contra;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
            
    public String execute() throws PropertyVetoException, SQLException{
        LoginBean lb = new LoginBean();        
        if(lb.validateUser(nombre,contra)){
            return "Exito";
        }else{
            return "Fracaso";
        }
    }
    
}
