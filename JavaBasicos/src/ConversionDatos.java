
public class ConversionDatos {
	public static void main(String[] args) {
		byte numeroByte = 10;
		
		//conversion -Hacia arriba- es Automatica
		short numeroShort = numeroByte;
		int numeroInt = numeroShort;
		long numeroLong = numeroInt;
		
		long numeroGrande = 2_080_000_000;
		//Casteo de numeros -asignar hacia abajo- 
		int numeroEntero = (int) numeroGrande;
		
		short numero1 = 7000;
		short numero2 = 300;
		byte numero3 = 12;
		byte numero4 = 44;
		// la suma se convierte en tipo Int se requiere la conversion con casteo (Int)
		short suma = (short) (numero1 + numero2);
		byte suma2 = (byte) (numero3 + numero4);
		int suma3 = numero3 + numero4;
		short suma4 = (short) (numero1 + numero3);
	}
}
