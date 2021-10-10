package com.example.freemarker.model;

public class Student {
    Integer id;
    String name;
    String grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student(Integer id, String studentName, String grade) {
        this.id = id;
        this.name = studentName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
