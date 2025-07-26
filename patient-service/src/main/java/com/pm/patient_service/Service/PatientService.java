package com.pm.patient_service.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pm.patient_service.DTO.PatientResponseDTO;
import com.pm.patient_service.Repository.PatientRepository;
import com.pm.patient_service.mapper.PatientMapper;
import com.pm.patient_service.model.Patient;

@Service
public class PatientService {
	private final PatientRepository patientRepository;

	// Constructor injection for PatientRepository
	public PatientService(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	// Additional service methods can be added here
	public List<PatientResponseDTO> getAllPatients() {
		List<Patient> patients = patientRepository.findAll();
		List<PatientResponseDTO> responseListDTO = patients.stream().map(PatientMapper::toResponseDTO)
				.filter(response -> response != null).toList();
		return responseListDTO;
	}
}
