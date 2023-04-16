package ch06.customer;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;


    protected int bonusPoint;
    protected double bonusRatio;

    /*public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer() call");
    }*/

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer(int, String) call");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public boolean showCustomerInfo() {
        System.out.printf("%s님의 등급은 %s이며, 보너스 포인트는 %d입니다.\n", customerName, customerGrade, bonusPoint);

        return false;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
