package com.geolitic.model;

import com.geolitic.POJO.LoginBean;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class AccionLogin implements SessionAware{
    
    private String nombre;
    private String contra;
    private Map<String,Object> session;

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
            session.put("nombre",nombre);            
            return "Exito";
        }else{
            return "Fracaso";
        }
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }
    
}
