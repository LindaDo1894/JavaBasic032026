package DataCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        // Luu tru gia tri. co the store gia tri trung lap.

        // Khai bao List dang 1
        List<String> listMenu = new ArrayList<>();
        //Them phần tử vào trong list.
        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Projects");
        listMenu.add("Tasks");
        listMenu.add("Contracts");

        // Khai bao List dang 2.
        ArrayList<String> listMenu1 = new ArrayList<>();  // Prefer this way.
        listMenu1.add(0,"Dashboard");
        listMenu1.add("Customers");
        System.out.println(listMenu1.get(0));

        // Update a value in array list.
        listMenu1.set(0,"Menu");
        System.out.println(listMenu1.get(0));

        System.out.println("++++++++++++++++++++++++");

        // Duyet het cac phan tu trong list voi for cai tien or for basic.
        for (String menuName : listMenu){
            System.out.println(menuName);
        } // dung for cai tien
        for (int i = 0; i < listMenu.size(); i++){
            System.out.println(listMenu.get(i));
        } // dung for basic


        // Them phan tu vao list voi gia tri chi dinh.
        listMenu.add("Reports");

        // them phan tu theo vi tri chi dinh.
        listMenu.add(0,"Sales");



        // Get phan tu theo vi tri
        System.out.println("++++++++++++++++++++++++");

        System.out.println(listMenu.get(1));



        // Xoa phan tu trong list theo gia tri.
        listMenu.remove("Dashboard");

        //Kiem tra gia tri trong list.
        System.out.println("menu Reports exist: "+ listMenu.contains("Reports")); //true
        System.out.println("menu Address exist:" + listMenu.contains("Address")); //false

        System.out.println("***************");


        // Sap xep tang dan Ascending cac phan tu.

        System.out.println(listMenu);
        Collections.sort(listMenu);
        for (String menu : listMenu) {
            System.out.println(menu);
        } // Contracts , Customers,Projects,Reports,Sales,Tasks.

        System.out.println("***************");

        // So sanh 2 list.
        List<String> listMenu2 = new ArrayList<>();
        listMenu2.add("Sales");
        listMenu2.add("Customers");
        listMenu2.add("Projects");
        listMenu2.add("Tasks");
        listMenu2.add("Contracts");
        listMenu2.add("Reports");

        System.out.println("Compare 2 lists: " + listMenu.equals(listMenu2));
    }
}
