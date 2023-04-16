package ch08;

public class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }

    public void seeing() {
        System.out.println("독수리가 300KM 밖에서 사냥감을 봅니다.");
    }
}
