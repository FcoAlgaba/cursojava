package cursoherencia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// crear un ArrayList vac�o
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		// creamos el objeto de la clase Estudiante
		Estudiante estudiante1 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
		
		// insertamos el objeto de la clase Estudiante en el ArrayList estudiantes
		estudiantes.add(estudiante1);
		
		// muestra por pantalla el n�mero de elementos
		System.out.println(estudiantes.size());
		
		// acceder a un elemento por una posici�n y guardarlo como objeto
		Estudiante estudianteGuardado = estudiantes.get(0);
		
		
		
//		Estudiante estudiante2 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
//		Estudiante estudiante3 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
//		Estudiante estudiante4 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
//		Estudiante estudiante5 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
		
//		// invocacion a un metodo no estatico OBJETO.METODO_NO_ESTATICO
//		estudiante1.mostrarInfo();
		
		// invocacion a un metodo estatico: CLASE.METODO_ESTATICO
//		Estudiante.crearEstudiante();

	}

}
