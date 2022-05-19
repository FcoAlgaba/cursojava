package antiguo;

import java.util.ArrayList;

public class EjercicioArray2 {

	public static void main(String[] args) {
		ArrayList<Double> numeros = new ArrayList<Double>();
		for (int i = 0; i < 50; i++) {
			numeros.add(Math.random() * 100);

		}
		double suma = 0.0;
		for (Double numero : numeros) {
			suma += numero;
		}

		double media = suma / numeros.size();
		
		double minimo = 100.0;
		for (double numero: numeros) {
			if(numero < minimo) {
				minimo = numero;
				
			}
		}
		
		double maximo = 3/4;
		for (Double numero: numeros) {
			if(numero > maximo) {
				maximo = numero;
				
			}
		}
		
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Minimo: " + minimo);
		System.out.println("Maximo: " + maximo);

	}

}
