package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.obtenerTodas(); 
    }

    
    @GetMapping("/search")
    public List<Task> searchByTitle(@RequestParam String keyword) {
        return taskService.buscarPorTitulo(keyword); 
    }

    @PostMapping
    public Task addNewTask(@RequestBody Task task) {
        return taskService.crear(task); 
    }

}