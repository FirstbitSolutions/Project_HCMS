package com.amigos.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employees")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;

	private String firstName;

	private String lastName;

	private String gender;

	private LocalDate dateOfBirth;

	private String email;

	private String phone;

	private String address;

	private String nationalId;

	private String martialStatus;

	private String emergencyContactPhone;

	// code incomplete
	@ManyToOne
	private Department department;

	private String position;

	private String skillSet;

	private LocalDate employmentStartDate;

	private LocalDate employmentEndDate;

	private BigDecimal salary;

	private String employmentStatus;

	private String bankAccountNumber;

	@ManyToOne
	private Employee manager;

	@ManyToOne
	private Role role;

}
