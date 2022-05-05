package day15_map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo5 {
    public static void main(String[] args) {
        // 會根據 key 值由小 -> 大排序
        TreeMap<String, Integer> people = new TreeMap<>();
        people.put("John", 18); // key(String)/value(Integer) 姓名/年齡 
        people.put("Mary", 17);
        people.put("Bob", 16);
        people.put("Helen", 18);
        people.put("Jo", 17);
        System.out.println(people);
        //--------------------------------------------------------------
        Fruit.order = Order.PRICE;
        TreeMap<Fruit, String> fruits = new TreeMap<>();
        fruits.put(new Fruit("apple", 100, 1.99), "梨山");
        fruits.put(new Fruit("watermelon", 200, 3.99), "花蓮");
        fruits.put(new Fruit("banana", 300, 2.99), "屏東");
        fruits.put(new Fruit("papaya", 400, 1.99), "南投");
        System.out.println(fruits);
        
        
    }
}
