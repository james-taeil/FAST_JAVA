package ch11;

public class CalculatorTest {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 2;

        // 타입 상속 함
        Calc calc = new CompleteCalc();

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));

        CompleteCalc calc2 = new CompleteCalc();
        calc2.showInfo();
        System.out.println(calc2.add(n1, n2));
    }
}