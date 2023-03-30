package ch09;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student(2015, "kim");
        student.setKoreaSubject("Korean", 90);
        student.setMathSubject("Math", 98);

        student.showStudentScore();
    }
}
