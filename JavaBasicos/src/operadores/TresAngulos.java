package operadores;

import java.util.Scanner;

public class TresAngulos {
	public static void main(String[] args) {
		/*
		 * Pedirle 3 ángulos a un usuario 
		 * decirle si es un triangulo válido
		 * */
		System.out.println("---- Ingresa tres angulos ---- ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer angulos: ");
		float angulo1 = sc.nextFloat();
		System.out.println("Ingresa el segundo angulos: ");
		float angulo2 = sc.nextFloat();
		System.out.println("Ingresa el tercer angulos: ");
		float angulo3 = sc.nextFloat();
		
		if((angulo1 + angulo2 + angulo3) == 180 && angulo1 <= 90 && angulo2 <= 90 && angulo3 <= 90) {
			System.out.println("Es un triangulo!!");
		}else {
			System.out.println("QUE ES ESTO!");
		}
	}

}
