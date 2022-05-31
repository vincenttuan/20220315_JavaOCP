package day22_cocurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        // 委派任務
        service.submit(new LongTask());
        service.submit(new ShortTask());
        service.submit(new LongTask());
        service.submit(new LongTask());
        service.submit(new ShortTask());
        service.submit(new ShortTask());
        
        // 平滑關閉
        service.shutdown();
        System.out.println("啟動平滑關閉");
        
        // 偵測 service 是否關閉 ?
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {            
            System.out.println("service 尚未關閉");
        }
        
        System.out.println("service 已關閉");
    }
}
