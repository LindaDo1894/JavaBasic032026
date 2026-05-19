package ConditionIFELSE;

public class IfElseIf {

    public void checkRoleAndMenuDisplayed(String role) {
        if (role.equals("Admin")) {
            System.out.println("Show 15 menus");
            //Dung automation to check if it displays all 15 menus.
        } else if (role.equals("Customer")) {
            System.out.println("Show 5 menus");
            //Dung automation to check if it displays all 5 menus.

        } else if (role.equals("Employee")) {
            System.out.println("Direct to User Home page");

        } else {
            System.out.println("Direct to Project Manager page");
        }
    }

    public static void main(String[] args) {
        float averageScore = 5.5F;

        if (averageScore >= 8){
            System.out.println("Student is Excellent");
        }else if(averageScore < 8 && averageScore >= 6.5){
            System.out.println("Student is Good");
        }else if (averageScore < 6.5 && averageScore >= 5) {
            System.out.println("Student is Ok");
        } else {
            System.out.println("Student needs to study again");
        }




    }
}
