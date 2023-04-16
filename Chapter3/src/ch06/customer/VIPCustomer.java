package ch06.customer;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;


    /*public VIPCustomer() {
        // super(); // compiler 가 default로 해줌.
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer() call");
    }*/

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) call");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return super.calcPrice(price);
    }

    public int getAgentID() {
        return agentID;
    }
}
