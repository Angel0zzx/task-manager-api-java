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

    public Task crear(Task task) {

        task.setCompleted(false);
        if (task.getDate() == null) {
            task.setDate(LocalDate.now());
        }
        return taskRepository.save(task);
    }

    public List<Task> obtenerTodas() {
        return taskRepository.findAll();
    }

    public List<Task> buscarPorTitulo(String keyword) {
        return taskRepository.findByTitleContainingIgnoreCase(keyword);
    }
}