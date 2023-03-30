package ch08;

public class UserInfo {

    public int userHeight;
    public int userWeight;
    public String userGender;
    public String userName;
    public int userAge;

    public UserInfo(){}

    public UserInfo(int userHeight, int userWeight, String userGender, String userName, int userAge) {
        this.userHeight = userHeight;
        this.userWeight = userWeight;
        this.userGender = userGender;
        this.userName = userName;
        this.userAge = userAge;
    }

    public String showUserInfo() {
        return "키가 " + userHeight + " 이고 몸무게가 " + userWeight+ "인 " + userGender+ "가 있습니다. \t" +
        "이름은 " +userName + " 이고 나이는 " +userAge+ "입니다.";

    }
}
