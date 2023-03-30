package ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        Company company = Company.getInstance();
        Company company1 = Company.getInstance();


        // heap 주소 항상 같다.
        System.out.println(company);
        System.out.println(company1);

//        Calendar calendar = new Calendar.getInstance();
    }
}
