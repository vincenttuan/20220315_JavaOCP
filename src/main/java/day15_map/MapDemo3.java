package day15_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MapDemo3 {
    public static void main(String[] args) {
        String[][] fruits = {
            {"apple",  "10", "1.99"}, // 此箱有 10 個 apple 每個 1.99 元
            {"orange", "20", "2.99"},
            {"melon",  "15", "3.99"}, 
            {"melon",  "30", "3.99"},  
            {"apple",  "15", "1.99"},
            {"apple",  "20", "1.99"}, 
            {"apple",  "25", "1.99"},
            {"banana", "50", "0.99"} 
        };
        // 試問每一種水果各有幾箱?
        // 結果範例: {apple=4, watermelon=2, orange=1, banana=1}
        List<Fruit> list = Arrays.stream(fruits)
                .map(array -> new Fruit(array))
                .collect(Collectors.toList());
        System.out.println(list);
        Map<String, Long> resultMap1 = list.stream()
                .collect(groupingBy(fruit -> fruit.getName(), counting()));
        System.out.println(resultMap1);
        //----------------------------------------------------------------
        Map<String, Long> resultMap2 = Arrays.stream(fruits)
                .map(array -> new Fruit(array))
                .collect(groupingBy(fruit -> fruit.getName(), counting()));
        System.out.println(resultMap2);
    }
}
