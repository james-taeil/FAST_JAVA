package ch06.customer;

public class GoldCustomer extends Customer {

    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        salesRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";

        System.out.println("GoldCustomer(int, String) call");
    }
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
