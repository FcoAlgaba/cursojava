package curso;

public class Persona {

	// atributos
	protected int id;
	protected int edad;
	protected int telefono;
	
	// constructor
	public Persona(int id, int edad, int telefono) {
		// invoca al constructor de la clase Object
		super();
		System.out.println("Constructor de la clase Persona");
		this.id = id;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	// M�todos publicos no est�ticos
	public void mostrarInfo() {
		System.out.println("M�todo mostrarInfo de Persona");
	}

	// m�todos getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
