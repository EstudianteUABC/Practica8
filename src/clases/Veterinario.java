package clases;

public class Veterinario {
	String nombre;
	double salario;
	
	public Veterinario( String nombre, double salario ) {
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public void vacunar( Animal animal ) {
		animal.establecerVacunado( true );
		System.out.println( animal.obtenerNombre() + " esta vacunado.");
	}
	
	public void establecerSueldo( int salario ) {
		this.salario = salario;
	}

}
