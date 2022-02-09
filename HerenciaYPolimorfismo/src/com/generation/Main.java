package com.generation;

public class Main {

	public static void main(String[] args) {
		// Herencia gracias al extends permite reciclar codigo
		// 
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.setNombre("Cuadradin");
		System.out.println(cuadrado1.getNombre());
		
		cuadrado1.setAlto(15);
		cuadrado1.setLargo(10);
		System.out.println("El area del " + cuadrado1.getNombre() + " es " + cuadrado1.calcularArea());
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setNombre("Triangulito");
		System.out.println(triangulo1.getNombre());
		
		triangulo1.setAlto(15);
		triangulo1.setLargo(10);
		System.out.println("El area del " + triangulo1.getNombre() + " es " + triangulo1.calcularArea());
		

	}

}
