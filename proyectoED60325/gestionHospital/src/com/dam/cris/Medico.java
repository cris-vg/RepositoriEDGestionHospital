package com.dam.cris;

public class Medico {
	private int id;
	private String nombre;
	private int numLicencia;
	private String especialidad;

	public Medico() {

	}

	public Medico(int id, String nombre, int numLicencia, String especialidad) {

		this.id = id;
		this.nombre = nombre;
		this.numLicencia = numLicencia;
		this.especialidad = especialidad;
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

	public int getNumLicencia() {
		return numLicencia;
	}

	public void setNumLicencia(int numLicencia) {
		this.numLicencia = numLicencia;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String toString() {
		return "Medico [id=" + id + ", nombre=" + nombre + ", numLicencia=" + numLicencia + ", especialidad="
				+ especialidad + "]";
	}

}
