package com.example.demo_spring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table 
public class Student {
   

        @Id 
        @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "Student_Sequence",
            allocationSize = 1
        )
        @GeneratedValue (strategy = GenerationType.IDENTITY, generator = "Student_Sequence")

        private long id;
        private int age;
        private String name;
        private String email;
        
        
        
    public Student() {
        }
    public Student( String name, String email,int age) {
            this.age = age;
            this.name = name;
            this.email = email;
        }
    public Student(long id, int age, String name, String email) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.email = email;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Student [getId()=" + getId() + ", getAge()=" + getAge() + ", getName()=" + getName() + ", getEmail()="
                + getEmail() + "]";
    }

    
    
}
