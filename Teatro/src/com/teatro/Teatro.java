package com.teatro;

import java.util.ArrayList;

public class Teatro {

	protected String nombre;
	protected String calle;
	protected int superficie;
	protected int accesos;
	protected ArrayList<Localidad> localidades;
	
	public Teatro(String teatro, String calle, int superficie, int acceso) {
		
		this.nombre = teatro;
		this.calle = calle;
		this.superficie = superficie;
		this.accesos = accesos;
		
		// Inicialización de localidades
		this.localidades = new ArrayList<Localidad>();
		
		// Inserta 50 localidades (5 filas x 10 butacas) en el Arraylist
		for (int fila = 0; fila < 5; fila++) {
			for (int butaca = 0; butaca < 10; butaca++) {
				}
			}
	}

	
	public ArrayList<Localidad> getLocalidades() {
		return localidades;
	}


	public void mostrarTeatro() {
		System.out.println("En C/ " + this.calle + ", loca de " + this.superficie + " metros, con " + this.accesos);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getAccesos() {
		return accesos;
	}

	public void setAccesos(int accesos) {
		this.accesos = accesos;
	}


}
