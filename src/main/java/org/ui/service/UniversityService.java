package org.ui.service;

import org.ui.Main;
import org.ui.exception.SystemServiceException;
import org.ui.model.person.GraduateStudent;
import org.ui.model.person.Person;
import org.ui.model.person.Professor;
import org.ui.model.person.Student;
import org.ui.model.university.AzadUniversity;
import org.ui.model.university.StateUniversity;
import org.ui.model.university.University;

import java.util.List;
import java.util.Optional;

public class UniversityService {

    public String getPersonDetail(Person person){ // AMC
        return person.printInfo();
    }

    public String getPersonType(Person person){ // IHI //PPD
        return person.getType();
    }

    public String getUniversityType(University university){ //IHD
        return university.type;
    }

    public String getStudentStatus(Student student){ //IOD //PPD
        return student.getStatus();
    }

    public String getUniversityBrand(University university){ //IOP //PPD
        return university.getBrand();
    }

    public double calculateAverageAgePerson(University university){
        List<Person> personList = university.getPersonList();
        double sum =0;
        for(Person person: personList) {
            sum += person.getAge();
        }

        return sum/personList.size();
    }

    public boolean registerProfessor(String name,int age,String department,String major,University university){
        if (name == null || department == null || major == null){
            throw new SystemServiceException("Null value not valid!");
        }

        if (age > 120 || age < 15){
            throw new SystemServiceException("Invalid age!");
        }

        Optional<University> u = Main.universities.stream().filter(university1 -> university1.equals(university)).findFirst();
        u.ifPresentOrElse(uni -> uni.getPersonList().add(new Professor(name,age,department,major)),
                () -> new SystemServiceException("University not found!"));
        return true;
    }

    public boolean isValidToStudy(Student student){
        return student.getStatus().equals("Studying");
    }

    public boolean registerStudent(String name, int age, int studentID,String major,int yearOfArrival,University university){

        Student student = new Student(name,age,studentID,major,yearOfArrival); //PNC
        if (!isValidToStudy(student)){ //PNC
            return false;
        }
        if (university instanceof AzadUniversity){
            ((AzadUniversity) university).calculateTuition(); //PCD //PPC
        }
        Optional<University> u = Main.universities.stream().filter(university1 -> university1.equals(university)).findFirst();
        u.ifPresentOrElse(uni -> uni.getPersonList().add(student),
                () -> new SystemServiceException("University not found!"));
        return true;
    }

    public void getUniBrand(){ //PMD //PCI
        University university = new AzadUniversity("Khorasgan");
        University university2 = new StateUniversity("UI");
        System.out.println(university.getBrand());
        System.out.println(university2.getBrand());
    }

    public void printProfessorInfo(){ //PRV
        Person p;
        Professor professor = new Professor("Mr.sharbaf",35,"UI","CE");
        Student student = new Student("Hossen",21,123,"CE",1400);
        p = professor;
        System.out.println(((Professor) p).getProfessorInfo());
    }


    public void addCourseForStudent(Student student,String courseCode,String name){ //OMR //OMD //OAC
        student.addCourse(courseCode);
    }

    public void getUniPriority(AzadUniversity azadUniversity){ //JSI
        System.out.println(azadUniversity.getPriority());
    }

}
