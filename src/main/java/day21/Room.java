package day21;
import java.util.Random;

// 診間
public class Room {
    
    // 看診
    public synchronized void watch() throws InterruptedException {
        Random random = new Random();
        String name = Thread.currentThread().getName();
        System.out.printf("%s 進入診間\n", name);
        Thread.sleep(random.nextInt(1000));
        System.out.printf("醫生問 %s 的病況\n", name);
        Thread.sleep(random.nextInt(1000));
        System.out.printf("%s 說明自己的病況\n", name);
        Thread.sleep(random.nextInt(1000));
        System.out.printf("醫生對 %s 進行診斷\n", name);
        Thread.sleep(random.nextInt(1000));
        System.out.printf("%s 離開診間\n", name);
    }
    
}
