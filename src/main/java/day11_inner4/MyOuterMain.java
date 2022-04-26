package day11_inner4;

public class MyOuterMain {
    public static void main(String[] args) {
        // 一般內部類別建立實體
        MyOuter.MyInner in = new MyOuter().new MyInner();
        in.foo();
        
        // 靜態內部類別建立實體
        // MyStaticInner 不需要 new
        // 不過必須先要 new MyOuter
        MyOuter.MyStaticInner sin = new MyOuter.MyStaticInner();
        sin.foo();
        sin.bar();
    }
}
