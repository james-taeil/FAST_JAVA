package ch24;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("Korean", 100);
        studentLee.addSubject("Math", 50);

        studentLee.showStudentInfo();

    }
}