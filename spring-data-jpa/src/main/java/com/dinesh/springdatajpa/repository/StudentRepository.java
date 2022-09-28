package com.dinesh.springdatajpa.repository;

import com.dinesh.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findByFirstName(String firstName);

    public List<Student> findByFirstNameContaining(String firstName);

}
