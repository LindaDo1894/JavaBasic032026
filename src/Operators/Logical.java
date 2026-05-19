package Operators;

public class Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println((a > b) || (b < c)); // result "True"  || means OR => True if 1 condition  la True
        System.out.println((a > b) && (b < c)); // result "false"  && means AND => True if both conditions la True

        // Logical : the return result is True or False (Boolean values)

        int age = 20;
        boolean hasID = true;
        String address = "Ha Noi";

        if (age >= 18 && hasID) {
            System.out.println("Passed");
        }

        if (age >= 18 && hasID && address.equals("Sydney")) {
            System.out.println("Prefer");
        }  // K in ra ket qua "Prefer" . Only print it out when if clause is TRUE.


        String alertMessage = "Category has been inserted successfully";
        String alertMessageActual = "Category has been inserted successfully"; //  dung Selenium de lay.
        String categoryName = "Beauty & Skincare"; // dung Selenium de lay

        if (alertMessageActual.equals(alertMessage) && categoryName.equals("Beauty & Skincare")) {
            System.out.println("Add new category successfully");

        }


        int n, m, k; //n,m,k  all of them have datatype la int   => help reduce lines of code.
        n = m = k = 10;   // n,m,k all have value = 10.

        System.out.println(n + m);

        // thu tu uu tien trong cac phep toan. Thuong dung () de phan ro thu tu uu tien va tao su ro rang trong code.

        System.out.println((5 + 10) * 2); //30
        System.out.println(20 - (5 * 2)); //10
    }
}
