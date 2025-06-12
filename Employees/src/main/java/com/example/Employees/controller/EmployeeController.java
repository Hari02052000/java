package com.example.Employees.controller;

import com.example.Employees.model.Employee;
import com.example.Employees.service.EmployeeService;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

  @Autowired private EmployeeService employeeService;

  @PostMapping
  public ResponseEntity<Map<String, Object>> createEmployee(@RequestBody Employee employee) {
    Employee saved = this.employeeService.createEmployee(employee);
    return ResponseEntity.status(HttpStatus.OK).body(saved.getEmployeeDetails());
  }

  @GetMapping
  public ResponseEntity<List<Map<String, Object>>> getEmployees() {
    List<Employee> employees = this.employeeService.getAllEmployee();
        List<Map<String, Object>> employeeDetailsList = employees.stream()
        .map(Employee::getEmployeeDetails)
        .toList(); 
    return ResponseEntity.status(HttpStatus.OK).body(employeeDetailsList);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Map<String, Object>> getEmployeeById(@PathVariable String id) {
    Employee employee = employeeService.getEmployeeById(id);
    return ResponseEntity.status(HttpStatus.OK).body(employee.getEmployeeDetails());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteEmployee(@PathVariable String id) {
    this.employeeService.deleteEmployee(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
