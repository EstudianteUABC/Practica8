package clases;

public class Gato extends Animal {
	public Gato( String nombre, int edad ){
		super( nombre, edad );
		tipo = "Gato";
	}
	
	@Override
	public void comer() {
		System.out.println( nombre + " esta comiendo comida para gato." );
	}
}
