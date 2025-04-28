package com.jpahibernate.example.student_management_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.antlr.v4.runtime.misc.NotNull;

@Entity//it is an entity or model class which directly represents the database schema
@Table(name="student")//it will create a table in database
public class Student {

    @Id//it is the primary key of the table and cannot be duplicated
    @Column(name="id")//it creates a column inside database table
    private int id;

    @Column(name="name",nullable=false)
    private String name;

    @Column(name="age")
    private int age;


    @Column(name="email",nullable=false,unique = true)//unique=true- allows unique values
    private String email;

    @Column(name="gender")
    private String gender;

    @Column(name="grade",nullable=false)
    private String grade;

    @Column(name="mobile",nullable=false)
    private String mobile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
