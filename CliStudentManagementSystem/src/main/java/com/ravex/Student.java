package com.ravex;

public class Student {
     // =================== ATTRIBUTES ===================
    String name;
    double[] marks = new double[5];
    double generalAverage;


    // =================== CONSTRUCTOR ===================
    public Student(String name, double[] marks){
        this.name = name;
        this.marks = marks;
        this.generalAverage = computeAverage();
    }

    // =================== GETTERS ===================
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
        generalAverage = sum / marks.length;
        return generalAverage;
    }

    // =================== SETTERS ===================
    public void setName(String name){
        this.name = name;
    }

    public void setMarks(double[] marks){
        this.marks = marks;
    }
}
