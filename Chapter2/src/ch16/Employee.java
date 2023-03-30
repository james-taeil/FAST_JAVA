package ch16;

public class Employee {

    private static int serialNum = 1000;
    private int employeeId;
    private String employeeName;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    private String department;


    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }

    public int getEmployeeId() {

        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public static int getSerialNum() {
//        employeeName = "kim"; // error
        return serialNum;
    }

}
