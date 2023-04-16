package ch06.customer;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerT = new Customer(1001, "Tom");
        Customer customerJ = new Customer(1002, "James");
        Customer customerK = new GoldCustomer(1003, "Kim");
        Customer customerL = new GoldCustomer(1004, "Lee");
        Customer customerA = new VIPCustomer(1005, "Atom");

        customerList.add(customerT);
        customerList.add(customerJ);
        customerList.add(customerK);
        customerList.add(customerL);
        customerList.add(customerA);

        /*for (Customer customer : customerList) {
            customer.showCustomerInfo();
        }


        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);

            System.out.println(customer.getCustomerName() + "님이" + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + " 입니다.");
        }*/
        // casting error : customerK - GoldCustomer
        // VIPCustomer vc = (VIPCustomer) customerK;

        /*if (customerK instanceof VIPCustomer) { // false
            VIPCustomer vc = (VIPCustomer) customerK; // not work
        }*/

        if (customerK instanceof GoldCustomer) {
            GoldCustomer vc = (GoldCustomer)customerK;
            customerK.showCustomerInfo();
        }


    }
}
