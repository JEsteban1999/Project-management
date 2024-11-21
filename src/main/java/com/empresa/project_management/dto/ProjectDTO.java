package com.empresa.project_management.dto;

import java.util.List;

public record ProjectDTO(
        Long id,
        String name,
        Long companyId,
        List<UserStoryDTO> userStories
) {
}
