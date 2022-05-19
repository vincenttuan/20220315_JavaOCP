package day19_thread;

public class WorkerTest {
    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.printf("main() 開始: %s\n", tName);
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        worker1.start();
        worker2.start();
        System.out.printf("main() 結束: %s\n", tName);
    }
}
