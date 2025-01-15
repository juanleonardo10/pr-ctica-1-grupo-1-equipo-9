package gestorAplicacion.Usuario;

import java.io.Serializable;

public abstract class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS
	
	 protected String nombre;
	 protected int cedula;
	 
	 //Como es una clase abstracta necesita un metodo abstracto
	 
	 //METODO ABSTRACTO
	 
	 public abstract void mostrarInformacion();
	 
	 //METODOS
	 
	 public String despedida() {
	        return "Hasta luego " + nombre + ".\nEsperamos que regreses pronto."; // NOTA DE MI PARA MI: no me gusta esta despedida
	        
	 }
	 
	//GETTERS Y SETTERS 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	 
}
	 
	 


