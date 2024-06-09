package com.luv2code.cruddemo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.cruddemo.dao.EmployeeDAO;
import com.luv2code.cruddemo.entity.Employee;

@Service
public class EmployeeServiceEmpl implements EmployeeService{

	private final EmployeeDAO employeeDAO;
	
	public EmployeeServiceEmpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public List<Employee> findAll() {
		return this.employeeDAO.findAll();
	}

	@Override
	public Employee findById(int employeeId) {
		return this.employeeDAO.findById(employeeId);
	}

	@Override
	@Transactional
	public Employee save(Employee theEmployee) {
		return this.employeeDAO.save(theEmployee);
	}
	
	@Override
	@Transactional
	public Employee update(Employee theEmployee, int id) {
		return this.employeeDAO.update(theEmployee, id);
	}

	@Override
	@Transactional
	public void deleteById(int employeeId) {
		this.employeeDAO.deleteById(employeeId);
	}
}
