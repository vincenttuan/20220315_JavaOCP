package day11_inner3;

public class ButtomMain {
    public static void main(String[] args) {
        Button manulButton = new ManulButton();
        manulButton.action();
        
        Button autoButton = new AutoButton();
        autoButton.action();
        
        Button yoyoButton = new Button(){
            @Override
            public void action() {
                System.out.println("悠遊卡登入");
            }
        };
        yoyoButton.action();
        
        Button creditCardButton = new Button(){
            @Override
            public void action() {
                System.out.println("信用卡登入");
            }
        };
        creditCardButton.action();
        
        
    }
}
