package com.example.University.Event.Management.controller;

import com.example.University.Event.Management.model.Student;
import com.example.University.Event.Management.server.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    private IStudent iStudent;
    @GetMapping("/getAll")
//    http://localhost:8080/Student/getAll
    public List<Student> getAllStudents(){
        return iStudent.getallStudents();
    }
    @GetMapping("/getById/{id}")
//    http://localhost:8080/Student/getById/{id}
    public Student getStudentById(@PathVariable int id){
        return  iStudent.getStudentById(id);
    }
    @PostMapping("/add-student")
//    http://localhost:8080/Student/add-student
    public String addStudent(@RequestBody Student stu){
        return iStudent.addStudent(stu);
    }
    @DeleteMapping("/delete-student/{id}")
//    http://localhost:8080/Student/delete-student/{id}
    public String deleteStudent(@PathVariable int id){
        return  iStudent.deleteStudent(id);
    }
    @PutMapping("/update-student/{id}")
//    http://localhost:8080/Student/update-student/{id}
    public String updateStudent(@PathVariable int id,@RequestBody Student stu){
        return iStudent.updateStudentDepartment(id,stu);
    }




}
