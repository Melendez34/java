package metodos;

public class PruebaMetodos {
	public static void main(String[] args) {
		//Crear un objeto que va a contener los metodos
		//y atributos de la clase Metodo que se encuentra 
		// en el mismo package
		Metodos metodoPrueba = new Metodos();
		metodoPrueba.a = 10;
		metodoPrueba.b = 15;
		//metodoPrueba.sumar();
		//metodoPrueba.sumarRetornoValor();
		
		System.out.println(metodoPrueba.sumarRetornoValor());
		System.out.println(metodoPrueba.sumarRetornoValor()-10);
		
		double multiplicacion = metodoPrueba.multiplicacionconArgumentos(40, 20.5);
		System.out.println("El resultado de multiplicacion: " + multiplicacion);
	}

}
