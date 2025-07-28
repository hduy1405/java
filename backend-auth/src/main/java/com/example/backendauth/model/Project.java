package com.example.backendauth.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private LocalDateTime createdAt = LocalDateTime.now();

    private String status;  // Thêm thuộc tính status

    // Các phương thức getter và setter cho các thuộc tính
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getStatus() {  // Thêm phương thức getter cho status
        return status;
    }

    public void setStatus(String status) {  // Thêm phương thức setter cho status
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // Nếu muốn liên kết User tạo project:
    // @ManyToOne
    // private User owner;

    // Getters & Setters cho các thuộc tính khác
    // ...
}
