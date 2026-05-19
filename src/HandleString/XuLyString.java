package HandleString;

public class XuLyString {
    public static void main(String[] args) {

        String str1 = "Selenium Java - Web Test Automation";
        String str2 = "Playwright Java - Web&API Test Automation";

        System.out.println(str1.toUpperCase()); //return the strings with ALL Upper Case.
        System.out.println(str2.toLowerCase()); // return the string with ALL Lower Case.
        System.out.println(str1.charAt(14));
        System.out.println(str1.charAt(0)); // return the char value at the specified index
        System.out.println(str2.length()); // 41 - return the length of this string.
        System.out.println(str1.substring(9));
        System.out.println(str1.substring(9, 13));


        System.out.println(str1.contains("Automation")); //true
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals("Selenium Java - Web Test Automation")); //true
        String textTableFooter = "Showing 1 to 25 of 42 entries";

        // Lay gia tri 42 trong chuoi
        // su dung pp split chuỗi theo khoảng trắng.
        // pp nay se stable hon pp substring theo index.e.g: neu con so 25 thay doi thanh 100 => index cho substring("42") se thay doi theo)
        String mangGiaTriSauTach[] = textTableFooter.split(" ");
        System.out.println(mangGiaTriSauTach[5]); //42

        String actual = "38/45";
        String expected = "38" + "/" + mangGiaTriSauTach[5];
        System.out.println(actual.equals(expected));  //false


        // check if string is empty.
        boolean check = str1.isEmpty();
        System.out.println(check); //false

        String example = "   ";
        System.out.println(example.length()); // 3
        System.out.println(example.isEmpty()); //false => chuoi example is not empty.
        System.out.println(example.isBlank()); //true => chuoi example is blank.
        // => day chinh la su khac nhau giua isBlank and isEmpty. isEmpty returns True only if the lengh of the string = 0
        // voi isBlank returns True when the string is empty or only contains white space.
        System.out.println("===================");

        // Concatenate strings.
        String newString = str1.concat(" 2026");
        System.out.println(newString);

        String str3 = "Automation Testing: " + "Selenium";
        System.out.println(str3);

        System.out.println("===================");
        // Replace the old string with a new one.
        System.out.println(str1.replace("Java", "C#"));
        String str4 = "Selenium Java Selenium C# Selenium Python 2025";
        System.out.println(str4.replaceAll("Selenium", "Learning"));

        System.out.println("===================");
        // test if the string starts with or ends with the specified string
        System.out.println(str1.startsWith("Selenium")); //true
        System.out.println(str1.endsWith("2026"));  //false


        System.out.println("===================");
        // Remove ALL leading and trailing space (xoa khoảng trắng ở đầu và cuối)

        String str5 = "   Enter your email   ";
        System.out.println(str5.trim());

        // using more methods
        System.out.println(str5.trim().replaceAll(" ", ""));// remove all spaces in the string.
        System.out.println(str5.trim().replaceAll(" ", "").length()); //14

        System.out.println("===================");
        // Return a number to a string or a string to number.
        String stringNumber = "2000";
        int number = 1000;

        System.out.println("Return a number to a string: " + String.valueOf(number));
        System.out.println("Return a string of numbers to a number: " + (Integer.valueOf(stringNumber) + 20));


    }
}
