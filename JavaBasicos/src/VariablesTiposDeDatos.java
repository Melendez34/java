/*
 * Ejercicio Variables en Java 26-01-2022
 * 
 * */
public class VariablesTiposDeDatos {
	public static void main(String[] args) {
		//   Javascript
		//		let numero = 1;
		//		let nombre = "Hola Mundo";
		
		// Permite String guardar cadenas de caracteres
		String nombre = "Omar";
		
		// Caracter almacenado en char solo se puede almacenar uno 
		char inicial = 'M';
		// boolean almancena un valor logico, true o false
		boolean TieneCrush = true;
		
		//tipo byte para numeros peque�os -128 a 127
		byte edad = 30;
		byte suma = 23 + 12;
		
		//short
		short corto  = 40;
		//int
		int numero  = 34;
		//long
		long OtroNumero = 1_290_000;
		System.out.println(OtroNumero);
		
		//float
		float PI = 3.141598f;
		//double
		double numeroEuler = 2.711828; 
		
		System.out.println("El nombre es: " + nombre + ", el numero es: " + numero + " y el numero corto es: " + corto);
		
	}
}
