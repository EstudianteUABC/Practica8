package clases;

public class Animal {
	String nombre;
	String tipo;
	int edad;
	boolean vacunado;
	
	public Animal( String nombre, int edad ) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void comer() {
		System.out.println( nombre + " esta comiendo." );
	}
	
	public void dormir() {
		System.out.println( nombre + " esta durmienod" );
	}
	
	public void establecerVacunado( boolean vacunado ) {
		this.vacunado = vacunado;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public void mostrarDatos() {
		System.out.println("Tipo: " + tipo );
		System.out.println("Nombre: " + nombre );
		System.out.println("Edad: " + edad );
		System.out.println("Vacunado: " + vacunado );
	}
}
