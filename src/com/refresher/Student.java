package com.refresher;

public class Student {
    int id;
    String name;
    double cgpa;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String toString(){
        return this.name+" with this cgpa "+this.cgpa+" and this id: "+this.id;
    }
}
