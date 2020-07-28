package com.example.demo.service;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

  @Autowired
  private CompanyRepository companyRepository;

  public List<Company> getAllCompanies() {
    return companyRepository.findAll();
  }

  public Company addCompany(Company company) {
    return companyRepository.save(company);
  }
}
