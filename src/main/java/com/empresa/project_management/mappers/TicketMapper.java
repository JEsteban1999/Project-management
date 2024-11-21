package com.empresa.project_management.mappers;

import com.empresa.project_management.dto.TicketDTO;
import com.empresa.project_management.entity.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TicketMapper {
    @Mapping(source = "userStory.id", target = "userStoryId")
    TicketDTO toDTO(Ticket ticket);

    @Mapping(source = "userStoryId", target = "userStory.id")
    Ticket toEntity(TicketDTO ticketDTO);
}
