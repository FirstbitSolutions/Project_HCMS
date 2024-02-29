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
@Table(name = "Trainers")
public class Trainers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TrainerID")
	private int trainerId;

	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;

	@Column(name = "IsExternal")
	private boolean isExternal;

	// Getters and setters
	public Trainers() {
		// TODO Auto-generated constructor stub
	}

	public Trainers(int trainerId, Employees employee, boolean isExternal) {
		super();
		this.trainerId = trainerId;
		this.employee = employee;
		this.isExternal = isExternal;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public boolean isExternal() {
		return isExternal;
	}

	public void setExternal(boolean isExternal) {
		this.isExternal = isExternal;
	}

	@Override
	public String toString() {
		return "Trainers [trainerId=" + trainerId + ", employee=" + employee + ", isExternal=" + isExternal + "]";
	}

}