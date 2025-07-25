package com.pm.patient_service.Repository;

import com.pm.patient_service.model.Patient;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, UUID> {

}
