package ch12;

public class Person {

    String name;
    int age;

    public Person() {
        this("이름 없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + " " + age);
    }

    public Person getPerson(){
        return this;
    }
}
