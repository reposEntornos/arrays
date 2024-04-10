package insertarmodulos;

import java.util.Arrays;
import java.util.Scanner;

public class InsertarModulos {

		static Scanner sc = new Scanner(System.in);
		// Definimos el array vModulos estático para que no pierda los valores almacenados
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
			// TODO Auto-generated method stub
			
		}

		private static void altaModulo() {
			// Declarar array temporal
			
			// Pedir al usuario el módulo a insertar
			
			// Buscar en el array, lo podeis hacer con métodos de la clase Array
			
			// Si el módulo existe, se informa al usuario
			
			
			// Si el módulo no existe, se INSERTA
			
				//INSERTAR: Primero, redimensionar el array temporal 
				// con longitud la del array original + 1
			
			
				// copiamos los elementos del array original al array temporal
			
			
				// añadimos el nuevo módulo
			
				// al array original se asigna la referencia del array temporal
			
			
			
		}

		// Visualizar menú de opciones
		private static void menu() {
			System.out.println("1.ALTA");
			System.out.println("2.BAJA");
			System.out.println("3.SALIR");
			System.out.println("--- Elige opción:");
		}
	}


