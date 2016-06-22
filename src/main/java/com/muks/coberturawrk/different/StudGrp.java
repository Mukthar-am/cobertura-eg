package com.muks.coberturawrk.different;

import com.muks.coberturawrk.Student;

import java.util.HashMap;

/**
 * Created by 15692 on 22/06/16.
 */
public class StudGrp {
    private HashMap<Integer, Student> students;

    public StudGrp() {
        students = new HashMap<Integer, Student>();
    }

    public void addStudent(Student student) {
        int id = student.getId();
        students.put(id, student);
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public void removeStudent(int id) {
        students.remove(id);
    }

    public void clear() {
        students.clear();
    }

    public int getGroupSize() {
        return students.size();
    }
}
