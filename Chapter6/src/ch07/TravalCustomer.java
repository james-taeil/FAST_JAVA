package ch07;

public class TravalCustomer {
    private String customerName;
    private int age;
    private int price;

    public TravalCustomer(String name, int age, int price) {
        this.customerName = name;
        this.age = age;
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TravalCustomer{" +
                "customerName='" + customerName + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
