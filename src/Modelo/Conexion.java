
package Modelo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

  Connection con;

  public Connection Conectar() throws ClassNotFoundException {

    String url = "jdbc:mysql://127.0.0.1:3306/";
    String user = "root";
    String bdName = "bdsistema";
    String password = "emanuel555";
    String driver = "com.mysql.jdbc.Driver";

    try {
      Class.forName(driver);
      con = DriverManager.getConnection(url+ bdName, user,password);
      System.out.println("La Base de Datos esta Conectada");
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos :\n" + ex);
    }
    return con;
  }

}


    

