
package Modelo;

public class ListaProductos {
    
    private Producto cabeza;

    public ListaProductos() {
        cabeza = null;
    }
    
    public boolean esVacia(){
        return cabeza == null;
    }
    
    public Producto getProducto(){
        return cabeza;
    }
    
    public void acolar(String descripcion, double precio){
        Producto nuevo = new Producto();
        nuevo.setDescripcion(descripcion);
        nuevo.setPrecio(precio);
        if(esVacia()){
            cabeza = nuevo;
        }else{
            Producto aux = cabeza;
            while(aux.getSiguienteProducto() != null){
                aux = aux.getSiguienteProducto();
            }
            aux.setSiguienteProducto(nuevo);
        }
    }
    
}
