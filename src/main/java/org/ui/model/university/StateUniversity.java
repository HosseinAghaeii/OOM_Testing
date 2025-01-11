package org.ui.model.university;

public class StateUniversity extends University{

    public String type = "state university";

    public StateUniversity(String name) {
        super(name);
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public String getBrand(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("State ");
        stringBuilder.append(super.type);
        stringBuilder.append(": ").append(getName());
        return stringBuilder.toString();
    }
}
