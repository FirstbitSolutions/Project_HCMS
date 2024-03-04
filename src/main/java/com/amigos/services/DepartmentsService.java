package com.amigos.services;

import java.util.List;

import com.amigos.entities.Departments;

public interface DepartmentsService {

	List<Departments> getAllDepartments();

	void addDepartment(Departments department);

	void updateDepartment(Departments department);

	void deleteDepartment(int departmentId);

	Departments getDepartmentById(int departmentId);

}
