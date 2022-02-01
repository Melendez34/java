package operadores;

import java.util.Scanner;

/*
 * Pedir al usuario 2 números por consola y preguntarle que desea realizar
 * 1) Suma
 * 2) Resta
 * 3) División
 * 4) Multiplicación
 * 
 * y despues imprimir el resultado
 */

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese dos numeros:");
		System.out.println("Primer numero: ");
		float num1 = sc.nextFloat();
		System.out.println("Segundo numero: ");
		float num2 = sc.nextFloat();
		System.out.println("Que operacion deseas realizar: \n 1)Suma\n 2)Resta\n 3)Multiplicacion\n 4)Division.\n");
		int opera = sc.nextInt();
		
		switch(opera) {
		case 1:
			System.out.println("El resultado es: " +(num1 + num2) );
			break;
		case 2:
			System.out.println("El resultado es: " +(num1 - num2) );
			break;
		case 3:
			System.out.println("El resultado es: " +(num1 * num2) );
			break;
		case 4:
			if(num2 == 0) {
				System.out.println("no se puede dividir entre cero. ");
			}else {
				System.out.println("El resultado es: " +(num1 / num2) );
			}
			break;
			
		}
		sc.close();
	}
}
