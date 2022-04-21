package day11_inner;

// 外部類別(表單)
public class LoginForm {
    private String userName;

    public LoginForm(String userName) {
        this.userName = userName;
    }
    
    // 內部類別(按鈕)
    public class Button {
        // 行為
        public void action() {
            System.out.println(userName + "登入了...");
        }
    }
    
}
