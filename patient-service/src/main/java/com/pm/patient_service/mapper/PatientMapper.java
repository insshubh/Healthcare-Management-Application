package com.pm.patient_service.mapper;

import java.util.UUID;

import com.pm.patient_service.DTO.PatientRequestDTO;
import com.pm.patient_service.DTO.PatientResponseDTO;
import com.pm.patient_service.model.Patient;

public class PatientMapper {
	public static PatientResponseDTO toResponseDTO(Patient patient) {
		if (patient == null) {
			return null;
		}
		PatientResponseDTO response = new PatientResponseDTO();
		response.setPatientId(patient.getId().toString());
		response.setName(patient.getName());
		response.setEmail(patient.getEmail());
		response.setDateOfBirth(patient.getDateOfBirth());

		return response;
	}

	public static Patient toDTO(Patient newPatient) {
		if (newPatient == null) {
			return null;
		}
		Patient patient = new Patient();
		patient.setId(UUID.randomUUID());
		patient.setName(newPatient.getName());
		patient.setEmail(newPatient.getEmail());
		patient.setAddress(newPatient.getAddress());
		patient.setDateOfBirth(newPatient.getDateOfBirth());
		patient.setRegistrationDate(newPatient.getRegistrationDate());

		return patient;
	}
}
