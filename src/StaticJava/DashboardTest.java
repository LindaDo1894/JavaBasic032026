package StaticJava;

import Method.pages.LoginPage;

public class DashboardTest {

    public void test01_CheckCustomerTotal(){
        System.out.println(ConfigData.browser);
        System.out.println(ConfigData.window_size);

        System.out.println("Test success");
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccess("admin@example.com", "123456");

        StaticMethod.clickElement("Search input");
        StaticMethod.enterText("10", "Search input");

        StaticMethod.clickElement("Transaction icon");
        StaticMethod.enterText("Thi Len", "Search");

    }

    public static void main(String[] args) {
        DashboardTest dashboardTest = new DashboardTest();
        dashboardTest.test01_CheckCustomerTotal();
    }
}
