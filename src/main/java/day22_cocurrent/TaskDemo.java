package day22_cocurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        // 觀察 DB.data
        System.out.println("1. DB.data = " + DB.data);
        // 委派任務
        service.submit(new LongTask());
        service.submit(new ShortTask());
        service.submit(new LongTask());
        service.submit(new ExceptionTask()); // 故意加上一個例外 Task
        service.submit(new LongTask());
        service.submit(new ShortTask());
        service.submit(new ShortTask());
        
        // 平滑關閉
        service.shutdown();
        System.out.println("啟動平滑關閉");
        // 觀察 DB.data
        System.out.println("2. DB.data = " + DB.data);
        
        // 偵測 service 是否關閉 ?
        // while (!service.awaitTermination(1, TimeUnit.MILLISECONDS));
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {            
            System.out.println("service 尚未關閉");
        }
        
        System.out.println("service 已關閉");
        // 觀察 DB.data
        System.out.println("3. DB.data = " + DB.data);
    }
}
