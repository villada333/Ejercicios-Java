package Punto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import Punto3.Persona;

public class Agenda {
	public static void mostrarcontacto(Persona contacto) {
		System.out.println("Nombre: " + contacto.getnombre());
		System.out.println("Apellido: " + contacto.getapellido());
		System.out.println("Telefono: " + contacto.gettelefono());
	}
	public static void listarcontactos(List<Persona> agendatel) {
		for (Persona persona : agendatel) {
			Agenda.mostrarcontacto(persona);
		}
	}
	public static void buscarnombre(List<Persona> agendatel, BufferedReader entrada, boolean ind) throws IOException {
		int contador=0;
		boolean band=false;
		System.out.println("Digite el nombre que desea buscar: ");
		String nombrebuscado = entrada.readLine();
		for (Persona persona : agendatel) {
			contador=+1;
			if (persona.getnombre().equals(nombrebuscado)) {
				band=true;
				Agenda.mostrarcontacto(persona);
				break;
			}
		}
		if(band==false) {
			System.out.println("Contacto no encontrado ");
		}else {
			if(ind==true) {
				agendatel.remove(contador);
				System.out.println("Contacto Eliminado ");
			}
		}
		contador=0;
	}
	public static void buscarapellido(List<Persona> agendatel, BufferedReader entrada) throws IOException {
		boolean band=false;
		System.out.println("Digite el apellido que desea buscar: ");
		String apellidobuscado = entrada.readLine();
		for (Persona persona : agendatel) {
			if (persona.getapellido().equals(apellidobuscado)) {
				band=true;
				Agenda.mostrarcontacto(persona);
				break;
			}
		}
		if(band==false) {
			System.out.println("Contacto no encontrado ");
		}
	}
	public static void buscartelefono(List<Persona> agendatel, BufferedReader entrada) throws IOException {
		boolean band=false;
		System.out.println("Digite el telefono que desea buscar: ");
		String telefonobuscado = entrada.readLine();
		for (Persona persona : agendatel) {
			if (persona.gettelefono().equals(telefonobuscado)) {
				band=true;
				Agenda.mostrarcontacto(persona);
				break;
			}
		}
		if(band==false) {
			System.out.println("Contacto no encontrado ");
		}
	}
	public static void ingresarcontacto(List<Persona> agendatel, BufferedReader entrada) throws IOException {
		System.out.println("Digite su nombre: ");
		String nombre = entrada.readLine();
		System.out.println("Digite su apellido: ");
		String apellidos = entrada.readLine();
		System.out.println("Digite su telefono: ");
		String telefono = entrada.readLine();
		Persona persona =  new Persona(nombre, apellidos, telefono);
		agendatel.add(persona);
		System.out.println("Contacto ingresado correctamente \n");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader opcion = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int opcion2 = 10;
		List<Persona> MiAgenda =  new ArrayList<>();
		do {
			System.out.println("\n1)Agregar Contacto\n"
			+ "2)Ver todos los contactos \n"
			+ "3)Buscar contacto por nombre \n"
			+ "4)Buscar contacto por apellido\n"
			+ "5)Buscar contacto por telefono\n"
			+ "6)Eliminar contacto \n"
			+ "0)Salir\n"
			+ "Seleccione una opcion = ");
			opcion2 =  Integer.parseInt(opcion.readLine());
			switch (opcion2){
				case 1: entrada = new BufferedReader(new InputStreamReader(System.in));
						Agenda.ingresarcontacto(MiAgenda,entrada);
						break;
				case 2: Agenda.listarcontactos(MiAgenda);
						break;
				case 3: entrada = new BufferedReader(new InputStreamReader(System.in));
						Agenda.buscarnombre(MiAgenda,entrada,false);
						break;
				case 4: entrada = new BufferedReader(new InputStreamReader(System.in));
						Agenda.buscarapellido(MiAgenda,entrada);
						break;
				case 5: Agenda.buscartelefono(MiAgenda,entrada);
						break;
				case 6: entrada = new BufferedReader(new InputStreamReader(System.in));
						Agenda.buscarnombre(MiAgenda,entrada,true);
						break;
				case 0: System.out.println("El programa ha terminado \n");
						opcion2=-10;
						break;
			}
		}while(opcion2>-1);
	}
}
