package com.dam.cris;

public class Consulta {
	private int id;
	private String fecha;
	private String diagnostico;
	private String tratamiento;

	public Consulta() {

	}

	public Consulta(int id, String fecha, String diagnostico, String tratamiento) {

		this.id = id;
		this.fecha = fecha;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String toString() {
		return "Consulta [id=" + id + ", fecha=" + fecha + ", diagnostico=" + diagnostico + ", tratamiento="
				+ tratamiento + "]";
	}

}
