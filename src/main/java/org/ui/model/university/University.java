package org.ui.model.university;

public class University {
    private String name;
    public String type = "university";

    public University(String name) {
        this.name = name;
    }

    public University() {
    }

    public String getName() {
        return name;
    }

    public String getBrand(){
        return type+": "+name;
    }

    public String getType(){
        return type;
    }

    //inner class
    static class Department {
        private String departmentName;

        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public void showDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }
}
