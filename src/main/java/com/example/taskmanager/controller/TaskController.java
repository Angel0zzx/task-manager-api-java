package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> GetAllTasks() {
        return taskService.getAll();
    }

    @GetMapping("/search")
    public List<Task> SearchByTitle(@RequestParam String keyword) {
        return taskService.searchByTitle(keyword);
    }

    @GetMapping("/search/date")
    public List<Task> SearchByDate(@RequestParam LocalDate date) {
        return taskService.searchByDate(date);
    }

    @PutMapping("/{id}/status")
    public Task UpdateStatus(@PathVariable String id) {
        return taskService.updateStatus(id);
    }

    @PostMapping
    public Task AddNewTask(@RequestBody Task task) {
        return taskService.CreateTask(task);
    }

    @DeleteMapping("/{id}/delete")
    public Task DeleteTask(@PathVariable String id) {
        return taskService.DeleteTask(id);
    }

}