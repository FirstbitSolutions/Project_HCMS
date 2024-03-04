package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Departments;

public interface DepartmentsDAO {
	List<Departments> getAllDepartments();

	void addDepartments(Departments department);
}
