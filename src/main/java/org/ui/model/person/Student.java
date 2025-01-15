package org.ui.model.person;

import org.ui.model.Course;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int studentID;
    private String major;
    private int yearOfArrival;
    private List<Course> courses = new ArrayList<>();

    public Student(String name, int age, int studentID,String major,int yearOfArrival) {
        super(name, age); //IPC
        this.studentID = studentID;
        this.major = major;
        this.yearOfArrival = yearOfArrival;
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

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(String code){
        Course course = new Course(code);
        courses.add(course);
        System.out.println("Call add course type1");
    }

    public void addCourse(String code, String name){
        Course course = new Course(code,name);
        courses.add(course);
        System.out.println("Call add course type2");
    }

    public void addCourse(String code, String name, int unit){
        Course course = new Course(code,name,unit);
        courses.add(course);
        System.out.println("Call add course type3");
    }
}
