package ch10;

public class PasswordTest {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("Password not null");
        }
        else if (password.length() < 5) {
            throw new PasswordException("Password length over 5");
        }
        else if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("Password into number or Special characters");
        }

        this.password = password;
    }

    public static void main(String[] args) {
        PasswordTest test = new PasswordTest();

        String password = null;

        try {
            test.setPassword(password);
            System.out.println("Test Done! : 1");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }


        password = "asdf";

        try {
            test.setPassword(password);
            System.out.println("Test Done! : 2");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "asdfaaa";

        try {
            test.setPassword(password);
            System.out.println("Test Done! : 3");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "asdfaaa1#2@";

        try {
            test.setPassword(password);
            System.out.println("Test Done! : 4");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }



}
