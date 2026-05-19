package DataCollections;

import StaticJava.ConfigData;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        // Map: dang key-value pairs.

        // Khai bao map.
        Map<String, String> map = new HashMap<>();

        // Them du lieu

        map.put("browser", "chrome");
        map.put("os", "windows");
        map.put("headless", "true");
        map.put("browser", "edge");
        map.put("screenshot", "true");


        //truy xuat gia tri theo tung key.

        System.out.println(map.get("os"));
        
        System.out.println(map.get("browser")); // result: edge. Because each key just have 1 value only.
                                 // if the key are the same it will get the last value.

        System.out.println("+++++++++++++");

        // get het gia tri cua key and value.
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }  // loop through Map using entrySet() => loop through both key and value.

        System.out.println("===================");

        //Xoa gia tri cua key va value.
        map.remove("os");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map.get("os")); //null

        System.out.println("===================");

        // Kiem tra gia tri bang key or value
        System.out.println(map.containsKey("browser")); // true
        System.out.println(map.containsKey("os"));      // false
        System.out.println(map.containsValue("edge")); // true

        System.out.println("===================");

        if(map.containsKey("browser") == true){
            System.out.println(map.get("browser"));
        }else{
            System.out.println(ConfigData.browser);
        }

    }
}
