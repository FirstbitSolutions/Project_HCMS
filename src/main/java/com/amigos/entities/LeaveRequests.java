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
@Table(name = "LeaveRequests")
public class LeaveRequests {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LeaveRequestID")
	private int leaveRequestId;

	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;

	@ManyToOne
	@JoinColumn(name = "LeaveType")
	private LeaveTypes leaveType;

	@Column(name = "StartDate")
	private LocalDate startDate;

	@Column(name = "EndDate")
	private LocalDate endDate;

	@Column(name = "LeaveReason")
	private String leaveReason;

	@Column(name = "Status")
	private String status;

	// Getters and setters
	public LeaveRequests() {
		// TODO Auto-generated constructor stub
	}

	public LeaveRequests(int leaveRequestId, Employees employee, LeaveTypes leaveType, LocalDate startDate,
			LocalDate endDate, String leaveReason, String status) {
		super();
		this.leaveRequestId = leaveRequestId;
		this.employee = employee;
		this.leaveType = leaveType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveReason = leaveReason;
		this.status = status;
	}

	public int getLeaveRequestId() {
		return leaveRequestId;
	}

	public void setLeaveRequestId(int leaveRequestId) {
		this.leaveRequestId = leaveRequestId;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public LeaveTypes getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveTypes leaveType) {
		this.leaveType = leaveType;
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

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LeaveRequests [leaveRequestId=" + leaveRequestId + ", employee=" + employee + ", leaveType=" + leaveType
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", leaveReason=" + leaveReason + ", status="
				+ status + "]";
	}

}
