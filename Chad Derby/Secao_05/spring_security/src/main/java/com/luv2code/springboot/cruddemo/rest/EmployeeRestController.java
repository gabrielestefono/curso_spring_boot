package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

  private final EmployeeService employeeService;

  public EmployeeRestController(EmployeeService theEmployeeService) {
    employeeService = theEmployeeService;
  }

  @GetMapping("/employees")
  public List<Employee> findAll() {
    return employeeService.findAll();
  }

  @GetMapping("/employees/{employeeId}")
  public Employee getEmployee(@PathVariable int employeeId) {
    return employeeService.findById(employeeId);
  }


  @PostMapping("/employees")
  public Employee addEmployee(@RequestBody Employee theEmployee) {
    theEmployee.setId(0);
    return employeeService.save(theEmployee);
  }


  @PutMapping("/employees/{id}")
  public Employee updateEmployee(@RequestBody Employee theEmployee, @PathVariable int id) {
    Employee employee = this.getEmployee(id);
    employee.setFirstName(theEmployee.getFirstName());
    employee.setLastName(theEmployee.getLastName());
    employee.setEmail(theEmployee.getEmail());
    return employeeService.save(employee);
  }

  @DeleteMapping("/employees/{employeeId}")
  public String deleteEmployee(@PathVariable int employeeId) {
    this.getEmployee(employeeId);
    employeeService.deleteById(employeeId);
    return "Deleted employee id - " + employeeId;
  }
}














