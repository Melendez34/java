
package animales;

public class Perro extends Animal implements Mascota{
	// se aplican poliformismo
	@Override 
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy jugando con la pelota");
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baniar() {
		// TODO Auto-generated method stub
		
	}
	
}