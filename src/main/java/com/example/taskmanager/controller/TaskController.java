package com.example.taskmanager.controller;

import java.util.List;
import com.example.taskmanager.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




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

@GetMapping ("/search")
public List<Task> findByTitle(@RequestParam String title) {
    return taskRepository.findByTitle(title);
}


@PostMapping
public Task addNewTask(@RequestBody Task task) {
    return taskRepository.save(task);
}





}
