package com.example.Employees.service;

import com.example.Employees.exception.EmployeeNotFoundException;
import com.example.Employees.model.Employee;
import com.example.Employees.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired private EmployeeRepository repository;

  public Employee createEmployee(Employee employee) {
    return this.repository.save(employee);
  }

  public List<Employee> getAllEmployee() {

    return this.repository.findAll();
  }

  public Employee getEmployeeById(String Id) {
    Long longId = Long.parseLong(Id);
    return this.repository
        .findById(longId)
        .orElseThrow(() -> new EmployeeNotFoundException("Employee Not found in the " + Id));
  }

  public void deleteEmployee(String id) {
    Long longId = Long.parseLong(id);
    this.repository
        .findById(longId)
        .orElseThrow(
            () ->
                new EmployeeNotFoundException(
                    "Employee Not fonnd in the given id cant perform delete" + id));
    this.repository.deleteById(longId);
  }
}
