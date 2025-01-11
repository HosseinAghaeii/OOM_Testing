package org.ui.model.university;

public class AzadUniversity extends University{

    public String type = "azad university";

    public AzadUniversity(String name) {
        super(name);
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public String getBrand(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Azad ");
        stringBuilder.append(super.type);
        stringBuilder.append(": ").append(getName());
        return stringBuilder.toString();
    }



}
