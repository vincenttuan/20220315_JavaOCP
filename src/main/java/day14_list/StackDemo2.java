package day14_list;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class StackDemo2 {
    public static void main(String[] args) {
        /*
        利用 java.util.Stack 做字串反轉
        說明 : 使用者輸入 "Java" 則會顯示 "avaJ"
        */
        String str = "Java";
        char[] chars = str.toCharArray(); // ['J', 'a', 'v', 'a']
        Stack<Character> names = new Stack<>();
        //IntStream.range(0, chars.length).forEach(i -> System.out.println(i)); // 0, 1, 2, 3
        IntStream.range(0, chars.length).forEach(i -> names.push(chars[i]));
        System.out.println(names);
        while (!names.isEmpty()) {            
            System.out.print(names.pop());
        }
        System.out.println();
        
    }
}
