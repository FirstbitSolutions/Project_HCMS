package com.amigos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CandidateProfiles")
public class CandidateProfiles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CandidateID")
	private int candidateId;

	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;

	// Getters and setters
	public CandidateProfiles() {
	}

	public CandidateProfiles(int candidateId, Employees employee) {
		this.candidateId = candidateId;
		this.employee = employee;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "CandidateProfiles [candidateId=" + candidateId + ", employee=" + employee + "]";
	}

}