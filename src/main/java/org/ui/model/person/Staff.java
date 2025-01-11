package org.ui.model.person;

import org.ui.Manageable;

public class Staff extends Person implements Manageable {
    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getRole() {
        return "Staff";
    }

    @Override
    public void manage() {
        System.out.println("Managing tasks as a " + position);
    }
}
