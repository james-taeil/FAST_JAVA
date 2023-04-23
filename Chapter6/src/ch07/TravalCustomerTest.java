package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravalCustomerTest {
    public static void main(String[] args) {

        TravalCustomer customerLee = new TravalCustomer("Lee", 40, 10000);
        TravalCustomer customerKim = new TravalCustomer("Kim", 20, 50000);
        TravalCustomer customerChoi = new TravalCustomer("Choi", 30, 70000);

        List<TravalCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerChoi);

        System.out.println("Customer List ");
        customerList.stream()
                .map(el -> el.getCustomerName())
                .forEach(el -> System.out.println(el));

        System.out.println();
        System.out.println("Traval cost");
        int costSum = customerList.stream()
                .mapToInt(el -> el.getPrice())
                .sum();
        System.out.println(costSum);

        System.out.println();
        System.out.println("customer age is 30 to up");
        customerList.stream()
                .filter(el -> el.getAge() >= 30)
                .map(el -> el.getCustomerName())
                .sorted()
                .forEach(el -> System.out.println(el));


    }
}
