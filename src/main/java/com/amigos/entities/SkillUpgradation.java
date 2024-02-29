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
@Table(name = "SkillUpgradation")
public class SkillUpgradation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UpgradationID")
	private int upgradationId;

	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;

	@Column(name = "SkillName")
	private String skillName;

	@Column(name = "PreviousSkillLevel")
	private int previousSkillLevel;

	@Column(name = "NewSkillLevel")
	private int newSkillLevel;

	@Column(name = "UpgradationDate")
	private LocalDate upgradationDate;

	@ManyToOne
	@JoinColumn(name = "UpgradedBy")
	private Employees upgradedBy;

	public SkillUpgradation() {
		// TODO Auto-generated constructor stub
	}

	public SkillUpgradation(int upgradationId, Employees employee, String skillName, int previousSkillLevel,
			int newSkillLevel, LocalDate upgradationDate, Employees upgradedBy) {
		super();
		this.upgradationId = upgradationId;
		this.employee = employee;
		this.skillName = skillName;
		this.previousSkillLevel = previousSkillLevel;
		this.newSkillLevel = newSkillLevel;
		this.upgradationDate = upgradationDate;
		this.upgradedBy = upgradedBy;
	}

	public int getUpgradationId() {
		return upgradationId;
	}

	public void setUpgradationId(int upgradationId) {
		this.upgradationId = upgradationId;
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

	public int getPreviousSkillLevel() {
		return previousSkillLevel;
	}

	public void setPreviousSkillLevel(int previousSkillLevel) {
		this.previousSkillLevel = previousSkillLevel;
	}

	public int getNewSkillLevel() {
		return newSkillLevel;
	}

	public void setNewSkillLevel(int newSkillLevel) {
		this.newSkillLevel = newSkillLevel;
	}

	public LocalDate getUpgradationDate() {
		return upgradationDate;
	}

	public void setUpgradationDate(LocalDate upgradationDate) {
		this.upgradationDate = upgradationDate;
	}

	public Employees getUpgradedBy() {
		return upgradedBy;
	}

	public void setUpgradedBy(Employees upgradedBy) {
		this.upgradedBy = upgradedBy;
	}

	@Override
	public String toString() {
		return "SkillUpgradation [upgradationId=" + upgradationId + ", employee=" + employee + ", skillName="
				+ skillName + ", previousSkillLevel=" + previousSkillLevel + ", newSkillLevel=" + newSkillLevel
				+ ", upgradationDate=" + upgradationDate + ", upgradedBy=" + upgradedBy + "]";
	}

}