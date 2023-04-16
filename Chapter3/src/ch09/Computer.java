package ch09;

public abstract class Computer {

    // 추상화  abstract practice
    // 상속 받는 애들이 구현하는 것 => abstract 쓰는 이유
    // 상속을 위한 것 => abstract class
    public abstract void dispaly();
    public abstract void typing();

    // 공통으로 쓰일 메서드만 구현
    public void turnOn() {
        System.out.println("System ON!");
    }

    public void turnOff() {
        System.out.println("System OFF!");
    }

}
