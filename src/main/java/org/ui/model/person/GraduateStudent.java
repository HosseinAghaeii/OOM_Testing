package org.ui.model.person;

public class GraduateStudent extends Student{
    private String thesisTitle;

    public GraduateStudent(String name, int age, int studentID, String thesisTitle,String major,int yearOfArrival) {
        super(name, age, studentID,major,yearOfArrival); // ISI
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String getStatus(){
        return "Graduate";
    }

    @Override
    public void setName(String name) {
        super.setName("Grad: " + name);
    }
}
