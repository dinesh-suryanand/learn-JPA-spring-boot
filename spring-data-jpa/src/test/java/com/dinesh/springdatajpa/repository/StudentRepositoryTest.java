package com.dinesh.springdatajpa.repository;

import com.dinesh.springdatajpa.entity.Guardian;
import com.dinesh.springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;
    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .firstName("Dinesh")
                .lastName("boddu")
                .emailId("dinesh@gmail.com")
//                .guardianName("Dileep")
//                .guardianEmail("dileep@gmail.com")
//                .guardianMobile("9929292909")
                .build();

        studentRepository.save(student);
    }
    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .email("dileep@gmail.com")
                .name("Dileep")
                .mobile("9929292909")
                .build();

        Student student = Student.builder()
                .firstName("lokesh")
                .lastName("boddu")
                .guardian(guardian)
                .emailId("lokesh@gmail.com")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void printAllStudents(){
        List<Student> students = studentRepository.findAll();

        System.out.println("students = " + students);
    }

    @Test
    public void printByFirstName(){
        List<Student> students = studentRepository.findByFirstName("dinesh");

        System.out.println("students = " + students);

    }

    @Test
    public void printByFirstNameContains(){
        List<Student> students = studentRepository.findByFirstNameContaining("di");

        System.out.println("students = " + students);

    }
}