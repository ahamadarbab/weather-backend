package com.example.weather_backend.service;

import com.example.weather_backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public String tellYourDetails(String name) {
        int id = studentRepository.getId();
        return "Hii " + name + " " + id;
    }
}
