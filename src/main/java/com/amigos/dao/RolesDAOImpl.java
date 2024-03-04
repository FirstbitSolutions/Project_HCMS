package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Employees;
import com.amigos.entities.Roles;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RolesDAOImpl implements RolesDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Roles> getAllRoles() {
		return entityManager.unwrap(Session.class).createQuery("from Roles", Roles.class).getResultList();
	}

	@Override
	public void addRole(Roles role) {
		entityManager.unwrap(Session.class).saveOrUpdate(role);
	}

	@Override
	public void updateRole(Roles role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRole(int roleId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Roles getRoleById(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
