package antiguo;

import java.util.ArrayList;

public class EjercicioArray1 {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<String>();

		colores.add("Amarillo");
		colores.add("Rojo");
		colores.add("Azul");

		//System.out.println(colores);

		ArrayList<String> colores2 = new ArrayList<String>();

		for (String color : colores) {
			colores2.add(color);
		}

		//System.out.println(colores2);

		for(int i=0; i<colores.size(); i++) {
			colores2.add(colores.get(i));
}
		
		
		System.out.println(colores2);




}

	}
