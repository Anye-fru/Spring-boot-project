package com.example.demo_spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping(path="api/v1/student")

public class StudentController {

    @GetMapping
    public List<Student> StudentInfo() {
        return List.of(
            new Student(1L, 19, "papa dev", "papadev@gmail.com")
        );
    }
    
    
}
