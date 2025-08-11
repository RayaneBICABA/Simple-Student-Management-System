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
  public void getBestStudent() {
    // Check if the list is empty
    if (studentList.isEmpty()) {
      System.out.println("No student found!");
    } else {
      // Create empty list
      ArrayList<Double> studentAverageList = new ArrayList<>();

      // Collect all student average
      int studentListSize = studentList.size();
      for (int i = 0; i < studentListSize; i++) {
        studentAverageList.add(studentList.get(i).getGeneralAverage());
      }

      // Found the highest average
      double highestAverage = studentAverageList.get(0);
      int highestIndex = 0;
      for (int i = 0; i < studentAverageList.size(); i++) {
        if (studentAverageList.get(i) > highestAverage) {
          highestAverage = studentAverageList.get(i);
          highestIndex = i;
        }
      }

      // Display the best student name and his average
       System.out.println("====== BEST STUDENT ====== \n"+ studentList.get(highestIndex).getName()+"---------"+ highestAverage+"/20");
    }
  }


  // =================== Update student ===================
  public void updateStudent(int studentId){
    //Check if the id exist
    if(studentList.get(studentId-1) == null){
      System.out.println("Student Not Found!");
    }else{
      System.out.println(studentId+"-"+studentList.get(studentId-1).getName()+"-------"+studentList.get(studentId-1).getGeneralAverage()+"/20");
    }
    // Collect student to update id / index
    
    // Collect new name and new average (number of marks, marks)

    // Confirm student update
  }

}
