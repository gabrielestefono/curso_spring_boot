package com.luv2code.cruddemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

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
}
