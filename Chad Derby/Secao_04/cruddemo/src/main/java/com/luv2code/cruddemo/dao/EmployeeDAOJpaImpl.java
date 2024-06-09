package com.luv2code.cruddemo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.luv2code.cruddemo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

	private final EntityManager entityManager;

	public EmployeeDAOJpaImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);
		return theQuery.getResultList();
	}

	@Override
	public Employee findById(int employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}

	@Override
	public Employee save(Employee employee) {
		return this.entityManager.merge(employee);
	}

	@Override
	public void deleteById(int employeeId) {
		Employee employee = this.findById(employeeId);
		this.entityManager.remove(employee);
	}
	
	@Override
	public Employee update(Employee employee, int id) {
		Employee employeeRecovered = this.findById(id);
		employeeRecovered.setFirstName(employee.getFirstName());
		employeeRecovered.setLastName(employee.getLastName());
		employeeRecovered.setEmail(employee.getEmail());
		return this.entityManager.merge(employeeRecovered);
	}
}
