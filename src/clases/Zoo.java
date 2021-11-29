package clases;

import java.util.LinkedList;

public class Zoo {
	
	LinkedList<Animal> animales = new LinkedList<Animal>();
	boolean flag = true;
	
	public void Ejecutar() {
		
		int opcion;
		do {
			System.out.println("\n1) Agregar. ");
			System.out.println("2) Eliminar. ");
			System.out.println("3) Mostar animales. ");
			opcion = Entrada.entero("Seleccione una opcion: " );
			
			switch( opcion ) {
				case 1:
					agregar();
					break;
				
				case 2:
					eliminar();
					break;
				
				case 3:
					mostrarAnimales();
					break;
					
				case 4:
					flag = false;
					break;
				
				default:
					System.out.println( "Opcion invalida!!! \nSeleccione una opcion correcta.");
					
			}
		}while( flag == true );
	}
	
	public void agregar() {
		System.out.println("\n1) Perro." );
		System.out.println("2) Gato." );
		System.out.println("3) Leon." );
		System.out.println("4) Puerco." );
		
		int opcion;
		do {
			opcion = Entrada.entero("Seleccione una opcion:" );
		}while( opcion < 1 || opcion > 4 );
		
		String nombre = Entrada.cadena( "\nNombre: " );
		int edad = Entrada.entero( "Edad: " );
		
		switch( opcion ) {
			case 1:
				animales.add( new Perro( nombre, edad ) );
				break;
				
			case 2:
				animales.add( new Gato( nombre, edad ) );
				break;
				
			case 3: 
				animales.add( new Leon( nombre, edad ) );
				break;
				
			case 4:
				animales.add( new Puerco( nombre, edad ) );
				break;
		}
	}
	
	public void mostrarAnimales() {
		for( int i = 0; i < animales.size(); i++ ) {
			System.out.println("\n---------------------------" );
			System.out.println("Animal [" + ( i + 1 ) + "]" );
			animales.get(i).mostrarDatos();;
		}
	}
	
	public void eliminar() {
		mostrarAnimales();
		
		int opcion;
		do {
			opcion = Entrada.entero( "Seleccione un animal para eliminar: " );
		}while( opcion < 1 || opcion > animales.size() );
		
		animales.remove( opcion - 1 );
	}
	
	

}
