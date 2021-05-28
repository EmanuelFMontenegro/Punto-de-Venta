package Modelo;

public class Ventas {
 
  int IdCliente;
  int IdVendedor;
  String Fecha;
  double Monto;
  String Estado;

  public Ventas() {

  }
public Ventas(int IdCliente, int IdVendedor, String Fecha, double Monto, String Estado) {
        
        this.IdCliente = IdCliente;
        this.IdVendedor = IdVendedor;
        this.Fecha = Fecha;
        this.Monto = Monto;
        this.Estado = Estado;
    }  
     
       public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        this.IdCliente = idCliente;
    }

    public int getIdVendedor() {
        return IdVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.IdVendedor = idVendedor;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        this.Monto = monto;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }

   }  

    

  

 