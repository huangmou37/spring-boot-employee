package com.example.demo.controller;

import com.example.demo.entity.Company;
import com.example.demo.entity.Employee;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
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

  @Autowired
  private CompanyService companyService;

  @GetMapping("/companies")
  public List<Company> getAllCompanies() {
    return companyService.getAllCompanies();
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
  public Company addCompany(@RequestBody Company company) {
    return companyService.addCompany(company);
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
