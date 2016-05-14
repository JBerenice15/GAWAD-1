package com.geolitic.model;

import com.geolitic.hibernate.HibernateUtil;
import com.geolitic.hibernate.Usuarios;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RegistraAction extends ActionSupport {        
    
    private String nombre;
    private String appat;
    private String apmat;
    private String sexo;
    private int edad;
    private String username;
    private String pass;
    private Session hibernateSession;    

    public Session getHibernateSession() {
        return hibernateSession;
    }

    public void setHibernateSession(Session hibernateSession) {
        this.hibernateSession = hibernateSession;
    }
  
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    public String execute() throws Exception {        
      
       hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
       if(hibernateSession != null){
      //Insert
        Transaction t0=hibernateSession.beginTransaction();
        Usuarios user0 = new Usuarios();        
        user0.setNombre(nombre);
        user0.setApPat(appat);
        user0.setApMat(apmat);
        user0.setSexo(sexo);
        user0.setEdad(edad);
        user0.setUserName(username);
        user0.setPass(pass);
        hibernateSession.save(user0);
        t0.commit();
        return "ExitoRegistro";    
       }else{
           return "Fallo";
       }
    }
}
