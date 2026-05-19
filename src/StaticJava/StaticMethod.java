package StaticJava;

public class StaticMethod {

    public static int timeout = 1000;


    public static void clickElement(String element) {
        System.out.println("Wait for timeout: " + timeout);
        System.out.println("Click on element: " + element);
    }

    public static void enterText(String text, String element) {
        System.out.println("Wait for timeout: " + timeout);
        System.out.println("Enter text " + text + " on element " + element);
    }
}
