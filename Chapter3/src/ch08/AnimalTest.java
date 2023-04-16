package ch08;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {
        Animal humanAinmal = new Human();
        Animal tigerAnimal = new Tiger();
        Animal eagleAnimal = new Eagle();


        AnimalTest test = new AnimalTest();
        /*test.moveAnimal(humanAinmal);
        test.moveAnimal(tigerAnimal);
        test.moveAnimal(eagleAnimal);*/

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(humanAinmal);
        animalArrayList.add(tigerAnimal);
        animalArrayList.add(eagleAnimal);

        for (Animal animal : animalArrayList) {
            animal.move();
        }

        test.testDownCasting(animalArrayList);
    }

    // 다형성
    public void moveAnimal(Animal animal) {
        animal.move();
    }

    // downCasting
    public void testDownCasting(ArrayList<Animal> list) {

        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);

            if (animal instanceof Human) {
                Human human = (Human)animal;
                human.readBook();
            }
            else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }
            else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.seeing();
            } else {
                System.out.println("unsupported type");
            }
        }
    }
}
