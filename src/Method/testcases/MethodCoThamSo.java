package Method.testcases;

public class MethodCoThamSo {
    public int totalNumber(int number1, int number2) {

        return number1 + number2;
    }

    public void loginTestWithValidCredential(String email, String password) {
        System.out.println("Navigate to url...");
        System.out.println("Enter email: " + email);
        System.out.println("Enter password: " + password);
        System.out.println("Click Login button");
        System.out.println("Verify login success");
    }

    public void loginTestWithInvalidEmail(String email, String password) {
        System.out.println("Navigate to url...");
        System.out.println("Enter email: " + email);
        System.out.println("Enter password: " + password);
        System.out.println("Click Login button");
        System.out.println("Verify login fail");
    }

    public static void main(String[] args) {
        MethodCoThamSo object1 = new MethodCoThamSo();

        System.out.println(object1.totalNumber(2, 5));
        System.out.println(object1.totalNumber(10, 15));

        object1.loginTestWithValidCredential("abc@gmail.com", "123456");
        object1.loginTestWithInvalidEmail("123gmail.com", "123456");


    }


}
