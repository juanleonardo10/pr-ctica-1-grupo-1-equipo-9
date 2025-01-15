package gestorAplicacion.Usuario;

 //FALTAN COSAS REVISAR 
import java.io.Serializable;
import java.util.ArrayList;

import gestorAplicacion.Usuario.Cliente.Afiliacion;

public class Cliente implements Serializable  { //Serializable:La clase implementa esta interfaz para permitir que los objetos de tipo Cliente sean serializados 
	//(convertidos a un formato que puede ser almacenado o transmitido).

	private static final long serialVersionUID = 1L; 
	
	//ATRIBUTOS
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>(); // Este atributo es una lista estática que almacena todos los objetos de tipo Cliente.
	//Al ser static, es compartido por toda la clase y no pertenece a instancias individuales de Cliente.
	private Pedido pedido;
	private Factura factura;
	private Mesa mesa;
	private Restaurante restaurante;
	private Enum afiliacion; // Este enum llamado Afiliacion define un conjunto de valores constantes relacionados con los niveles de afiliación de un cliente. 
	//Los valores posibles son: NINGUNA: Sin afiliación. ESTRELLITA. ESTRELLA. SUPERESTRELLOTA
	private int puntosAcumulados;
    private ArrayList<Plato> platosFavoritos = new ArrayList<Plato>();
    private String placaVehiculo;
    private Reserva reserva;
    
    public enum Afiliacion {NINGUNA, ESTRELLITA, ESTRELLA, SUPERESTRELLOTA}
    
    
    // CONSTRUCTOR VACIO
    
	public Cliente() {
		
		Cliente.getClientes().add(this);
	}
	
    // CONSTRUCTORES Y SOBRECARGA 
	
    public Cliente(int cedula) {
        this.cedula = cedula;
        this.afiliacion = Afiliacion.NINGUNA;
        this.placaVehiculo = "Ninguna";
        Cliente.getClientes().add(this);
    }
    public Cliente (String nombre, int cedula){
        this.nombre = nombre;
        this.cedula = cedula;
        this.afiliacion = Afiliacion.NINGUNA;
        this.placaVehiculo = "Ninguna";
        Cliente.getClientes().add(this);
    }
    public Cliente (String nombre, int cedula, Enum afiliacion, String placaVehiculo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.afiliacion = afiliacion;
        this.placaVehiculo = placaVehiculo;
        Cliente.getClientes().add(this);
    }
    public Cliente (String nombre, int cedula, String placaVehiculo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.afiliacion = Afiliacion.NINGUNA;
        this.placaVehiculo = placaVehiculo;
        Cliente.getClientes().add(this);
    }
    public Cliente (String nombre, int cedula, String placaVehiculo, Factura factura){
        this(nombre, cedula, placaVehiculo); 
        this.afiliacion = Afiliacion.NINGUNA;
        this.placaVehiculo = placaVehiculo;
        this.factura = factura;
    }
	
	
	// METODOS
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Afiliacion: " + afiliacion);
        System.out.println("Placa del vehiculo: " + placaVehiculo);
    }
    public static void despedida(Persona persona) {
        persona.despedida();
    }
    
    //SETTERS Y GETTERS 

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public static void setClientes(ArrayList<Cliente> clientes) {
		Cliente.clientes = clientes;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public Enum getAfiliacion() {
		return afiliacion;
	}

	public void setAfiliacion(Enum afiliacion) {
		this.afiliacion = afiliacion;
	}

	public int getPuntosAcumulados() {
		return puntosAcumulados;
	}

	public void setPuntosAcumulados(int puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}

	public ArrayList<Plato> getPlatosFavoritos() {
		return platosFavoritos;
	}

	public void setPlatosFavoritos(ArrayList<Plato> platosFavoritos) {
		this.platosFavoritos = platosFavoritos;
	}

	public String getPlacaVehiculo() {
		return placaVehiculo;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	 @Override
	    public String toString() { // Este método sobrescribe el método toString() de la clase base Object.
		 // toString() es un método que Java usa para obtener una representación en texto de un objeto.
	        final StringBuilder sb = new StringBuilder("Datos del cliente:");
	        sb.append("\nNombre: ").append(nombre);
	        sb.append("\nCédula: ").append(cedula);
	        return sb.toString();
	    }

	    public boolean esAfiliado() { // Proporciona una forma clara de verificar si un cliente pertenece a algún programa de afiliación.

	        if (this.getAfiliacion() != Afiliacion.NINGUNA) {
	            return true;
	        } else {
	            return false;
	        }
	    }
    
    
    
	
    


	
	

}
