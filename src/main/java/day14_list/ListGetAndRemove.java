package day14_list;

import java.util.ArrayList;
import java.util.List;

public class ListGetAndRemove {
    public static void main(String[] args) {
        List<String> nums = new ArrayList<>();
        nums.add("0"); // 0
        nums.add("3"); // 1
        nums.add("2"); // 2
        nums.add("1"); // 3
        System.out.println(nums);
        // 取得 index = 2 的資料
        System.out.println(nums.get(2));
        // 移除內容 = 3 的資料
        //nums.remove("3");
        nums.remove(1);
        System.out.println(nums);
    }
}
