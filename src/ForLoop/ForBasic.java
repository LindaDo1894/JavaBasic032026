package ForLoop;

public class ForBasic {
    public static void main(String[] args) {

        // khai bao For loop.
        for (int i = 1; i <= 5; i += 2) {
            System.out.println(i);
        }
        // Dung de Lap doan code nhat dinh. (e.g; Login)
        for (int i = 1; i <= 3; i++) {
            System.out.println("Navigate to url....");
            System.out.println("Enter email");
            System.out.println("Enter password");
            System.out.println("Click Login button");
            System.out.println("Verify successful message");
        }

        // Duyet Array or ArrayList de check each element in the array.

        //Khai bao Number Array, String Array
        int array1[] = new int[]{2, 5, 6, 8, 9, 24, 0};
        String array2[] = new String[]{"Dashboard", "Customer", "Project"};

        // Duyet Array above.
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }


    }
}
