package ch24;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    // Constructor
    public Student(int studentNum, String studentName) {

        this.studentID = studentNum;
        this.studentName = studentName;
        subjectList = new ArrayList<>();
    }

    public void addSubject(String subjectName, int subjectScore) {
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectScore(subjectScore);

        subjectList.add(subject);
    }

    public void showStudentInfo() {

        int total = 0;

        for (Subject subject : subjectList) {
            total += subject.getSubjectScore();
            System.out.println("학생 " + studentName + "의 " +
                    subject.getSubjectName() +  "과목 성적은 " +
                    subject.getSubjectScore() + "점 입니다.");
        }
        System.out.println("학생 " + studentName + "의 " +
                "총점은 " + total + "점 입니다.");

    }
}
