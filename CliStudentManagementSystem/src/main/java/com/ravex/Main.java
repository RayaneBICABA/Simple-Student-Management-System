package com.ravex;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    // =====Methods Init=====
    // Continue prog 
    static int continueProg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Welcome to Ravex Student Management System ==========");
        System.out.println(" 1- Add Student \n 2- Display all students \n 3- Compute general average 4- Display the best student \n 5- Search student \n 6- Filter students \n 7- Exit");
        System.out.print("Choose:__");

        int choice = sc.nextInt();
        return choice;
    }


    // Display all
    static void displayAllStudent(){
       //Use a for loop to iterate the student list
       //Student list size or length
       int studentListLength = studentList.size();
       for (int i = 0; i<studentListLength;i++){
        System.out.println((i+1)+"- "+studentList.get(i));
       }
    }


    // General average computation


    // =====Entry point=====
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
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.print("\033c");
                    break;
                case 2:
                    System.out.print("\033c");
                    displayAllStudent();
                    break;
                case 7:
                    System.out.println(" Thanks for using Ravex Student Management System \n Bye!");
                    break;
                default:
                    System.out.println("\033c");
                    System.out.println("(*_*)! Invalid choice. Please try again.");
                    break;
            }
        }while(choice != 7);
    }
}