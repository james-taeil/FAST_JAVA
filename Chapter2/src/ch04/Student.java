package ch04;

public class Student {

    int studentId;
    String studentName;
    String address;

    public String setStudentName(String greeting) {
        this.studentName = greeting;
        return this.studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public int setStudentId(int studentId) {
        return this.studentId;
    }

    public void showStudentInfo() {
        System.out.println(studentName + " 의 주소는 " + address+ " 이고, 학번은 " + studentId + "입니다.");
    }
}
