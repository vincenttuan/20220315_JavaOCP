package day19_runnable;

public class Nintendo {
    public static void main(String[] args) {
        // 準備卡帶
        Mario mario = new Mario();
        Bubble bubble = new Bubble();
        KingKong kingKong = new KingKong();
        
        Thread thread = new Thread();
        thread.start();
    }
}
