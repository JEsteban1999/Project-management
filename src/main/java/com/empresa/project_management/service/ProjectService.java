package com.empresa.project_management.service;

import com.empresa.project_management.dto.CompanyDTO;
import com.empresa.project_management.dto.ProjectDTO;
import com.empresa.project_management.entity.Company;
import com.empresa.project_management.entity.Project;
import com.empresa.project_management.mappers.ProjectMapper;
import com.empresa.project_management.repository.CompanyRepository;
import com.empresa.project_management.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;
    private final CompanyRepository companyRepository;
    private final ProjectMapper projectMapper;

    public ProjectService(ProjectRepository projectRepository, CompanyRepository companyRepository, ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.companyRepository = companyRepository;
        this.projectMapper = projectMapper;
    }

    // Obtener todos los proyectos de una compañia
    public List<ProjectDTO> getAllProjects() {
        return projectRepository.findAll().stream()
                .map(projectMapper::toDTO)
                .collect(Collectors.toList());
    }

    // Obtener proyecto en especifico
    public ProjectDTO getProjectById(Long id) {
        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));
        return projectMapper.toDTO(project);
    }

    // Crear nuevo proyecto
    public ProjectDTO createProject(ProjectDTO projectDTO) {
        Company company = companyRepository.findById(projectDTO.companyId())
                .orElseThrow(() -> new RuntimeException("Company not found"));

        Project project = new Project();
        project.setName(projectDTO.name());
        project.setCompany(company);

        Project savedProject = projectRepository.save(project);
        return projectMapper.toDTO(savedProject);
    }

    // Actualizar un proyecto existente
    public ProjectDTO updateProject(Long id, ProjectDTO projectDTO) {
        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));
        Company company = companyRepository.findById(projectDTO.companyId())
                .orElseThrow(() -> new RuntimeException("Company not found"));

        project.setName(projectDTO.name());
        project.setCompany(company);

        Project updatedProject = projectRepository.save(project);
        return projectMapper.toDTO(updatedProject);
    }

    // Eliminar un proyecto
    public void deleteProject(Long id) {
        if (!projectRepository.existsById(id)) {
            throw new RuntimeException("Project not found");
        }
        projectRepository.deleteById(id);
    }
}
