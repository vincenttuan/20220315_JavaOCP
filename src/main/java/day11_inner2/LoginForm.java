package day11_inner2;

public class LoginForm {
    private String userName;
    public LoginForm(String userName) {
        this.userName = userName;
        auto(); // 調用自動登入
    }
    // 自動登入
    public void auto() {
        String title = "自動登入";
        // 此 Button 是 auto() 方法所獨享的
        class Button { // 不可以加入權限的修飾字
            void action() {
                System.out.println(userName);
                System.out.println(title);
            }
        }
        Button button = new Button(); // 自己 new 出 Button 物件
        button.action();
    }
}
