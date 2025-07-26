package com.ravex.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ravex.models.Student;

public class StudentManager {
    // =================== Global variables ===================
    private List<Student> studentList = new ArrayList<>();


    // =================== Add student ===================
    public void addStudent(String name , double[] marks) {
        Student newStudent = new Student(name, marks);
        studentList.add(newStudent);
        System.out.println(name + " added successfully!");
    }
}
