package ch19;

public class Latte extends Decorator {
    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding Milk");
    }

    public Latte(Coffee coffee) {
        super(coffee);
        // 상위 클래스에 default constractor가 없으면
        // 하위 클래스에서는 매개변수가 constractor가 매개변수가 있는 super를 명시적으로 선언해줘야 한다.
    }
}
