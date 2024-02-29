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
@Table(name = "TrainingSchedules")
public class TrainingSchedules {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ScheduleID")
	private int scheduleId;

	@ManyToOne
	@JoinColumn(name = "ModuleID")
	private TrainingModules trainingModule;

	@ManyToOne
	@JoinColumn(name = "TrainerID")
	private Trainers trainer;

	@Column(name = "StartDate")
	private LocalDate startDate;

	@Column(name = "EndDate")
	private LocalDate endDate;

	@Column(name = "Location")
	private String location;

	@Column(name = "MaxParticipants")
	private int maxParticipants;

	// Getters and setters
	public TrainingSchedules() {
		// TODO Auto-generated constructor stub
	}

	public TrainingSchedules(int scheduleId, TrainingModules trainingModule, Trainers trainer, LocalDate startDate,
			LocalDate endDate, String location, int maxParticipants) {
		super();
		this.scheduleId = scheduleId;
		this.trainingModule = trainingModule;
		this.trainer = trainer;
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
		this.maxParticipants = maxParticipants;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public TrainingModules getTrainingModule() {
		return trainingModule;
	}

	public void setTrainingModule(TrainingModules trainingModule) {
		this.trainingModule = trainingModule;
	}

	public Trainers getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainers trainer) {
		this.trainer = trainer;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMaxParticipants() {
		return maxParticipants;
	}

	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}

	@Override
	public String toString() {
		return "TrainingSchedules [scheduleId=" + scheduleId + ", trainingModule=" + trainingModule + ", trainer="
				+ trainer + ", startDate=" + startDate + ", endDate=" + endDate + ", location=" + location
				+ ", maxParticipants=" + maxParticipants + "]";
	}

}