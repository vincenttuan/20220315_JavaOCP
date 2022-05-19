package day19_thread;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
// 關卡 1-1 ~ 8-4
// random 遇到 9 的倍數就 GG
public class SuperMario extends Thread {
    private Random r = new Random();
    public void run() {
        int i, k = 0;
        gamploop:
        for(i = 1; i <= 8; i++) {
            for(k = 1; k <= 4; k++) {
                System.out.printf("run %d - %d\t", i, k);
                int timesleep = r.nextInt(1000);
                System.out.printf("time: %s\n", timesleep);
                try {
                    Thread.sleep(timesleep);
                } catch (InterruptedException ex) { // 執行緒中斷例外
                    System.out.println("GG: " + ex);
                    break gamploop;
                }
                if(timesleep % 9 == 0) {
                    System.out.println("GG");
                    break gamploop;
                }
                // 跳關邏輯
                if(i < 8 && timesleep % 8 == 0) {
                    i = 7;
                    continue gamploop;
                }
            }
        }
        
        // 救到公主遊戲結束
        if(i == 8 && k == 4) {
            System.out.println("救到公主 ! 遊戲結束 ~~");
        }
    }
}
