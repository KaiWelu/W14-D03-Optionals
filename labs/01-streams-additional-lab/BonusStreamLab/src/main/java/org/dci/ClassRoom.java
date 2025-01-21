package org.dci;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassRoom {
    private ArrayList<Student> students;
    private Teacher teacher;

    public ClassRoom(ArrayList<Student> students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }



    @Override
    public String toString() {
        return "Teacher: " + teacher.toString() + "\n" + "Students: \n" + students.toString();
    }
}
