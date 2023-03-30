package ch18;

public class Company {

    // signleton pattern
    // 1. 디폴트 생성자 마음대로 new 할 수 없도록 private 생성자를 만들어 준다.
    // 2. 유일한 인스턴스는 내부에서 만든다.
    // 3. 유일한 객체를 외부에서 쓸 수 있게 해줘야 한다.
    // 4. 유일한 인스턴스에 접근을 할 수 있는 코드 만들기
    // 5. 인스턴스 접근 코드는 외부에서 선언하면 안되고 바로 method를 사용해야 되기 때문에 static method로 구현해준다.
    private Company() {}

    private static Company instance = new Company();

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }

}
