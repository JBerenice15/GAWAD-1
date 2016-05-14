package com.geolitic.POJO;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginBean {

    private String nombre = "";    
    private String pass = "";

    private Connection con = null;
    private Statement s = null;
    private ResultSet rs = null;

    public boolean validateUser(String name, String password) throws PropertyVetoException, SQLException, IOException {        
        try {
            con = DataSource.getInstance().getConnection();
            s = con.createStatement();
            rs = s.executeQuery("SELECT UserName,Pass FROM Usuarios WHERE UserName = '" + name + "' and Pass = '" + password + "';");
            while (rs.next()) {
                nombre = rs.getString("UserName");
                pass = rs.getString("Pass");
            }
        } catch (SQLException es) {
        }
        if (nombre.compareTo(name) == 0) {
            if (pass.compareTo(password) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean registra(String name, String appat, String apmat, String sexo, String edad, String username, String contra) throws PropertyVetoException, IOException {                      
           String sql = "INSERT INTO Usuarios(Nombre,ApPat,ApMat,Sexo,Edad,UserName,Pass) VALUES (' "+name+" ',' "+appat+" ',' "+apmat+" ',' "+sexo+" ',' "+edad+" ',' "+username+" ',' "+contra+" ')";
           int ee;
           try {
            con = DataSource.getInstance().getConnection();
            s = con.createStatement();
            ee = s.executeUpdate(sql);
            if(ee > 0){
                return true;
            }
        } catch (SQLException es) {
        }           
          return false;
    }

}
