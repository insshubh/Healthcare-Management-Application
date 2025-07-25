package com.pm.patient_service.mapper;

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
}
