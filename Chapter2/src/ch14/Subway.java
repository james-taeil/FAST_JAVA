package ch14;

public class Subway {

    int lineNumber;
    int passengerCount;
    int comeMoney;

    // 몇호선
    public Subway(int lineNumber) {

        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.comeMoney += money;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(
                lineNumber + "번의 승객 수는 " +
                passengerCount + "명 이고, 수입은 " +
                comeMoney + "원 입니다."
        );
    }
}
