package com.luv2code.cruddemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.cruddemo.entity.Employee;
import com.luv2code.cruddemo.service.EmployeeServiceEmpl;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class EmployeeRestController {

	private final EmployeeServiceEmpl employeeService;

	public EmployeeRestController(EmployeeServiceEmpl employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/employees")
	public List<Employee> findAll() {
		return this.employeeService.findAll();
	}

	@GetMapping("/employees/{id}")
	public Employee findById(@PathVariable int id) {
		return this.employeeService.findById(id);
	}


	@PostMapping("/employees")
	public Employee save(@RequestBody Employee employee) {
		return this.employeeService.save(employee);
	}

	@DeleteMapping("/employees/{id}")
	public void delete(@PathVariable int id) {
		this.employeeService.deleteById(id);
	}

	@PutMapping("employees/{id}")
	public Employee update(@PathVariable int id, @RequestBody Employee employee) {
		return this.employeeService.update(employee, id);
	}
}
