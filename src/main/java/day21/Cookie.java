package day21;

// 餅乾資源
public class Cookie {
    private boolean empty = true;
    
    public synchronized void put(int i) {
        if(empty == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.printf("主人放第 %d 塊餅乾\n", i);
        empty = false; // 放好餅乾, 盤子也不為空
        notify(); // 通知小狗
    }
    
    public synchronized void eat(int i) {
        if(empty == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.printf("小狗吃第 %d 塊餅乾\n", i);
        empty = true; // 吃完了, 盤子也空了
        notify(); // 通知主人
    }
    
}
