package operadores;

import java.util.Scanner;

public class EstructuraDeControlIf {

	public static void main(String[] args) {
		
		// Estructura de control de flujo 28-01-2022
		/*
		 * Nos sirve para la toma de decisiones
		 * para cambiar el flujo de nnuestro programa
		 * evaluando una condicion y a partir de la evaluación
		 * se realiza una accion o otra.
		 * 
		 * estructura
		 * if(){
		 *   codigo
		 * }
		 * else{
		 *   codigo
		 * }
		 * */
		System.out.println("Introduce tu edad: ");
		Scanner scanner = new Scanner(System.in);
		int edad = scanner.nextInt();
		if(edad >= 18) {
			System.out.println("Eres mayor de edad.");
		}else {
			System.out.println("Eres menor de edad.");
		}
		
		
	}

}




