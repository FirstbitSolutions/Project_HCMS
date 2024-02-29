package com.amigos.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Certifications")
public class Certifications {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CertificationID")
	private int certificationId;

	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;

	@Column(name = "CertificationName")
	private String certificationName;

	@Column(name = "CertificationAuthority")
	private String certificationAuthority;

	@Column(name = "IssueDate")
	private LocalDate issueDate;

	@Column(name = "ExpiryDate")
	private LocalDate expiryDate;

	// Getters and setters
	public Certifications() {
	}

	public Certifications(int certificationId, Employees employee, String certificationName,
			String certificationAuthority, LocalDate issueDate, LocalDate expiryDate) {
		this.certificationId = certificationId;
		this.employee = employee;
		this.certificationName = certificationName;
		this.certificationAuthority = certificationAuthority;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}

	public int getCertificationId() {
		return certificationId;
	}

	public void setCertificationId(int certificationId) {
		this.certificationId = certificationId;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public String getCertificationName() {
		return certificationName;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}

	public String getCertificationAuthority() {
		return certificationAuthority;
	}

	public void setCertificationAuthority(String certificationAuthority) {
		this.certificationAuthority = certificationAuthority;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Certifications [certificationId=" + certificationId + ", employee=" + employee + ", certificationName="
				+ certificationName + ", certificationAuthority=" + certificationAuthority + ", issueDate=" + issueDate
				+ ", expiryDate=" + expiryDate + "]";
	}

}