package day18;

class BigData {
    private String data;
    BigData() {
        System.out.printf("建構子執行者: %s\n", Thread.currentThread().getName());
        for(int i=0;i<=9999;i++) {
            data += String.valueOf(i);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("finalize 方法執行者: %s\n", Thread.currentThread().getName());
    }
    
}

public class ObjectTest {
    public static void main(String[] args) throws Exception {
        System.out.printf("main 方法執行者: %s\n", Thread.currentThread().getName());
        Runtime runtime = Runtime.getRuntime();
        System.out.printf("FreeMemory: %,d bytes\n", runtime.freeMemory());
        BigData bigData = new BigData();
        Thread.sleep(1000); // 等待一秒鐘
        System.out.printf("FreeMemory: %,d bytes\n", runtime.freeMemory());
        bigData = null;
        System.gc();
        Thread.sleep(1000); // 等待一秒鐘
        System.out.printf("FreeMemory: %,d bytes\n", runtime.freeMemory());
    }
}
