package day22_cocurrent;

// 排程化執行緒池

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 停留 2 秒鐘之後才執行 Lucky 的工作
        service.schedule(new Lucky(), 2, TimeUnit.SECONDS);
        service.shutdown();
    }
}
