package uiMain;
import gestorAplicacion.paquete1.*;
import gestorAplicacion.paquete2.*;
import baseDatos.Serializador;
import java.util.*;

/**
 * Clase Main encargada de la capa asociada a la interfaz del usuario y de implementar
 * las funcionalidades del proyecto.
 */

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Sistema sistema = new Sistema();
    static int numeroMultas = 0;  // Atributo estático para el número de multas
    
    //Agregar multa y prestamos de prueba
    //static { sistema.getUser().getMultas().add(new Multa("Regresar tarde", new Date(12,12,2023), sistema.getUser())); } 
    //static { sistema.getUser().getPrestamos().add(new Prestamo(sistema.getUser(), Prestamo.Tipo.PARTICULAR,new Date(), new Date(12,12,2023),sistema.getBibliotecas().get(0).getCopias().get(0),sistema.getBibliotecas().get(0))); } 
   
    
	public static void main(String[] args) {
		byte opcion;
		byte op;
		boolean enSesion = false;	
		
		while (enSesion == false) {
			
			System.out.println("Bienvenido al sistema de biliotecas de nuestra institución");
			System.out.println("----------------------------------------------------------");
			System.out.println("Por favor, seleccione una opción: ");
			System.out.println("1. Ingresar como Administrador");
			System.out.println("----------------------------------------------------------");
			System.out.println("Por favor, seleccione la opción que desee ");
			opcion = sc.nextByte(); 
			switch(opcion) {
			case 1:
				enSesion = true;
				System.out.println("Sesion iniciada correctamente");
				break;
			default: 
				System.out.println("Por favor, seleccione una opcion correcta");
			}
		}	
		
		do {
			System.out.println("Por favor seleccione la opcion que desee");
			System.out.println("----------------------------------------------------------");
			System.out.println("1. Consulta de disponibilidad para prestamo");
			System.out.println("2. Consulta de disponibilidad para reserva de evento");
			System.out.println("3. Gestion de base de datos");
			System.out.println("4. Gestion de prestamos y reservas");
			System.out.println("5. Gestión de Multas");
			System.out.println("6. Salir del sistema");
			System.out.println("----------------------------------------------------------");
			op = sc.nextByte();
			
			switch(op) {
			case 1:
				pedirComputadorOLibro();
				break;
			case 2:
				recursoEvento();
				break;
			case 3:
				AgregarOEliminar();
				break;
			case 4:
				regresarPrestamo();
				break;
			case 5:
				gestionMultas();				
				break;
			case 6: 
				salirDelSistema(sistema);
				break;
			default:
				System.out.println("Opcion incorrecta, por favor, escoge otra opcion");
			}		
		}
		while (op != 6);
	}
	