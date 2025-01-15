package gestorAplicacion.Usuario;

import java.io.Serializable;
import java.util.ArrayList;

import gestorAplicacion.Entorno.Mesa;
import gestorAplicacion.Gestion.Evento;
import gestorAplicacion.Gestion.Pedido;
import gestorAplicacion.Gestion.Plato;
import gestorAplicacion.Gestion.Restaurante;

//NOTA: faltan cosas revisar
public class Trabajador extends Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	
	    //Estas listas almacenan instancias de trabajadores:
	    //cocineros: Contiene trabajadores clasificados como cocineros.
	    //trabajadores: Contiene todos los trabajadores registrados.
	    //Al ser estáticstos atributos son compartidos por todas las instancias de la clase.
	
	
	private static ArrayList<Trabajador> cocineros = new ArrayList<Trabajador>();                 
    private static ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
    
  //ATRIBUTOS
    
    private String especialidad;
    private int salario;
    private float calificacion;
    private ArrayList<String> reseñas = new ArrayList<String>();
    private Restaurante restaurante;
    private Enum tipo;
    private Mesa mesa;
    private int gananciasExtra;

    public enum Tipo {COCINERO, MESERO}
    
  //CONSTRUCTOR VACIO 

	public Trabajador() {
	} 
    
  //METODOS
	
	public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Salario: " + salario);
    }
	
	//GETTERS Y SETTERS  //NOTA PARA MI: REVISAR

	public static ArrayList<Trabajador> getCocineros() {
		return cocineros;
	}

	public static void setCocineros(ArrayList<Trabajador> cocineros) {
		Trabajador.cocineros = cocineros;
	}

	public static ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public static void setTrabajadores(ArrayList<Trabajador> trabajadores) {
		Trabajador.trabajadores = trabajadores;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}

	public ArrayList<String> getReseñas() {
		return reseñas;
	}

	public void setReseñas(ArrayList<String> reseñas) {
		this.reseñas = reseñas;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public Enum getTipo() {
		return tipo;
	}

	public void setTipo(Enum tipo) {
		this.tipo = tipo;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public int getGananciasExtra() {
		return gananciasExtra;
	}

	public void setGananciasExtra(int gananciasExtra) {
		this.gananciasExtra = gananciasExtra;
	}

	public void pagoExtraServicio(ArrayList<Evento> eventos, String especialidad) {
        for (Evento evento : eventos) {
            if (evento.getNombre().equals(getEspecialidad())) {
                this.salario += 40000;
            }
        }
    }

    public ArrayList<Plato> cocinar(Pedido pedido) {
        ArrayList<Plato> platosCocinados = new ArrayList<Plato>();
        for (Plato plato: pedido.getPlatos()) {
            for (ArrayList<String> ingredienteCantidad : plato.getCantidadIngredientes()) {                   //["NombreIngrediente", "2"]
                for (ArrayList<String> ingrediente : pedido.getRestaurante().getBodegaIngredientes()) {
                    int enBodegaAntes = Integer.parseInt(ingrediente.get(1));
                    int cantidadRequerida = Integer.parseInt(ingredienteCantidad.get(1));
                    
                    //Ver la cantidad de ese ingrediente en bodegaIngredientes de restaurante
                    
                    if (cantidadRequerida <= enBodegaAntes) {
                        int enBodegaAhora = enBodegaAntes - cantidadRequerida;
                        ingrediente.remove(1);
                        ingrediente.add(String.valueOf(enBodegaAhora));
                        platosCocinados.add(plato);
                    }
                }
            }
        }
        return platosCocinados;
    }
	
	
	
    
    
	
	

}
