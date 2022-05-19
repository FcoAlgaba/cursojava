package antiguo;

import java.util.HashMap;

public class Main6 {

	public static void main(String[] args) {
		
		HashMap<String, String> capitales = new HashMap<String, String>();
		
		//Agregar Elementos
		capitales.put("Francia", "París");
		capitales.put("España", "Madrid");
		capitales.put("Noruega", "Oslo");
		//System.out.println(capitales);

		//Eliminar elementos
		capitales.remove("España");
		
		//Extraer un elemento y lo muestra por consola
		//System.out.println(capitales.get("Francia"));
		
		//Comprueba si existe una determinada clave
		//System.out.println(capitales.containsKey("Francia"));
		//System.out.println(capitales.containsKey("España"));
		
		//Iterar HashMap por las claves
		for(String clave: capitales.keySet()) {
			System.out.println(clave + ":" + capitales.get(clave));
		}
		
		
		
		
		
		
		

	}

}
