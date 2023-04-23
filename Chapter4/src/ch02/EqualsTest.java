package ch02;

public class EqualsTest implements Cloneable {
    public static void main(String[] args) throws Throwable {

        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");

        Student std3 = std1; // 주소값 복사 (물리적인 복사)


        // 논리적으로 같냐 라는 것과 같다.
        // System.out.println(std1 == std2);   // false
        // System.out.println(std1.equals(std2));  //  before override false => after true
        // System.out.println(std1.hashCode());
        // System.out.println(std2.hashCode());

        // System.out.println(System.identityHashCode(std1));
        // System.out.println(System.identityHashCode(std2));

        // System.out.println(std1 == std3);   // true

        System.out.println(std1.toString());
        Student copyStd = (Student) std1.clone();
//        System.out.println(" ");
//        std1.setStudentname("jjj");
//        System.out.println(std1.toString());
//        System.out.println(copyStd.toString());
//        System.out.println(" ");
//        copyStd.setStudentname("kim");
//        std1.setStudentname("choi");
//        System.out.println(std1.toString());
//        System.out.println(copyStd.toString());

        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(copyStd));
    }
}
