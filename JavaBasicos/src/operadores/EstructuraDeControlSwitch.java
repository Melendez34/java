package operadores;

import java.util.Scanner;
public class EstructuraDeControlSwitch {
	public static void main(String[] args) {
		/*
		 * estructura de control
		 * Switch 
		 * Nos sirve para controlar el flujo de comportamiento
		 * de un programa para tomar decisiones.
		 * 
		 * switch(condicion){
		 *   case "valor esperado en condición":
		 *   	Codigo
		 *      brake;
		 *   case 2:
		 *      codigo
		 *      brake;
		 *      
		 *   default:
		 *      codigo por defecto
		 * }
		 * */
		System.out.println("Introduce un dia de la semana y mostrar mensaje");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		
		switch(dia.toLowerCase()) {
			case "lunes":
				System.out.println("Ya mero es viernes, toma un cafe.");
				break;
			case "martes":
				System.out.println("Ya mero es viernes, toma un cafe.");
				break;
			case "miercoles":
				System.out.println("Ya mero es viernes, toma un cafe.");
				break;
			case "jueves":
				System.out.println("Ya mero es viernes, toma un cafe.");
				break;
			case "viernes":
				System.out.println("Ya es viernes, toma un cafe.");
				break;
			case "sabado":
				System.out.println("Vamos por la barbacha.");
				break;
			default:
				System.out.println("Dia inventado!");
		}
	}
}
