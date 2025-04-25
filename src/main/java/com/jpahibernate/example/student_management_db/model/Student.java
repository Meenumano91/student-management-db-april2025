package com.jpahibernate.example.student_management_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//it is an entity or model class which directly represents the database schema
@Table(name="student")//it will create a table in database
public class Student {

    @Id//it is the primary key of the table and cannot be duplicated
    @Column(name="id")//it creates a column inside database table
    private int id;

    @Column(name="name",nullable=false)
    private String name;

    @Column(name="age")
    private String age;

    @Column(name="email",nullable=false,unique = true)//unique=true- allows unique values
    private String email;

    @Column(name="gender")
    private String gender;

    @Column(name="grade",nullable=false)
    private String grade;

    @Column(name="mobile",nullable=false)
    private String mobile;
}
