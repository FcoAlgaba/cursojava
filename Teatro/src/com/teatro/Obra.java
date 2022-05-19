package com.teatro;

public class Obra extends Teatro {

	private String titulo;
	private String genero;
	private int duracion;
	private double precio;

	public Obra(String teatro, String calle, int superficie, int acceso, String titulo, String genero, int duracion,
			double precio) {
		super(teatro, calle, superficie, acceso);
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.precio = precio;
	}

	public void mostrarObra() {
		System.out.println(
				"Hoy representamos " + this.titulo + ", g�nero: " + this.genero + ", Duraci�n: " + this.duracion);

	}

	public void mostrarPrecio() {
		System.out.println("Precio: " + this.precio);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return null;
	}

	public void verProgramacion() {
		this.mostrarObra();
		this.mostrarTeatro();
		this.mostrarPrecio();
	}

	public void mostrarLocalidades() {
for (Localidad localidad : this.localidades) {
	//String ocupado =
	//System.out.println(localidad.getFila() + "." + localidad.getButaca());
	
}
	}

}
