package com.dam.cris;

import java.util.ArrayList;

public class Hospital {

	private ArrayList<Medico> medicos;
	private ArrayList<Paciente> pacientes;
	private ArrayList<Consulta> consultas;

	public Hospital() {
		medicos = new ArrayList<Medico>();
		pacientes = new ArrayList<Paciente>();
		consultas = new ArrayList<Consulta>();
	}

	public Hospital(ArrayList<Medico> medicos, ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas) {

		this.medicos = medicos;
		this.pacientes = pacientes;
		this.consultas = consultas;
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Medico> medicos) {
		this.medicos = medicos;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}

	public String infoDatosMedicos() {
		String info = "--- Datos de todos los medicos ---  \n";
		
		for (Medico m : medicos) {
			info += m.toString() + "\n";
		}
		
		return info;
	}
	public String infoDatosPacientes() {
		String info = "--- Datos de todos los pacientes ---  \n";
		
		for (Paciente p : pacientes) {
			info += p.toString() + "\n";
		}
		
		return info;
	}
	public String infoDatosConsultas() {
		String info = "--- Datos de todos las consultas ---  \n";
		
		for (Consulta c : consultas) {
			info += c.toString() + "\n";
		}
		
		return info;
	}
	
	public void addMedico(Medico m) {
		medicos.add(m);
	}
	public void addPaciente(Paciente p) {
		pacientes.add(p);
	}
	public void addConsulta(Consulta c) {
		consultas.add(c);
		
	}
}
