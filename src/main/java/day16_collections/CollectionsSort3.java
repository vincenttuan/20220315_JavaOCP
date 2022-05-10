package day16_collections;

// 排序 Map

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsSort3 {
    public static void main(String[] args) {
        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("John", 18);
        unsortMap.put("Mary", 19);
        unsortMap.put("Bob", 21);
        unsortMap.put("Jim", 20);
        unsortMap.put("Helen", 22);
        
        Map<String, Integer> sortMap = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, 
                                          Map.Entry::getValue, 
                                          (oldValue, newValue) -> oldValue, 
                                          LinkedHashMap::new));
        
        System.out.println(sortMap);
    }
}
