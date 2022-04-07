package day07_oo;

import java.util.stream.Stream;

public class AutoBoxingUnBoxing2 {
    public static void main(String[] args) {
        Integer[] scores = {100, 93, 81}; // auto-boxing
        int sum1 = Stream.of(scores).mapToInt(s -> s.intValue()).sum();
        int sum2 = Stream.of(scores).mapToInt(s -> s).sum(); // auto-unboxing
        int sum3 = Stream.of(scores).mapToInt(Integer::intValue).sum();
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        
        String[] nums = {"100", "93", "81"};
        // 求平均 = ?
        
    }
}
