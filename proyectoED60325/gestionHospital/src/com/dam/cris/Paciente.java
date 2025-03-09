package com.dam.cris;

public class Paciente {

	private int id;
	private String nombre;
	private int numHistorialClinico;
	private String direccion;

	public Paciente() {

	}

	public Paciente(int id, String nombre, int numHistorialClinico, String direccion) {

		this.id = id;
		this.nombre = nombre;
		this.numHistorialClinico = numHistorialClinico;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHistorialClinico() {
		return numHistorialClinico;
	}

	public void setNumHistorialClinico(int numHistorialClinico) {
		this.numHistorialClinico = numHistorialClinico;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", numHistorialClinico=" + numHistorialClinico
				+ ", direccion=" + direccion + "]";
	}

}
