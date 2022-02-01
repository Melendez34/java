package operadores;

import java.util.Scanner;

public class ScannerYBuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero1 = sc.nextInt();
		System.out.println(sc.nextLine());
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		sc.close();
		System.out.println("Tu nombre es: " + nombre + "\nTu número: " + numero1 );
		
	}

}
