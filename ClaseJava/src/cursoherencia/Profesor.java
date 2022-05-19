package cursoherencia;

public class Profesor extends Persona {
	private int numeroDeEdadesEstudiantes;
	private double sumadeEdadesEstudiantes;
	private double estudiantesEdadMedia;

	public Profesor(int id, int edad, int telefono, int numeroDeEdadesEstudiantes, double sumadeEdadesEstudiantes,
			double estudiantesEdadMedia) {
		super(id, edad, telefono);
		this.numeroDeEdadesEstudiantes = numeroDeEdadesEstudiantes;
		this.sumadeEdadesEstudiantes = sumadeEdadesEstudiantes;
		this.estudiantesEdadMedia = estudiantesEdadMedia;
	}

	public void agrefarEdadEstudiante(int edad) {
		System.out.println("Método agregarEdadEstudiante de Profesor");
	}

	public void mostrarInfo() {
		System.out.println("Método mostrarInfo de Profesor");
	}

	public int getNumeroDeEdadesEstudiantes() {
		return numeroDeEdadesEstudiantes;
	}

	public void setNumeroDeEdadesEstudiantes(int numeroDeEdadesEstudiantes) {
		this.numeroDeEdadesEstudiantes = numeroDeEdadesEstudiantes;
	}

	public double getSumadeEdadesEstudiantes() {
		return sumadeEdadesEstudiantes;
	}

	public void setSumadeEdadesEstudiantes(double sumadeEdadesEstudiantes) {
		this.sumadeEdadesEstudiantes = sumadeEdadesEstudiantes;
	}

	public double getEstudiantesEdadMedia() {
		return estudiantesEdadMedia;
	}

	public void setEstudiantesEdadMedia(double estudiantesEdadMedia) {
		this.estudiantesEdadMedia = estudiantesEdadMedia;
	}

	@Override
	public void mostrarID() {
		System.out.println(this.id);

	}

}
