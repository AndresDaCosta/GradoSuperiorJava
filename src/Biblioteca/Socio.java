package Biblioteca;

public class Socio {

	private String nombre;
	private String apellidos;
	private final String dni;
	
	public Socio(String nombre, String apellidos, String dni) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		
	}

	//getters and setters 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "]";
	}
	
	
}
