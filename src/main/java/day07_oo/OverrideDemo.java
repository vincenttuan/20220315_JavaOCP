package day07_oo;

class Father {
    void play() {
        System.out.println("Golf");
    }
}

class Son extends Father {
    @Override
    void play() { // 覆寫 Father 的方法
        System.out.println("LoL");
    }
    void hello() { // Son 自己的方法
        System.out.println("Hello son");
    }
}


public class OverrideDemo {
    public static void main(String[] args) {
        Son son = new Son();
        son.play();
        son.hello();
    }
}
