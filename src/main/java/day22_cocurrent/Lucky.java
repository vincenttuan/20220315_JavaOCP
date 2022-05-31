package day22_cocurrent;

import java.util.Random;

public class Lucky implements Runnable {

    @Override
    public void run() {
        Random random = new Random();
        try {
            Thread.sleep(1); // 模擬工作時間
        } catch (Exception e) {
        }
        System.out.println(random.nextInt(100));
    }
    
}
