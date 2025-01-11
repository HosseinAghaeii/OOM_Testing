package org.ui.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ui.model.person.GraduateStudent;
import org.ui.model.person.Person;
import org.ui.model.person.Student;
import org.ui.model.university.AzadUniversity;
import org.ui.model.university.StateUniversity;
import org.ui.model.university.University;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertNotNull;

class UniversityServiceTest {

    UniversityService service;

    @BeforeEach
    void setUp() {
        service = new UniversityService();
    }

    @Test
    void getPersonDetail() { //AMC
        Person p = new Student("Ali", 20, 123);
        String s = service.getPersonDetail(p);
        assertEquals("Name: Ali, Age: 20", s);
    }

    @Test
    void getPersonType() { // IHI
        Student student = new Student("Ali", 20, 123);
        String s = service.getPersonType(student);
        assertEquals("person",s);
    }

    @Test
    void getUniversityType(){ //IHD
        StateUniversity stateUniversity = new StateUniversity("UI");
        String s = service.getUniversityType(stateUniversity);
        assertEquals("state university",s);
    }

    @Test
    void getStudentStatus(){ //IOD
        GraduateStudent graduateStudent = new GraduateStudent("Sara",29,111,"AI");
        String s = service.getStudentStatus(graduateStudent);
        assertEquals("Graduate",s);
    }

    @Test
    void getUniversityBrand(){ //IOP //ISD
        AzadUniversity azadUniversity = new AzadUniversity("khorasgan");
        String s = service.getUniversityBrand(azadUniversity);
        assertEquals("Azad university: khorasgan",s);
    }

    // IOR --> compile error

    @Test
    void getAzadUniversityType(){ //ISI
        AzadUniversity azadUniversity = new AzadUniversity("khorasgan");
        String s = azadUniversity.getType();
        assertEquals("azad university",s);
    }

    @Test
    void getNameOfUni(){ //ISP
        AzadUniversity azadUniversity = new AzadUniversity("khorasgan");
        String s  = azadUniversity.getName();
        assertNotNull(s);
    }

}