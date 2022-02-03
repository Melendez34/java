package metodos;

public class Metodos {
	//Metodos es una funcion 
	
	int a, b;
	
	//Metodo void (vacio)
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de " + a + " + " + b + " es " + resultado);
	}
	//Metodo con retorno de valor
	public int sumarRetornoValor() {
		
		return a + b;
	}
	//multiplicacion
	public double multiplicacionconArgumentos(double arg1,double arg2) {
		double c = arg1;
		double d =arg2;
		return c*d;
	}

}
