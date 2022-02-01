//Conjunto de datos de un mismo tipo o de tipo complejo
public class Arreglos {

	public static void main(String[] args) {
		
		/*
		 * Solo un tipo de dato 
		 * arreglo[1,4,6, true, "Hola"];
		 * Requerimos especificar el tamaño de elementos
		 * */
		int numeros[];
		numeros = new int[4];// se crea el arreglo
		
		//segunda forma de crear un arreglo
		String[] nombres = new String[4];
		
		numeros[0] = 20;
		numeros[1] = 0;
		numeros[2] = 10;
		numeros[3] = 400;
		
		nombres[0] = "Pedro";
		nombres[1] = "Antoni";
		nombres[2] = "Jose";
		nombres[3] = "Oscar";
		
		//Arreglo literal	
		//String[]frutas = new String[] {"manzana", "pera", "platano"}; 
		
		//System.out.println(numeros[0]);
		//System.out.println(numeros[1]);
		//System.out.println(numeros);
		
		//length es una propiedad y permite 
		for(int i = 0; i < numeros.length ; i++) {
			System.out.println("elemento [" + i + "] " + numeros[i] );
		}
		
	}

}
