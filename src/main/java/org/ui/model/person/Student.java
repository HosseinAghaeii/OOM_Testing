package org.ui.model.person;

public class Student extends Person{
    private int studentID;

    public Student(String name, int age, int studentID) {
        super(name, age); //IPC
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStatus(){
        return "Studying";
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
