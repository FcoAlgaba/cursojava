import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * implementa un programa que solicite al usuario que introduzca un n?mero por
		 * pantalla y en funci?n del n?mero introducido se muestre el siguiente mensaje
		 * para cada n?mero:
		 * 
		 * 1 --> Gestores
		 * 
		 * 2 --> Clientes
		 * 
		 * 3 --> Transferencias
		 * 
		 * 4 --> Mensajes
		 * 
		 * 5 --> Pr?stamos
		 * 
		 * 6 -> Salir
		 * 
		 * Para el resto de n?meros no se mostrar? ning?n mensaje por pantalla.
		 */
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("1. Gestores");
		System.out.println("2. Clientes");
		System.out.println("3. Transferencias");
		System.out.println("4. Mensajes");
		System.out.println("5. Pr?stamos");
		System.out.println("6. Salir");
		
		System.out.print("Introduzca elecci?n: ");
		int eleccion = keyboard.nextInt();
			
		if(eleccion == 1) {
			System.out.println("Gestores");
		}
		else if(eleccion == 2) {
			System.out.println("Clientes");
		}
		else if(eleccion == 3) {
			System.out.println("Transferencias");
		}
		
		
		
		
		
		
		
		
		
		keyboard.close();				
	}

}
