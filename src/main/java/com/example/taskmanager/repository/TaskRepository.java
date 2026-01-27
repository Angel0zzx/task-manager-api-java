package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
    
    List<Task> findByTitle(String title);

    List<Task> findByDate(LocalDate date);

    List<Task> findByCompleted(boolean completed);

}