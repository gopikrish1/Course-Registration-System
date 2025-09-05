package com.example.Course.Registration.System.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course{
    @Id
    private int courseId;
    private String courseName;
    private String courseTrainer;
    private int duration;
}
