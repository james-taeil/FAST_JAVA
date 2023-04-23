package ch02;

import java.util.Objects;

public class Student implements Cloneable {

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return studentName + ", " + studentId;
    }

    public void setStudentname(String name) {
        this.studentName = name;
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Student) {
            Student std = (Student) o;

            if (this.studentId == std.studentId) {
                return true;
            }
            else return false;
        }

        return false;

        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(studentName, student.studentName);*/
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
