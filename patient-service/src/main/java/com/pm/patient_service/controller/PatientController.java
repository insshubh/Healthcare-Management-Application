package com.pm.patient_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import java.util.List;
import com.pm.patient_service.DTO.PatientResponseDTO;

import com.pm.patient_service.Service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {
private final PatientService patientService;

	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}
	
	@GetMapping
	public ResponseEntity<List<PatientResponseDTO>> getAllPatients() {
		List<PatientResponseDTO> patients = patientService.getAllPatients();
		return ResponseEntity.ok().body(patients);
	}
	
	
}
