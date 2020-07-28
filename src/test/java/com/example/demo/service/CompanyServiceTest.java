package com.example.demo.service;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CompanyServiceTest {

  @Mock
  private CompanyRepository companyRepository;

  @InjectMocks
  private CompanyService companyService;

  @Test
  void should_return_5_companies_when_get_all_companies_given_company_repository_with_5_companies() {
    // given
    Mockito.when(companyRepository.findAll()).thenReturn(new ArrayList<>(Collections.nCopies(5, new Company())));

    // when
    List<Company> companies = companyService.getAllCompanies();

    // then
    assertEquals(5, companies.size());
  }

  @Test
  void should_return_0_companies_when_get_all_companies_given_company_repository_with_0_companies() {
    // given
    Mockito.when(companyRepository.findAll()).thenReturn(new ArrayList<>());

    // when
    List<Company> companies = companyService.getAllCompanies();

    // then
    assertEquals(0, companies.size());
  }
}
