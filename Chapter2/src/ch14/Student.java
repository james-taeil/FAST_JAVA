package ch14;

public class Student {

    String studentName;
    int money;
    
    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;

    }

    // 어떤 버스를 탓지는지 매개변수로 넘어온다.
    public void takeBus(Bus bus) {
        bus.take(1000); // 1000원 지불
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "님의 남은 돈은 "
        + money + "원 입니다.");
    }

}
