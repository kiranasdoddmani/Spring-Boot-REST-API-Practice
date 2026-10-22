package com.example.cfs.model;

public class student {
    private String name;
    private int marks;
    private int id;

    public student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
