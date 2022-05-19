package day19_thread;

public class Worker extends Thread {
    
    public Worker() {
    
    }
    
    public Worker(String tName) {
        // 改執行緒名稱
        setName(tName);
    }
    
    @Override
    public void run() {
        job();
    }
    
    private void job() {
        String tName = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 跑 %d 步\n", tName, i);
        }
    }
}
