package ch04;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(1001, "Lee");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        customerLee.showCustomerInfo();
        System.out.println(price);

        VIPCustomer customerKim = new VIPCustomer(10001, "Kim");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        customerKim.showCustomerInfo();
        System.out.println(price);


        // up Casting
        // vip object는 못씀
        Customer vc = new VIPCustomer(111, "tester");
        System.out.println(vc.calcPrice(1000));

    }
}
