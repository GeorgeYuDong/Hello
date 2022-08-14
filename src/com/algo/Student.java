package com.algo;

public class Student {
    Integer id;

    public Student(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object student) {
        if (this == student) return true;

        if (student.getClass() != this.getClass()) {
            return false;
        }

        if (student == null) return false;

        Student another = (Student) student;
        return this.id.equals(another.id);
    }
}
