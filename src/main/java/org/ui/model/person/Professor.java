package org.ui.model.person;

public class Professor extends Person{
    private String department;

    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // IOR
    public String getProfessorInfo() {
        return "Professor in " + department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }
}
