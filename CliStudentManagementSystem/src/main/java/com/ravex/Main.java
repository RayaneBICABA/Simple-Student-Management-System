package com.ravex;

import java.util.Scanner;
import com.ravex.services.StudentManager;

public class Main {
    // =================== StudentManager service instantiation ===================
    static StudentManager studentManager = new StudentManager();
    static Scanner sc = new Scanner(System.in);

    // =================== METHODS ===================
    // Continue prog 
    static int continueProg(){
        System.out.println("====== Welcome to Ravex Student Management System ==========");
        System.out.println(" 1- Add Student \n 2- Display all students \n 3- Display the best student \n 4- Search student \n 5- Filter students \n 6- Exit");
        System.out.print("Choose:__");

        return sc.nextInt();
    }

    // Add student
    static void addStudent(){
        System.out.print("Student name: ");
        sc.nextLine(); // Consume newline left-over
        String studentName = sc.nextLine();

        System.out.print("How many marks do you want to enter for " + studentName + "? ");
        int numberOfMarks = sc.nextInt();
        double[] marks = new double[numberOfMarks];
        for(int i = 0; i<numberOfMarks;i++){
            System.out.print("Mark "+(i+1)+": ");
            marks[i] = sc.nextDouble();
        }

        studentManager.addStudent(studentName,marks);

    }

    // Display all students
    static void displayAllStudent(){
        if(studentManager == null){
            System.out.println("No Student Found!");
        }else{
            System.out.println("====== All Students ======");
            studentManager.displayAllStudents();
        }
    }

    // Get best student
    static void getBestStudent(){
        if(studentManager == null){
            System.out.println("No Student Found");
        }else{
            studentManager.getBestStudent();
        }
    }

   
   
    
    // =================== Entry point ===================
    public static void main(String[] args) {
       int choice;
        do{
            choice  = continueProg();
            switch (choice) {
                case 1:
                    addStudent();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("Something interrupted the program. Try again later.");
                    }
                    System.out.print("\033c");
                    break;
                case 2:
                    System.out.print("\033c");
                    displayAllStudent();
                    break;
                case 3:
                    System.out.println("\033c");
                    getBestStudent();
                    break;
                case 6:
                    System.out.println(" Thanks for using Ravex Student Management System \n Bye!");
                    break;
                default:
                    System.out.println("\033c");
                    System.out.println("(*_*)! Invalid choice. Please try again.");
                    break;
            }
        }while(choice != 6);
    }
}