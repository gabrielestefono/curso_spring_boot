package com.luv2code.cruddemo.service;

import java.util.List;

import com.luv2code.cruddemo.entity.Employee;

public interface EmployeeService {
	List<Employee> findAll();

	Employee findById(int employeeId);
	
	Employee save(Employee theEmployee);
	
	Employee update(Employee theEmployee, int id);

	void deleteById(int employeeId);
}
