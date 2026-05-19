package StaticJava;

public class StaticVariable {
    public String email1 = "admin@example.com";
    public static String password1 = "123456";


    public static void main(String[] args) {

        StaticVariable object1 = new StaticVariable();

        System.out.println(object1.email1);
        System.out.println(password1); // static variable and static method are in the same class , we can call directly by its name.
                                     // If their class are different, we can call static variables by using its class name.
        System.out.println(ConfigData.browser);
        System.out.println(StaticVariable.password1);



    }
}
