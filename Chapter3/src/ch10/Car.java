package ch10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("Turn on the car!");
    }

    public void turnOff() {
        System.out.println("Turn off the car!");
    }

    // template pettern
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}
