package com.empresa.project_management.mappers;

import com.empresa.project_management.dto.CompanyDTO;
import com.empresa.project_management.entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    CompanyDTO toDTO(Company company);
    Company toEntity(CompanyDTO companyDTO);
}
