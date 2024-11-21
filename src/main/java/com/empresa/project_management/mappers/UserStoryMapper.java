package com.empresa.project_management.mappers;

import com.empresa.project_management.dto.UserStoryDTO;
import com.empresa.project_management.entity.UserStory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {TicketMapper.class})
public interface UserStoryMapper {
    @Mapping(source = "project.id", target = "projectId")
    UserStoryDTO toDTO(UserStory userStory);

    @Mapping(source = "projectId", target = "project.id")
    UserStory toEntity(UserStoryDTO userStoryDTO);
}
