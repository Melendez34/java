package operadores;

import java.util.Scanner;

public class Descuentos {

	public static void main(String[] args) {
		// solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
		// sila cuenta es de 1001 - 4999 10%
		// si la cuenta es de 5001 a 9999 20%
		// si la compra es de 10000 o más 30%
		System.out.println("Ingrese el total de su compra:");
		Scanner sca = new Scanner(System.in);
		float cuenta = sca.nextFloat();
		/*
		if(cuenta >= 10000) {
			float total = (float) (cuenta * 0.70);
			System.out.println("Su pago es de: " + total);
		}else if(cuenta >= 5000 && cuenta <=9999) {
			float total = (float) (cuenta * 0.80);
			System.out.println("Su pago es de: " + total);
		}else if(cuenta >= 1000 && cuenta <= 4999) {
			float total = (float) (cuenta * 0.90);
			System.out.println("Su pago es de: " + total);
		}else {
			System.out.println("Su pago es de: " + cuenta);
		}*/
		
		//Corrección de ejercicio
		if(cuenta >= 1 && cuenta < 1000){
			float total = (float) (cuenta * 1);
			System.out.println("Su pago es de: " + total);
		}else if(cuenta >= 1000 && cuenta < 5000){
			float total = (float) (cuenta * 0.90);
			System.out.println("Su pago es de: " + total);
		}else if(cuenta >= 5000 && cuenta < 10000){
			float total = (float) (cuenta * 0.80);
			System.out.println("Su pago es de: " + total);
		}else if(cuenta >= 10000) {
			float total = (float) (cuenta * 0.70);
			System.out.println("Su pago es de: " + total);
		}
		
	}

}
