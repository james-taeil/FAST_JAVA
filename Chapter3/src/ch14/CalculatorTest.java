package ch14;

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

        calc.description();

        // use static method
        // 정적 메서드 사용시 인스턴스 선언을 안해도 된다.
        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));


    }
}
