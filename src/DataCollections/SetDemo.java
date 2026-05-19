package DataCollections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        // Luu tru gia tri KHONG trung lap ( a group of UNIQUE values)
        // Khong cho phep luu theo vi tri.

        Set<String> setTabBrowser = new HashSet<String>();
        setTabBrowser.add("AN12345");
        setTabBrowser.add("PG3456");
        setTabBrowser.add("BC345667");
        setTabBrowser.add("AN12345");

        // In ra
        for (String tab : setTabBrowser) {
            System.out.println(tab);
        } // Just print out only different values va khi dung HashSet se khong in theo thu tu
          // PG3456 ,AN12345, BC345667


        //TreeSet sap xep data theo thu tu Ascending from A -> Z hoacj tang dan (default)
        Set<String> setTabBrowser2 = new TreeSet<>();
        setTabBrowser2.add("AN12345");
        setTabBrowser2.add("PG3456");
        setTabBrowser2.add("BC345667");
        setTabBrowser2.add("AN12345");  //AN12345, BC345667,PG3456

        // dung TreeSet de sap xep giam dan or Descending from Z -> A.
        Set<String> setTabBrowser3 = new TreeSet<>(Collections.reverseOrder());
        setTabBrowser3.add("AN12345");
        setTabBrowser3.add("PG3456");
        setTabBrowser3.add("BC345667");
        setTabBrowser3.add("AN12345");
        for (String tab : setTabBrowser3) {
            System.out.println(tab);
        }  // PG3456 , BC345667, AN12345.

        // Xoa du lieu
        System.out.println("+++++++++++++++++++++++");

        setTabBrowser3.remove("AN12345");
        for(String tab : setTabBrowser3){
            System.out.println(tab);
        }
        System.out.println("+++++++++++++++++++++++++++++++");
        // Kiem tra du lieu
        System.out.println(setTabBrowser3.contains("BC345667")); //true


    }
}
