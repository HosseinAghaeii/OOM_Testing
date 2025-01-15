package org.ui.model.university;

import org.ui.model.person.Person;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    public String type = "university";
    public int priority = 0;


    private final List<Person> personList;

    public University(String name) {
        this.name = name;
        personList = new ArrayList<>();
    }

    public University() {
        personList = new ArrayList<>();
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

    public List<Person> getPersonList() {
        return personList;
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

    @Override
    public boolean equals(Object o){
        if (o == null){
            return false;
        }
        if (o == this){
            return true;
        }
        if (!(o instanceof University university)){
            return false;
        }

        return this.name.equals(university.name);
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }


}
