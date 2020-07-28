package com.example.demo.controller;

import com.example.demo.entity.Company;
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
public class CompanyController {

  @GetMapping("/companies")
  public List<Company> getAllCompanies() {
    return null;
  }

  @GetMapping("/companies?page={page}&pageSize={pageSize}")
  public List<Company> getCompanies(@PathVariable int page, @PathVariable int pageSize) {
    return null;
  }

  @GetMapping("/companies/{companyId}")
  public Company getCompanyByCompanyId(@PathVariable String companyId) {
    return null;
  }

  @GetMapping("/companies/{companyId}/employees")
  public List<Employee> getAllEmployeesByCompanyId(@PathVariable String companyId) {
    return null;
  }

  @PostMapping("/companies")
  public void addCompany(@RequestBody Company company) {
    return;
  }

  @PutMapping("/companies")
  public void updateCompany(@RequestBody Company company) {
    return;
  }

  @DeleteMapping("/companies/{companyId}")
  public void deleteCompanyById(@PathVariable String companyId) {
    return;
  }
}
