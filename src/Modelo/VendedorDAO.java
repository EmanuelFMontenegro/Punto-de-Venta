
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VendedorDAO {
  Conexion con = new Conexion();
  PreparedStatement ps;
  ResultSet rs;
  Connection ingreso;
  
  

  public Vendedor ValidarVendedor(String usuario, String contraseña) {

    Vendedor vn = new Vendedor();

    try {
      ingreso = con.Conectar();
      String sql = "SELECT * FROM login WHERE usuario=? and contraseña=?";
      ps = ingreso.prepareStatement(sql);
      ps.setString(1, usuario);
      ps.setString(2, contraseña);
      rs = ps.executeQuery();
      
      while (rs.next()) {
        vn.setUsuario(rs.getString(1));
        vn.setContraseña(rs.getString(2));
        
      }

    } catch (Exception e) {
      System.out.println("Error:" + e);
      
    }
    return vn;
    
  } 
 
}