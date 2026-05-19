package Method.testcases;

public class MethodReturnAValue {

    // Khai bao ham tra ve value de su dung lai dk.
    public String getVersion() {

        String version = "2.0";
        return version;
    }

    public int getCategoryTotal() {

        int categoryTotal = 100;
        return categoryTotal;
    }


    public static void main(String[] args) {
        MethodReturnAValue object2 = new MethodReturnAValue();

        String updateVersion1 = object2.getVersion();
        System.out.println(updateVersion1);

        String updateVersion2 = object2.getVersion();
        System.out.println(updateVersion2);


//         Goi noi dung tu class nay sang class khac de su dung.
//        MethodsReturnNothing object1 = new MethodsReturnNothing();
//
//        object1.showInfo();
//        object1.displayVersion();


    }
}
