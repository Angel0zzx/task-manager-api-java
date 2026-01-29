package com.example.taskmanager.service;

import java.util.List;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import java.time.LocalDate;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task CreateTask(Task task) {
        task.setCompleted(false);
        if (task.getDate() == null) {
            task.setDate(LocalDate.now());
        }
        return taskRepository.save(task);
    }

    public List<Task> searchByDate(LocalDate date) {
        return taskRepository.findByDate(date);
    }

    public Task updateStatus(String id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setCompleted(!task.isCompleted());
        return taskRepository.save(task);
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public List<Task> searchByTitle(String keyword) {
        return taskRepository.findByTitleContainingIgnoreCase(keyword);
    }
}