package com.empresa.project_management.service;

import com.empresa.project_management.dto.CompanyDTO;
import com.empresa.project_management.entity.Company;
import com.empresa.project_management.mappers.CompanyMapper;
import com.empresa.project_management.repository.CompanyRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    public CompanyService(CompanyRepository companyRepository, CompanyMapper companyMapper) {
        this.companyRepository = companyRepository;
        this.companyMapper = companyMapper;
    }

    // Obtener todas las compañias
    public List<CompanyDTO> getAllCompanies() {
        return companyRepository.findAll()
                .stream()
                .map(companyMapper::toDTO)
                .collect(Collectors.toList());
    }

    // Obtener compañia por ID
    public CompanyDTO getCompanyById(Long id) {
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found"));
        return companyMapper.toDTO(company);
    }

    // Crear una nueva compañia
    public CompanyDTO createCompany(CompanyDTO companyDTO) {
        Company company = companyMapper.toEntity(companyDTO);
        Company savedCompany = companyRepository.save(company);
        return companyMapper.toDTO(savedCompany);
    }

    // Actualizar compañia existente
    public CompanyDTO updateCompany(Long id, CompanyDTO companyDTO) {
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found"));
        company.setName(companyDTO.name());
        company.setNit(companyDTO.nit());
        company.setPhone(companyDTO.phone());
        company.setAddress(companyDTO.address());
        company.setEmail(companyDTO.email());
        Company updatedCompany = companyRepository.save(company);
        return companyMapper.toDTO(updatedCompany);
    }

    // Eliminar compañia por ID
    public void deleteCompany(Long id) {
        if (!companyRepository.existsById(id)) {
            throw new RuntimeException("Company not found");
        }
        companyRepository.deleteById(id);
    }
}
