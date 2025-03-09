package com.dam.cris;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hospital = new Hospital();

		hospital.addMedico(new Medico(11, "Manolo Ruiz", 20021, "Psiquiatria"));
		hospital.addMedico(new Medico(1, "Dr. Juan Pérez", 123456, "Cardiología"));
		hospital.addMedico(new Medico(2, "Dra. María López", 234567, "Pediatría"));
		hospital.addMedico(new Medico(3, "Dr. Carlos Gómez", 345678, "Neurología"));
		hospital.addMedico(new Medico(4, "Dra. Ana Martínez", 456789, "Dermatología"));
		hospital.addMedico(new Medico(5, "Dr. Luis Rodríguez", 567890, "Ortopedia"));
		hospital.addMedico(new Medico(6, "Dra. Sofía Fernández", 678901, "Ginecología"));
		hospital.addMedico(new Medico(7, "Dr. Eduardo Sánchez", 789012, "Oftalmología"));
		hospital.addMedico(new Medico(8, "Dra. Patricia Ramírez", 890123, "Psiquiatría"));
		hospital.addMedico(new Medico(9, "Dr. Roberto Díaz", 901234, "Endocrinología"));
		hospital.addMedico(new Medico(10, "Dra. Gabriela Herrera", 102345, "Medicina Interna"));
		
		hospital.addPaciente(new Paciente()); // TODO: Añadir datos
		hospital.addPaciente(new Paciente(1, "Carlos Ramírez", 1111, "Av. Siempre Viva 742"));
		hospital.addPaciente(new Paciente(2, "Laura Fernández", 2222, "Calle Falsa 123"));
		hospital.addPaciente(new Paciente(3, "Pedro López", 3333, "Paseo del Sol 456"));
		hospital.addPaciente(new Paciente(4, "Ana González", 4444, "Callejón del Beso 22"));
		hospital.addPaciente(new Paciente(5, "Diego Martínez", 5555, "Av. Reforma 789"));
		hospital.addPaciente(new Paciente(6, "Sofía Herrera", 6666, "Plaza Mayor 101"));
		hospital.addPaciente(new Paciente(7, "Javier Ortega", 7777, "Calle Luna 303"));
		hospital.addPaciente(new Paciente(8, "Patricia Díaz", 8888, "Bulevar Central 202"));
		hospital.addPaciente(new Paciente(9, "Andrés Mendoza", 9999, "Av. del Río 505"));
		hospital.addPaciente(new Paciente(10, "Gabriela Torres", 1010, "Calle Primavera 707"));
		
		hospital.addConsulta(new Consulta());// TODO: Añadir datos
		hospital.addConsulta(new Consulta(1, "2025-03-09", "Hipertensión leve", "Dieta baja en sodio y ejercicio"));
		hospital.addConsulta(new Consulta(2, "2025-03-08", "Gripe estacional", "Reposo, hidratación y paracetamol"));
		hospital.addConsulta(new Consulta(3, "2025-03-07", "Migraña crónica", "Analgésicos y reducción de estrés"));
		hospital.addConsulta(new Consulta(4, "2025-03-06", "Alergia estacional", "Antihistamínicos y evitar alérgenos"));
		hospital.addConsulta(new Consulta(5, "2025-03-05", "Fractura de tobillo", "Yeso y reposo por 6 semanas"));
		hospital.addConsulta(new Consulta(6, "2025-03-04", "Diabetes tipo 2", "Insulina y control de dieta"));
		hospital.addConsulta(new Consulta(7, "2025-03-03", "Conjuntivitis", "Gotas antibióticas"));
		hospital.addConsulta(new Consulta(8, "2025-03-02", "Ansiedad severa", "Terapia cognitivo-conductual"));
		hospital.addConsulta(new Consulta(9, "2025-03-01", "Hipotiroidismo", "Levotiroxina"));
		hospital.addConsulta(new Consulta(10, "2025-02-28", "Gastritis crónica", "Antiácidos y cambios en la dieta"));
		
		// TODO: Actualizar UML con funciones addMedico(), addPaciente() y addConsulta()
		System.out.println(hospital.infoDatosMedicos());
		System.out.println(hospital.infoDatosPacientes());
		System.out.println(hospital.infoDatosConsultas());
	}

}
