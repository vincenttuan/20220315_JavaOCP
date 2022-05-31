package day22_cocurrent;

public class ExceptionTask implements Runnable {

    @Override
    public void run() {
        System.out.println("發生錯誤的 Task");
        throw new RuntimeException("哇哇哇~發生了例外...");
    }
    
}
