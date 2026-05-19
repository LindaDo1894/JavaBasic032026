package DataType;


public class DemoDataType {

    public static void main(String[] args) {

        String name = "Selenium course";

        // Kieu dữ liệu chỉ lưu SỐ NGUYÊN.
        byte number1 = 0;
        short number2 = 32000;
        int number3= 21000000; // kieu int thuong dung trong Automation
        long number4= 30000000000L; // L ghi phia sau de giup may understand that we are using long type. L - Mandatory

        // Kieu dữ liệu chỉ lưu SỐ THâp PHÂN (SỐ THỰC)
        float interestRate = 3.5F;// F ghi phia sau để giúp máy hiểu dk we are using float type. F- mandatory.
        double numberPi = 3.14444D; // thường dung trong Automation.

        // Kieu du lieu True or False
        boolean citizenship = true;
        boolean bonus = false;
        String actual = "Login successfull";
        String expected = "Login successfull";
        boolean checkCondition = actual.equals(expected);
        boolean compare = 15 >10;




/*
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(interestRate);
        System.out.println(numberPi);

*/
        System.out.println(citizenship);
        System.out.println(bonus);
        System.out.println(checkCondition);
        System.out.println(compare);


    }
}
