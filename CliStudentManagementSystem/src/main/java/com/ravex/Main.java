package com.ravex;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    // Global variable studentList
    static ArrayList < String > studentList = new ArrayList<>();


    // FUNCTIONS CREATION
    // Add Student function
    static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        studentList.add(studentName);
        System.out.println(studentName+" Add with success!");
    }


    // Display all student function
    

    // Compute general average function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Welcome to Ravex Student Management System ==========");
        System.out.println(" 1- Add Student \n 2- Display all students \n 3- Compute general average 4- Display the best student \n 5- Search student \n 6- Filter students \n 7- Exit");
        System.out.println("Choose:__");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addStudent();
                break;
        
            default:
                break;
        }

    }
}