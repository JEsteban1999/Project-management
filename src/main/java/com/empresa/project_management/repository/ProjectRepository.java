package com.empresa.project_management.repository;

import com.empresa.project_management.dto.CompanyDTO;
import com.empresa.project_management.dto.ProjectDTO;
import com.empresa.project_management.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<ProjectDTO> findByCompany(CompanyDTO company);
}
