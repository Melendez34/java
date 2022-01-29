package operadores;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		/*
		 * Pedir 3 numeros al usuario y mostrar un mensaje con el
		 * número mayor  
		 * */
		System.out.println("Introduce el primer numero: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Introduce el primer numero: ");
		int num2 = sc.nextInt();
		System.out.println("Introduce el primer numero: ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " es el numero mayor");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println(num2 + " es el numero mayor");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println(num3 + " es el numero mayor");
		}

   }
}