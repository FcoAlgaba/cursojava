package antiguo;

import java.util.HashMap;

public class EjercicioHashMap1 {

	public static void main(String[] args) {

		HashMap<Boolean, String> map = new HashMap<Boolean, String>();

		map.put(true, "SevillaFc");
		map.put(false, "Real Madrid");
		map.put(null, "Barcelona");
	
		System.out.println(map.size());
	}

}
