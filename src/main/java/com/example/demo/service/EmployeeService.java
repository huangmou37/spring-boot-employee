package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
  }

  public List<Employee> getEmployeesByGender(String gender) {
    return employeeRepository
        .findAll()
        .stream()
        .filter(employee -> employee.getGender().equals("male"))
        .collect(Collectors.toList());
  }

  public Employee addEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }
}
