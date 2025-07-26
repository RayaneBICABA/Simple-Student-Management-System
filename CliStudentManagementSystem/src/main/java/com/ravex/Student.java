package com.ravex;

public class Student {
    // Attributes
    String name;
    double[] marks = new double[5];
    double GeneralAverage;


    // Constructor
    public Student(String name, double[] marks){
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public String getName(){
        return name;
    }


    public double[] getMarks(){
        return marks;
    }

    public double getGeneralAverage(){
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        GeneralAverage = sum / marks.length;
        return GeneralAverage;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setMarks(double[] marks){
        this.marks = marks;
    }
}
