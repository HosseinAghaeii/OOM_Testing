package org.ui.service;

import org.ui.model.person.Person;
import org.ui.model.person.Student;
import org.ui.model.university.University;

public class UniversityService {

    public String getPersonDetail(Person person){ // AMC
        return person.printInfo();
    }

    public String getPersonType(Person person){ // IHI
        return person.getType();
    }

    public String getUniversityType(University university){ //IHD
        return university.type;
    }

    public String getStudentStatus(Student student){ //IOD
        return student.getStatus();
    }

    public String getUniversityBrand(University university){ //IOP
        return university.getBrand();
    }


}
