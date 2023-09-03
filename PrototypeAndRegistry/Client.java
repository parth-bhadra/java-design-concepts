package PrototypeAndRegistry;

import java.util.ArrayList;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        // starting a new batch -> 100 students
        // create 1 enrollment at a time, and pass all the details
        // create 100 enrollments with the common data, and later on add individual attribute values

        Student s = new Student(1, "Parth", 100, "Test", "LLD", "BE", new Date(2023, 7, 14), "Sandeep", new Date(2024, 7, 14), "ICICI", 60 );

        ArrayList<Student> studentList = new ArrayList<Student>();

        for(int i=0; i<100; i++) {
            studentList.add(s.clone());
        }

        // you can't write any function definition in psvm
    }

    public static Student getClone(Student s) {
        Student s1 = new Student();

        // Need to know all details about Student class
        s1.setId(s.getId());
        s1.setName(s.getName());
        s1.setPsp(s.getPsp());
        s1.setBatchName(s.getBatchName());
        s1.setJoinYear(s.getJoinYear());
        s1.setTrack(s.getTrack());
        s1.setInstructorName(s.getInstructorName());
        s1.setModuleName(s.getModuleName());
        // s1.setPaymentPartner(s.getPaymentPartner()); if there are any hidden attributes they will not be copied i.e. if you don't have getters and setters available for this property

        // any change in student attributes will make this method change as well
        // violates ocp
        s1.setBatchPSP(s.getBatchPSP());

        return s1;

    }

    public static Car getCarClone(Car c) {
        if(c instanceof Maruti) {
            return new Maruti((Maruti)c); // downcasting will work here, but such a getCarClone method will violate OCP
        } else if(c instanceof  Kia){
            return new Kia((Kia)c);
        }

        return null;
    }
}
