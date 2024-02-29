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
@Table(name = "SkillMatrix")
public class SkillMatrix {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MatrixID")
	private int matrixId;

	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;

	@Column(name = "SkillName")
	private String skillName;

	@Column(name = "SkillLevel")
	private int skillLevel;

	@Column(name = "LastUpdated")
	private LocalDate lastUpdated;

	// Getters and setters
	public SkillMatrix() {
		// TODO Auto-generated constructor stub
	}

	public SkillMatrix(int matrixId, Employees employee, String skillName, int skillLevel, LocalDate lastUpdated) {
		super();
		this.matrixId = matrixId;
		this.employee = employee;
		this.skillName = skillName;
		this.skillLevel = skillLevel;
		this.lastUpdated = lastUpdated;
	}

	public int getMatrixId() {
		return matrixId;
	}

	public void setMatrixId(int matrixId) {
		this.matrixId = matrixId;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		return "SkillMatrix [matrixId=" + matrixId + ", employee=" + employee + ", skillName=" + skillName
				+ ", skillLevel=" + skillLevel + ", lastUpdated=" + lastUpdated + "]";
	}

}
