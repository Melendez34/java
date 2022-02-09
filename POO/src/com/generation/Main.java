package com.generation;

public class Main {

	public static void main(String[] args) {
		// Punto de entrada de nuestra aplicacion *main*
		Tacos tacoSuadero = new Tacos("Masa Azul", "Suadero", 2, "grande", 30);
		/*
		 * tacoSuadero.tipoDeTortilla = "Maiz azul"; tacoSuadero.tipoDeGuisado =
		 * "Suadero"; tacoSuadero.numeroDeTortilla = 2; tacoSuadero.tamanioDeTortilla =
		 * "Mediana"; tacoSuadero.precio = 30; 
		 */
		tacoSuadero.subirPrecio(5.5f);
		
		System.out.println(tacoSuadero.toString());
		
		Tacos taco2 = new Tacos();
		/*
		 * taco2.tipoDeTortilla = "Harina"; taco2.tipoDeGuisado = "Bisteck";
		 * taco2.numeroDeTortilla = 1; taco2.tamanioDeTortilla = "Grande"; taco2.precio
		 * = 42.5f;
		 */
		//System.out.println(taco2.toString());
		
		Tacos taco3 = new Tacos("Maiz");
		//con este tipo de llamada se utiliza el metodo toString por defecto
		System.out.println(tacoSuadero);
		taco2.setPrecio(20);
		taco2.setNumeroDeTortilla(1);
		System.out.println(taco2);
		System.out.println(taco3);

	}

}
