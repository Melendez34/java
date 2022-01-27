import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		/*
		 * Crear un nuevo proyecto llamado NumeroParImpar
		 * crear el método main
		 * crear una función que evalúe si un número es par o impar (se puede usar el operador ternario)
		 * Imprimir en terminal el resultado
		 * extra, investigar cómo usar la clase Scanner en java.
*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero a evaluar: ");
		int numero1 = sc.nextInt();
		
		String resultado = (numero1 %2 == 0) ? ("es Par") : ("es Impar");
		System.out.println("El numero " + resultado);
		
	}
}
