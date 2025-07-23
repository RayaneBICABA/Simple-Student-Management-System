package com.ravex;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    // =====Global variables=====
    static ArrayList < String > studentList = new ArrayList<>();


    // =====Methods Init=====
    // Continue prog 
    static int continueProg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Welcome to Ravex Student Management System ==========");
        System.out.println(" 1- Add Student \n 2- Display all students \n 3- Compute general average 4- Display the best student \n 5- Search student \n 6- Filter students \n 7- Exit");
        System.out.println("Choose:__");

        int choice = sc.nextInt();
        return choice;
    }

    // Add student 
    static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        studentList.add(studentName);
        System.out.println(studentName+" Add with success!");
    }


    // Display all
    static void displayAllStudent(){
        System.out.println(studentList); // ArrayList display test
    }


    // General average computation


    // =====Entry point=====
    public static void main(String[] args) {
       int choice = continueProg();
        do{

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    System.out.println(choice);
                    break;
                default:
                    System.out.println("(*_*)! Invalid choice. Please try again.");
                    break;
            }
        }while(choice != 7);
    }
}