package ch19;

public class CarFactory {

    // singleton pattern
    private CarFactory() {}
    private static CarFactory instance = new CarFactory();

    public static CarFactory getInstance() {

        if (instance == null) {
            instance = new CarFactory();
        }

        return instance;
    }

    public Car createCar() {
        Car car = new Car();
        return car;
    }
}
