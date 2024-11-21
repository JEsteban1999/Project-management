package com.empresa.project_management.dto;

import java.util.List;

public record UserStoryDTO(
        Long id,
        String title,
        String description,
        Long projectId,
        List<TicketDTO> tickets
) {
}
