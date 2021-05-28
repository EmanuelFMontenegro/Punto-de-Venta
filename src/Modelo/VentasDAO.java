package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentasDAO {
  
  Conexion con = new Conexion();
  Connection conn;
  PreparedStatement ps;
  ResultSet rs;
  int r = 0;

  public String IdVentas() {
    String idv = "";
    String sql = "select max(Idventas) from ventas";

    try {
      conn = con.Conectar();
      ps = conn.prepareStatement(sql);
      rs = ps.executeQuery();

      while (rs.next()) {
        idv = rs.getString(1);

      }
    } catch (Exception e) {
    }
    return idv;
  }

  public int GuardarVentas(Ventas v) {
    Ventas ventas = new Ventas();
    String sql = "insert into ventas (IdCliente,IdVendedor,Fecha,Monto,Estado) values (?,?,?,?,?,?)";
    try {
      conn = con.Conectar();
      ps = conn.prepareStatement(sql);
      ps.setInt(1, v.getIdCliente());
      ps.setInt(2, v.getIdVendedor());
      ps.setString(3, v.getFecha());
      ps.setDouble(4, v.getMonto());
      ps.setString(5, v.getEstado());

      r = ps.executeUpdate();

    } catch (Exception e) {

    }

    return r;
  }

 public int GuardarDetalleVentas(DetalleVentas dv) {
    
     String sql = "insert into detalleventas(IdVentas,IdProducto,Cantidad,Precio,Total) values(?,?,?,?,?)";

    try {
      conn = con.Conectar();
      ps = conn.prepareStatement(sql);
      ps.setInt(1, dv.getIdVentas());
      ps.setInt(2, dv.getIdProducto());
      ps.setInt(3, dv.getCantidad());
      ps.setDouble(4, dv.getPrecio());
      ps.setDouble(5, dv.getTotal());

      ps.executeUpdate();
    } catch (Exception e) {
    }
    return r;

  }

}
