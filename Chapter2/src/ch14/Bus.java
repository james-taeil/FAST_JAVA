package ch14;

public class Bus {

    int busNumber;
    int passengerCount;
    int comeMoney;

    public Bus(int busNumber) {

        this.busNumber = busNumber;
    }

    public void take(int money) {

        this.comeMoney = money;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(
                busNumber + "번의 승객 수는 " +
                passengerCount + "명 이고, 수입은 " +
                comeMoney + "원 입니다."
        );
    }
}
