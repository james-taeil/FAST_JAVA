package ch03;

public class CustomerTest {

    public static void main(String[] args) {
        /*Customer customerLee = new Customer();
        customerLee.setCustomerName("Lee");
        customerLee.setCustomerID(1001);
        customerLee.bonusPoint = 1000;
        customerLee.showCustomerInfo();*/

        VIPCustomer customerKim = new VIPCustomer(10001, "Kim");
        customerKim.bonusPoint = 10000;
        customerKim.showCustomerInfo();

        // up Casting
        // vip object는 못씀
        Customer vc = new VIPCustomer(111, "tester");

    }
}
