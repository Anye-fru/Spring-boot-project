package com.example.demo_spring;

import java.util.List;

import java.util.Optional; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository; 
    }
      public List<Student> StudentInfo() {
        return  studentRepository.findAll();
    }

    public void addNewStudent(Student student){
        Optional<Student> StudentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if(StudentByEmail.isPresent()){
            throw new IllegalStateException("Email taken");
        }
        studentRepository.save(student);

    }
    public void deleteStudent(Long id) {
      boolean exist= studentRepository.existsById(id);

      if(exist){
         studentRepository.deleteById(id);
      }
    }
}
