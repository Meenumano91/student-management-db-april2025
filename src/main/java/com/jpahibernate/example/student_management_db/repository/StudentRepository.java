package com.jpahibernate.example.student_management_db.repository;

import com.jpahibernate.example.student_management_db.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository // it performs the database operations and it is the data layer
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
