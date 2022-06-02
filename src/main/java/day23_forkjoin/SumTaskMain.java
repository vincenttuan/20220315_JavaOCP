package day23_forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer> {
    // 門檻值
    private final int THRESHOLD  = 3;
    // 任務數組
    private int [] array;
    // 起訖位置
    private int start;
    private int end;
    // 建構子-將任務與起訖位置注入
    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }
    @Override
    protected Integer compute() {
        // 1. 判斷門檻值, 若小於或等於門檻值則直接計算
        if((end - start) <= THRESHOLD) {
            int sum = 0;
            for(int i=start;i<end;i++) {
                sum += array[i];
            }
            return sum;
        }
        // 2. 任務過大, 一分為二
        int middle = (end + start)/2;
        // 3. 分裂任務
        SumTask sumTask1 = new SumTask(array, start, middle);
        SumTask sumTask2 = new SumTask(array, middle, end);
        // 4. 運行任務
        invokeAll(sumTask1, sumTask2); // fork
        //sumTask1.fork();
        //sumTask2.fork();
        // 5. 獲得任務結果
        int subTask1Result = sumTask1.join();
        int subTask2Result = sumTask2.join();
        // 6. 匯總結果
        int result = subTask1Result + subTask2Result;
        return result;
    }
    
}

public class SumTaskMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8,9, 10};
        ForkJoinTask<Integer> task = new SumTask(array, 0, array.length);
        int total_result = ForkJoinPool.commonPool().invoke(task);
        System.out.println("total_result = " + total_result);
    }
}
