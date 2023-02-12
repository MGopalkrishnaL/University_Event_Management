package com.example.University.Event.Management.server;

import com.example.University.Event.Management.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServer implements IStudent {
    private static List<Student> students= new ArrayList<>();

    static{
        Student s1 = new Student(1,"Gopal","Krishna",24,"Civil");
        students.add(s1);
        Student s2 = new Student(2,"Venu","Kuruva",23,"Civil");
        students.add(s2);
    }
    @Override
    public List<Student> getallStudents(){
        return students;
    }
    @Override
    public Student getStudentById(int studentId){
        for(Student stu:students){
            if(stu.getStudentId()==(studentId)){
                return stu;
            }
        }
        return null;
    }
    @Override
    public String addStudent(Student stu){
        students.add(stu);
        return "Student Added Successfully";
    }
    @Override
    public String deleteStudent(int studentId){
        for(Student stu:students){
            if(stu.getStudentId()==(studentId)){
                students.remove(stu);
                return "Student deleted successfully";
            }
        }
        return "Student Not Present in the dataBase.";
    }
    @Override
    public String updateStudentDepartment(int studentId , Student stu){
        Student stunew = getStudentById(studentId);
        if(stunew!=null){
            stunew.setDepartment(stu.getDepartment());
            return "Student department is updated";
        }
        return "No student found by the StudentId:"+studentId+" please check once again.";
    }
}
