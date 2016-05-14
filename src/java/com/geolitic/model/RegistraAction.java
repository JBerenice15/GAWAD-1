package com.geolitic.model;

import com.geolitic.POJO.LoginBean;

public class RegistraAction {        
    
    private String nombre;
    private String appat;
    private String apmat;
    private String sexo;
    private String edad;
    private String username;
    private String contra;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
    public String execute() throws Exception {        
        LoginBean lb = new LoginBean();
        if(lb.registra(nombre, appat, apmat, sexo, edad, username, contra)){
            return "ExitoRegistro";
        }else return "Fallo";
    }
    
}
