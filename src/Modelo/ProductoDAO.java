package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductoDAO {
  int r;
  PreparedStatement ps;
  ResultSet rs;
  Connection con;
  Conexion acceso = new Conexion();
  Producto pro = new Producto();
 
  public Producto listarID(int id){
   Producto p = new Producto();
   String sql= "select * from producto where IdProducto=?";
      try {
          con=acceso.Conectar();
          ps=con.prepareStatement(sql);
          ps.setInt(1,id);
          rs=ps.executeQuery();
          while(rs.next()){
          p.setIdProducto(rs.getInt(1));
          p.setDescripcion(rs.getString(2));
          p.setPrecio(rs.getDouble(3));
          p.setStock(rs.getInt(4));
          }
          
      } catch (Exception e) {
      }
      return p;
  }
}
