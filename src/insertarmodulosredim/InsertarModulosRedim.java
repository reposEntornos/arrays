package insertarmodulosredim;

import java.util.Arrays;
import java.util.Scanner;

public class InsertarModulosRedim {

	static Scanner sc = new Scanner(System.in);
	// La ponemos estática para que no pierda los valores ya almacenados
	static String [] vModulos = new String[0];	
	
	public static void main(String[] args) {
		
		int opcion;		
		
		
		do {
			menu();
			
		   opcion = sc.nextInt();
		   switch(opcion) {
			
			case 1:
				altaModulo();
				break;
			case 2:
				bajaModulo();
				break;
			case 3:
				System.out.println(Arrays.toString(vModulos));
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while(opcion!=3);
	}


	private static void bajaModulo() {
		
		// Pedir módulo a borrar
		System.out.println("¿Qué módulo quieres borrar?:");
		String modulo = sc.next();
		Arrays.sort(vModulos);
		int pos = Arrays.binarySearch(vModulos, modulo);
		if (pos!= -1) {
			// Redimensionamos el array temporal con un elemento menos
			String [] vTemp = new String[vModulos.length-1];
			
			// copiamos los elementos anteriores al elemento que queremos borrar de vModulos al array temporal
			System.arraycopy(vModulos, 0, vTemp, 0, pos);
			
			// copiamos los elementos posteriores del elemento que queremos borrar de vModulos al array temporal
			System.arraycopy(vModulos, pos+1, vTemp, pos, vTemp.length-pos);
			
			// Por último hacemo que vModulos apunte a vTemp
			vModulos = vTemp;						
		}
		
	}

	private static void altaModulo() {
		String [] vTemp;
		
		// Pedir al usuario el módulo
		System.out.println("Dime el módulo a insertar:");
		String modulo=sc.next();
		
		// Buscar en el array
		boolean existe=false;
		for (int i=0; i<vModulos.length && !existe; i++) {
			if (vModulos[i].equals(modulo)) 
				existe=true;
		}
			
		if (existe) 
			System.out.println("Módulo ya existe");
		else {
			// insertar módulo en el array: primero redimensionar tamaño del array temporal vTemp
			vTemp = new String[vModulos.length+1];
				
			// copiamos los elementos del array vModulos al array temporal
			System.arraycopy(vModulos, 0, vTemp, 0, vModulos.length);
				
			// insertamos el nuevo en la última posición

			vTemp[vTemp.length-1]=modulo;
				
			// Por último hacemo que vModulos apunte a vTemp
			vModulos = vTemp;
			}
		}
	

	// Visualizar menú de opciones
	private static void menu() {
		System.out.println("1.ALTA");
		System.out.println("2.BAJA");
		System.out.println("3.SALIR");
		System.out.println("--- Elige opción:");
	}

	
}
