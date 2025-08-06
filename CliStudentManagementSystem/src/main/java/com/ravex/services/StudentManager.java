package com.ravex.services;

import java.util.ArrayList;
import java.util.List;

import com.ravex.models.Student;

public class StudentManager {
  // =================== Global variables ===================
  private final List<Student> studentList = new ArrayList<>();
  
  

  // =================== Add student ===================
  public void addStudent(String name, double[] marks) {
    Student newStudent = new Student(name, marks);
    studentList.add(newStudent);
    System.out.println(name + " added successfully!");
  }

  // =================== Display all students ===================
  public void displayAllStudents() {
    if (studentList.isEmpty()) {
      System.out.println("No Student Found!");
    } else {
      int studentIndex = 1;
      for (Student student : studentList) {
        String studentName = student.getName();
        double studentGeneralAverage = student.getGeneralAverage();
        System.out.println(studentIndex + "- " + studentName + "---------" + studentGeneralAverage + "/20");
        studentIndex++;
      }
    }
  }

  // =================== Get best student ===================
  public void getBestStudent(){
    // Check if the list is empty 
    if (studentList.isEmpty()){
      System.out.println("No student found!");
    }else{
      // Create empty list
      ArrayList<Double> studentAverageList = new ArrayList<>();
      
      // Collect all student average
      


      // Found the highest average

      // Collect the highest average index

      // Found the student with the same index

      // Display the best student name and his average
    }
  }

}
