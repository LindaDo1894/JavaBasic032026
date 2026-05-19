package Array;

public class ArrayDemo {
    public static void main(String[] args) {
        // Khai bao Array 1 chieu

        // Array kieu so nguyen (int)

        int arrayNumber[] = new int[3];

        // Add elements in the array. Index starts from 0.
        arrayNumber[0] = 5;
        arrayNumber[1] = 2;
        arrayNumber[2] = 20;

        // Duyet array using For basic or For advance.
       for (int i=0; i < arrayNumber.length; i++) {
            System.out.println(arrayNumber[i]);
        }
        System.out.println("=====================");

        for (int i : arrayNumber){
            System.out.println(i);
        }

        System.out.println("===========================");

        //Vua khai bao array & vua khoi tao gia tri cho array.

        int array2[] =  new int[]{5,15, 25, 35};
        System.out.println(array2[3]);


    }
}
