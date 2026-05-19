package StaticJava;

import Method.pages.LoginPage;

public class LoginTestCMS {


    public void test01_LoginSuccess(){
        System.out.println(ConfigData.browser);
        System.out.println(ConfigData.window_size);
        System.out.println("Test success");
        LoginPage loginPage = new LoginPage(); // using an object to call a non-static method.
        loginPage.loginSuccess("admin@example.com", "123456");

    }

    public void test02_LoginFailWithEmailInvalid(){
        System.out.println(ConfigData.browser);
        System.out.println(ConfigData.window_size);
        System.out.println("Test fail");
        LoginPage loginPage = new LoginPage(); // using an object to call a non-static method.
        loginPage.loginFail("fail@example.com", "123456");

    }

    public static void main(String[] args) {
        LoginTestCMS loginTest = new LoginTestCMS();
        loginTest.test01_LoginSuccess();
        loginTest.test02_LoginFailWithEmailInvalid();


    }

}



