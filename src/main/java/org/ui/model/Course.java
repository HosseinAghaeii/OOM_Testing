package org.ui.model;

public class Course {

    private String code;
    private String name;
    private int unit;

    public Course(String code, String name, int unit) {
        this.code = code;
        this.name = name;
        this.unit = unit;
    }

    public Course(String code) {
        this.code = code;
    }

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }


}
