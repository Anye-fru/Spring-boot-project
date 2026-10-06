package com.example.demo_spring;

import java.beans.BeanProperty;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
           Student mariam= new Student("papa dev","papadev@gmail.com",19);
           Student alex = new Student("edith","edith@gmail.com",22);

           repository.saveAll(List.of(mariam,alex));
        };
    }
    
}
