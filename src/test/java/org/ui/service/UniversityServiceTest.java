package org.ui.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ui.exception.SystemServiceException;
import org.ui.model.person.GraduateStudent;
import org.ui.model.person.Person;
import org.ui.model.person.Professor;
import org.ui.model.person.Student;
import org.ui.model.university.AzadUniversity;
import org.ui.model.university.StateUniversity;
import org.ui.model.university.University;

import static org.junit.gen5.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class UniversityServiceTest {

    UniversityService service;
    private AzadUniversity azadUniversity;
    private StateUniversity stateUniversity;
    private Student student;
    private Professor professor;

    @BeforeEach
    void setUp() {
        service = new UniversityService();
        azadUniversity = new AzadUniversity("Azad Tehran");
        stateUniversity = new StateUniversity("State Isfahan");
        student = new Student("Ali", 20, 123, "CS", 2020);
        professor = new Professor("Dr. Reza", 45, "Engineering", "CS");
    }

    @Test
    void testGetPersonDetail() {
        String detail = service.getPersonDetail(student);
        assertEquals("Name: Ali, Age: 20", detail);
    }

    @Test
    void testGetPersonType() {
        String type = service.getPersonType(student);
        assertEquals("person", type);
    }

    @Test
    void testGetUniversityType() {
        String type = service.getUniversityType(azadUniversity);
        assertEquals("university", type);
    }

    @Test
    void testGetStudentStatus() {
        String status = service.getStudentStatus(student);
        assertEquals("Studying", status);
    }

    @Test
    void testRegisterProfessorWithValidData() {
        boolean result = service.registerProfessor("Dr. Ali", 50, "Science", "Math", azadUniversity);
        assertTrue(result);
    }


    @Test
    void testRegisterStudent() {
        boolean result = service.registerStudent("Sara", 22, 124, "IT", 2019, azadUniversity);
        assertTrue(result);
    }

    @Test
    void testGetUniBrand() {
        assertDoesNotThrow(() -> service.getUniBrand());
    }

    @Test
    void testPrintProfessorInfo() {
        assertDoesNotThrow(() -> service.printProfessorInfo());
    }

    @Test
    void testCalculateAverageAgePerson() {
        azadUniversity.getPersonList().add(student);
        azadUniversity.getPersonList().add(professor);
        double averageAge = service.calculateAverageAgePerson(azadUniversity);
        assertEquals(32.5, averageAge);
    }

    @Test
    void testAddCourseForStudent() {
        assertDoesNotThrow(() -> service.addCourseForStudent(student, "CS101", "Programming"));
        assertEquals(1, student.getCourses().size());
    }

    @Test
    void testGetUniPriority() {
        assertDoesNotThrow(() -> service.getUniPriority(azadUniversity));
    }

    @Test
    void getPersonDetail() { //AMC
        Person p = new Student("Ali", 20, 123,"CE",1400);
        String s = service.getPersonDetail(p);
        assertEquals("Name: Ali, Age: 20", s);
    }

    @Test
    void getPersonType() { // IHI
        Student student = new Student("Ali", 20, 123,"CE",1400);
        String s = service.getPersonType(student);
        assertEquals("person",s);
    }

    @Test
    void getUniversityType(){ //IHD
        University university = new University("UI");
        String s = service.getUniversityType(university);
        assertEquals("university",s);
    }

    @Test
    void getStudentStatus(){ //IOD
        GraduateStudent graduateStudent = new GraduateStudent("Sara",29,111,"AI","CE",1393);
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