package com.empresa.project_management.mappers;

import com.empresa.project_management.dto.ProjectDTO;
import com.empresa.project_management.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserStoryMapper.class})
public interface ProjectMapper {
    @Mapping(source = "company.id", target = "companyId")
    ProjectDTO toDTO(Project project);

    @Mapping(source = "companyId", target = "company.id")
    Project toEntity(ProjectDTO projectDTO);
}
