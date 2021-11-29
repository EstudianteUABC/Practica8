package clases;

public class Puerco extends Animal {
	public Puerco( String nombre, int edad ) {
		super( nombre, edad );
		tipo = "Puerco";
	}
	
	public void caminar() {
		System.out.println( nombre + " esta caminando" );
	}
}
