package com.pm.patient_service.model;

import java.time.LocalDate;
import java.time.Period;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import java.util.UUID;

import org.springframework.data.annotation.Transient;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@NotNull
	private String name;
	

	@NotNull
	@Email
	@Column(unique = true)
	private String email;

	@NotNull
	private String address;

	@NotNull
	private LocalDate dateOfBirth;
	
	@Column(name = "REGISTERED_DATE")
	@NotNull
	private LocalDate registrationDate;

	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}
 
	@Transient
	public int getAge() {
	    return Period.between(dateOfBirth, LocalDate.now()).getYears();
	}

	
	/**
	 * @param id the id to set
	 */
	public void setId(UUID id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the registrationDate
	 */
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

}
