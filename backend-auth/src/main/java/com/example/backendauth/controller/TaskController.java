package com.example.backendauth.controller;

import com.example.backendauth.model.Task;
import com.example.backendauth.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task); // Tạo task mới
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks(); // Lấy tất cả tasks
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id); // Lấy task theo ID
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id); // Xóa task
    }
}
