package org.ui;

import org.ui.model.person.GraduateStudent;
import org.ui.model.person.Professor;
import org.ui.model.person.Staff;
import org.ui.model.person.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ali", 20, 12345);
        Professor professor = new Professor("Dr. Reza", 45, "Engineering");
        Staff staff = new Staff("Sara", 35, "Admin");
        GraduateStudent gradStudent = new GraduateStudent("Maryam", 25, 54321, "AI Research");

        student.setName("Ali Reza");
        System.out.println(student.getName());
        System.out.println(professor.getProfessorInfo());
        staff.manage();
        System.out.println(gradStudent.getThesisTitle());
        System.out.println(gradStudent.getName());
    }
}