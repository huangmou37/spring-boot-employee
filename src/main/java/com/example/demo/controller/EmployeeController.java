package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Employee;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

  @GetMapping("/employees")
  public List<Employee> getAllEmployees() {
    return null;
  }

  @GetMapping("/employees?page={page}&pageSize={pageSize}")
  public List<Employee> getEmployees(@PathVariable int page, @PathVariable int pageSize) {
    return null;
  }

  @GetMapping("/employees?gender={gender}")
  public List<Employee> getEmployeesByGender(@PathVariable String gender) {
    return null;
  }

  @GetMapping("/employees/{employeeId}")
  public Employee getEmployeeByEmployeeId(@PathVariable String employeeId) {
    return null;
  }

  @PostMapping("/employees")
  public void addEmployee(@RequestBody Employee employee) {
    return;
  }

  @PutMapping("/employees")
  public void updateEmployee(@RequestBody Employee employee) {
    return;
  }

  @DeleteMapping("/employees/{employeeId}")
  public void deleteEmployeeById(@PathVariable String employeeId) {
    return;
  }
}
