package com.pm.patient_service.DTO;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;

public class PatientRequestDTO {
	@NotBlank
	@Size(max = 100, message = "Name cannot exceed 100 characters")
	private String name;
	@NotBlank(message = "Email cannot be blank")
	@Email(message = "Email should be valid")
	private String email;
	@NotNull(message = "Address cannot be null")
	private String address;
	@NotNull(message = "Date of Birth cannot be null")
	private LocalDate dateOfBirth;
	@NotNull(message = "Registration Date cannot be null")
	private LocalDate registrationDate;

	// Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

}
