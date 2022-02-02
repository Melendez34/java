import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
		/*
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		*/
		//Estructura foreach en Java
		// for(tipoDeDatoElemento Variable : ColeccionARecorrer)
		/*
		 * for(String fruta : frutas) {
			System.out.println(fruta);
		}
		*/
		
		//TreeSet
		//Ordena los elementos pero es mas lenta
		//Sigue el orden ASCII al parecer
		//dando prioridad a palabras que inician en mayuscula
		/*
		 * Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
		 * */
		//LinkedHashSet
		//Ordena los elementos en orden de inserción
		//pero es mas costoso en memoria que HashSet
		/*
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
		 * 
		 */
		//Listas
		
		//List
		//Permite elementos duplicados
		//Acceder a elementos especificos
		//Buscar elementos
		List <String> pokemones = new ArrayList<String>();
		pokemones.add("Pikachu");
		pokemones.add("Mewtwo");
		pokemones.add("Eevee");
		pokemones.add("Dragonite");
		pokemones.add("Psyduck");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		//Si incertamos con indice, desplazara los demas elementos
		//en caso de insertar alguna posicion
		pokemones.add(5, "Mewtwo");
		
		// remove() nos permite eliminar un elemento en la posicion seleccionada
		pokemones.set(7, "Flareon");
		pokemones.remove(5);
		
		// set reemplaza el elemento en la posicion especificada
		for (String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		//System.out.println(pokemones.get(0));
		System.out.println("-------------------");
		//indexOf nos devuelte la posicion de algun String 
				//al ser buscado por este metodo
		System.out.println(pokemones.indexOf("Gengar"));
		// Si se repite el String a lo largo de la lista
		// con lastIndexOf() obtenemos la posicion index
		// de la ultima posicion donde coincida la String
		System.out.println(pokemones.lastIndexOf("Mewtwo"));
		// Si busco un elemento que no se encuentra en la lista
		// devuelve -1
		System.out.println(pokemones.lastIndexOf("Charmander"));
		
		//LinkedList
		// listas doblemente enlazadas
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angelmon");
		digimones.add("Andromon");
		digimones.add("greymon");
		
		//ArrayList
		
		//Map 
		// asocia claves a valores
		// NO puede contener claves duplicadas
		// Solo puede contener un valor asociado
		
		//HashMap
		// Tiene mejor rendimiento pero no garantiza un orden
		// al momento de hacer iteraciones.
		Map<Integer, String> usuarios = new HashMap<Integer,String>();
		usuarios.put(1221, "Omar Melendez");
		usuarios.put(2020, "Raul");
		usuarios.put(3030, "Rodrigo");
		
		System.out.println("-------------------");
		//Devuelve el ultimo valor asociado a la clave
		System.out.println(usuarios.get(3030));
		System.out.println("-------------------");
		
		//keySet 
		//Nos permite recuperar el nombre de la clave
		System.out.println(usuarios.keySet());
		//values 
		//Nos permite recuperar el valor directamente
		System.out.println(usuarios.values());
		System.out.println(usuarios);
		//clear limpia todo el mapping en el map
		usuarios.clear();
		System.out.println(usuarios);
		
		//TreeMap
		Map<Integer,String> tamales = new TreeMap<Integer,String>();
		tamales.put(1, "Mole");
		tamales.put(2, "Verde");
		tamales.put(3, "Gansito");
		tamales.put(4, "Cochinita");
		
		System.out.println("*******************");
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		System.out.println(tamales);
		
		tamales.entrySet().forEach(tamal -> { //funcion Lambda 
			System.out.println(tamal.getKey().toString() + " " + tamal.getValue().toString().toUpperCase());
		});
		
		//LinkedHashMap
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		carros.put(1, "Volvo");
		carros.put(9, "Mercedes Benz");
		carros.put(5, "Mustang");
		System.out.println("****************************");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
	}

}
