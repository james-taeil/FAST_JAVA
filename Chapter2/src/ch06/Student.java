package ch06;

public class Student {

    // member variable
    public int studentID;
    public String studentName;
    public int grade;

    // default 생성자 또 만들수도 있다.
    public Student() {}

    // 초기화 시킬 때, 사용할 수도?
    public Student(int studentID, String studentName, int grade) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.grade = grade;
        System.out.println("Student 생성자 생성");
    }

    public String showStudentInfo() {

        return studentID + " 학번의 학생은 " + studentName + " 이고, " + grade + " 학년 입니다.";
    }
}
