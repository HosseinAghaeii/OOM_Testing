package org.ui.model.university;

public class AzadUniversity extends University{

    public String type = "azad university";
    public int priority = 1;

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

    public void calculateTuition(){
        System.out.println("Tuition calculation ...");
    }

    public int getPriority(){ // JSI
        return this.priority;
    }

}
