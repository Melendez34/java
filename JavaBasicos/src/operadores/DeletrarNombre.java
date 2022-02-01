package operadores;

import java.util.Scanner;

public class DeletrarNombre {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida al usuario ingresar su nombre y que entonces imprima cada una de las letras de su nombre.
		 * Ejemplo: 
		 * "Juan"
		 * "J""u""a""n"
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String nombre= sc.nextLine();
		for(int i = 0; i < (nombre.length()) ; i++) {
			System.out.println(nombre.charAt(i));
		}
		
	}

}
