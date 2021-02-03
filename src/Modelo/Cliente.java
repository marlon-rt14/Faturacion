package Modelo;

public class Cliente {

	//DECLARACION DE VARIABLES DE LOS ATRIBUTOS DEL CLIENTE
	private static String nombres;
	private static String apellidos;
	private static String cedula;
	private Cliente siguienteCliente;

        //INICIALIZAR LOS ATRIBUTOS CON UN CONSTRUCTOR
	public Cliente() {
		nombres = "";
		apellidos = "";
		cedula = "";
		siguienteCliente = null;
	}

	//CREAR GETTERS Y SETTERS DE LOS ATRIBUTOS DEL CLIENTE
	public Cliente getSiguienteCliente() {
		return siguienteCliente;
	}

	public void setSiguienteCliente(Cliente siguienteCliente) {
		this.siguienteCliente = siguienteCliente;
	}

	public static String getNombres() {
		return nombres;
	}

	public static void setNombres(String nombres) {
		Cliente.nombres = nombres;
	}

	public static String getApellidos() {
		return apellidos;
	}

	public static void setApellidos(String apellidos) {
		Cliente.apellidos = apellidos;
	}

	public static String getCedula() {
		return cedula;
	}

	public static void setCedula(String cedula) {
		Cliente.cedula = cedula;
	}

}
