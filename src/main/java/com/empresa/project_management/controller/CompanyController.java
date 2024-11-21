package com.empresa.project_management.controller;

import com.empresa.project_management.dto.CompanyDTO;
import com.empresa.project_management.service.CompanyService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<CompanyDTO> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public CompanyDTO getCompanyById(@PathVariable Long id) {
        return companyService.getCompanyById(id);
    }

    @PostMapping
    public CompanyDTO createCompany(@RequestBody @Valid CompanyDTO companyDTO) {
        return companyService.createCompany(companyDTO);
    }

    @PutMapping("/{id}")
    public CompanyDTO updateCompany(@PathVariable Long id, @RequestBody @Valid CompanyDTO companyDTO) {
        return companyService.updateCompany(id, companyDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.deleteCompany(id);
    }
}
