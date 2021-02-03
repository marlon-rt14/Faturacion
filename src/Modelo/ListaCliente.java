package Modelo;

import javax.swing.table.DefaultTableModel;

public class ListaCliente {

	private Cliente cabeza;
	private int tamanio;

	public ListaCliente() {
		cabeza = null;
		tamanio = 0;
	}

	public boolean esVacia() {
		return cabeza == null;
	}

	public int getTamanio(){
		return tamanio;
	}
        
        public Cliente getCliente(){
            return cabeza;
        }

	public void acolar(String nombres, String apellidos, String cedula) {
		Cliente nuevo = new Cliente();
		nuevo.setNombres(nombres);
		nuevo.setApellidos(apellidos);
		nuevo.setCedula(cedula);
		if (esVacia()) {
			cabeza = nuevo;
		} else {
			Cliente aux = cabeza;
			while (aux.getSiguienteCliente() != null) {
				aux = aux.getSiguienteCliente();
			}
			aux.setSiguienteCliente(nuevo);
		}
		tamanio++;
	}

}
