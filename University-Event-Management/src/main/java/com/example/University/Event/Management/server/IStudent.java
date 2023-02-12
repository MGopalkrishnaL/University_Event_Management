package com.example.University.Event.Management.server;

import com.example.University.Event.Management.model.Student;

import java.util.List;

public interface IStudent{
    public List<Student> getallStudents();
    public Student getStudentById(int studentId);
    public String addStudent(Student stu);
    public String deleteStudent(int studentId);
    public String updateStudentDepartment(int studentId , Student stu);

}
