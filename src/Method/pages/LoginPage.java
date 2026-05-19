package Method.pages;

public class LoginPage {

    public void loginSuccess(String email, String password){
        System.out.println("Navigate to url...");
        System.out.println("Enter email: " + email );
        System.out.println("Enter password: " + password);
        System.out.println("Click Login button");
        System.out.println("Verify login success");
    }

    public void loginFail(String email, String password) {
        System.out.println("Navigate to url...");
        System.out.println("Enter email: " + email );
        System.out.println("Enter password: " + password);
        System.out.println("Click Login button");
        System.out.println("Verify login fail");
    }


}

