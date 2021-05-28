package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements CRUD {

  Connection con;
  Conexion cn = new Conexion();
  PreparedStatement ps;
  ResultSet rs;

  public Cliente listarID(String dni) {
    String sql = "select * from cliente where dni=?";
    Cliente c = new Cliente();
    try {
      con = cn.Conectar();
      ps = con.prepareStatement(sql);
      ps.setString(1, dni);
      rs = ps.executeQuery();
      while (rs.next()) {
        c.setId(rs.getInt(1));
        c.setDni(rs.getString(2));
        c.setNombres(rs.getString(3));
        c.setDireccion(rs.getString(4));
        c.setEstado(rs.getString(5));

      }

    } catch (Exception e) {
    }
    return c;
  }

  @Override
  public List listar() {
    List<Cliente> lista = new ArrayList<>();
    String sql = "select * from cliente;";
    try {
      con = cn.Conectar();
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
      while (rs.next()) {
        Cliente c = new Cliente();
        c.setId(rs.getInt(1));
        c.setDni(rs.getString(2));
        c.setNombres(rs.getString(3));
        c.setDireccion(rs.getString(4));
        c.setEstado(rs.getString(5));
        lista.add(c);

      }

    } catch (Exception e) {
    }
    return lista;

  }

  @Override
  public int add(Object[] o) {
    int r = 0;
    String sql = "insert into cliente(dni,nombre,direccion,estado) values(?,?,?,?)";
    try {
      con = cn.Conectar();
      ps = con.prepareStatement(sql);

      Cliente c = new Cliente();
      ps.setObject(1, o[0]);
      ps.setObject(2, o[1]);
      ps.setObject(3, o[2]);
      ps.setObject(4, o[3]);
      r = ps.executeUpdate();

    } catch (Exception e) {
    }
    return r;

  }

  @Override
  public int actualizar(Object[] o) {
    int r = 0;
    String sql = "update cliente set Dni=?,Nombres=?,Direccion=?, Estado=? where idcliente=?";
    try {
      con = cn.Conectar();
      ps = con.prepareStatement(sql);
      ps.setObject(1, o[0]);
      ps.setObject(2, o[1]);
      ps.setObject(3, o[2]);
      ps.setObject(4, o[3]);
      ps.setObject(5, o[4]);
      r = ps.executeUpdate();
    } catch (Exception e) {
    }
    return r;
  }

  @Override
  public void eliminar(int Id) {
    String sql = "delete from cliente where idcliente=?";
    try {
      con = cn.Conectar();
      ps = con.prepareStatement(sql);
      ps.setInt(1, Id);
      ps.executeUpdate();
    } catch (Exception e) {
    }

  }

}
