import clases.*;

public class Practica8 {

	public static void main(String[] args) {

		
		//Ejercicio 1
		System.out.println("Ejercicio 1\n");
		Animal animal = new Animal( "Animal", 12 );
		Perro perro = new Perro( "Sebas",2 );
		Gato gato = new Gato( "Nieves", 3 );
		
		animal.dormir();
		animal.comer();
		
		perro.dormir();
		perro.comer();
		
		gato.dormir();
		gato.comer();
		
		//ejercicio 2
		System.out.println("\n\nEjercicio 2\n");
		Animal perro2 = new Perro( "Max", 9 );
		perro2.dormir();
		perro2.comer();
		
		//este metodo no funciona en un objeto animal
		//perro2.ladrar();
		
		//Ejercicio 3
		System.out.println("\n\nEjercicio 3\n");
		Animal animalArray[] = new Animal[3];
		animalArray[0] = new Animal( "Un animal", 1 );
		animalArray[1] = new Perro( "Chispitas", 4 );
		animalArray[2] = new Gato( "Miau", 2 );
		
		for( Animal a : animalArray ) {
			a.comer();
		}
		
		//Ejercicio 4
		System.out.println("\n\nEjercicio 4\n");
		for( Animal a : animalArray ) {
			a.comer();
			
			if( a instanceof Perro ) {
				((Perro)a).ladrar();
			}
		}
		
		//Desafio
		System.out.println("\n\nDesafio ");
		Zoo zoo = new Zoo();
		zoo.Ejecutar();
		
	}

}
