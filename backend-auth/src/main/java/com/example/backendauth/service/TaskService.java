package com.example.backendauth.service;

import com.example.backendauth.model.Task;
import com.example.backendauth.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task); // Tạo task mới
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null); // Lấy task theo ID
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll(); // Lấy tất cả tasks
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id); // Xóa task
    }
}
