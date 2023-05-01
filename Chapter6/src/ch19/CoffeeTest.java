package ch19;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee etipiaCoffee = new EtiopiaAmericano();
        etipiaCoffee.brewing();

        System.out.println();

        Coffee etiopiaLatte = new Latte(etipiaCoffee);
        etiopiaLatte.brewing();

        Coffee mochaEtiopia = new Mocha(new EtiopiaAmericano());
        mochaEtiopia.brewing();
    }
}
