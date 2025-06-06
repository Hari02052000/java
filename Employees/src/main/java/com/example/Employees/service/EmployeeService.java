package com.example.Employees.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employees.exception.EmployeeNotFoundException;
import com.example.Employees.model.Employee;
import com.example.Employees.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    
    public Employee createEmployee(Employee employee){
      return this.repository.save(employee);
    }
    public List<Employee> getAllEmployee(){
        
        return this.repository.findAll();
    }
    public Employee getEmployeeById(String Id){
      return this.repository.findById(Id).orElseThrow(()->new EmployeeNotFoundException("Employee Not found in the " + Id));
    }
    public void deleteEmployee(String id){
        this.repository.findById(id).orElseThrow(()->new EmployeeNotFoundException("Employee Not fonnd in the given id cant perform delete" + id));
        this.repository.deleteById(id);
    }

}
