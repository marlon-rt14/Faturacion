
package Modelo;

public class ListaProductos {
    
    private Producto cabeza;//CREAR UNA VARIABLE DE TIPO PRODUCTO

    public ListaProductos() {
        cabeza = null;//INICIALIZAR LA VARIABLE DESDE EL CONSTRUCTOR
    }
    
    public boolean esVacia(){
        return cabeza == null; //METODO PARA PREGUNTAR SI LA LISTA ESTA VACIA
    }
    
    public Producto getProducto(){ //METODO PARA RECUPERAR LA LISTA DE PRODUCTOS
        return cabeza;
    }
    
    public void acolar(String descripcion, double precio){//AGREGAR UN NUEVO PRODUCTO AL FINAL DE LA LISTA
        Producto nuevo = new Producto();//INSANCIAR LA CLASE CLIENTES
        //AGREGAR NUEVOS VALORES
        nuevo.setDescripcion(descripcion);
        nuevo.setPrecio(precio);
        if(esVacia()){//SI ESTA VACIA GUARDARA POR PRIMERA VEZ
            cabeza = nuevo;
        }else{//SI NO ESTA VACIA APUNTARA AL SIGUIENTE PRODUCTO HASTA LLEGAR A NULL
            Producto aux = cabeza; //CREAR UNA COPIA DE LA LISTA PRODUCTOS
            while(aux.getSiguienteProducto() != null){//RECORRER LA LISTA DE LOS PRODUCTOS
                aux = aux.getSiguienteProducto();//INCREMENTAR CON UN PRODUCTO MAS
            }
            aux.setSiguienteProducto(nuevo);//CUANDO APUNTE A NULL GUARDAR UN NUEVO PRODUCTO
        }
    }
    
}
