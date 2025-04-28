package com.jpahibernate.example.student_management_db.service;

import com.jpahibernate.example.student_management_db.model.Student;
import com.jpahibernate.example.student_management_db.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //it contains business logic
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(Student student)
    {
     studentRepository.save(student);
     return "Student saved successfully!";
    }




    public Student getStudentById(int id)
    {
       Optional<Student> studentOptional= studentRepository.findById(id);
       if(studentOptional.isPresent()){
           return studentOptional.get();
       }
       return null;
    }


    public List<Student> getAllStudent()
    {
      List<Student> studentList=  studentRepository.findAll();
      return studentList;
    }

    public String deleteStudentById(int id)
    {
     studentRepository.deleteById(id);
     return "Student Deleted successfully";
    }

    public String countStudents()
    {
        long totalCount= studentRepository.count();
        return "Total Students Present are : "+totalCount;
    }


    public String updateStudentByPut(int id,Student newStudentRequest)
    {
        //find student with id
        //if student is present , update it
        //else no need to update it
       Student alreadyExistingStudent= getStudentById(id);
       if(alreadyExistingStudent!=null)
       {
        //perform update
           studentRepository.save(newStudentRequest);
           return " student updated successfully";
       }else
       {
           return "Student cannot be updated as id is not present";
       }

    }


     public String  updateStudentEmailByPatch(int id,String email)
     {
         //find student with id
         //if student is present , update it
         //else no need to update it
         Student alreadyExistingStudent= getStudentById(id);

         if(alreadyExistingStudent!=null)
         {
             //perform update
             alreadyExistingStudent.setEmail(email);
             studentRepository.save(alreadyExistingStudent);
             return " student email updated successfully";
         }else
         {
             return "Student  email cannot be updated as id is not present";
         }
     }

}
