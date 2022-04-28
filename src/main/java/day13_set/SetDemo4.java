package day13_set;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo4 {
    public static void main(String[] args) {
        // 集合與泛型
        Set<Integer> dataSet = new HashSet<>();
        dataSet.add(Integer.valueOf(100)); // Integer
        dataSet.add(70); // Integer (auto-boxing)
        dataSet.add(90); // Integer (auto-boxing)
        System.out.println(dataSet);
        // dataSet : [100, 70, 90] <- Integer[]
        // 請計算總分 Java 7
        Iterator<Integer> iter = dataSet.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Integer next = iter.next();
            sum += next;
        }
        System.out.println(sum);
        // 請計算總分 Java 8
        //int sum2 = dataSet.stream().mapToInt(data -> data.intValue()).sum();
        int sum2 = dataSet.stream().mapToInt(data -> data).sum(); // data -> data 等於 data -> data.intValue()
                                                                  //          ^ auto-unboxing
        System.out.println(sum2);
    }
}
