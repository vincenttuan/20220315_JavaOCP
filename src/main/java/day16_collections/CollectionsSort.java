package day16_collections;

// 排序

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(91, 85, 92, 69, 75);
        // 1. 排序(自然排序 小->大)
        Collections.sort(scores);
        System.out.println(scores);
        // 2. 排序(二數相加, 自然排序 小->大)
        // 例如: 91->10, 85->13, 92->11, 69->15, 75->12
        
    }
}
