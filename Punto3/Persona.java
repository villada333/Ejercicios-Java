package Punto3;

public class Persona {
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Persona() {
		super();
	}	
	public Persona(String nombre, String apellido, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;		
	}
	public String getnombre() {
		return this.nombre;
	}
	public String getapellido() {
		return this.apellido;
	}
	public String gettelefono() {
		return this.telefono;
	}
}