package ConditionIFELSE;

public class If {

    public static void main(String[] args) {
        String actualCustomerName = "Anthony 01"; // from automation lay dk.
        int actualCustomerId = 101;  // from automation lay dk

        if (actualCustomerName.equals("Anthony 01")) {
            System.out.println("Test case Add New Customer passed");
        }

        if (actualCustomerId == 101) {
            System.out.println("Test case Get Customer ID  passed");
        }

    }
}
