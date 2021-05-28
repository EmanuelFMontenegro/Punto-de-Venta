package Modelo;

public class DetalleVentas {
  int id;
  int idVentas;
  int idProducto;
  int cantidad;
  double precio;
  double total;

  public DetalleVentas() {
  }

  public DetalleVentas(int id, int idVentas, int idProducto, int cantidad, double precio, double Total) {
    this.id = id;
    this.idVentas = idVentas;
    this.idProducto = idProducto;
    this.cantidad = cantidad;
    this.precio = precio;
    this.total=total;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getIdVentas() {
    return idVentas;
  }

  public void setIdVentas(int idVentas) {
    this.idVentas = idVentas;
  }

  public int getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(int idProducto) {
    this.idProducto = idProducto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }
public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }
}
