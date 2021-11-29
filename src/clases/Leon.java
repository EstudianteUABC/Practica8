package clases;

public class Leon extends Animal {
	public Leon( String nombre, int edad ) {
		super( nombre, edad );
		tipo = "Leon";
	}
	
	public void rugir() {
		System.out.println( nombre + " esta rugiendo." );
	}
	
	public void morder() {
		System.out.println( nombre + " esta mordiendo." );
	}
}
