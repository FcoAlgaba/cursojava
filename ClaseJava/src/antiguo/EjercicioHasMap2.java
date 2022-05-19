package antiguo;

import java.util.HashMap;

public class EjercicioHasMap2 {
	public static void main(String[] args) {

		HashMap<String, String> capitales1 = new HashMap<String, String>();
		HashMap<String, String> capitales2 = new HashMap<String, String>();

		capitales1.put("España", "Madrid");
		capitales1.put("Noruega", "Oslo");
		capitales1.put("Portugal", "Lisboa");

		capitales2.put("Lisboa", "Portugal");
		capitales2.put("Roma", "Italia");
		capitales2.put("Oslo", "Noruega");
		
		int contador = 0;
		for (String clave : capitales1.keySet()) {
			if (capitales2.containsValue(clave)) {
				contador++;
			}
		}
	}

}
