import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
		
		/* COLECCIONES 01-02-2022 
		 * Las colecciones no sirven para almacenar un conjunto
		 * de Objetos
		 * La diferencia de las colecciones y los objetos
		 * es que las colecciones son dinamicas
		 * pueden cambiar el numero de objetos agregados
		 * Se tienen 3 implementaciones:
		 * HashSet
		 * TreeSet
		 * LinkedHashSet
		 * Con caracteristicas particulares:
		 * -No pueden contener elementos repetidos
		 * -Los elementos no mantienen un orden
		 */
		//HashSet
		//implementacion mas rapida (mejor rendimiento)
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		//
		//Estructura foreach en Java
		// for(tipoDeDatoElemento Variable : ColeccionARecorrer)
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		//TreeSet
	}

}
