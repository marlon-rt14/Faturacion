
package controladores;

import Modelo.Cliente;
import Modelo.ListaProductos;
import Modelo.Producto;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


public class IniciarDatos {
    
    public static void cargarComboProductos(JComboBox<String> dcm, Producto cabeza){
        Producto aux = cabeza;
        while(aux != null){
            dcm.addItem(aux.getDescripcion());
            aux = aux.getSiguienteProducto();
        }
    }
}
