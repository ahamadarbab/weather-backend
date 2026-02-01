package com.example.weather_backend;


import com.example.weather_backend.repository.StudentRepository;
import com.example.weather_backend.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StudentServiceTest {

    StudentService studentService;
    StudentRepository studentRepository;

    @BeforeEach
    public void setUp() {
        // step 1: create a dummy or fake object class
        studentRepository = mock(StudentRepository.class);
        studentService = new StudentService(studentRepository);
    }

    @Test
    public void testTellYourDetails() {
        when(studentRepository.getId()).thenReturn(1);
        String actualResponse = studentService.tellYourDetails("Somendra");
        String expectedResponse = "Hii Somendra 1";
        assertEquals(expectedResponse, actualResponse);
    }
}
