package day21;

// 餅乾資源
public class Cookie {
    
    public synchronized void put(int i) {
        System.out.printf("主人放第 %d 塊餅乾\n", i);
    }
    
    public synchronized void eat(int i) {
        System.out.printf("小狗吃第 %d 塊餅乾\n", i);
    }
    
}
