/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Producto {
    int    IdProducto;
    String Descripcion;
    double Precio;
    int    Stock;
    
    public Producto(){
    }

    public Producto(int IdProducto, String Descripcion, int Stock) {
        this.IdProducto = IdProducto;
        this.Descripcion = Descripcion;
        this.Stock = Stock;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
     
    
    
    
}
 