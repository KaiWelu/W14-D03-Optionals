package org.dci;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Teacher teacher = new Teacher("Sponge Bob", 44, "Under the Sea");

        students.add(new Student("Alice Johnson", 19, 89.5, "New York"));
        students.add(new Student("Bob Smith", 20, 92.3, "Los Angeles"));
        students.add(new Student("Charlie Davis", 18, 85.7, "Chicago"));
        students.add(new Student("Diana Evans", 21, 88.2, "Houston"));
        students.add(new Student("Ethan Garcia", 22, 91.4, "Phoenix"));
        students.add(new Student("Fiona White", 20, 87.9, "Philadelphia"));
        students.add(new Student("George Brown", 19, 83.6, "San Antonio"));
        students.add(new Student("Hannah Wilson", 18, 94.1, "San Diego"));
        students.add(new Student("Ian Thomas", 22, 90.5, "Dallas"));
        students.add(new Student("Jane Martin", 21, 86.8, "San Jose"));
        students.add(new Student("Kyle Moore", 20, 89.2, "Austin"));
        students.add(new Student("Laura Taylor", 19, 93.4, "Jacksonville"));
        students.add(new Student("Michael Anderson", 18, 88.7, "Fort Worth"));
        students.add(new Student("Nina Harris", 22, 92.1, "Columbus"));
        students.add(new Student("Oscar Clark", 21, 85.3, "Charlotte"));
        students.add(new Student("Paula Lewis", 20, 91.7, "San Francisco"));
        students.add(new Student("Quentin Walker", 19, 87.4, "Indianapolis"));
        students.add(new Student("Rachel Hall", 22, 89.8, "Seattle"));
        students.add(new Student("Sam Allen", 21, 90.3, "Denver"));
        students.add(new Student("Tina Young", 20, 88.0, "Washington"));

        ClassRoom classRoom = new ClassRoom(students, teacher);
        System.out.println(classRoom.toString());

        List<Student> belowAge = classRoom.findStudentsBelowAge(20);

        System.out.println("\nStudents below age 20:");
        for(Student student : belowAge) {
            System.out.println(student.toString());
        }

        System.out.println("\nStudents with grade higher than 90:");
        List<Student> highGrade = classRoom.getHighAchievers(90.20);
        for(Student student : highGrade) {
            System.out.println(student.toString());
        }

    }
}