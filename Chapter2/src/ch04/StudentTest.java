package ch04;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();

        studentLee.studentId = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student studentKim = new Student();

        studentKim.studentId = 11111;
        studentKim.setStudentName("Kim");
        studentKim.address = "Seoul";

        studentKim.showStudentInfo();

        System.out.println(studentKim);
        System.out.println(studentLee);
    }
}
