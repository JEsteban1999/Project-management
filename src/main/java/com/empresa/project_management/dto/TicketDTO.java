package com.empresa.project_management.dto;

public record TicketDTO(
        Long id,
        String title,
        String comments,
        String status,
        Long userStoryId
) {
}

