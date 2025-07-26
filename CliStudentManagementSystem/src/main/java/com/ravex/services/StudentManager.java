package com.ravex.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ravex.models.Student;

public class StudentManager {
    // =================== Global variables ===================
    

    // =================== Add student ===================
    public void addStudent() {
        //Create new student
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Please enter student fullname: ");
        String studentName = scanner.nextLine();
        System.out.print("Please enter student marks: ");
        Student newStudent = new Student(studentName, null)
    }
}
