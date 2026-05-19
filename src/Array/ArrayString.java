package Array;

public class ArrayString {
    public static void main(String[] args) {
        String menuList[] = new String[]{"Dashboard", "Customers", "Projects", "Tasks"};

        boolean checkMenu = false;  //checkMenu dong vai tro nhu bien trung gian.

        for (String menu : menuList) {
            // System.out.println(menu);

            if (menu.equals("abc")) {
                checkMenu = true;
                break; // Exit For loop, stop checking. => day la cach kiem tra du lieu trong 1 list.
            }
        }

            if (checkMenu == true) {
                System.out.println("Having Projects menu");
        } else {
            System.out.println("Don't have Projects menu");
        }

    }
}
