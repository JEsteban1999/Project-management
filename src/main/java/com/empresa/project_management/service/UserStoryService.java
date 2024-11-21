package com.empresa.project_management.service;

import com.empresa.project_management.dto.UserStoryDTO;
import com.empresa.project_management.entity.Project;
import com.empresa.project_management.entity.UserStory;
import com.empresa.project_management.mappers.UserStoryMapper;
import com.empresa.project_management.repository.ProjectRepository;
import com.empresa.project_management.repository.UserStoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserStoryService {
    private final UserStoryRepository userStoryRepository;
    private final ProjectRepository projectRepository;
    private final UserStoryMapper userStoryMapper;

    public UserStoryService(UserStoryRepository userStoryRepository, ProjectRepository projectRepository, UserStoryMapper userStoryMapper) {
        this.userStoryRepository = userStoryRepository;
        this.projectRepository = projectRepository;
        this.userStoryMapper = userStoryMapper;
    }

    public UserStoryDTO createUserStory(UserStoryDTO userStoryDTO) {
        Project project = projectRepository.findById(userStoryDTO.projectId())
                .orElseThrow(() -> new RuntimeException("Project not found"));
        UserStory userStory = new UserStory();
        userStory.setTitle(userStoryDTO.title());
        userStory.setDescription(userStoryDTO.description());
        userStory.setProject(project);

        UserStory savedStory = userStoryRepository.save(userStory);
        return userStoryMapper.toDTO(savedStory);
    }

    public List<UserStoryDTO> getUserStoriesByProject(Long id) {
        List<UserStory> userStories = userStoryRepository.findByProjectId(id);
        return userStories.stream().map(userStoryMapper::toDTO).collect(Collectors.toList());
    }

    public UserStoryDTO updateUserStory(Long id, UserStoryDTO userStoryDTO) {
        UserStory userStory = userStoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User story not found"));

        userStory.setTitle(userStoryDTO.title());
        userStory.setDescription(userStoryDTO.description());

        UserStory updatedStory = userStoryRepository.save(userStory);
        return userStoryMapper.toDTO(updatedStory);
    }

    public void deleteUserStory(Long id) {
        UserStory userStory = userStoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User story not found"));

        userStoryRepository.delete(userStory);
    }

}
