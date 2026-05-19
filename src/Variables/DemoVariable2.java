package Variables;

public class DemoVariable2 {
    public String name = "Rosie" ;  // Instance variable.
    public static int age = 32; // Static variable

    // Day la cau truc cua 1 hàm.
   public void getInfo1 () {
       String address = "Hai Duong" ; // Local variable

       System.out.println(address);
       System.out.println(name);
       System.out.println(age);
       System.out.println(DemoVariable2.age);
   }

    public void getInfo2 () {
        String address = "Sydney" ; // Local variable
        System.out.println(address);
        System.out.println(name);

    }

    public static void main(String[] args) {
       System.out.println(age);
       System.out.println(DemoVariable2.age);



        DemoVariable2 demo2 = new DemoVariable2();  // cau truc khai bao doi tuong class
                                        // để thay mặt class truy suất những thành phần trong 1 class đó.
        demo2.getInfo1();
        demo2.getInfo2();
        System.out.println(demo2.name);




    }
}
