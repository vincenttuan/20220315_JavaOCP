package day10_oo3;

public class Shiba implements Dog {

    @Override
    public void skill() {
        System.out.println("拿報紙");
    }

    @Override
    public void eat() {
        System.out.println("寶路狗食");
    }
    
}
