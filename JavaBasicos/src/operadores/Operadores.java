package operadores;

public class Operadores {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		
		int c = a + b;
		System.out.println(c);
		
		String string1 = "El resultado de la suma es:" ;
		
		System.out.println(string1 + " " + c);
		//Resta
		System.out.println("El resultado de la resta es: " + (a - b));
		// division
		int division = b / a;
		// Hace la division entera, se pierde los decimales
		System.out.println("El resultado de la division es: " + division);
		// Al especificar el tipo de dato de la operacion se conserva los decimales
		double division2 = (double)b / a;
		System.out.println("El resultado de la division2 es: " + division2);
		//multiplicacion
		double multiplicacion = c * a;
		System.out.println("El resultado de la división es: " + multiplicacion);
		
		//modulo
		double modulo = c % a;
		System.out.println("El resultado es: " + modulo);
		
		/*
		 * Operador de Asignacion
		 * =
		 * */
		
		int d = 5, e;
		e = 6;
		System.out.println(d + " - " + e);
		/*
		 * operadores de declaracion compuesta
		 * 
		 * += *= /= %= 
		 * 
		 * una operacion simplificada*/
		int f = 0, g = 5;
		
		f+= 5;
		System.out.println(f);
		//Operadores relacionales 
		// == igualdad
		// != diferencia
		// Resultado en tipo booleano (true, false)
		
		int bool = 15, bool2 = 12;
		String j = "Hola ";
		
		System.out.println(bool2 > bool);
		System.out.println(bool2 != bool);
		// En este caso no se pueden comparar por ser tipos distintos
		//System.out.println(j != bool);
		
		/*
		 * Operadores Logicos
		 * AND &&
		 * OR ||
		 * NOT !()
		 * 
		 * */
		System.out.println("Operador logico de && da: " + (true && true));
		// y si uno de ellos es false 
		System.out.println("Operador logico de && con que uno sea falso da: " + (false && true));
		
		/*
		 * Operadores unarios
		 * pre asignación
		 * post asignación
		 * ++
		 * --
		 * */
		int k = 0,l= 0;
		++k;
		System.out.println(k);
		System.out.println(--l);
		
		int operacion = 4 + 5 * 6 / 3;
		//5 * 6 = 30
		//4 + 30 / 3
		//30 / 3 = 10
		//4 + 10 = 14
		System.out.println(operacion);
		
		int x=0,y=0;
		int operacion2 = ++x + y--;
		// (0 + 1) + (0)
		System.out.println(operacion2);
		/*
		 * Operador Ternario
		 * () ? () : ()
		 * */
		int edad = 18;
		int valor1 = 1;
		int valor2 = 0;
		int resultado = (edad <= 18) ? (valor1 = 10) : (valor2 = 0);
		System.out.println(resultado);
	}
}
