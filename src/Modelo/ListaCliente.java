package Modelo;


public class ListaCliente {

	private Cliente cabeza; //CREAR UNA VARIABLE DE TIPO CLIENTE

	public ListaCliente() {
		cabeza = null; //INICIALIZAR LA VARIABLE DESDE EL CONSTRUCTOR
	}

	public boolean esVacia() { //METODO PARA PREGUNTAR SI LA LISTA ESTA VACIA
		return cabeza == null;
	}
        
        public Cliente getCliente(){ //METODO PARA RECUPERAR LA LISTA DE CLIENTES
            return cabeza;
        }

	public void acolar(String nombres, String apellidos, String cedula) { //AGREGAR UN NUEVO CLIENTE AL FINAL DE LA LISTA
		Cliente nuevo = new Cliente();//INSANCIAR LA CLASE CLIENTES
                //AGREGAR NUEVOS VALORES
		nuevo.setNombres(nombres);
		nuevo.setApellidos(apellidos);
		nuevo.setCedula(cedula);
		if (esVacia()) {//SI ESTA VACIA GUARDARA POR PRIMERA VEZ
			cabeza = nuevo;
		} else { //SI NO ESTA VACIA APUNTARA AL SIGUIENTE CLIENTE HASTA LLEGAR A NULL
			Cliente aux = cabeza; //CREAR UNA COPIA DE LA LISTA CLIENTES
			while (aux.getSiguienteCliente() != null) {//RECORRER LA LISTA DE LOS CLIENTES
				aux = aux.getSiguienteCliente();//INCREMENTAR CON UN CLIENTE MAS
			}
			aux.setSiguienteCliente(nuevo);//CUANDO APUNTE A NULL GUARDAR UN NUEVO CLIENTE
		}
	}

}
