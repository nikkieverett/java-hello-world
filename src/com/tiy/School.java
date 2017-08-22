package com.tiy;

public class School {
    public static void main(String[] args) {
        int numberOfStudents;
        int numberOfTeachers;
        double averageGPA;
        boolean isPublic;
        String name;
        String city;

        numberOfStudents = 403;
        numberOfTeachers = 62;
        averageGPA = 2.98;
        isPublic = true;
        name = "Grady High School";
        city = "Atlanta, GA";

        System.out.println("School: " + name);
        System.out.println("Teachers: " + numberOfTeachers);

        printSchoolGPA(averageGPA, city);

        if (numberOfStudents >= 10 && isPublic == true) {
            System.out.println("We have " + numberOfStudents + " students");
        }
        if (numberOfTeachers >= 5) {
            System.out.println("We have " + numberOfTeachers + " teachers");
        }

    }
    public static void printSchoolGPA(Double averageGPA, String city) {
        System.out.println(averageGPA + ", " + city);
    }

}