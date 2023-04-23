package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("ch04.Person");

        Person person = (Person)c1.newInstance();
        person.setName("KIM");
        System.out.println(person);

        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();
        System.out.println(p);

        Class[] parmeterTypes = {String.class};
        Constructor cons = c2.getConstructor(parmeterTypes);

        Object[] initargs = {"kim"};
        Person kimPerson = (Person) cons.newInstance(initargs);
        System.out.println(kimPerson);

        Person kim2 = new Person("kim");
        System.out.println(kim2);

    }
}
