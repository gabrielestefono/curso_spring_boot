package com.luv2code.cruddemo.dao;

import java.util.List;

import com.luv2code.cruddemo.entity.Employee;

public interface EmployeeDAO {
	List<Employee> findAll();

	Employee findById(int employeeId);

	Employee save(Employee employee);

	Employee update(Employee employee, int id);

	void deleteById(int employeeId);
}
