package ch14;

public class TakeTransTest {
    public static void main(String[] args) {

        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);
        Student studentEdward = new Student("Edward", 20000);

        Bus bus100 = new Bus(100);
        Subway greenSubway = new Subway(2);
        Taxi grandTaxi = new Taxi("잘나가는 운수");

        studentJames.takeBus(bus100);
        studentTomas.takeSubway(greenSubway);
        studentEdward.takeTaxi(grandTaxi);

        studentJames.showStudentInfo();
        studentTomas.showStudentInfo();
        studentEdward.showStudentInfo();

        bus100.showBusInfo();
        greenSubway.showSubwayInfo();
        grandTaxi.showTaxiInfo();

    }
}
