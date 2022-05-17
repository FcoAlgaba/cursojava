package clasejava;



public class Bicicleta extends Vehiculo {

	// atributo de la bicicleta
	private int cambios;
	
	// m�todos
		public void parar() {
			System.out.println("Método parar de Bicicleta");
		};



	// constructor
	public Bicicleta(float velocidad, int asientos, int orientacionRuedas, int cambios) {
		super(velocidad, asientos, orientacionRuedas);
		this.cambios = cambios;
	}

	public int getCambios() {
		return cambios;
	}

	public void setCambios(int cambios) {
		this.cambios = cambios;
	}
}
