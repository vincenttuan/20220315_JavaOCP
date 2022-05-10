package day16_collections;

// 排序

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSort {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(91, 85, 92, 69, 75);
        // 1. 排序(自然排序 小->大)
        Collections.sort(scores);
        System.out.println(scores);
        // 2. 排序(二數相加, 自然排序 小->大)
        // 例如: 91->10, 85->13, 92->11, 69->15, 75->12
        Comparator<Integer> comp = (o1, o2) -> (o1/10+o1%10) - (o2/10+o2%10);
        Collections.sort(scores, comp);
        System.out.println(scores);
        Collections.sort(scores, comp.reversed()); // 反排序, 大 -> 小
        System.out.println(scores);
    }
}
