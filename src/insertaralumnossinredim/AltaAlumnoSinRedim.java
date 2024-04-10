package insertaralumnossinredim;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class AltaAlumnoSinRedim {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion, numAlu;
		
		System.out.println("¿Cuántos alumnos hay?");
		numAlu = sc.nextInt();
		Alumno [] arrayAlu = new Alumno[numAlu];
		
		
		do {
			menu();
			
		   opcion = sc.nextInt();
		   switch(opcion) {
			
			case 1:
				altaAlumno(arrayAlu);
				break;
			case 2:
				bajaAlumno(arrayAlu);
				break;
			case 3:
				listarAlumnos(arrayAlu);
				break;
			case 4:
				System.out.println("--FIN PROGRAMA--");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while(opcion!=4);
	}

	// Visualizar menú de opciones
	private static void menu() {
		System.out.println("1.ALTA");
		System.out.println("2.BAJA");
		System.out.println("3.LISTAR");
		System.out.println("4.FIN");
		System.out.println("--- Elige opción:");
	}

	// Añade un alumno en la primera posición libre
	private static void altaAlumno(Alumno[] arrayAlu) {
		String nombre;
		int edad, i;
		
		// Obtenemos la primera posición nula del array donde darle de alta
		for (i=0; i<arrayAlu.length && arrayAlu[i]!=null; i++) {		
		}
		if (i==arrayAlu.length)
			System.out.println("EL ARRAY ESTÁ LLENO");
		else {
			System.out.println("Nombre alumno:");
			nombre=sc.next();
			System.out.println("Edad alumno:");
			edad=sc.nextInt();
			arrayAlu[i]=new Alumno(nombre,edad);
		}
	}
	
	// Listar los nombres de los alumnos
	private static void listarAlumnos(Alumno[] arrayAlu) {
		for (Alumno alu : arrayAlu) {
			if (!Objects.isNull(alu)) {
				System.out.println(alu.getNombre());
			}
		}
	}

	// Pido el nombre del alumno a borrar. Lo borro almacenando null en esa posición
	private static void bajaAlumno(Alumno[] arrayAlu) {
		System.out.println("Nombre del alumno a borrar:");
		String nombre=sc.next();
		boolean borrado=false;
		
		for (int i=0; i<arrayAlu.length && !borrado; i++) {
			if (arrayAlu[i].getNombre().equals(nombre)) {
				arrayAlu[i]=null;
				borrado=true;
			}
		}
	}

}
