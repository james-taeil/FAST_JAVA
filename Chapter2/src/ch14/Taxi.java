package ch14;

public class Taxi {

    String companyName;
    int comeMoney;
    int taxiNumber;
    int passengerCount;

    public Taxi(String name) {
        this.companyName = name;
    }

    public void take(int money) {
        this.comeMoney += money;
        passengerCount++;
    }

    public void showTaxiInfo() {
        System.out.println(
                companyName + "은 택시 회사 이름이고, 총 승객수는 " +
                passengerCount + "명 이고, 수입은 " +
                comeMoney + "원 입니다."
        );
    }
}

