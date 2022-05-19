package antiguo;

import java.util.HashMap;

public class Main6 {

	public static void main(String[] args) {
		
		HashMap<String, String> capitales = new HashMap<String, String>();
		
		//Agregar Elementos
		capitales.put("Francia", "Par�s");
		capitales.put("Espa�a", "Madrid");
		capitales.put("Noruega", "Oslo");
		//System.out.println(capitales);

		//Eliminar elementos
		capitales.remove("Espa�a");
		
		//Extraer un elemento y lo muestra por consola
		//System.out.println(capitales.get("Francia"));
		
		//Comprueba si existe una determinada clave
		//System.out.println(capitales.containsKey("Francia"));
		//System.out.println(capitales.containsKey("Espa�a"));
		
		//Iterar HashMap por las claves
		for(String clave: capitales.keySet()) {
			System.out.println(clave + ":" + capitales.get(clave));
		}
		
		
		
		
		
		
		

	}

}
