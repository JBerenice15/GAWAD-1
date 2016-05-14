package com.geolitic.hibernate;

public class Usuarios  implements java.io.Serializable {

     private Integer iduser;
     private String nombre;
     private String apPat;
     private String apMat;
     private String sexo;
     private int edad;
     private String userName;
     private String pass;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apPat, String apMat, String sexo, int edad, String userName, String pass) {
       this.nombre = nombre;
       this.apPat = apPat;
       this.apMat = apMat;
       this.sexo = sexo;
       this.edad = edad;
       this.userName = userName;
       this.pass = pass;
    }
   
    public Integer getIduser() {
        return this.iduser;
    }
    
    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApPat() {
        return this.apPat;
    }
    
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }
    public String getApMat() {
        return this.apMat;
    }
    
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
}


