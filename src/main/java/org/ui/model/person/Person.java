package org.ui.model.person;

public abstract class Person {
    private String name;
    private int age;
    private String type = "person";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // polymorphism
    public abstract String getRole();

    public String printInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}
