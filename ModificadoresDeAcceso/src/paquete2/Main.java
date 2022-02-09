package paquete2;

import paquete1.ClaseDefault;
import paquete1.ClasePrivada;
import paquete1.ClaseProtected;

public class Main extends paquete1.ClaseProtected{

	public static void main(String[] args) {
		// main
		ClaseDefault prueba = new ClaseDefault();
		
		//clase privada con métodos para poner y mostrar valores
		ClasePrivada privada = new ClasePrivada();
		privada.setSaludar("Omar");
		System.out.println(privada.getSaludar());
		
		//Objeto de la clase Main
		
		Main protegido = new Main();
		
		protegido.setEdad(18);
		System.out.println(protegido.getEdad());

	}

}
