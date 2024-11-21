package com.empresa.project_management.controller;

import com.empresa.project_management.dto.UserStoryDTO;
import com.empresa.project_management.service.UserStoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-stories")
public class UserStoryController {
    private final UserStoryService userStoryService;

    public UserStoryController(UserStoryService userStoryService) {
        this.userStoryService = userStoryService;
    }

    @GetMapping("/{id}")
    public List<UserStoryDTO> getUserStoriesByProject(@PathVariable Long id) {
        return userStoryService.getUserStoriesByProject(id);
    }

    @PostMapping
    public UserStoryDTO createUserStory(@RequestBody UserStoryDTO userStoryDTO) {
        return userStoryService.createUserStory(userStoryDTO);
    }

    @PutMapping("/{id}")
    public UserStoryDTO updateUserStory(@PathVariable Long id, @RequestBody UserStoryDTO userStoryDTO) {
        return userStoryService.updateUserStory(id, userStoryDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUserStory(@PathVariable Long id) {
        userStoryService.deleteUserStory(id);
    }
}
