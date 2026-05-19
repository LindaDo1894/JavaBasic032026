package Method.testcases;

public class MethodsReturnNothing {

// Khai bao ham KHONG tra ve gia tri de dung trong cac case nhu: tinh toan roi in ra gia tri,
// or chay thuc thi 1 doan code nao do.

    public void showInfo() {
        String name = "An";
        String address = "Perth";
        System.out.println(name);
        System.out.println(address);
    }

    ;


    public void displayVersion() {

        String version = "2.0";
        System.out.println(version);
    }

    ;


    public static void main(String[] args) {
        MethodsReturnNothing object1 = new MethodsReturnNothing();
        // Doi voi cac variables or methods ma k phai static ,
        // neu muon su dung trong ham static thi phai thong qua "doi tuong class" de giup truy xuat.
        object1.showInfo();
        object1.displayVersion();


    }


}
