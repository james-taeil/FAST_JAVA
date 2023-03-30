package ch16;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("척준경");

        System.out.println(Employee.getSerialNum());

        Employee employeeLee = new Employee();

        System.out.println(employeeKim.getEmployeeId());
        System.out.println(employeeLee.getEmployeeId());
    }

}
