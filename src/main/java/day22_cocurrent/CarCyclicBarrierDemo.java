package day22_cocurrent;

import java.util.concurrent.CyclicBarrier;

public class CarCyclicBarrierDemo {
    public static void main(String[] args) {
        int parties = 2;
        Runnable lunch = () -> System.out.println(Thread.currentThread().getName() + " 吃午飯");
        //CyclicBarrier cb = new CyclicBarrier(parties);
        CyclicBarrier cb = new CyclicBarrier(parties, lunch);
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
    }
}
