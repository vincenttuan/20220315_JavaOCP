package day15_map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        // <String, Integer> 指的是 key/value 的資料型別
        Map<String, Integer> people = new LinkedHashMap<>();
        people.put("John", 18); // key(String)/value(Integer) 姓名/年齡 
        people.put("Mary", 17);
        people.put("Bob", 16);
        people.put("Helen", 18);
        people.put("Jo", 17);
        System.out.println(people);
        // 取出某人的年齡
        Integer age = people.get("Bob");
        System.out.println(age);
        // 取出所有的人名
        Set<String> names = people.keySet();
        System.out.println(names);
        // 取出所有年齡
        Collection<Integer> values = people.values();
        System.out.println(values);
        // 每個年齡層有幾個人 ?
        // {16=1, 17=2, 18=2} <- Map 的資料呈現
        
    }
}
