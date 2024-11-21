package com.empresa.project_management.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record CompanyDTO(
        Long id,
        @NotBlank
        String name,
        @NotBlank
        String nit,
        @NotBlank
        String phone,
        @NotBlank
        String address,
        @Email
        String email,
        List<ProjectDTO> projects
) {
}
