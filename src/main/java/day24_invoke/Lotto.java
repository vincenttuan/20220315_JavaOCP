package day24_invoke;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer>{
    
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        String tName = Thread.currentThread().getName();
        Thread.sleep(random.nextInt(5000));
        int num = random.nextInt(100);  // 0~99
        System.out.printf("%s 搖出 %d\n", tName, num);
        return num;
    }
    
}