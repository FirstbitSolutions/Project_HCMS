package com.amigos.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Projects")
public class Projects {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProjectID")
	private int projectId;

	@Column(name = "ProjectName")
	private String projectName;

	@Column(name = "ProjectDescription")
	private String projectDescription;

	@Column(name = "StartDate")
	private LocalDate startDate;

	@Column(name = "EndDate")
	private LocalDate endDate;

	@Column(name = "Status")
	private String status;

	// Getters and setters
	public Projects() {
		// TODO Auto-generated constructor stub
	}

	public Projects(int projectId, String projectName, String projectDescription, LocalDate startDate,
			LocalDate endDate, String status) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Projects [projectId=" + projectId + ", projectName=" + projectName + ", projectDescription="
				+ projectDescription + ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status + "]";
	}
	
	
}
