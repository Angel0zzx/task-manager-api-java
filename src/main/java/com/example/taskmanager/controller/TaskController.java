package com.example.taskmanager.controller;

import java.util.List;


import com.example.taskmanager.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskmanager.repository.TaskRepository;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskRepository taskRepository;

public TaskController(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
}

@GetMapping
public List<Task> getAllTasks() {
    return taskRepository.findAll();
}


}
