package com.gatitos;

public class PruebaGato {

	public static void main(String[] args) {
		// ejercicio Principio de Encapsulamiento
		Gato g = new Gato("Bicho", 2, true);
		//g.nombre = "Patas";
		//g.patas = 3;
		g.setNombre("Taco");
		g.setPatas(4);
		g.setAdoptado(true);
		
		System.out.println(g);
		System.out.println("El nombre de mi gato es: " + g.getNombre());

	}

}
