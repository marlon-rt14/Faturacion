
package Modelo;


public class Producto {
    
    //DECLARACION DE VARIABLES DE LOS ATRIBUTOS DEL CLIENTE
    private String descripcion;
    private double precio;
    private Producto siguienteProducto;
    
    //INICIALIZAR LOS ATRIBUTOS CON UN CONSTRUCTOR
    public Producto(){
        descripcion = "";
        precio = 0;
        siguienteProducto = null;
    }

    //CREAR GETTERS Y SETTERS DE LOS ATRIBUTOS DEL CLIENTE
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto getSiguienteProducto() {
        return siguienteProducto;
    }

    public void setSiguienteProducto(Producto siguienteProducto) {
        this.siguienteProducto = siguienteProducto;
    }
    
    
}
