package clases;

public class Perro extends Animal{
	public Perro( String nombre, int edad ){
		super( nombre, edad );
		tipo = "Perro";
	}
	
	@Override
	public void comer() {
		System.out.println( nombre + " esta comiendo comida para perro." );
	}
	
	//metodo solo definido en la clase Perro
	public void ladrar() {
		System.out.println( nombre + " esta ladrando." );
	}
}
