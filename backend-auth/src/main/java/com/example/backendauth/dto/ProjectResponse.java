package com.example.backendauth.dto;

import java.time.LocalDateTime;

public class ProjectResponse {
    private Long id;
    private String name;
    private String description;
    private String status;  // Thêm trường status
    private LocalDateTime createdAt;

    // Constructor mặc định
    public ProjectResponse() {}

    // Constructor với các tham số
    public ProjectResponse(Long id, String name, String description, String status, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;  // Thêm status vào constructor
        this.createdAt = createdAt;
    }

    // Getters và Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;  // Thêm getter cho status
    }
    public void setStatus(String status) {
        this.status = status;  // Thêm setter cho status
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
