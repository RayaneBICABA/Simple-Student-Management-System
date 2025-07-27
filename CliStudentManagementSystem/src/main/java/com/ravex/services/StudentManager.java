package com.ravex.services;

import java.util.ArrayList;
import java.util.List;

import com.ravex.models.Student;

public class StudentManager {
    // =================== Global variables ===================
    private final List<Student> studentList = new ArrayList<>();


    // =================== Add student ===================
    public void addStudent(String name , double[] marks) {
        Student newStudent = new Student(name, marks);
        studentList.add(newStudent);
        System.out.println(name + " added successfully!");
    }

    // =================== Display all students ===================
    public void displayAllStudents(){
      if(studentList.isEmpty()){
        System.out.println("No Student Found!");
      }else{
        int studentIndex = 1;
        for(Student student:studentList){
            String studentName = student.getName();
            double studentGeneralAverage = student.getGeneralAverage();
            System.out.println(studentIndex+"- "+studentName+"---------"+studentGeneralAverage+"/20");
            studentIndex++;
        }
      }
    }

    // =================== Get best student ===================
    public void getBestStudent(){
      studentList.sort((s1, s2) -> Double.compare(s2.getGeneralAverage(), s1.getGeneralAverage()));
      if(studentList.isEmpty()){
        System.out.println("No Student Found!");
      }else{
        Student bestStudent = studentList.get(0);
        System.out.println("Best Student: " + bestStudent.getName() + " with average " + bestStudent.getGeneralAverage() + "/20");
      }
    }
}
