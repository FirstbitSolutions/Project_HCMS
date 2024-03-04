package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Departments;
import com.amigos.entities.Roles;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DepartmentsDAOImpl implements DepartmentsDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Departments> getAllDepartments() {
		return entityManager.unwrap(Session.class).createQuery("from Departments", Departments.class).getResultList();
	}

	@Override
	public void addDepartments(Departments department) {
		entityManager.unwrap(Session.class).saveOrUpdate(department);
	}

}
